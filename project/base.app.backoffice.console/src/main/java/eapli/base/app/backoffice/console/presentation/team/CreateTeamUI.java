package eapli.base.app.backoffice.console.presentation.team;

import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.teammanagement.application.TeamCreatorController;
import eapli.base.teammanagement.domain.TeamType;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class CreateTeamUI extends AbstractUI {

    private static final Logger LOGGER = LogManager.getLogger(CreateTeamUI.class);
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
                LOGGER.error("Team needs at least one representative!");
                representation = selectCollaborators();
            }
            String strOp = Console.readLine("Confirm the team with code " + id + " creation? (Y/N) ");

            if(strOp.compareToIgnoreCase("Y") == 0){
                this.theController.createTeam(id, theTeamType, acronym, teamDescription, representation);
                LOGGER.info("Operation Successful. The Following Team was created successfully > id:" +
                        " {}\tacronym :{}\n\n", id, acronym);
            } else{
                LOGGER.error("Operation cancelled");
            }
        } catch (final Exception ex) {
            LOGGER.error("Error while creating a team.");
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
                LOGGER.error("Didn't select a representative!");
            } else if(collab == null) {
                break;
            } else if(setCollab.contains(collab)) {
                LOGGER.error("Representative already selected!");
            }
        }
        return setCollab;
    }

    private Collaborator selectCollaborator() {
        System.out.println("List of Collaborators - Select a Collaborator");
        final Iterable<Collaborator> listCollaborator = theController.getCollaborators();
        if(!listCollaborator.iterator().hasNext())
            throw new IllegalArgumentException("No collaborators avaiable!");
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
