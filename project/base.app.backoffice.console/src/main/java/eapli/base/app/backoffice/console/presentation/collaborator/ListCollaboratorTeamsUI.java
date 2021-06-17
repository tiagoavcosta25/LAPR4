package eapli.base.app.backoffice.console.presentation.collaborator;

import eapli.base.app.backoffice.console.presentation.team.CollaboratorPrinter;
import eapli.base.app.backoffice.console.presentation.team.ListTeamsUI;
import eapli.base.collaboratormanagement.application.ListCollaboratorTeamsController;
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ListCollaboratorTeamsUI extends AbstractUI {

    private static final Logger LOGGER = LogManager.getLogger(ListCollaboratorTeamsUI.class);
    private final ListCollaboratorTeamsController theController = new ListCollaboratorTeamsController();

    @Override
    protected boolean doShow() {
        try {
            final Collaborator theCollab = selectCollaborator();
            ListTeamsUI listTeamsUI = new ListTeamsUI(theCollab);
            listTeamsUI.show();
        } catch (final Exception ex) {
            LOGGER.error("Error while listing teams.");
        }
        return false;
    }

    private Collaborator selectCollaborator() {
        System.out.println("List of Collaborators to check - Select a Collaborator");
        final Iterable<Collaborator> listCollaborator = theController.getCollaborators();
        final SelectWidget<Collaborator> selectorCollaborator = new SelectWidget<>("Select a Collaborator", listCollaborator,
                new CollaboratorPrinter());
        selectorCollaborator.show();
        return selectorCollaborator.selectedElement();
    }

    @Override
    public String headline() {
        return "List Collaborator's Team's";
    }
}
