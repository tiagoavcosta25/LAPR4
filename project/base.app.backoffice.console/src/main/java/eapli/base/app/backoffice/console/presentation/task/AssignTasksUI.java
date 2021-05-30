package eapli.base.app.backoffice.console.presentation.task;

import eapli.base.app.backoffice.console.presentation.utils.PrintList;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.formmanagement.domain.Attribute;
import eapli.base.formmanagement.domain.Form;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.taskmanagement.application.AssignTasksController;
import eapli.base.taskmanagement.domain.ManualTask;
import eapli.base.ticketmanagement.application.ServiceSolicitationController;
import eapli.base.ticketmanagement.domain.Ticket;
import eapli.base.ticketmanagement.domain.TicketUrgency;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

import java.time.LocalDateTime;

/**
 * @author Beatriz Seixas 1190424@isep.ipp.pt
 */
public class AssignTasksUI extends AbstractUI {

    private final AssignTasksController theController = new AssignTasksController();

    @Override
    protected boolean doShow() {
        try {

            Iterable<ManualTask> itTasks = this.theController.getPendingTasks();
            String op;
            do{
                ManualTask oManualTask = PrintList.chooseOne(itTasks, "Choose a Task", "Task");
                theController.assignTask(oManualTask);
                op = Console.readLine("Do you want to assign more task (Y/N) >");
            } while(op.compareToIgnoreCase("y") == 0);

        } catch(Exception e){
            System.out.println("Error in assigning a Task.");
        }

        return false;
    }

    @Override
    public String headline() {
        return "Assign Tasks";
    }
}