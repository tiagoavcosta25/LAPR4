package eapli.base.net.dashboard;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Pedro Santos (1190967@isep.ipp.pt)
 */
public class HttpServerAjaxDashboard {
    static private final String BASE_FOLDER="www";
    static private ServerSocket sock;

    public static void main(String args[]) throws Exception {
	Socket cliSock;

	if(args.length!=1) {
            System.out.println("Local port number required at the command line.");
            System.exit(1);
            }
        
        accessesCounter=0;
        for(int i=0;i<candidatesNumber; i++) {
                candidateName[i] = "Candidate " + i;
                candidateVotes[i] = 0;
            }
        
	try { sock = new ServerSocket(Integer.parseInt(args[0])); }
	catch(IOException ex) {
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
    
    private static final int candidatesNumber = 4;
    private static final String[] candidateName = new String[candidatesNumber];
    private static final int[] candidateVotes = new int[candidatesNumber];
    private static int accessesCounter;
    
    private static synchronized void incAccessesCounter() { accessesCounter++; }
    
    public static synchronized String getPendingTasksInHTML() {
        String textHtml = "<hr><p>HTTP server accesses counter: " + accessesCounter + "</p><p>PendingTasks: " + accessesCounter + "</p><hr>";
        return textHtml;
        }
}
