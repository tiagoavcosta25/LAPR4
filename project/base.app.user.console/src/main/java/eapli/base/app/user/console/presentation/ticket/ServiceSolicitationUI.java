package eapli.base.app.user.console.presentation.ticket;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.formmanagement.domain.Attribute;
import eapli.base.formmanagement.domain.Form;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.ticketmanagement.application.ServiceSolicitationController;
import eapli.base.ticketmanagement.domain.Ticket;
import eapli.base.ticketmanagement.domain.TicketUrgency;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
public class ServiceSolicitationUI extends AbstractUI {

    private static final Logger LOGGER = LogManager.getLogger(ServiceSolicitationUI.class);
    private final ServiceSolicitationController theController = new ServiceSolicitationController();

    @Override
    protected boolean doShow() {
        try {

            Iterable<Catalogue> itCatalogues = this.theController.getCataloguesByUser();
            Catalogue oCatalogue = chooseOne(itCatalogues, "Choose a Catalogue", "Catalogue");
            Iterable<Service> itServices = this.theController.getServicesByCatalogue(oCatalogue);
            Service oService = chooseOne(itServices, "Choose a Service", "Service");

            TicketUrgency oTicketUrgency = chooseOne(this.theController.showUrgencies(), "Choose a Urgency for this Ticket", "Urgency");
            final Integer intYear = Integer.parseInt(Console.readLine("Limit Date (year) >"));
            final Integer intMonth = Integer.parseInt(Console.readLine("Limit Date (month) >"));
            final Integer intDay = Integer.parseInt(Console.readLine("Limit Date (day) >"));
            final Integer intHour = Integer.parseInt(Console.readLine("Limit Date (hour) >"));
            final Integer intMinute = Integer.parseInt(Console.readLine("Limit Date (minute) >"));

            final LocalDateTime dtLimitDate = LocalDateTime.of(intYear, intMonth, intDay, intHour, intMinute);

            String strOp;

            do {
                final String strFile = Console.readLine("File Name (Present in the XML Folder) >");
                this.theController.addFile(strFile);
                strOp = Console.readLine("Do you want to add more files? (Y/N) >");
            } while (strOp.compareToIgnoreCase("Y") == 0);

            for(Form f : oService.forms()) {
                System.out.printf("\nForm: %s\n\n------------------------------------------------\n\n", f.name().toString());
                for(Attribute a : f.attributes()) {
                    String strQuestion = a.label() + " >";
                    String strResponse = Console.readLine(strQuestion);
                    theController.addResponse(strResponse);
                }
                System.out.printf("\n\n------------------------------------------------\n\n");
                theController.createResponse(f);
            }


            Ticket oTicket = this.theController.addTicket(oService, oTicketUrgency.toString(),
                    dtLimitDate, LocalDateTime.now());

            strOp = Console.readLine("Confirm the creation of this ticket (Y/N) >");

            if(strOp.compareToIgnoreCase("Y") == 0){
                oTicket = this.theController.saveTicket(oTicket);
                LOGGER.info("\nOperation Successful. The Following Ticket was created successfully > {}\n\n", oTicket.toString());
            } else{
                LOGGER.info("\nOperation Cancelled.\n\n");
            }
        } catch(Exception e){
            LOGGER.error("Error in creating a Ticket.");
        }

        return false;
    }

    public static <T> T chooseOne(Iterable<T> itElements, String strHeader, String strElementName) {
        try{
            Integer i = 1;
            List<T> lstTemp = new ArrayList<>();
            System.out.printf("\n==========================================\n%s\n==========================================\n\n", strHeader);
            for(T t : itElements){
                System.out.printf("[%d] %s\n", i, t.toString());
                i++;
                lstTemp.add(t);
            }
            if(lstTemp.isEmpty()){
                System.out.printf("There is no " + strElementName + "s in the Database.\n\n");
                return null;
            }
            Integer intOp = Integer.parseInt(Console.readLine("\n\n\nSelect " + strElementName + " Number >"));

            return lstTemp.get(intOp - 1);

        } catch (Exception e){
            LOGGER.error("Error in selecting.\n\n");
            return null;
        }
    }

    @Override
    public String headline() {
        return "Service Solicitation";
    }
}
