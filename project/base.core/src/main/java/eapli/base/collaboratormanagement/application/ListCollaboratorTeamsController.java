package eapli.base.collaboratormanagement.application;

import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.teammanagement.domain.Team;
import eapli.framework.application.UseCaseController;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@UseCaseController
public class ListCollaboratorTeamsController {
    private final ListCollaboratorService listCollaboratorService = new ListCollaboratorService();

    public Iterable<Team> allCollaboratorTeams(Collaborator oCollaborator) {
        return listCollaboratorService.allCollaboratorTeams(oCollaborator);
    }

    public Iterable<Collaborator> getCollaborators() {
        return listCollaboratorService.allCollaborators();
    }

}
