package eapli.base.app.backoffice.console.presentation.team;

import eapli.base.collaboratormanagement.application.ListCollaboratorService;
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.teammanagement.application.ListTeamTypeService;
import eapli.base.teammanagement.application.TeamCreatorController;
import eapli.base.teammanagement.domain.TeamType;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class CreateTeamUI extends AbstractUI {

    private final TeamCreatorController theController = new TeamCreatorController();
    private final ListCollaboratorService listCollaboratorService = new ListCollaboratorService();
    private final ListTeamTypeService listTeamTypeService = new ListTeamTypeService();

    @Override
    protected boolean doShow() {
        try {
            final String theTeamType = selectTeamType();
            final String acronym = Console.readLine("Acronym:");
            final String teamDescription = Console.readLine("Team Description:");
            final Collaborator collaborator = selectCollaborator();
            final Set<Collaborator> representation = new HashSet<>();
            representation.add(collaborator);
            this.theController.createTeam(theTeamType, acronym, teamDescription, representation);
        } catch (final IllegalArgumentException ex) {
            System.out.println("Something went wrong");
        }
        return false;
    }

    private String selectTeamType() {
        System.out.println("List of Team Types - Select a Team type");
        final Iterable<TeamType> listTeamType = listTeamTypeService.getTeamTypes();
        final SelectWidget<TeamType> selectorTeamType = new SelectWidget<>("Select a Team Type", listTeamType,
                new TeamTypePrinter());
        selectorTeamType.show();
        return String.valueOf(selectorTeamType.selectedElement());
    }

    private Collaborator selectCollaborator() {
        System.out.println("List of Collaborators - Select a Collaborator");
        final Iterable<Collaborator> listCollaborator = listCollaboratorService.allCollaborators();
        final SelectWidget<Collaborator> selectorCollaborator = new SelectWidget<>("Select a Collaborator", listCollaborator,
                new CollaboratorPrinter());
        selectorCollaborator.show();
        return selectorCollaborator.selectedElement();
    }

    @Override
    public String headline() {
        return "Create Team";
    }
}
