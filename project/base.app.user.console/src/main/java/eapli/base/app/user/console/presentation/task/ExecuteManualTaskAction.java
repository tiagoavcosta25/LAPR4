package eapli.base.app.user.console.presentation.task;

import eapli.framework.actions.Action;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ExecuteManualTaskAction implements Action {
    @Override
    public boolean execute() {
        return new ExecuteManualTaskUI().doShow();
    }
}
