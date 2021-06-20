package base.server.fluxmotor.domain;


import base.server.fluxmotor.*;
import base.server.fluxmotor.application.ActivityFlowController;
import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.net.SDP2021;
import eapli.base.net.SDP2021Code;
import eapli.base.taskmanagement.execution.domain.ManualTaskExecution;
import eapli.base.util.AppSettings;
import eapli.base.util.Application;
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
import java.util.Optional;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ActivityFlowEngine{

    private static final Logger LOGGER = LogManager.getLogger(ActivityFlowEngine.class);
    private static final String TRUSTED_STORE = System.getProperty("user.dir") + "/certificates/flux_J.jks"; //application.properties
    private static final String KEYSTORE_PASS = "forgotten"; //application.properties
    private final ActivityFlowController m_oActivityFlowController = new ActivityFlowController();
    private GenericQueue queue;

    public void start(final int port, final boolean blocking) {
        System.setProperty("javax.net.ssl.trustStore", TRUSTED_STORE);
        System.setProperty("javax.net.ssl.trustStorePassword", KEYSTORE_PASS);
        System.setProperty("javax.net.ssl.keyStore", TRUSTED_STORE);
        System.setProperty("javax.net.ssl.keyStorePassword", KEYSTORE_PASS);
        new Thread(this::setupManualTaskAssignment).start();
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
                new ActivityFlowClientHandler(clientSocket, queue).start();
            }
        } catch (final IOException e) {
            LOGGER.error(e);
        }
    }

    private void setupManualTaskAssignment() {
        int algorithm = Application.settings().getAlgorithm();
        if(algorithm != 0) {
            int numOfThreads = 0;
            for (Collaborator ignored : m_oActivityFlowController.getAllCollabs()) {
                numOfThreads++;
            }
            this.queue = new SchedulerQueue(numOfThreads);
            for (ManualTaskExecution manualTaskExecution : this.m_oActivityFlowController.getUnassignedPendingTasks()) {
                this.queue.addToQueue(manualTaskExecution.id());
                Optional<ActivityFluxExecution> oAfe = m_oActivityFlowController.getFluxByManualTaskExec(manualTaskExecution.id());
                oAfe.ifPresent(activityFluxExecution -> m_oActivityFlowController.advanceFluxData(activityFluxExecution.id(), queue));
            }
            int i = 0;
            for (Collaborator collaborator : m_oActivityFlowController.getAllCollabs()) {
                new SchedulerHandler(i, (SchedulerQueue) queue, collaborator).start();
                i++;
            }
        } else {
            this.queue = new FCFSQueue();
            for (ManualTaskExecution manualTaskExecution : this.m_oActivityFlowController.getUnassignedPendingTasks()) {
                this.queue.addToQueue(manualTaskExecution.id());
                Optional<ActivityFluxExecution> oAfe = m_oActivityFlowController.getFluxByManualTaskExec(manualTaskExecution.id());
                oAfe.ifPresent(activityFluxExecution -> m_oActivityFlowController.advanceFluxData(activityFluxExecution.id(), queue));
            }
            for (Collaborator collaborator : m_oActivityFlowController.getAllCollabs()) {
                new FCFSHandler((FCFSQueue) queue, collaborator).start();
            }
        }


    }

    private static class ActivityFlowClientHandler extends Thread {
        private final Socket clientSocket;
        private final ActivityFlowController m_oActivityFlowController = new ActivityFlowController();
        private GenericQueue queue;

        public ActivityFlowClientHandler(Socket socket, GenericQueue FCFSQUEUE) {
            this.clientSocket = socket;
            this.queue = FCFSQUEUE;
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
            } catch (Exception e) {
                //e.printStackTrace();
            } finally {
                try {
                    clientSocket.close();
                } catch (final Exception e) {
                    LOGGER.error("While closing the client socket", e);
                    //e.printStackTrace();
                }
            }
        }

        private void handleRequest(SDP2021 sdp2021Packet, DataOutputStream out) {
            int pktCode = sdp2021Packet.getCode();
            Pair<Integer, String> dataPacket;
            String payload;
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
                    new Thread(() -> advanceFluxRequestHandler(sdp2021Packet)).start();
                    payload = "Advance flux request received for flux " + Long.valueOf(sdp2021Packet.getData());
                    dataPacket = new Pair<>(SDP2021Code.FLUX_ADVANCE_RESPONSE.getCode(), payload);
                    sendResponse(dataPacket, out);
                    break;
                case 11:
                    new Thread(() -> creationFluxRequestHandler(sdp2021Packet)).start();
                    payload = "Create flux request received for flux " + Long.valueOf(sdp2021Packet.getData());
                    dataPacket = new Pair<>(SDP2021Code.FLUX_CREATION_RESPONSE.getCode(), payload);
                    sendResponse(dataPacket, out);
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

        private void advanceFluxRequestHandler(SDP2021 sdp2021Packet) {
            Long fluxID = Long.valueOf(sdp2021Packet.getData());
            m_oActivityFlowController.advanceFluxData(fluxID, queue);
        }

        private void creationFluxRequestHandler(SDP2021 sdp2021Packet) {
            Long fluxID = Long.valueOf(sdp2021Packet.getData());
            m_oActivityFlowController.creationFluxData(fluxID, queue);
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
