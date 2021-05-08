package eapli.base.teammanagement.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.teammanagement.domain.Team;
import eapli.base.teammanagement.repositories.TeamRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.Optional;

/**
 *
 * Tiago Costa 1191460@isep.ipp.pt
 */
@UseCaseController
public class ListTeamController {

    private final AuthorizationService m_oAuthz = AuthzRegistry.authorizationService();
    private final TeamRepository m_oTeamRepository = PersistenceContext.repositories().teams();

    public Iterable<Team> allTeams() {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.HR_REP, BaseRoles.ADMIN, BaseRoles.POWER_USER);
        return this.m_oTeamRepository.findAll();
    }

    public Optional<Team> findByID(final Long oID) {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.HR_REP, BaseRoles.ADMIN, BaseRoles.POWER_USER);
        return m_oTeamRepository.ofIdentity(oID);
    }
}
