package base.server.autotaskexecutor.algorithms;

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
 * @author Jéssica Alves 1190682@isep.ipp.pt
 * @author Pedro Santos 1190967@isep.ipp.pt
 *
 */

public class ScriptTaker extends Thread {

    private static final Logger LOGGER = LogManager.getLogger(ScriptTaker.class);

    private Socket m_oSocket;
    private ScriptQueue m_oQueue;

    public ScriptTaker(Socket oSocket, ScriptQueue oQueue) {
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

                String strData = request.getData();
                Long lngID = Long.parseLong(strData.substring(0, strData.indexOf(',')));
                AutomaticTaskScript oScript = AutomaticTaskScript.valueOf(strData.substring(strData.indexOf(',') + 1));

                this.m_oQueue.addScript(lngID, oScript);

                response = new SDP2021(SDP2021Code.AUTOTASK_RESPONSE_SUCCESS.getCode());
                response.send(sOut, "Goodbye");
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
