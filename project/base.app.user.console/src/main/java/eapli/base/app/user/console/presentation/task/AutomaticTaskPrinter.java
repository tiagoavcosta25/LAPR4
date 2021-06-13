package eapli.base.app.user.console.presentation.task;

import eapli.base.taskmanagement.specification.domain.AutomaticTask;
import eapli.framework.visitor.Visitor;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class AutomaticTaskPrinter implements Visitor<AutomaticTask> {

    @Override
    public void visit(AutomaticTask visitee) {
        System.out.printf("Automatic Task %s", visitee.toString());
    }
}
