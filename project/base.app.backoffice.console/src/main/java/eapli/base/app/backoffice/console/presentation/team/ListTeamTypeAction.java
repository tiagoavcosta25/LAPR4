package eapli.base.app.backoffice.console.presentation.team;

import eapli.framework.actions.Action;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ListTeamTypeAction implements Action {

    @Override
    public boolean execute() {
        return new ListTeamTypeUI().show();
    }
}
