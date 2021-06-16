package eapli.base.app.user.console.presentation.task;

import eapli.base.app.user.console.utils.PrintList;
import eapli.base.taskmanagement.execution.application.AssignTasksController;
import eapli.base.taskmanagement.execution.domain.ManualTaskExecution;
import eapli.base.taskmanagement.specification.domain.ManualTask;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

/**
 *
 * @author Tiago Costa 1191460@isep.ipp.pt
 * @author Beatriz Seixas 1190424@isep.ipp.pt
 */
public class AssignTasksUI extends AbstractUI {

    private final AssignTasksController theController = new AssignTasksController();

    @Override
    protected boolean doShow() {
        try {

            Iterable<ManualTaskExecution> itTasks = this.theController.getPendingTasks();
            String op;
            do{
                ManualTaskExecution oManualTask = PrintList.chooseOne(itTasks, "Choose a Task", "Task");
                if (oManualTask == null)
                    throw new Exception("Error assigning task!");
                theController.assignTask(oManualTask);
                op = Console.readLine("Do you want to assign more task (Y/N) >");
            } while(op.compareToIgnoreCase("y") == 0);

        } catch(Exception e){
            System.out.println("Error in assigning a Task!");
        }

        return false;
    }

    @Override
    public String headline() {
        return "Assign Tasks";
    }
}