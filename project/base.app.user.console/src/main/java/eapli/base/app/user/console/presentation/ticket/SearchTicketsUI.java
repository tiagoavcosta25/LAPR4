package eapli.base.app.user.console.presentation.ticket;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.formmanagement.domain.Attribute;
import eapli.base.formmanagement.domain.Form;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.ticketmanagement.application.SearchTicketsController;
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
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class SearchTicketsUI extends AbstractUI {

    private static final Logger LOGGER = LogManager.getLogger(SearchTicketsUI.class);
    private final SearchTicketsController theController = new SearchTicketsController();

    @Override
    protected boolean doShow() {
        try {
            Iterable<Ticket> itTickets;

            String strOp = Console.readLine("Choose Search Mode:\n\n[1] On going\n[2] History\n\nMode >");
            if (strOp.compareToIgnoreCase("1") == 0) {
                itTickets = this.theController.getOnGoingTickets();
            } else {
                itTickets = this.theController.getTicketHistory();
            }

            do {
                Ticket oTicket = chooseOne(itTickets, "Your Tickets", "Ticket");
                System.out.println(oTicket.detailedView());
                strOp = Console.readLine("Do you want to see a detailed view of some more tickets? (Y/N) >");
            } while (strOp.compareToIgnoreCase("Y") == 0);

        } catch(Exception e){
            LOGGER.error("Error in searching a Ticket.");
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
                System.out.println("There is no " + strElementName + "s in the Database.\n\n");
                return null;
            }
            Integer intOp = Integer.parseInt(Console.readLine("\n\n\nChoose " + strElementName + " Number For a Detailed View >"));

            return lstTemp.get(intOp - 1);

        } catch (Exception e){
            LOGGER.error("Error in selecting.\n\n");
            return null;
        }
    }

    @Override
    public String headline() {
        return "Search Tickets";
    }
}
