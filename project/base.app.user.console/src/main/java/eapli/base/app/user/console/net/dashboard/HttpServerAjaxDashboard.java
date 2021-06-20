package eapli.base.app.user.console.net.dashboard;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;

/**
 *
 * @author Pedro Santos (1190967@isep.ipp.pt)
 */

public class HttpServerAjaxDashboard extends Thread {

    private static final Logger LOGGER = LogManager.getLogger(HttpServerAjaxDashboard.class);
    static private final String BASE_FOLDER = System.getProperty("user.dir") + "\\base.app.user.console\\src\\main\\java\\eapli\\base\\app\\user\\console\\net\\dashboard\\www";
    static private SSLServerSocket sock;
    static final String TRUSTED_STORE = System.getProperty("user.dir") +  "\\certificates\\dashboard_J.jks";
    static final String KEYSTORE_PASS = "forgotten";

    public static void main(Integer intPort) throws Exception {
        SSLSocket cliSock;

        System.setProperty("javax.net.ssl.trustStore", TRUSTED_STORE);
        System.setProperty("javax.net.ssl.trustStorePassword",KEYSTORE_PASS);
        System.setProperty("javax.net.ssl.keyStore", TRUSTED_STORE);
        System.setProperty("javax.net.ssl.keyStorePassword", KEYSTORE_PASS);
        
        accessesCounter = 0;

        try {
            SSLServerSocketFactory sslF = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
            sock = (SSLServerSocket) sslF.createServerSocket(intPort);
        }
        catch(IOException ex) {
            LOGGER.error("Server failed to open local port {}\n", intPort);
        }

        Desktop desktop = java.awt.Desktop.getDesktop();
        try {
            URI oURL = new URI(
                    "https://127.0.0.1:8000/");
            desktop.browse(oURL);
        } catch (URISyntaxException e) {
            LOGGER.error("Error Opening the Browser");
        }

        while(true) {
                cliSock = (SSLSocket) sock.accept();
                HttpAjaxDashboardRequest req = new HttpAjaxDashboardRequest(cliSock, BASE_FOLDER);
                req.start();
                incAccessesCounter();
        }
    }
	
    
    // DATA ACCESSED BY THREADS - LOCKING REQUIRED

    private static int accessesCounter;
    
    private static synchronized void incAccessesCounter() { accessesCounter++; }
    
    public static synchronized String getPendingTasksInHTML(int pendingCounter, int overdueCounter, int closeCounter, int highCounter, int mediumCounter, int lowCounter) {
        String textHtml = "<hr><p><b>HTTP server accesses counter:</b> " + accessesCounter + "</p><p><b>Pending Tasks:</b> " + pendingCounter
                + "</p><p><b>Overdue Tasks (Tasks that over the limit date):</b> " + overdueCounter + "</p><p><b>Tasks With Less Than 1h Left:</b> " + closeCounter
                + "</p><p><b>Pending Tasks (High Urgency):</b> " + highCounter + "</p><p><b>Pending Tasks (Medium Urgency):</b> " + mediumCounter +
                "</p><p><b>Pending Tasks (Low Urgency):</b> " + lowCounter + "</p><hr>";
        return textHtml;
    }
}
