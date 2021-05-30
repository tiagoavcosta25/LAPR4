package eapli.base.app.user.console.presentation.task;


import eapli.base.formmanagement.domain.Attribute;
import eapli.base.taskmanagement.application.ExecuteManualTaskController;
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
public class ExecuteManualTaskUI extends AbstractUI {

    private final ExecuteManualTaskController theController = new ExecuteManualTaskController();

    @Override
    protected boolean doShow() {
        try {
            final ManualTask manualTask = selectManualTask();
            int id = Math.toIntExact(manualTask.identity());
            List<String> responses = new ArrayList<>();
            System.out.println("Complete the form:");
            for(Attribute attr : manualTask.form().attributes()) {
                responses.add(Console.readLine(attr.label().toString()));
            }
            Response rp = new Response(manualTask.form(), responses);
            String strOp = Console.readLine("Confirm the execution of task with code " + id + "? (Y/N) ");

            if(strOp.compareToIgnoreCase("Y") == 0){
                this.theController.executeTask(manualTask, rp);
                System.out.printf("Operation Successful. The Following Manual Task was created successfully > id:" +
                        " %s\n\n", id);
            } else{
                System.out.println("Operation Cancelled.");
            }
        } catch (final Exception ex) {
            System.out.println("Error while executing a Manual Task. " + ex.getMessage());
        }
        return false;
    }

    private ManualTask selectManualTask() {
        System.out.println("List of Pending Manual Tasks - Select a Manual Task");
        final Iterable<ManualTask> listTasks = theController.getUserPendingTasks();
        if(!listTasks.iterator().hasNext())
            throw new IllegalArgumentException("No Pending Tasks avaiable!");
        final SelectWidget<ManualTask> selectorManualTask = new SelectWidget<>("Select a Manual Task", listTasks,
                new ManualTaskPrinter());
        selectorManualTask.show();
        return selectorManualTask.selectedElement();
    }

    @Override
    public String headline() {
        return "Execute Manual Task";
    }
}
