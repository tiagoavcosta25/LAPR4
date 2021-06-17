package eapli.base.app.backoffice.console.presentation.catalogue;

import eapli.base.cataloguemanagement.domain.CatalogueCompleteDescription;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class CatalogueSearchCompleteUI extends AbstractUI {

    private static final Logger LOGGER = LogManager.getLogger(CatalogueSearchCompleteUI.class);

    @Override
    protected boolean doShow() {
        try {
            final String completeDescription = Console.readLine("Complete description to search by:");
            ListCatalogueUI listCatalogueUI = new ListCatalogueUI(CatalogueCompleteDescription.
                    valueOf(completeDescription), false);
            listCatalogueUI.show();
        } catch (final Exception ex) {
            LOGGER.error("Error while listing catalogues.");
        }
        return false;
    }

    @Override
    public String headline() {
        return "Catalogue Search by Complete Description";
    }
}
