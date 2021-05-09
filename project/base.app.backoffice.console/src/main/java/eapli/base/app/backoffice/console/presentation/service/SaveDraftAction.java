package eapli.base.app.backoffice.console.presentation.service;

import eapli.base.app.backoffice.console.presentation.collaborator.AddCollabToTeamUI;
import eapli.framework.actions.Action;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class SaveDraftAction implements Action {
    @Override
    public boolean execute() {
        return new SaveDraftUI().show();
    }
}
