package eapli.base.app.user.console.presentation.task;

import eapli.framework.actions.Action;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ConsultAssignedPendingTaskAction implements Action {
    @Override
    public boolean execute() {
        return new ConsultAssignedPendingTasksUI().show();
    }
}
