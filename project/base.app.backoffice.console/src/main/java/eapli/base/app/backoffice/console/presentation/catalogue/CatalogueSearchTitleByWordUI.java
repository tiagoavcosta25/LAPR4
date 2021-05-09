package eapli.base.app.backoffice.console.presentation.catalogue;

import eapli.base.cataloguemanagement.domain.CatalogueTitle;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class CatalogueSearchTitleByWordUI extends AbstractUI {

    @Override
    protected boolean doShow() {
        try {
            final String title = Console.readLine("Word to search by on Title:");
            ListCatalogueUI listCatalogueUI = new ListCatalogueUI(CatalogueTitle.
                    valueOf(title), true);
            listCatalogueUI.show();
        } catch (final Exception ex) {
            System.out.println("Error while listing catalogues.");
        }
        return false;
    }

    @Override
    public String headline() {
        return "Catalogue Search by word Title";
    }
}
