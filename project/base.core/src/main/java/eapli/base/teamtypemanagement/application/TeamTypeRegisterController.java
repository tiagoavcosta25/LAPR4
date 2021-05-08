package eapli.base.teamtypemanagement.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.teamtypemanagement.domain.TeamType;
import eapli.base.teamtypemanagement.domain.TeamTypeBuilder;
import eapli.base.teamtypemanagement.repositories.TeamTypeRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

/**
 * @author João Parente 1190740@isep.ipp.pt
 */
@UseCaseController
public final class TeamTypeRegisterController {
    private final AuthorizationService authorizationService = AuthzRegistry.authorizationService();
    private final TeamTypeRepository teamTypeRepository =
        PersistenceContext.repositories().teamTypes();

    private TeamType teamType;

    public TeamType buildTeamType(String id, String description, String color) {
        teamType = new TeamTypeBuilder()
            .withId(id)
            .withDescription(description)
            .withColor(color)
            .build();

        return teamType;
    }

    public TeamType registerTeamType() {
        authorizationService.ensureAuthenticatedUserHasAnyOf(
            BaseRoles.HR_REP,
            BaseRoles.ADMIN,
            BaseRoles.POWER_USER
        );

        return teamTypeRepository.save(teamType);
    }
}
