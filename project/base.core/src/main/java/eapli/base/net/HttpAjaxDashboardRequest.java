package eapli.base.net;

import java.io.*;
import java.net.Socket;

/**
 *
 * @author Pedro Santos (1190967@isep.ipp.pt)
 */
public class HttpAjaxDashboardRequest extends Thread {
	String baseFolder;
	Socket sock;
	DataInputStream inS;
	DataOutputStream outS;
    
	public HttpAjaxDashboardRequest(Socket s, String f) {
		baseFolder=f; sock=s;
		}	
    
	public void run() {
		try {
			outS = new DataOutputStream(sock.getOutputStream());
			inS = new DataInputStream(sock.getInputStream());
			}
		catch(IOException ex) { System.out.println("Thread error on data streams creation"); }
		try{
        		SDP2021 request = new SDP2021(inS);
        		SDP2021 response = new SDP2021();

        		response.setCode(1);
        		response.send(outS, "");

        } catch(IOException ex) { System.out.println("Thread error when reading request"); }
		try { sock.close();}
		catch(IOException ex) { System.out.println("CLOSE IOException"); }
		}
	}

