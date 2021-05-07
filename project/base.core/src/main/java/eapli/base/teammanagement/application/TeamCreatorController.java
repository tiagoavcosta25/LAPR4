package eapli.base.teammanagement.application;

import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.collaboratormanagement.repositories.CollaboratorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.teammanagement.domain.*;
import eapli.base.teammanagement.repositories.TeamRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.List;
import java.util.Set;

/**
 *
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@UseCaseController
public class TeamCreatorController {

    private final AuthorizationService m_oAuthz = AuthzRegistry.authorizationService();
    private final CollaboratorRepository m_oCollaboratorRepo = PersistenceContext.repositories().collaborators();
    private final TeamRepository m_oTeamRepo = PersistenceContext.repositories().teams();

    public TeamType[] getTeamTypes() {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HR_REP);
        return TeamType.values();
    }

    public List<Collaborator> getCollaborators() {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HR_REP);
        return m_oCollaboratorRepo.all();
    }

    public Team createTeam(TeamType enumTeamType, Acronym oAcronym, TeamDescription oTeamDescription,
                           Set<Collaborator> setRepresentation) {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HR_REP);
        final TeamBuilder teamBuilder = new TeamBuilder();
        teamBuilder.withTeamType(enumTeamType).withAcronym(oAcronym).withTeamDescription(oTeamDescription)
                .withRepresentation(setRepresentation);
        return m_oTeamRepo.save(teamBuilder.build());
    }

}
