package base.server.autotaskexecutor;

import base.server.autotaskexecutor.algorithms.ScriptQueue;
import base.server.autotaskexecutor.algorithms.ScriptTaker;
import base.server.autotaskexecutor.algorithms.fcfs.ScriptHandlerFCFS;
import base.server.autotaskexecutor.algorithms.fcfs.ScriptQueueFCFS;
import base.server.autotaskexecutor.algorithms.scheduler.ScriptHandlerScheduler;
import base.server.autotaskexecutor.algorithms.scheduler.ScriptQueueScheduler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.net.Socket;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
public class TCPServerAutoTaskExecutor {
    private static final Logger LOGGER = LogManager.getLogger(TCPServerAutoTaskExecutor.class);
    static SSLServerSocket sock;
    static final String TRUSTED_STORE = System.getProperty("user.dir") + "/certificates/executor_J.jks";
    static final String KEYSTORE_PASS="forgotten";

    public static void main(int intPort, int intThreads, AlgorithmMode oMode) throws Exception {
        Socket cliSock;

        System.setProperty("javax.net.ssl.trustStore", TRUSTED_STORE);
        System.setProperty("javax.net.ssl.trustStorePassword",KEYSTORE_PASS);

        System.setProperty("javax.net.ssl.keyStore",TRUSTED_STORE);
        System.setProperty("javax.net.ssl.keyStorePassword",KEYSTORE_PASS);

        SSLServerSocketFactory sslF = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();


        ScriptQueue oQueue;


        if(oMode.equals(AlgorithmMode.FCFS)){ // if the mode is First Come First Served

            ScriptQueueFCFS oQueueFCFS = new ScriptQueueFCFS();

            for(int i = 0; i < intThreads; i++){
                ScriptHandlerFCFS oHandler = new ScriptHandlerFCFS(oQueueFCFS, i);
                oHandler.start();
            }

            oQueue = oQueueFCFS;

        } else{ // if the mode is Scheduler

            ScriptQueueScheduler oQueueScheduler = new ScriptQueueScheduler(intThreads);

            for(int i = 0; i < intThreads; i++){
                ScriptHandlerScheduler oHandler = new ScriptHandlerScheduler(oQueueScheduler, i);
                oHandler.start();
            }

            oQueue = oQueueScheduler;
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
            new ScriptTaker(cliSock, oQueue).start();
        }
    }
}