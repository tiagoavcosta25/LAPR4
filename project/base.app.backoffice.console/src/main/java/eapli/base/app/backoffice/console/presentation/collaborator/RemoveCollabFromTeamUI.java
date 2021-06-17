package eapli.base.app.backoffice.console.presentation.collaborator;

import eapli.base.app.backoffice.console.presentation.team.CollaboratorPrinter;
import eapli.base.app.backoffice.console.presentation.team.TeamPrinter;
import eapli.base.collaboratormanagement.application.RemoveCollabFromTeamController;
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
public class RemoveCollabFromTeamUI extends AbstractUI {

    private static final Logger LOGGER = LogManager.getLogger(RemoveCollabFromTeamUI.class);
    private final RemoveCollabFromTeamController theController = new RemoveCollabFromTeamController();

    @Override
    protected boolean doShow() {
        try {
            final Collaborator theCollaborator = selectCollaborator();
            final Team theTeam = selectTeam(theCollaborator);
            String strOp = Console.readLine("Confirm the removal of collab with id " + theCollaborator.id()
                    + " from team " + theTeam.identity() + " ? (Y/N) ");

            if(strOp.compareToIgnoreCase("Y") == 0){
                this.theController.removeCollabFromTeam(theCollaborator, theTeam);
                LOGGER.info("Operation Successful. Collaborator " + theCollaborator.id() + " " +
                        theCollaborator.completeName() + " was removed from team " + theTeam.identity() + ".");
            } else{
                LOGGER.error("Operation cancelled.");
            }
        } catch (final Exception ex) {
            LOGGER.error("Error while removing collaborator from team.");
        }
        return false;
    }

    @Override
    public String headline() {
        return "Remove collaborator from Team";
    }

    private Collaborator selectCollaborator() {
        System.out.println("List of Collaborators to remove - Select a Collaborator");
        final Iterable<Collaborator> listCollaborator = theController.getCollaborators();
        final SelectWidget<Collaborator> selectorCollaborator = new SelectWidget<>("Select a Collaborator", listCollaborator,
                new CollaboratorPrinter());
        selectorCollaborator.show();
        return selectorCollaborator.selectedElement();
    }

    private Team selectTeam(Collaborator oCollab) {
        System.out.println("List of Teams for Collaborator " + oCollab.id() + " - Select a Team");
        final Iterable<Team> listTeams = theController.getTeamsFromCollab(oCollab);
        final SelectWidget<Team> selectorTeam = new SelectWidget<>("Select a Team", listTeams,
                new TeamPrinter());
        selectorTeam.show();
        return selectorTeam.selectedElement();
    }
}
