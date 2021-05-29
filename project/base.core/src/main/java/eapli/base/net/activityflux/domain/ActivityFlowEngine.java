package eapli.base.net.activityflux.domain;

import eapli.base.net.SDP2021;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ActivityFlowEngine {
    private ServerSocket serverSocket;

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

        public ActivityFlowClientHandler(Socket socket) {
            this.clientSocket = socket;
        }

        public void run() {
            System.out.println("New client with ip: " + clientSocket.getInetAddress().getHostAddress());
            try {
                DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
                DataInputStream in = new DataInputStream(clientSocket.getInputStream());

                SDP2021 sdp2021Packet = new SDP2021(in);
                System.out.println("DATA " + sdp2021Packet.getData());

                SDP2021 sdp2021Packet2 = new SDP2021(4);
                sdp2021Packet2.send(out, "DEU");

                in.close();
                out.close();
                clientSocket.close();
                System.out.println("Connection closed");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        private void handleRequest(SDP2021 sdp2021Packet) {
            int pktCode = sdp2021Packet.getCode();

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
                    //TODO: Implement HTTP_REQUEST
                    break;
                case 4:
                    //TODO: Implement HTTP_RESPONSE
                    break;
                case 5:
                    //TODO: Implement AUTOTASK_RESPONSE
                    break;
                case 6:
                    //TODO: Implement AUTOTASK_REQUEST
                    break;
                case 7:
                    //TODO: Implement INFO_RESPONSE
                    break;
                case 8:
                    //TODO: Implement INFO_REQUEST
                    break;
                case 255:
                    //TODO: Implement SEGMENT
                    break;
            }
        }

    }

}
