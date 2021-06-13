package base.server.autotaskexecutor;

import eapli.base.net.SDP2021;
import eapli.base.net.SDP2021Code;
import eapli.base.taskmanagement.execution.application.ExecuteAutomaticTaskController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;

/**
 *
 * @author JÃ©ssica Alves 1190682@isep.ipp.pt
 */
public class TCPServerAutoTaskExecutor {
    private static final Logger LOGGER = LogManager.getLogger(TCPServerAutoTaskExecutor.class);
    static SSLServerSocket sock;
    static final String TRUSTED_STORE="server_J.jks";
    static final String KEYSTORE_PASS="forgotten";

    public static void main(int intPort) throws Exception {
        Socket cliSock;

        System.setProperty("javax.net.ssl.trustStore", TRUSTED_STORE);
        System.setProperty("javax.net.ssl.trustStorePassword",KEYSTORE_PASS);

        System.setProperty("javax.net.ssl.keyStore",TRUSTED_STORE);
        System.setProperty("javax.net.ssl.keyStorePassword",KEYSTORE_PASS);

        SSLServerSocketFactory sslF = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();

        try {
            sock = (SSLServerSocket) sslF.createServerSocket(intPort);
            sock.setNeedClientAuth(true);
        }
        catch(IOException ex) {
            System.out.println("Server failed to open local port " + intPort);
            System.exit(1);
        }

        while(true) {
            cliSock=sock.accept();
            new Thread(new TCPExecutorThread(cliSock)).start();
        }
    }

    private static class TCPExecutorThread implements Runnable {
        private Socket s;

        public TCPExecutorThread(Socket cli_s) { s=cli_s;}

        public void run() {
            InetAddress clientIP;

            clientIP=s.getInetAddress();
            System.out.println("New client connection from " + clientIP.getHostAddress() +
                    ", port number " + s.getPort());

            try(DataOutputStream sOut = new DataOutputStream(s.getOutputStream());
                DataInputStream sIn = new DataInputStream(s.getInputStream())){

                SDP2021 request; // usa o protocolo sdp criado pela equipa
                SDP2021 response;

                while((request = new SDP2021(sIn)).getCode() != SDP2021Code.END.getCode()) { // enquanto nao receber o codigo END

                    System.out.println("Executing Automatic Task...");

                    ExecuteAutomaticTaskController autoTaskController = new ExecuteAutomaticTaskController();
                    boolean blnTaskSuccessful = autoTaskController.executeAutomaticTaskMock(request.getData()); // excetudar a task automatica

                    if(blnTaskSuccessful){
                        response = new SDP2021(SDP2021Code.AUTOTASK_RESPONSE_SUCCESS.getCode());
                        System.out.println("Automatic Task Executed Successfully.");

                        response.send(sOut, "Success");
                    } else{
                        response = new SDP2021(SDP2021Code.AUTOTASK_RESPONSE_FAILURE.getCode());
                        System.out.println("Error Executing Automatic Task.");

                        response.send(sOut, "Error");
                    }
                }
                LOGGER.trace("Asked to close");
                response = new SDP2021(SDP2021Code.ROGER.getCode()); // envia codigo ENTENDIDO para o cliente
                response.send(sOut, "Goodbye");
                System.out.println("Client " + clientIP.getHostAddress() + ", port number: " + s.getPort() +
                        " disconnected");
                s.close(); // fecha a conexao
            } catch (IOException e) {
                //e.printStackTrace();
            } finally {
                try {
                    System.out.println("Client " + clientIP.getHostAddress() + ", port number: " + s.getPort() +
                            " disconnected");
                    s.close();
                } catch (final IOException e) {
                    LOGGER.error("While closing the client socket", e);
                }
            }
        }
    }
}