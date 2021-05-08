package eapli.base.collaboratormanagement.application;

import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.framework.application.UseCaseController;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@UseCaseController
public class ListCollaboratorsController {
   private final ListCollaboratorService listCollaboratorService = new ListCollaboratorService();

    public Iterable<Collaborator> getCollaborators() {
        return listCollaboratorService.allCollaborators();
    }
}
