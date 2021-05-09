package eapli.base.app.backoffice.console.presentation.catalogue;

import eapli.base.app.backoffice.console.presentation.team.TeamPrinter;
import eapli.base.cataloguemanagement.application.CatalogueSearchController;
import eapli.base.cataloguemanagement.domain.CatalogueCompleteDescription;
import eapli.base.teammanagement.domain.Team;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class CatalogueSearchByTeamUI extends AbstractUI {


    private final CatalogueSearchController theController = new CatalogueSearchController();

    @Override
    protected boolean doShow() {
        try {
            final Team theTeam = selectTeam();
            ListCatalogueUI listCatalogueUI = new ListCatalogueUI(theTeam);
            listCatalogueUI.show();
        } catch (final Exception ex) {
            System.out.println("Error while listing catalogues.");
        }
        return false;
    }

    private Team selectTeam() {
        System.out.println("List of Teams - Select a Team");
        final Iterable<Team> listTeams = theController.getTeams();
        final SelectWidget<Team> selectorTeam = new SelectWidget<>(" Select a Team to give access", listTeams,
                new TeamPrinter());
        selectorTeam.show();
        return selectorTeam.selectedElement();
    }

    @Override
    public String headline() {
        return "Catalogue Search by word Complete Description";
    }
}
