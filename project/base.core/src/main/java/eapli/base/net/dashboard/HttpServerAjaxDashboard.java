package eapli.base.net.dashboard;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Pedro Santos (1190967@isep.ipp.pt)
 */
public class HttpServerAjaxDashboard {
    static private final String BASE_FOLDER = "www";
    static private ServerSocket sock;

    public static void main(String args[]) throws Exception {
        Socket cliSock;

        if(args.length!=1) {
            System.out.println("Local port number required at the command line.");
            System.exit(1);
        }
        
        accessesCounter = 0;
        
        try {
            sock = new ServerSocket(Integer.parseInt(args[0]));
        } catch(IOException ex) {
                System.out.println("Server failed to open local port " + args[0]);
                System.exit(1);
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
        String textHtml = "<hr><p>HTTP server accesses counter: " + accessesCounter + "</p><p>Pending Tasks: " + pendingCounter
                + "</p><p>Overdue Tasks (Tasks that over the limit date): " + overdueCounter + "</p><p>Tasks With Less Than 1h Left: " + closeCounter
                + "</p><p>Pending Tasks (High Urgency): " + highCounter + "</p><p>Pending Tasks (Medium Urgency): " + mediumCounter +
                "</p><p>Pending Tasks (Low Urgency): " + lowCounter + "</p><hr>";
        return textHtml;
    }
}
