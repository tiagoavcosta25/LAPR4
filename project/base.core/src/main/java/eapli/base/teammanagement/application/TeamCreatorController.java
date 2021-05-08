package eapli.base.teammanagement.application;

import eapli.base.collaboratormanagement.application.ListCollaboratorService;
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.teammanagement.domain.Team;
import eapli.base.teammanagement.domain.TeamBuilder;
import eapli.base.teammanagement.domain.TeamType;
import eapli.base.teammanagement.repositories.TeamRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.Set;

/**
 *
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@UseCaseController
public class TeamCreatorController {

    private final AuthorizationService m_oAuthz = AuthzRegistry.authorizationService();
    private final TeamRepository m_oTeamRepo = PersistenceContext.repositories().teams();
    private final ListTeamTypeService listTeamTypeService = new ListTeamTypeService();
    private final ListCollaboratorService listCollaboratorService = new ListCollaboratorService();

    public Iterable<Collaborator> getCollaborators() {
        return listCollaboratorService.allCollaborators();
    }

    public Team createTeam(String oTeamID, String enumTeamType, String oAcronym, String oTeamDescription,
                           Set<Collaborator> setRepresentation) {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HR_REP);
        final TeamBuilder teamBuilder = new TeamBuilder();
        teamBuilder.withTeamID(oTeamID).withTeamType(enumTeamType).withAcronym(oAcronym).withTeamDescription(oTeamDescription)
                .withRepresentation(setRepresentation);
        return m_oTeamRepo.save(teamBuilder.build());
    }

    public Iterable<TeamType> getTeamTypes() {
        return this.listTeamTypeService.getTeamTypes();
    }
}
