package eapli.base.app.user.console.presentation.task;

import eapli.base.taskmanagement.specification.domain.ManualTask;
import eapli.framework.visitor.Visitor;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ManualTaskPrinter implements Visitor<ManualTask> {

    @Override
    public void visit(ManualTask visitee) {
        System.out.printf("Manual Task %s", visitee.toString());
    }
}
