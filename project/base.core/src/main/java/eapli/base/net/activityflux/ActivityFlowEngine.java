package eapli.base.net.activityflux;

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
        while (true) {/*
            try {
                new ActivityFlowClientHandler(serverSocket.accept()).start();
            } catch (IOException e) {
                System.out.println("Failed to accept server socket and start new Thread");
            }*/
        }
    }

    public void stop() {
        try {
            serverSocket.close();
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }

}
