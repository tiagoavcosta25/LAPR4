package eapli.base.app.backoffice.console.presentation.service;

import eapli.base.app.backoffice.console.presentation.collaborator.ListCollaboratorsUI;
import eapli.framework.actions.Action;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class ListServicesAction implements Action {

    @Override
    public boolean execute() {
        return new ListServicesUI().show();
    }
}
