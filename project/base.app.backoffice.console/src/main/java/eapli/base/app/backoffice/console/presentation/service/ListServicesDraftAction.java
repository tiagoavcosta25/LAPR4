package eapli.base.app.backoffice.console.presentation.service;

import eapli.framework.actions.Action;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class ListServicesDraftAction implements Action {

    @Override
    public boolean execute() {
        return new ListServicesDraftUI().show();
    }
}
