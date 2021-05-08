package eapli.base.teammanagement.application;

import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.teammanagement.domain.Team;
import eapli.base.teammanagement.domain.TeamID;
import eapli.base.teammanagement.repositories.TeamRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.ApplicationService;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.Optional;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@ApplicationService
public class ListTeamService {

    private final AuthorizationService m_oAuthz = AuthzRegistry.authorizationService();
    private final TeamRepository m_oTeamRepository = PersistenceContext.repositories().teams();

    public Iterable<Team> getTeams() {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HR_REP);
        return this.m_oTeamRepository.findAll();
    }

    public Optional<Team> findByID(final TeamID oID) {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.HR_REP, BaseRoles.ADMIN, BaseRoles.POWER_USER);
        return m_oTeamRepository.findByID(oID);
    }

    public Iterable<Team> getTeamsFromCollab(Collaborator oCollab) {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.HR_REP, BaseRoles.ADMIN, BaseRoles.POWER_USER);
        return oCollab.teams();
    }
}
