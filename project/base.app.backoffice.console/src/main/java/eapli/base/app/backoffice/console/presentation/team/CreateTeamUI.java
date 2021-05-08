package eapli.base.app.backoffice.console.presentation.team;

import eapli.base.collaboratormanagement.application.ListCollaboratorService;
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.teammanagement.application.ListTeamTypeService;
import eapli.base.teammanagement.application.TeamCreatorController;
import eapli.base.teammanagement.domain.TeamType;
import eapli.framework.domain.repositories.IntegrityViolationException;
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
            final String id = Console.readLine("Team ID:");
            final String theTeamType = selectTeamType();
            final String acronym = Console.readLine("Acronym:");
            final String teamDescription = Console.readLine("Team Description:");
            Set<Collaborator> representation = selectCollaborators();
            if(representation.isEmpty()) {
                System.out.println("Team needs atleast one representative!");
                representation = selectCollaborators();
            }
            this.theController.createTeam(id, theTeamType, acronym, teamDescription, representation);
            System.out.printf("Operation Successful. The Following Team was created successfully > id: %s\tacronym :%s\n\n", id, acronym);
        } catch (final Exception ex) {
            System.out.println("Error while creating a team.");
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
        Collaborator collab;
        String decision = "";
        while(decision.equals("") || decision.equalsIgnoreCase("Y")) {
            collab = selectCollaborator();
            if(collab != null && !setCollab.contains(collab)) {
                setCollab.add(collab);
                decision = Console.readLine("Do you wish to add another representative? (Y\\N) ");
            } else if(collab == null && setCollab.isEmpty()) {
                System.out.println("Didn't select a representative!");
            } else if(collab == null) {
                break;
            } else if(setCollab.contains(collab)) {
                System.out.println("Representative already selected!");
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
