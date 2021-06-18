package base.server.autotaskexecutor;

import base.server.autotaskexecutor.fcfs.ScriptHandlerFCFS;
import base.server.autotaskexecutor.fcfs.ScriptQueueFCFS;
import base.server.autotaskexecutor.fcfs.ScriptTakerFCFS;
import base.server.autotaskexecutor.scheduler.ScriptHandlerScheduler;
import base.server.autotaskexecutor.scheduler.ScriptQueueScheduler;
import base.server.autotaskexecutor.scheduler.ScriptTakerScheduler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
public class TCPServerAutoTaskExecutor {
    private static final Logger LOGGER = LogManager.getLogger(TCPServerAutoTaskExecutor.class);
    static SSLServerSocket sock;
    static final String TRUSTED_STORE="server_J.jks";
    static final String KEYSTORE_PASS="forgotten";

    public static void main(int intPort, int intThreads, AlgorithmMode oMode) throws Exception {
        Socket cliSock;

        System.setProperty("javax.net.ssl.trustStore", TRUSTED_STORE);
        System.setProperty("javax.net.ssl.trustStorePassword",KEYSTORE_PASS);

        System.setProperty("javax.net.ssl.keyStore",TRUSTED_STORE);
        System.setProperty("javax.net.ssl.keyStorePassword",KEYSTORE_PASS);

        SSLServerSocketFactory sslF = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();


        ScriptQueueFCFS oQueueFCFS = new ScriptQueueFCFS();
        ScriptQueueScheduler oQueueScheduler = new ScriptQueueScheduler(intThreads);


        if(oMode.equals(AlgorithmMode.FCFS)){

            List<ScriptHandlerFCFS> lstHandlers = new ArrayList<>();

            for(int i = 0; i < intThreads; i++){
                ScriptHandlerFCFS oHandler = new ScriptHandlerFCFS(oQueueFCFS, i);
                lstHandlers.add(oHandler);
                oHandler.start();
            }
        } else{

            List<ScriptHandlerScheduler> lstHandlers = new ArrayList<>();

            for(int i = 0; i < intThreads; i++){
                ScriptHandlerScheduler oHandler = new ScriptHandlerScheduler(oQueueScheduler, i);
                lstHandlers.add(oHandler);
                oHandler.start();
            }
        }

        try {
            sock = (SSLServerSocket) sslF.createServerSocket(intPort);
            sock.setNeedClientAuth(true);
        }
        catch(IOException ex) {
            LOGGER.error("Server failed to open local port " + intPort);
            System.exit(1);
        }

        while(true) {
            cliSock = sock.accept();
            if(oMode.equals(AlgorithmMode.FCFS)){
                new ScriptTakerFCFS(cliSock, oQueueFCFS).start();
            } else{
                new ScriptTakerScheduler(cliSock, oQueueScheduler).start();
            }
        }
    }
}