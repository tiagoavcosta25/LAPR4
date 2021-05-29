package base.server.fluxmotor.application;

import eapli.base.net.SDP2021;
import eapli.base.net.SDP2021Code;

import java.io.*;
import java.net.*;

class TCPAutoTaskExecutorClient {
    static InetAddress serverIP;
    static Socket sock;

    public static void main(String args[]) throws Exception {

        try { serverIP = InetAddress.getByName("127.0.0.1"); }
        catch(UnknownHostException ex) {
            System.out.println("Invalid server specified: " + "127.0.0.1");
            System.exit(1); }

        try { sock = new Socket(serverIP, 9999); }
        catch(IOException ex) {
            System.out.println("Failed to establish TCP connection");
            System.exit(1); }

        DataInputStream sIn = new DataInputStream(sock.getInputStream());
        DataOutputStream sOut = new DataOutputStream(sock.getOutputStream());

        SDP2021 request = new SDP2021(SDP2021Code.AUTOTASK_REQUEST.getCode());

        request.send(sOut, "TESTE");

        sock.close();
    }
}