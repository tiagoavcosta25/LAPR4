package eapli.base.app.user.console.presentation.task;

import eapli.base.taskmanagement.execution.application.ConsultAssignedPendingTasksController;
import eapli.base.taskmanagement.specification.domain.TaskFilterFields;
import eapli.base.taskmanagement.specification.domain.TaskOrderFields;
import eapli.base.ticketmanagement.domain.Ticket;
import eapli.base.ticketmanagement.domain.TicketUrgency;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractListUI;
import eapli.framework.visitor.Visitor;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ConsultAssignedPendingTasksUI extends AbstractListUI<Ticket> {

    private final ConsultAssignedPendingTasksController theController = new ConsultAssignedPendingTasksController();
    private Iterable<Ticket> elements;

    public ConsultAssignedPendingTasksUI() {
        //Casual constructor
    }

    @Override
    public String headline() {
        return "List Pending Tasks";
    }

    @Override
    protected String emptyMessage() {
        return "No data.";
    }

    @Override
    protected Iterable<Ticket> elements() {
        return this.elements;
    }

    @Override
    protected Visitor<Ticket> elementPrinter() {
        return new TicketManualTaskPrinter();
    }

    @Override
    protected String elementName() {
        return "Manual Task";
    }

    @Override
    protected String listHeader() {
        return String.format("#  %-5s%-45s%-20s%-30s", "ID" , "NAME", "PRIORITY", "FINISH DATE");
    }

    @Override
    protected boolean doShow() {
        this.elements = theController.getTasksOfCollaborator();
        super.doShow();

        String strOp = Console.readLine("\n\nDo you wish to filter/Order this results? (Filter/Order/N) ");
        if (strOp.compareToIgnoreCase("Filter") == 0) {
            String filters = getStringFilters("TaskFilter");
            String filterBy = Console.readLine("\n\nWhat do you wish to filter by? (" + filters + ") ");
            if(filterBy.compareToIgnoreCase("Priority") == 0) {
                String priorities = getStringFilters("Priority");
                filterBy = Console.readLine("\n\nInsert priority to filter by. (" + priorities + ") ");
                System.out.println("\n");
                this.elements = theController.getTasksOfCollaborator(TaskFilterFields.PRIORITY, filterBy);
                super.doShow();
            } else if(filterBy.compareToIgnoreCase("FinishDate") == 0) {

            } else {
                System.out.println("Unrecognized filter.");
            }
        } else if(strOp.compareToIgnoreCase("Order") == 0) {

        }else{
            System.out.println();
        }
        return true;
    }


}
