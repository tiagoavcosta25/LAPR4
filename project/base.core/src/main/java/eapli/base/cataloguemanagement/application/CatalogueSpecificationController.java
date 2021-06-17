package eapli.base.cataloguemanagement.application;

import eapli.base.cataloguemanagement.domain.*;
import eapli.base.cataloguemanagement.repositories.CatalogueRepository;
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.collaboratormanagement.domain.CollaboratorBuilder;
import eapli.base.collaboratormanagement.domain.CollaboratorMechanographicNumber;
import eapli.base.collaboratormanagement.repositories.CollaboratorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.teammanagement.domain.*;
import eapli.base.teammanagement.repositories.TeamRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author Beatriz Seixas 1190424@isep.ipp.pt
 */
public class CatalogueSpecificationController {
    private final AuthorizationService m_oAuthz = AuthzRegistry.authorizationService();

    private final CatalogueRepository m_oCatalogueRepo = PersistenceContext.repositories().catalogues();
    private final CollaboratorRepository m_oCollaboratorRepo = PersistenceContext.repositories().collaborators();
    private final TeamRepository m_oTeamRepo = PersistenceContext.repositories().teams();

    public Iterable<Collaborator> getCollaborators() {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        return m_oCollaboratorRepo.findAll();
    }

    public Collaborator getCollaboratorById(Long lngID) {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        return this.m_oCollaboratorRepo.findByMecanographicNumber(CollaboratorMechanographicNumber.valueOf(lngID)).get();
    }

    public Iterable<Team> getTeams() {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        return m_oTeamRepo.findAll();
    }

    public Team getTeamById(String strID) {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        return this.m_oTeamRepo.findByID(TeamID.valueOf(strID)).get();
    }

    
    public Catalogue createCatalog(String strTitle, String strBriefDescription, String strCompleteDescription, Collaborator strCollaborator, Set<Team> setAccess) {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HR_REP);
        final CatalogueBuilder catalogueBuilder = new CatalogueBuilder();
        catalogueBuilder.withTitle(strTitle).withBriefDescription(strBriefDescription).withCompleteDescription(strCompleteDescription).withCollaborator(strCollaborator).withAccess(setAccess);
        return m_oCatalogueRepo.save(catalogueBuilder.build());
    }
}







