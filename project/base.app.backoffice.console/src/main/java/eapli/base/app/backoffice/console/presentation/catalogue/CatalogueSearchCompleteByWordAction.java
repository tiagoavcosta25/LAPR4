package eapli.base.app.backoffice.console.presentation.catalogue;

import eapli.base.cataloguemanagement.domain.CatalogueCompleteDescription;
import eapli.framework.actions.Action;


/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class CatalogueSearchCompleteByWordAction implements Action {


    @Override
    public boolean execute() {
        return new CatalogueSearchCompleteByWordUI().show();
    }
}
