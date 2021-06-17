package eapli.base.app.backoffice.console.presentation.collaborator;

import eapli.base.app.backoffice.console.presentation.team.CollaboratorPrinter;
import eapli.base.app.backoffice.console.presentation.team.TeamPrinter;
import eapli.base.collaboratormanagement.application.AddCollabToTeamController;
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.teammanagement.domain.Team;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class AddCollabToTeamUI extends AbstractUI {

    private static final Logger LOGGER = LogManager.getLogger(AddCollabToTeamUI.class);
    private final AddCollabToTeamController theController = new AddCollabToTeamController();

    @Override
    protected boolean doShow() {
        try {
            final Collaborator theCollaborator = selectCollaborator();
            final Team theTeam = selectTeam();
            String strOp = Console.readLine("Confirm the addition of collab with id " + theCollaborator.id()
                    + " to the team " + theTeam.identity() + " ? (Y/N) ");

            if(strOp.compareToIgnoreCase("Y") == 0){
                this.theController.addCollabToTeam(theCollaborator, theTeam);
                LOGGER.info("Operation Successful. Collaborator " + theCollaborator.id() + " " +
                        theCollaborator.completeName() + " was added to team " + theTeam.identity() + ".");
            } else{
                LOGGER.error("Operation cancelled");
            }
        } catch (final Exception ex) {
            LOGGER.error("Error while adding collaborator to the team.");
        }
        return false;
    }

    @Override
    public String headline() {
        return "Add Collaborator to Team";
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
}
