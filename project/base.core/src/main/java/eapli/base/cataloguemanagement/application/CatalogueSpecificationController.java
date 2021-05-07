package eapli.base.cataloguemanagement.application;

import eapli.base.cataloguemanagement.domain.*;
import eapli.base.cataloguemanagement.repositories.CatalogueRepository;
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.collaboratormanagement.domain.CollaboratorBuilder;
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

public class CatalogueSpecificationController {
    private final AuthorizationService m_oAuthz = AuthzRegistry.authorizationService();

    private final CatalogueRepository m_oCatalogueRepo = PersistenceContext.repositories().catalogues();
    private final CollaboratorRepository m_oCollaboratorRepo = PersistenceContext.repositories().collaborators();
    private CatalogueBuilder m_oCatalogueBuilder = new CatalogueBuilder();
    private final TeamRepository m_oTeamRepo = PersistenceContext.repositories().teams();


    public List<Collaborator> getCollaborators() {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HR_REP);
        return m_oCollaboratorRepo.all();
    }

    public List<Team> getTeams() {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HR_REP);
        return m_oTeamRepo.all();
    }


    public Catalogue createCatalog(String strTitle, String strBriefDescription, String strCompleteDescription, String strCollaborator, Set<Team> setAccess) {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HR_REP);
        final CatalogueBuilder catalogueBuilder = new CatalogueBuilder();
        catalogueBuilder.withTitle(strTitle).withBriefDescription(strBriefDescription).withCompleteDescription(strCompleteDescription).withCollaborator(strCollaborator).withAccess(setAccess);
        return m_oCatalogueRepo.save(catalogueBuilder.build());
    }
    public Catalogue saveCatalogue() {
        Catalogue oCatalogue = this.m_oCatalogueBuilder.build();
        this.m_oCatalogueRepo.save(oCatalogue);
        return oCatalogue;
    }
}







