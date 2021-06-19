package eapli.base.app.user.console.net.dashboard;

import eapli.base.net.SDP2021;
import eapli.base.net.SDP2021Code;
import eapli.base.net.motorflux.ActivityFlowClient;
import eapli.base.util.Application;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.net.Socket;

/**
 *
 * @author Pedro Santos (1190967@isep.ipp.pt)
 */
public class HttpAjaxDashboardRequest extends Thread {

	private static final Logger LOGGER = LogManager.getLogger(HttpAjaxDashboardRequest.class);
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
		} catch(IOException ex) { LOGGER.error("Thread error on data streams creation"); }

		try{
			HTTPmessage request = new HTTPmessage(inS);
			HTTPmessage response = new HTTPmessage();

			if(request.getMethod().equals("GET")) {
				if(request.getURI().equals("/dashboard_info")) {

					String strUsername = AuthzRegistry.authorizationService().session().get().authenticatedUser().username().toString();

					ActivityFlowClient oActivityFlow = new ActivityFlowClient(Application.settings().getFluxServerIp());

					SDP2021 oProtocol = oActivityFlow.retrieveInformation(strUsername, SDP2021Code.INFO_REQUEST.getCode());

					String strMessage = oProtocol.getData();

					oActivityFlow.retrieveInformation("", SDP2021Code.END.getCode());

					int[] arrayCounter = new int[6];

					for(int i = 0; i < 6; i++){
						arrayCounter[i] = Integer.parseInt(strMessage.split(";")[i].trim());
					}

					response.setContentFromString(
							HttpServerAjaxDashboard.getPendingTasksInHTML(arrayCounter[0],arrayCounter[1],
									arrayCounter[2],arrayCounter[3],arrayCounter[4],arrayCounter[5]), "text/html");
					response.setResponseStatus("200 Ok");
				}
				else {
					String fullname=baseFolder + "/";
					if(request.getURI().equals("/")) fullname=fullname+"index.html";
					else fullname=fullname+request.getURI();
					if(response.setContentFromFile(fullname)) {
						response.setResponseStatus("200 Ok");
					}
					else {
						response.setContentFromString(
								"<html><body><h1>404 File not found</h1></body></html>",
								"text/html");
						response.setResponseStatus("404 Not Found");
					}
				}
				response.send(outS);
			}
			else { // NOT GET
				response.setContentFromString(
						"<html><body><h1>ERROR: 405 Method Not Allowed</h1></body></html>",
						"text/html");
				response.setResponseStatus("405 Method Not Allowed");
				response.send(outS);
			}

        } catch(Exception ex) {
			//LOGGER.error("Thread error when reading request");
		}

		try {
			sock.close();
		}
		catch(IOException ex) {
			//LOGGER.error("CLOSE IOException");
		}
	}
}

