package eapli.base.app.backoffice.console.presentation.collaborator;

import eapli.framework.actions.Action;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ListCollaboratorTeamsAction implements Action {
    @Override
    public boolean execute() {
        return new ListCollaboratorTeamsUI().show();
    }
}
