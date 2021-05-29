package net.activityflux.domain;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.net.SDP2021;
import eapli.base.net.SDP2021Code;
import eapli.base.usermanagement.domain.BasePasswordPolicy;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.PlainTextEncoder;
import net.activityflux.application.ActivityFlowController;
import javafx.util.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ActivityFlowEngine{
    private static final Logger LOGGER = LogManager.getLogger(ActivityFlowEngine.class);

    public void start(final int port, final boolean blocking) {
        if (blocking) {
            listen(port);
        } else {
            new Thread(() -> listen(port)).start();
        }
    }

    private void listen(final int port) {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            while (true) {
                final Socket clientSocket = serverSocket.accept();
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
            final InetAddress clientIP = clientSocket.getInetAddress();
            LOGGER.debug("Acepted connection from {}:{}", clientIP.getHostAddress(), clientSocket.getPort());
            try(DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
                 DataInputStream in = new DataInputStream(clientSocket.getInputStream())){

                SDP2021 sdp2021PacketReceived = new SDP2021(in);

                LOGGER.trace("Received message:----\n{}\n----", sdp2021PacketReceived.getData());

                Pair<Integer, String> dataForPacket = handleRequest(sdp2021PacketReceived);

                SDP2021 sdp2021Packet2Sent = new SDP2021(dataForPacket.getKey());
                sdp2021Packet2Sent.send(out, dataForPacket.getValue());
                LOGGER.trace("Sent message:----\n{}\n----", sdp2021Packet2Sent.getData());

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

        private Pair<Integer, String> handleRequest(SDP2021 sdp2021Packet) {
            int pktCode = sdp2021Packet.getCode();
            Pair<Integer, String> dataPacket = null;
            switch(pktCode) {
                case 0:
                    //TODO: Implement TEST
                    break;
                case 1:
                    //TODO: Implement END
                    break;
                case 2:
                    //TODO: Implement ROGER
                    break;
                case 3:
                    //TODO: Implement AUTOTASK_RESPONSE
                    break;
                case 4:
                    //TODO: Implement AUTOTASK_REQUEST
                    break;
                case 5:
                    //TODO: Implement INFO_RESPONSE
                    break;
                case 6:
                    dataPacket = infoRequestHandler(sdp2021Packet);
                    break;
                case 255:
                    //TODO: Implement SEGMENT
                    break;
                default:
                    throw new IllegalStateException("Unhandled code for packet: " + pktCode);
            }
            return dataPacket;
        }

        private Pair<Integer, String> infoRequestHandler(SDP2021 sdp2021Packet) {
            String strMecNumber = sdp2021Packet.getData();
            String payload = m_oActivityFlowController.prepareFluxData(strMecNumber);
            return new Pair<>(SDP2021Code.INFO_RESPONSE.getCode(), payload);
        }

    }

}
