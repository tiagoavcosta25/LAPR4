package eapli.base.collaboratormanagement.application;

import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.collaboratormanagement.repositories.CollaboratorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.teammanagement.application.ListTeamService;
import eapli.base.teammanagement.domain.Team;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@UseCaseController
public class RemoveCollabFromTeamController {

    private final AuthorizationService m_oAuthz = AuthzRegistry.authorizationService();
    private final ListTeamService m_oListTeamService = new ListTeamService();
    private final CollaboratorRepository m_oCollabRepo = PersistenceContext.repositories().collaborators();
    private final ListCollaboratorService m_oListCollaboratorService = new ListCollaboratorService();

    public Iterable<Collaborator> getCollaborators() {
        return m_oListCollaboratorService.allCollaborators();
    }

    public Iterable<Team> getTeamsFromCollab(Collaborator oCollab) {
        return this.m_oListTeamService.getTeamsFromCollab(oCollab);
    }

    public Collaborator removeCollabFromTeam(Collaborator oCollab, Team oTeam) {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HR_REP);
        oCollab.removeTeam(oTeam);
        return m_oCollabRepo.save(oCollab);
    }
}
