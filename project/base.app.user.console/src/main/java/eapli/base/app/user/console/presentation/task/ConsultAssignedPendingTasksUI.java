package eapli.base.app.user.console.presentation.task;

import eapli.base.taskmanagement.execution.application.ConsultAssignedPendingTasksController;
import eapli.base.taskmanagement.specification.domain.TaskFilterFields;
import eapli.base.taskmanagement.specification.domain.TaskOrderFields;
import eapli.base.ticketmanagement.domain.Ticket;
import eapli.base.ticketmanagement.domain.TicketUrgency;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractListUI;
import eapli.framework.visitor.Visitor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ConsultAssignedPendingTasksUI extends AbstractListUI<Ticket> {

    private static final Logger LOGGER = LogManager.getLogger(ConsultAssignedPendingTasksUI.class);
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
        List<Ticket> list = new ArrayList<>();
        for(Ticket t : elements) {
            list.add(t);
        }
        super.doShow();
        if(!elements.iterator().hasNext()) return true;
        String strOp = Console.readLine("\n\nDo you wish to filter/Order this results? (Filter/Order/N) ");
        if (strOp.compareToIgnoreCase("Filter") == 0) {
            String filters = getStringFilters("TaskFilter");
            String filterBy = Console.readLine("\n\nWhat do you wish to filter by? (" + filters + ") ");
            if(filterBy.compareToIgnoreCase(TaskFilterFields.PRIORITY.toString()) == 0) {
                String priorities = getStringFilters(TaskFilterFields.PRIORITY.toString());
                filterBy = Console.readLine("\n\nInsert priority to filter by. (" + priorities + ") ");
                System.out.println("\n");
                this.elements = theController.getTasksOfCollaborator(TaskFilterFields.PRIORITY, filterBy);
                super.doShow();
            } else if(filterBy.compareToIgnoreCase(TaskFilterFields.FINISHDATE.toString()) == 0) {
                String Year = Console.readLine("\n\nInput year:");
                String Month = Console.readLine("\nInput month:");
                String Day = Console.readLine("\nInput day:");
                if(Month.length() == 1) {
                    Month = "0" + Month;
                }
                if(Day.length() == 1) {
                    Day = "0" + Day;
                }
                filterBy = Year + Month + Day;
                System.out.println("\n");
                this.elements = theController.getTasksOfCollaborator(TaskFilterFields.FINISHDATE, filterBy);
                super.doShow();
            } else {
                LOGGER.error("Unrecognized filter.");
            }
        } else if(strOp.compareToIgnoreCase("Order") == 0) {
            String orders = getStringFilters("TaskOrder");
            String orderBy = Console.readLine("\n\nWhat do you wish to order by? (" + orders + ") ");
            if(orderBy.compareToIgnoreCase(TaskOrderFields.PRIORITY.toString()) == 0) {
                System.out.println("\n");
                this.elements = theController.getTasksOfCollaborator(TaskOrderFields.PRIORITY);
                super.doShow();
            } else if(orderBy.compareToIgnoreCase(TaskOrderFields.REVERSEPRIORITY.toString()) == 0) {
                System.out.println("\n");
                this.elements = theController.getTasksOfCollaborator(TaskOrderFields.REVERSEPRIORITY);
                super.doShow();
            } else if(orderBy.compareToIgnoreCase(TaskOrderFields.FINISHDATE.toString()) == 0) {
                System.out.println("\n");
                this.elements = theController.getTasksOfCollaborator(TaskOrderFields.FINISHDATE);
                super.doShow();
            } else if(orderBy.compareToIgnoreCase(TaskOrderFields.REVERSEFINISHDATE.toString()) == 0) {
                System.out.println("\n");
                this.elements = theController.getTasksOfCollaborator(TaskOrderFields.REVERSEFINISHDATE);
                super.doShow();
            }
            else {
                LOGGER.error("Unrecognized filter.");
            }
        }else{
            System.out.println();
        }
        return true;
    }

    private String getStringFilters(String typeOfFilter) {
        StringBuilder filters = new StringBuilder();
        switch(typeOfFilter) {
            case "TaskFilter":
                Iterable<TaskFilterFields> filterFields = this.theController.getTaskFilterFields();
                for(TaskFilterFields tff : filterFields) {
                    filters.append(tff.toString()).append("/");
                }
                filters.deleteCharAt(filters.length() - 1);
                break;
            case "PRIORITY":
                Iterable<TicketUrgency> priorityFilters = this.theController.getPriorityFilters();
                for(TicketUrgency tf : priorityFilters) {
                    filters.append(tf.toString()).append("/");
                }
                filters.deleteCharAt(filters.length() - 1);
                break;
            case "TaskOrder":
                Iterable<TaskOrderFields> taskOrder = this.theController.getTaskOrderFields();
                for(TaskOrderFields tf : taskOrder) {
                    filters.append(tf.toString()).append("/");
                }
                filters.deleteCharAt(filters.length() - 1);
                break;
        }
        return filters.toString();
    }


}
