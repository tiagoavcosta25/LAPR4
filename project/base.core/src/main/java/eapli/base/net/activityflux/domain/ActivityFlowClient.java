package eapli.base.net.activityflux.domain;

import eapli.base.net.SDP2021;

import java.io.*;
import java.net.Socket;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ActivityFlowClient {

    private Socket clientSocket;
    private DataOutputStream out;
    private DataInputStream in;

    public static void main(String[] args) {
        System.out.println(retrieveInformation("123456", 6).getData());
    }

    public static SDP2021 retrieveInformation(String strMessage, int intCode) {
        ActivityFlowClient client1 = new ActivityFlowClient();
        client1.startConnection("127.0.0.1", 32507); //10.9.20.133
        client1.sendPacketExecution(strMessage, intCode);
        SDP2021 sdp2021Packet = client1.receivePacketExecution();
        try {
            client1.stopConnection();
        } catch (IOException e) {
            System.out.println("Error closing the TCP connection");
        }
        return sdp2021Packet;
    }

    private void startConnection(String ip, int port) {
        try {
            clientSocket = new Socket(ip, port);
        } catch (IOException e) {
            System.out.println("Failed to establish TCP Connection");
            System.exit(1);
        }
        try {
            out = new DataOutputStream(clientSocket.getOutputStream());
            in = new DataInputStream(clientSocket.getInputStream());
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }
    }

    private void stopConnection() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
    }

    private void sendPacketExecution(String strMessage, int intCode) {
        SDP2021 sdp2021Packet = new SDP2021(intCode);
        try {
            sdp2021Packet.send(out, strMessage);
        } catch (IOException e) {
            System.out.println("Could not send packet!");
        }
    }

    private SDP2021 receivePacketExecution() {
        SDP2021 sdp2021Packet = null;
        try {
            sdp2021Packet = new SDP2021(in);
            System.out.println("data: " + sdp2021Packet.getData());
            System.out.println("code: " + sdp2021Packet.getCode());
            System.out.println("version: " + sdp2021Packet.getVersion());
        } catch (IOException e) {
            System.out.println("Could not catch packet!");
        }
        return sdp2021Packet;
    }
}
