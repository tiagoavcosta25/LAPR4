package eapli.base.app.user.console.presentation.task;

import eapli.base.taskmanagement.execution.domain.AutomaticTaskExecution;
import eapli.base.taskmanagement.specification.domain.AutomaticTask;
import eapli.framework.visitor.Visitor;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class AutomaticTaskPrinter implements Visitor<AutomaticTaskExecution> {

    @Override
    public void visit(AutomaticTaskExecution visitee) {
        System.out.printf("Automatic Task - %s", visitee.toString());
    }
}
