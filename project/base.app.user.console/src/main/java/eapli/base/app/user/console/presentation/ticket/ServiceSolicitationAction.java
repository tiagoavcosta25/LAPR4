package eapli.base.app.user.console.presentation.ticket;

import eapli.framework.actions.Action;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class ServiceSolicitationAction implements Action {
    @Override
    public boolean execute() {
        return new ServiceSolicitationUI().show();
    }
}
