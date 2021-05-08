package eapli.base.app.backoffice.console.presentation.teamtype;

import eapli.framework.actions.Action;

/**
 * @author João Parente 1190740@isep.ipp.pt
 */
public class TeamTypeRegisterAction implements Action {
    @Override
    public boolean execute() {
        return new TeamTypeRegisterUI().show();
    }
}
