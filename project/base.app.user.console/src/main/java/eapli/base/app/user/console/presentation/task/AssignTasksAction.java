package eapli.base.app.user.console.presentation.task;

import eapli.framework.actions.Action;

/**
 * @author Beatriz Seixas 1190424@isep.ipp.pt
 */
public class AssignTasksAction implements Action {
    @Override
    public boolean execute() {
        return new AssignTasksUI().show();
    }
}

