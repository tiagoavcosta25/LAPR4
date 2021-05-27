package eapli.base.app.backoffice.console.presentation.servicesolicitation;

import eapli.base.app.backoffice.console.presentation.utils.PrintList;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicesolicitationmanagement.application.ServiceSolicitationController;
import eapli.base.servicesolicitationmanagement.domain.*;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

import java.time.LocalDate;
import java.util.*;

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

            final String strUrgency = Console.readLine("Urgency >");
            final Integer intMonth = Integer.parseInt(Console.readLine("Limit Date (month) >"));
            final Integer intDay = Integer.parseInt(Console.readLine("Limit Date (day) >"));

            final LocalDate dtLimitDate = LocalDate.of(LocalDate.now().getYear(), intMonth, intDay);

            String strOp;
            List<TicketFile> lstFiles = new ArrayList<>();

            do {
                final String strFile = Console.readLine("File >");
                lstFiles.add(TicketFile.valueOf(strFile));
                strOp = Console.readLine("Do you want to add more files? (Y/N) >");
            } while (strOp.compareToIgnoreCase("Y") == 0);

            List<TicketResponse> lstResponses = new ArrayList<>();

            do {
                final String strResponse = Console.readLine("Response >");
                //theController.addResponse(strResponse);
                lstResponses.add(TicketResponse.valueOf(strResponse));
                strOp = Console.readLine("Do you want to add more responses? (Y/N) >");
            } while (strOp.compareToIgnoreCase("Y") == 0);


            Ticket oTicket = this.theController.addTicket(oService, TicketUrgency.stringToTicketUrgency(strUrgency),
                    TicketLimitDate.valueOf(dtLimitDate), lstResponses, lstFiles);

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
