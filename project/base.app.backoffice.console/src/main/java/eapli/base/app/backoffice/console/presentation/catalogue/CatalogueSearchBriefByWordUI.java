package eapli.base.app.backoffice.console.presentation.catalogue;

import eapli.base.cataloguemanagement.domain.CatalogueBriefDescription;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class CatalogueSearchBriefByWordUI extends AbstractUI {
    private static final Logger LOGGER = LogManager.getLogger(CatalogueSearchBriefByWordUI.class);

    @Override
    protected boolean doShow() {
        try {
            final String briefDescription = Console.readLine("Word to search on Brief Description:");
            ListCatalogueUI listCatalogueUI = new ListCatalogueUI(CatalogueBriefDescription.valueOf(briefDescription),
                    true);
            listCatalogueUI.show();
        } catch (final Exception ex) {
            LOGGER.error("Error while listing catalogues.");
        }
        return false;
    }

    @Override
    public String headline() {
        return "Catalogue Search by word for Brief Description";
    }

}
