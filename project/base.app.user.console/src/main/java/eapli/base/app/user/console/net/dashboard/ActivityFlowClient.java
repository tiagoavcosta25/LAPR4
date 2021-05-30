package eapli.base.app.user.console.net.dashboard;

import eapli.base.net.SDP2021;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.net.Socket;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ActivityFlowClient {

    private static final int TCP_PORT = 32507;
    private static final String SERVER_IP = "127.0.0.1";
    private static final Logger LOGGER = LogManager.getLogger(ActivityFlowClient.class);

    private Socket clientSocket;
    private DataOutputStream out;
    private DataInputStream in;

    public ActivityFlowClient() {
        startConnection(); //10.9.20.133 ip server
    }

    public SDP2021 retrieveInformation(String strMessage, int intCode) {
        sendPacketExecution(strMessage, intCode);
        return receivePacketExecution();
    }

    private void startConnection() {
        try {
            clientSocket = new Socket(SERVER_IP, TCP_PORT);
        } catch (IOException e) {
            LOGGER.error("Failed to establish TCP Connection", e);
            System.exit(1);
        }
        try {
            out = new DataOutputStream(clientSocket.getOutputStream());
            in = new DataInputStream(clientSocket.getInputStream());
        } catch (IOException e) {
            LOGGER.error("IOException");
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
            LOGGER.error("Could not send packet!");
        }
    }

    private SDP2021 receivePacketExecution() {
        SDP2021 sdp2021Packet = null;
        try {
            sdp2021Packet = new SDP2021(in);
        } catch (IOException e) {
            LOGGER.error("Could not catch data!");
        }
        return sdp2021Packet;
    }
}
