package eapli.base.app.backoffice.console.presentation.catalogue;

import eapli.base.cataloguemanagement.domain.CatalogueTitle;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class CatalogueSearchTitleByWordUI extends AbstractUI {

    private static final Logger LOGGER = LogManager.getLogger(CatalogueSearchTitleByWordUI.class);

    @Override
    protected boolean doShow() {
        try {
            final String title = Console.readLine("Word to search by on Title:");
            ListCatalogueUI listCatalogueUI = new ListCatalogueUI(CatalogueTitle.
                    valueOf(title), true);
            listCatalogueUI.show();
        } catch (final Exception ex) {
            LOGGER.error("Error while listing catalogues.");
        }
        return false;
    }

    @Override
    public String headline() {
        return "Catalogue Search by word Title";
    }
}
