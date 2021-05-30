package base.server.fluxmotor.application;

import eapli.base.net.SDP2021;
import eapli.base.net.SDP2021Code;

import java.io.*;
import java.net.*;

/**
 * @author Beatriz Seixas 1190424@isep.ipp.pt
 */
class TCPAutoTaskExecutorClient {
    static InetAddress serverIP;
    static Socket sock;

    static String strIP = "127.0.0.1";
    static int intPort = 32507;

    public static void main(String args[]) throws Exception {

        try { serverIP = InetAddress.getByName(strIP); }
        catch(UnknownHostException ex) {
            System.out.println("Invalid server specified: " + strIP);
            System.exit(1); }

        try { sock = new Socket(serverIP, intPort); }
        catch(IOException ex) {
            System.out.println("Failed to establish TCP connection");
            System.exit(1); }

        DataInputStream sIn = new DataInputStream(sock.getInputStream());
        DataOutputStream sOut = new DataOutputStream(sock.getOutputStream());

        SDP2021 request = new SDP2021(SDP2021Code.AUTOTASK_REQUEST.getCode());

        request.send(sOut, "D:/folder3/script3.bat");

        sock.close();
    }
}