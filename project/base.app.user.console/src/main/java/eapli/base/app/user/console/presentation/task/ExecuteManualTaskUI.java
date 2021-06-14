package eapli.base.app.user.console.presentation.task;


import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.activityfluxmanagement.specification.domain.ActivityFlux;
import eapli.base.formmanagement.domain.Attribute;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.taskmanagement.execution.application.ExecuteManualTaskController;
import eapli.base.taskmanagement.execution.domain.ManualTaskExecution;
import eapli.base.taskmanagement.specification.domain.ManualTask;
import eapli.base.ticketmanagement.domain.Response;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ExecuteManualTaskUI extends AbstractUI {

    private final ExecuteManualTaskController theController = new ExecuteManualTaskController();

    @Override
    protected boolean doShow() {
        try {

            final ActivityFluxExecution af = selectActivityFlux();

            final ManualTaskExecution manualTask = selectManualTask(af);
            int id = Math.toIntExact(manualTask.identity());
            List<String> responses = new ArrayList<>();
            System.out.println();
            System.out.println("Complete the form:");
            System.out.println();
            for(Attribute attr : manualTask.getM_oManualTask().form().attributes()) {
                responses.add(Console.readLine(attr.label().toString() + " >"));
                System.out.println();
            }
            Response rp = new Response(manualTask.getM_oManualTask().form(), responses);
            String strOp = Console.readLine("Confirm the execution of task with code " + id + "? (Y/N) ");

            if(strOp.compareToIgnoreCase("Y") == 0){
                this.theController.executeTask(manualTask, rp);
                System.out.printf("Operation Successful. The Following Manual Task was executed successfully > id:" +
                        " %s\n\n", id);
            } else{
                System.out.println("Operation Cancelled.");
            }
        } catch (final Exception ex) {
            System.out.println("Error while executing a Manual Task. " + ex.getMessage());
        }
        return false;
    }


}
