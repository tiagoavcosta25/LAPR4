package eapli.base.app.backoffice.console.presentation.catalogue;

import eapli.base.app.backoffice.console.presentation.team.CollaboratorPrinter;
import eapli.base.app.backoffice.console.presentation.team.TeamPrinter;
import eapli.base.app.backoffice.console.presentation.team.TeamTypePrinter;
import eapli.base.cataloguemanagement.application.CatalogueSpecificationController;
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.formmanagement.domain.FormType;
import eapli.base.servicemanagement.domain.ServiceDraft;
import eapli.base.teammanagement.application.TeamCreatorController;
import eapli.base.teammanagement.domain.Team;
import eapli.base.teammanagement.domain.TeamType;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;

import java.util.HashSet;
import java.util.Set;


public class CreateCatalogueUI extends AbstractUI {

    private final CatalogueSpecificationController theController = new CatalogueSpecificationController();

    @Override
    protected boolean doShow() {
        try {
            final String title = Console.readLine("Title:");
            final String briefDescription = Console.readLine("Brief Description:");
            final String completeDescription = Console.readLine("Complete Description:");
            final Collaborator collaborator = selectCollaborator();
            final Set<Team> access = new HashSet<>();
            this.theController.createCatalog(title, briefDescription, completeDescription, collaborator,access);
        } catch (final IllegalArgumentException ex) {
            System.out.println("Something went wrong");
        }
        return false;
    }


    private Collaborator selectCollaborator() {
        System.out.println("List of Collaborators - Select a Collaborator");
        final Iterable<Collaborator> listCollaborator = theController.getCollaborators();
        final SelectWidget<Collaborator> selectorCollaborator = new SelectWidget<>("Select a Collaborator", listCollaborator,
                new CollaboratorPrinter());
        selectorCollaborator.show();
        return selectorCollaborator.selectedElement();
    }
    private Team selectTeam() {
        System.out.println("List of Teams - Select a Team");
        final Iterable<Team> listTeams = theController.getTeams();
        final SelectWidget<Team> selectorTeam = new SelectWidget<>("Select a Team", listTeams,
                new TeamPrinter());
        selectorTeam.show();
        return selectorTeam.selectedElement();

    }


    @Override
    public String headline() {
        return "Create Catalogue";
    }
}
