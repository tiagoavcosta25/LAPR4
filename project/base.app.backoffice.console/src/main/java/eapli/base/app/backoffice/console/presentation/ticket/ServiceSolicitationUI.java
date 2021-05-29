package eapli.base.app.backoffice.console.presentation.ticket;

import eapli.base.app.backoffice.console.presentation.utils.PrintList;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.formmanagement.domain.Attribute;
import eapli.base.formmanagement.domain.Form;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.ticketmanagement.application.ServiceSolicitationController;
import eapli.base.ticketmanagement.domain.*;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
public class ServiceSolicitationUI extends AbstractUI {

    private final ServiceSolicitationController theController = new ServiceSolicitationController();

    @Override
    protected boolean doShow() {
        try {

            Iterable<Catalogue> itCatalogues = this.theController.getCataloguesByUser();
            Catalogue oCatalogue = PrintList.chooseOne(itCatalogues, "Choose a Catalogue", "Catalogue");
            Iterable<Service> itServices = this.theController.getServicesByCatalogue(oCatalogue);
            Service oService = PrintList.chooseOne(itServices, "Choose a Service", "Service");

            TicketUrgency oTicketUrgency = PrintList.chooseOne(this.theController.showUrgencies(), "Choose a Urgency for this Ticket", "Urgency");
            final Integer intYear = Integer.parseInt(Console.readLine("Limit Date (year) >"));
            final Integer intMonth = Integer.parseInt(Console.readLine("Limit Date (month) >"));
            final Integer intDay = Integer.parseInt(Console.readLine("Limit Date (day) >"));
            final Integer intHour = Integer.parseInt(Console.readLine("Limit Date (hour) >"));
            final Integer intMinute = Integer.parseInt(Console.readLine("Limit Date (minute) >"));

            final LocalDateTime dtLimitDate = LocalDateTime.of(intYear, intMonth, intDay, intHour, intMinute);

            String strOp;

            do {
                final String strFile = Console.readLine("File >");
                this.theController.addFile(strFile);
                strOp = Console.readLine("Do you want to add more files? (Y/N) >");
            } while (strOp.compareToIgnoreCase("Y") == 0);

            for(Form f : oService.forms()) {
                System.out.printf("\nForm: %s\n\n------------------------------------------------\n\n", f.name().toString());
                for(Attribute a : f.attributes()) {
                    String strQuestion = a.label() + " >";
                    theController.addResponse(Console.readLine(strQuestion));
                }
                System.out.printf("\n\n------------------------------------------------\n\n");
            }


            Ticket oTicket = this.theController.addTicket(oService, oTicketUrgency.toString(),
                    dtLimitDate, LocalDateTime.now());

            strOp = Console.readLine("Confirm the creation of this ticket (Y/N) >");

            if(strOp.compareToIgnoreCase("Y") == 0){
                oTicket = this.theController.saveTicket(oTicket);
                System.out.printf("\nOperation Successful. The Following Ticket was created successfully > %s\n\n", oTicket.toString());
            } else{
                System.out.println("\nOperation Cancelled.\n\n");
            }
        } catch(Exception e){
            System.out.println("Error in creating a Ticket.");
        }

        return false;
    }

    @Override
    public String headline() {
        return "Service Solicitation";
    }
}
