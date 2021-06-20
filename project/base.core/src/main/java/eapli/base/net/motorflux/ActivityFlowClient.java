package eapli.base.net.motorflux;

import eapli.base.net.SDP2021;
import eapli.base.net.SDP2021Code;
import eapli.base.util.Application;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.*;
import java.net.Socket;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ActivityFlowClient {

    private static final int TCP_PORT = Application.settings().getTcpServerPort();
    private static final String FLUX_SERVER_IP = Application.settings().getFluxServerIp();
    private static final String EXECUTE_SERVER_IP = Application.settings().getExecuteServerIp();
    static final String TRUSTED_STORE = System.getProperty("user.dir") + "\\certificates\\client_J.jks"; //application.properties
    static final String KEYSTORE_PASS = "forgotten"; //application.properties


    private SSLSocket clientSocket;
    private DataOutputStream out;
    private DataInputStream in;
    private final String ip;

    public ActivityFlowClient(String serverIP) {
        this.ip = serverIP;
        System.setProperty("javax.net.ssl.trustStore", TRUSTED_STORE);
        System.setProperty("javax.net.ssl.trustStorePassword",KEYSTORE_PASS);
        System.setProperty("javax.net.ssl.keyStore", TRUSTED_STORE);
        System.setProperty("javax.net.ssl.keyStorePassword",KEYSTORE_PASS);
        startConnection();
    }

    public SDP2021 retrieveInformation(String strMessage, int intCode) {
        sendPacketExecution(strMessage, intCode);
        return receivePacketExecution();
    }

    private void startConnection() {
        try {
            SSLSocketFactory sf = (SSLSocketFactory) SSLSocketFactory.getDefault();
            clientSocket = (SSLSocket) sf.createSocket(ip, TCP_PORT);
            clientSocket.startHandshake();
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
