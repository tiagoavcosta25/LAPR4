package eapli.base.app.user.console.presentation.task;

import eapli.base.taskmanagement.execution.domain.ManualTaskExecution;
import eapli.base.taskmanagement.specification.domain.ManualTask;
import eapli.framework.visitor.Visitor;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ManualTaskPrinter implements Visitor<ManualTaskExecution> {

    @Override
    public void visit(ManualTaskExecution visitee) {
        System.out.printf("Manual Task - %s", visitee.toString());
    }
}
