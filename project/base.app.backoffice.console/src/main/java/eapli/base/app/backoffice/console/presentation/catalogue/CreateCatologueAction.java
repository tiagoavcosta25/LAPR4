package eapli.base.app.backoffice.console.presentation.catalogue;

import eapli.framework.actions.Action;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class CreateCatologueAction implements Action {

    @Override
    public boolean execute() {
        return new CreateCatalogueUI().show();
    }
}
