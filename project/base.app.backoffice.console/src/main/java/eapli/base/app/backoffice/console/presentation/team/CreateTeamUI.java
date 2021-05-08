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

    @Override
    protected boolean doShow() {
        try {
            final String theTeamType = selectTeamType();
            final String acronym = Console.readLine("Acronym:");
            final String teamDescription = Console.readLine("Team Description:");
            final Set<Collaborator> representation = selectCollaborators();
            this.theController.createTeam(theTeamType, acronym, teamDescription, representation);
        } catch (final IllegalArgumentException ex) {
            System.out.println("Something went wrong");
        }
        return false;
    }

    private String selectTeamType() {
        System.out.println("List of Team Types - Select a Team type");
        final Iterable<TeamType> listTeamType = theController.getTeamTypes();
        final SelectWidget<TeamType> selectorTeamType = new SelectWidget<>("Select a Team Type", listTeamType,
                new TeamTypePrinter());
        selectorTeamType.show();
        return String.valueOf(selectorTeamType.selectedElement());
    }

    private Set<Collaborator> selectCollaborators() {
        Set<Collaborator> setCollab = new HashSet<>();
        Collaborator collab = selectCollaborator();
        setCollab.add(collab);
        String decision = "";
        while(!decision.equalsIgnoreCase("Y") || !decision.equalsIgnoreCase("N")) {
            decision = Console.readLine("Do you wish to add another representative? (Y\\N) ");
            if(decision.equalsIgnoreCase("Y")) {
                collab = selectCollaborator();
                setCollab.add(collab);
            }
            else if(decision.equalsIgnoreCase("N")) {
                break;
            }
        }
        return setCollab;
    }

    private Collaborator selectCollaborator() {
        System.out.println("List of Collaborators - Select a Collaborator");
        final Iterable<Collaborator> listCollaborator = theController.getCollaborators();
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
