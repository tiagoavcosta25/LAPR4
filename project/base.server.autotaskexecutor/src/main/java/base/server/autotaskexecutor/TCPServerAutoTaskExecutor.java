package base.server.autotaskexecutor;

import eapli.base.net.SDP2021;
import eapli.base.net.SDP2021Code;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.tp
 */
public class TCPServerAutoTaskExecutor {
    static ServerSocket sock;

    public static void main(int intPort) throws Exception {
        Socket cliSock;

        try { sock = new ServerSocket(intPort); }
        catch(IOException ex) {
            System.out.println("Failed to open server socket");
            System.exit(1);
        }

        while(true) {
            cliSock=sock.accept();
            new Thread(new TCPExecutorThread(cliSock)).start();
        }
    }
}

class TCPExecutorThread implements Runnable {
    private Socket s;
    private DataOutputStream sOut;
    private DataInputStream sIn;

    public TCPExecutorThread(Socket cli_s) { s=cli_s;}

    public void run() {
        InetAddress clientIP;

        clientIP=s.getInetAddress();
        System.out.println("New client connection from " + clientIP.getHostAddress() +
                ", port number " + s.getPort());
        try {
            sOut = new DataOutputStream(s.getOutputStream());
            sIn = new DataInputStream(s.getInputStream());
            SDP2021 request = new SDP2021(sIn);
            SDP2021 response = new SDP2021(SDP2021Code.AUTOTASK_RESPONSE.getCode());

            if(request.getCode() == SDP2021Code.END.getCode()){
                response.setCode(SDP2021Code.ROGER.getCode());
                response.send(sOut, "");
            }

            if(request.getCode() != SDP2021Code.AUTOTASK_REQUEST.getCode()){ System.out.println("Wrong Code.");}

            String strScript = request.getData();

            System.out.println("Executing Automatic Task...");
            // Mock (Sim Automatic Task Execution)
            System.out.println("Automatic Task Executed Successfully.");

            response.send(sOut, "Automatic Task Executed Successfully.");

            System.out.println("Client " + clientIP.getHostAddress() + ", port number: " + s.getPort() +
                    " disconnected");
            s.close();
        }
        catch(IOException e) { System.out.println("Exception"); }
    }
}
