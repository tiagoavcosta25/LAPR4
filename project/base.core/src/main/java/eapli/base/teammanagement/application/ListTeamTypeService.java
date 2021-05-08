package eapli.base.teammanagement.application;

import eapli.base.teammanagement.domain.TeamType;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.ApplicationService;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.Arrays;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@ApplicationService
public class ListTeamTypeService {

    private final AuthorizationService m_oAuthz = AuthzRegistry.authorizationService();

    public Iterable<TeamType> getTeamTypes() {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HR_REP);
        return Arrays.asList(TeamType.values());
    }
}
