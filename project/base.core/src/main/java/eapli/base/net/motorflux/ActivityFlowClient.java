package eapli.base.net.motorflux;

import eapli.base.net.SDP2021;
import eapli.base.net.SDP2021Code;
import eapli.base.util.Application;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.net.Socket;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ActivityFlowClient {

    private static final int TCP_PORT = Application.settings().getTcpServerPort();
    private static final String FLUX_SERVER_IP = Application.settings().getFluxServerIp();
    private static final String EXECUTE_SERVER_IP = Application.settings().getExecuteServerIp();

    private Socket clientSocket;
    private DataOutputStream out;
    private DataInputStream in;
    private final String ip;

    public ActivityFlowClient(String serverIP) {
        this.ip = serverIP;
        startConnection();
    }

    public SDP2021 retrieveInformation(String strMessage, int intCode) {
        sendPacketExecution(strMessage, intCode);
        return receivePacketExecution();
    }

    private void startConnection() {
        try {
            clientSocket = new Socket(ip, TCP_PORT);
            out = new DataOutputStream(clientSocket.getOutputStream());
            in = new DataInputStream(clientSocket.getInputStream());
        } catch (Exception e) {
            //LOGGER.error("Failed to establish TCP Connection");
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
        } catch (Exception e) {
            //LOGGER.error("Could not send packet!");
            startConnection();
        }
    }

    private SDP2021 receivePacketExecution() {
        SDP2021 sdp2021Packet = null;
        try {
            sdp2021Packet = new SDP2021(in);
        } catch (Exception e) {
            //LOGGER.error("Could not catch data!");
            startConnection();
        }
        return sdp2021Packet;
    }
}
