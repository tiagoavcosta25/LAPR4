package eapli.base.app.backoffice.console.presentation.catalogue;

import eapli.base.cataloguemanagement.domain.CatalogueBriefDescription;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class CatalogueSearchBriefUI extends AbstractUI {

    @Override
    protected boolean doShow() {
        try {
            final String briefDescription = Console.readLine("Brief description to search by:");
            ListCatalogueUI listCatalogueUI = new ListCatalogueUI(CatalogueBriefDescription.valueOf(briefDescription),
                    false);
            listCatalogueUI.show();
        } catch (final Exception ex) {
            System.out.println("Error while listing catalogues.");
        }
        return false;
    }

    @Override
    public String headline() {
        return "Catalogue Search by Brief Description";
    }
}
