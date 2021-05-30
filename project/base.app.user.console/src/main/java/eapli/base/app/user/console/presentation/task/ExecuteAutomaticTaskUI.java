package eapli.base.app.user.console.presentation.task;

import eapli.base.activityfluxmanagement.domain.ActivityFlux;
import eapli.base.formmanagement.domain.Attribute;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.taskmanagement.application.ExecuteAutomaticTaskController;
import eapli.base.taskmanagement.domain.AutomaticTask;
import eapli.base.taskmanagement.domain.ManualTask;
import eapli.base.ticketmanagement.domain.Response;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ExecuteAutomaticTaskUI extends AbstractUI {
    private final ExecuteAutomaticTaskController theController = new ExecuteAutomaticTaskController();

    @Override
    protected boolean doShow() {
        try {

            final ActivityFlux af = selectActivityFlux();

            final AutomaticTask autoTask = selectAutomaticTask(af);
            int id = Math.toIntExact(autoTask.identity());
            System.out.println();
            String strOp = Console.readLine("Confirm the execution of task with code " + id + "? (Y/N) ");

            if(strOp.compareToIgnoreCase("Y") == 0){
                this.theController.executeTask(autoTask);
                System.out.printf("Operation Successful. The Following Automatic Task was executed successfully > id:" +
                        " %s\n\n", id);
            } else{
                System.out.println("Operation Cancelled.");
            }
        } catch (final Exception ex) {
            System.out.println("Error while executing an Automatic Task. " + ex.getMessage());
        }
        return false;
    }

    private AutomaticTask selectAutomaticTask(ActivityFlux af) {
        System.out.println();
        System.out.println("List of Pending Automatic Tasks - Select an Automatic Task");
        final Iterable<AutomaticTask> listTasks = theController.getPendingTasks(af);
        if(!listTasks.iterator().hasNext())
            throw new IllegalArgumentException("No Pending Tasks avaiable!");
        final SelectWidget<AutomaticTask> selectorAutomaticTask = new SelectWidget<>("Select an Automatic Task", listTasks,
                new AutomaticTaskPrinter());
        selectorAutomaticTask.show();
        return selectorAutomaticTask.selectedElement();
    }

    private ActivityFlux selectActivityFlux() {
        System.out.println();
        System.out.println("List of Activity Flux - Select an Activity Flux");
        final Iterable<Service> listActivityFlux = theController.getActivityFlow();
        if(!listActivityFlux.iterator().hasNext())
            throw new IllegalArgumentException("No Pending Tasks avaiable!");
        final SelectWidget<Service> selectorActivityFlux = new SelectWidget<>("Select an Activity Flow", listActivityFlux,
                new ActivityFluxPrinter());
        selectorActivityFlux.show();
        return selectorActivityFlux.selectedElement().flux();
    }

    @Override
    public String headline() {
        return "Execute Manual Task";
    }
}
