package eapli.base.app.user.console.presentation.task;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.activityfluxmanagement.specification.domain.ActivityFlux;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.taskmanagement.execution.application.ExecuteAutomaticTaskController;
import eapli.base.taskmanagement.execution.domain.AutomaticTaskExecution;
import eapli.base.taskmanagement.specification.domain.AutomaticTask;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ExecuteAutomaticTaskUI extends AbstractUI {
    private final ExecuteAutomaticTaskController theController = new ExecuteAutomaticTaskController();

    @Override
    protected boolean doShow() {
        try {

            final ActivityFluxExecution af = selectActivityFlux();

            final AutomaticTaskExecution autoTask = selectAutomaticTask(af);
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

    private AutomaticTaskExecution selectAutomaticTask(ActivityFluxExecution af) {
        System.out.println();
        System.out.println("List of Pending Automatic Tasks - Select an Automatic Task");
        final Iterable<AutomaticTaskExecution> listTasks = theController.getPendingTasks(af);
        if(!listTasks.iterator().hasNext())
            throw new IllegalArgumentException("No Pending Tasks avaiable!");
        final SelectWidget<AutomaticTaskExecution> selectorAutomaticTask = new SelectWidget<>(
                "Select an Automatic Task", listTasks, new AutomaticTaskPrinter());
        selectorAutomaticTask.show();
        return selectorAutomaticTask.selectedElement();
    }

}
