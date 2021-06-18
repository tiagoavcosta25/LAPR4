package base.server.autotaskexecutor.scheduler;

import eapli.base.net.SDP2021;
import eapli.base.net.SDP2021Code;
import eapli.base.taskmanagement.specification.domain.AutomaticTaskScript;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 *
 */

public class ScriptTakerScheduler extends Thread {

    private static final Logger LOGGER = LogManager.getLogger(ScriptTakerScheduler.class);

    private Socket m_oSocket;
    private ScriptQueueScheduler m_oQueue;

    public ScriptTakerScheduler(Socket oSocket, ScriptQueueScheduler oQueue) {
        this.m_oSocket = oSocket;
        this.m_oQueue = oQueue;
    }

    public void run(){
        InetAddress clientIP;

        clientIP = m_oSocket.getInetAddress();
        LOGGER.trace("New client connection from " + clientIP.getHostAddress() +
                ", port number " + m_oSocket.getPort());

        try(DataOutputStream sOut = new DataOutputStream(m_oSocket.getOutputStream());
            DataInputStream sIn = new DataInputStream(m_oSocket.getInputStream())){

            SDP2021 request;
            SDP2021 response;

            while((request = new SDP2021(sIn)).getCode() != SDP2021Code.END.getCode()) {

                LOGGER.trace("Adding Automatic Task to Executing Queue...");

                this.m_oQueue.addScript(AutomaticTaskScript.valueOf(request.getData()));
            }
            LOGGER.trace("Asked to close");
            response = new SDP2021(SDP2021Code.ROGER.getCode());
            response.send(sOut, "Goodbye");
            LOGGER.trace("Client " + clientIP.getHostAddress() + ", port number: " + m_oSocket.getPort() +
                    " disconnected");
            m_oSocket.close();
        } catch (IOException e) {
            //e.printStackTrace();
        } finally {
            try {
                LOGGER.trace("Client " + clientIP.getHostAddress() + ", port number: " + m_oSocket.getPort() +
                        " disconnected");
                m_oSocket.close();
            } catch (final IOException e) {
                LOGGER.error("While closing the client socket", e);
            }
        }
    }
}
