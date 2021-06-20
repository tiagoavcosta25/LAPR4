package base.server.fluxmotor.domain;

import base.server.fluxmotor.application.ActivityFlowController;
import eapli.base.net.SDP2021;
import eapli.base.net.SDP2021Code;
import javafx.util.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ActivityFlowEngine{
    private static final Logger LOGGER = LogManager.getLogger(ActivityFlowEngine.class);
    static final String TRUSTED_STORE = System.getProperty("user.dir") + "/certificates/flux_J.jks"; //application.properties
    static final String KEYSTORE_PASS = "forgotten"; //application.properties

    public void start(final int port, final boolean blocking) {
        System.setProperty("javax.net.ssl.trustStore", TRUSTED_STORE);
        System.setProperty("javax.net.ssl.trustStorePassword", KEYSTORE_PASS);
        System.setProperty("javax.net.ssl.keyStore", TRUSTED_STORE);
        System.setProperty("javax.net.ssl.keyStorePassword", KEYSTORE_PASS);
        if (blocking) {
            listen(port);
        } else {
            new Thread(() -> listen(port)).start();
        }
    }

    private void listen(final int port) {
        SSLServerSocketFactory sslF = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
        try (SSLServerSocket serverSocket = (SSLServerSocket) sslF.createServerSocket(port)) {
            serverSocket.setNeedClientAuth(true);
            while (true) {
                final Socket clientSocket = serverSocket.accept();
                final InetAddress clientIP = clientSocket.getInetAddress();
                LOGGER.debug("Acepted connection from {}:{}", clientIP.getHostAddress(), clientSocket.getPort());
                new ActivityFlowClientHandler(clientSocket).start();
            }
        } catch (final IOException e) {
            LOGGER.error(e);
        }
    }

    private static class ActivityFlowClientHandler extends Thread {
        private final Socket clientSocket;
        private final ActivityFlowController m_oActivityFlowController = new ActivityFlowController();

        public ActivityFlowClientHandler(Socket socket) {
            this.clientSocket = socket;
        }

        public void run() {
            try(DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
                DataInputStream in = new DataInputStream(clientSocket.getInputStream())){

                SDP2021 sdp2021PacketReceived;
                SDP2021 sdp2021Packet2Sent;

                while((sdp2021PacketReceived = new SDP2021(in)).getCode() != SDP2021Code.END.getCode()) {

                    LOGGER.trace("Received message:----\n{}\n----", sdp2021PacketReceived.getData());

                   handleRequest(sdp2021PacketReceived, out);
                }
                LOGGER.trace("Asked to close");
                sdp2021Packet2Sent = new SDP2021(SDP2021Code.ROGER.getCode());
                sdp2021Packet2Sent.send(out, "Goodbye");
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    clientSocket.close();
                } catch (final IOException e) {
                    LOGGER.error("While closing the client socket", e);
                }
            }
        }

        private void handleRequest(SDP2021 sdp2021Packet, DataOutputStream out) {
            int pktCode = sdp2021Packet.getCode();
            Pair<Integer, String> dataPacket;
            switch(pktCode) {
                case 0:
                    dataPacket = testHandler();
                    sendResponse(dataPacket, out);
                    break;
                case 6:
                    dataPacket = infoRequestHandler(sdp2021Packet);
                    sendResponse(dataPacket, out);
                    break;
                case 9:
                    advanceFluxRequestHandler(sdp2021Packet, out);
                    break;
                case 11:
                    creationFluxRequestHandler(sdp2021Packet, out);
                    break;
                default:
                    throw new IllegalStateException("Unhandled code for packet: " + pktCode);
            }
        }

        private Pair<Integer, String> testHandler() {
            String payload = "";
            return new Pair<>(SDP2021Code.ROGER.getCode(), payload);
        }

        private Pair<Integer, String> infoRequestHandler(SDP2021 sdp2021Packet) {
            String strUserName = sdp2021Packet.getData();
            String payload = m_oActivityFlowController.prepareFluxData(strUserName);
            return new Pair<>(SDP2021Code.INFO_RESPONSE.getCode(), payload);
        }

        private void advanceFluxRequestHandler(SDP2021 sdp2021Packet, DataOutputStream out) {
            Long fluxID = Long.valueOf(sdp2021Packet.getData());
            String payload = "Advance flux request received for flux " + fluxID;
            Pair<Integer, String> dataPacket = new Pair<>(SDP2021Code.FLUX_ADVANCE_RESPONSE.getCode(), payload);
            sendResponse(dataPacket, out);
            m_oActivityFlowController.advanceFluxData(fluxID);
        }

        private void creationFluxRequestHandler(SDP2021 sdp2021Packet, DataOutputStream out) {
            Long fluxID = Long.valueOf(sdp2021Packet.getData());
            String payload = "Create flux request received for flux " + fluxID;
            Pair<Integer, String> dataPacket = new Pair<>(SDP2021Code.FLUX_CREATION_RESPONSE.getCode(), payload);
            sendResponse(dataPacket, out);
            m_oActivityFlowController.creationFluxData(fluxID);
        }

        private void sendResponse(Pair<Integer, String> dataForPacket, DataOutputStream out)  {
            SDP2021 sdp2021Packet2Sent = new SDP2021(dataForPacket.getKey());
            try {
                sdp2021Packet2Sent.send(out, dataForPacket.getValue());
            } catch (IOException e) {
                // Does nothing
            }
            LOGGER.trace("Sent message:----\n{}\n----", sdp2021Packet2Sent.getData());
        }

    }

}
