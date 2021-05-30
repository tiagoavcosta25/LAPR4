package eapli.base.app.user.console.net.dashboard;

import java.awt.*;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author Pedro Santos (1190967@isep.ipp.pt)
 */
public class HttpServerAjaxDashboard extends Thread {
    static private final String BASE_FOLDER = "D:\\Escola\\Uni\\_Year-02\\LAPR4\\ProjetoIntegrador\\project\\base.app.user.console\\src\\main\\java\\eapli\\base\\app\\user\\console\\net\\dashboard\\www";
    static private ServerSocket sock;

    public static void main(Integer intPort) throws Exception {
        Socket cliSock;
        
        accessesCounter = 0;

        try {
            sock = new ServerSocket(intPort);
        } catch(IOException ex) {
                System.out.println("Server failed to open local port " + intPort);
                System.exit(1);
        }

        Desktop desktop = java.awt.Desktop.getDesktop();
        try {
            URI oURL = new URI(
                    "http://127.0.0.1:8000/");
            desktop.browse(oURL);
        } catch (URISyntaxException e) {
            System.out.println("Error Opening the Browser");
        }

        while(true) {
                cliSock = sock.accept();
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
