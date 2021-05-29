package eapli.base.net.activityflux.domain;

import eapli.base.net.SDP2021;
import eapli.base.net.SDP2021Code;
import eapli.base.net.activityflux.application.ActivityFlowController;
import javafx.util.Pair;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ActivityFlowEngine implements Runnable{
    private ServerSocket serverSocket;

    @Override
    public void run() {
        ActivityFlowEngine server=new ActivityFlowEngine();
        server.start(32507);
    }

    public static void main(String[] args) {
        ActivityFlowEngine server=new ActivityFlowEngine();
        server.start(32507);
    }

    public void start(int port) {
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            System.out.println("Failed to open server socket");
        }
        while (true) {
            try {
                new ActivityFlowClientHandler(serverSocket.accept()).start();
            } catch (IOException e) {
                System.out.println("Failed to accept server socket and start new Thread");
            }
        }
    }

    public void stop() {
        try {
            serverSocket.close();
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }

    private static class ActivityFlowClientHandler extends Thread {
        private final Socket clientSocket;
        private final ActivityFlowController m_oActivityFlowController = new ActivityFlowController();

        public ActivityFlowClientHandler(Socket socket) {
            this.clientSocket = socket;
        }

        public void run() {
            System.out.println("New client with ip: " + clientSocket.getInetAddress().getHostAddress());
            try {
                DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
                DataInputStream in = new DataInputStream(clientSocket.getInputStream());

                SDP2021 sdp2021Packet = new SDP2021(in);

                System.out.println("Packet received with message: " + sdp2021Packet.getData());

                Pair<Integer, String> dataForPacket = handleRequest(sdp2021Packet);

                SDP2021 sdp2021Packet2 = new SDP2021(dataForPacket.getKey());
                sdp2021Packet2.send(out, dataForPacket.getValue());

                in.close();
                out.close();
                clientSocket.close();
                System.out.println("Connection closed");
            } catch (IOException e) {
                e.printStackTrace();
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
