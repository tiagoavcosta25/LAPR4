package eapli.base.collaboratormanagement.application;

import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.collaboratormanagement.repositories.CollaboratorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.teammanagement.domain.Team;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.ApplicationService;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@ApplicationService
public class ListCollaboratorService {

    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final CollaboratorRepository collabRepository = PersistenceContext.repositories().collaborators();

    public Iterable<Collaborator> allCollaborators() {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER,
                BaseRoles.ADMIN, BaseRoles.HR_REP);

        return this.collabRepository.findAll();
    }

    public Iterable<Team> allCollaboratorTeams(Collaborator oCollaborator) {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER,
                BaseRoles.ADMIN, BaseRoles.HR_REP);
        return oCollaborator.teams();
    }
}
