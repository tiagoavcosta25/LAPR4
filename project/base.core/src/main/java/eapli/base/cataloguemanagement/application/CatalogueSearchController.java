package eapli.base.cataloguemanagement.application;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueBriefDescription;
import eapli.base.cataloguemanagement.domain.CatalogueCompleteDescription;
import eapli.base.cataloguemanagement.domain.CatalogueTitle;
import eapli.base.cataloguemanagement.repositories.CatalogueRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.teammanagement.domain.Team;
import eapli.base.teammanagement.repositories.TeamRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

/**
 * @author Beatriz Seixas 1190424@isep.ipp.pt
 */

@UseCaseController
public class CatalogueSearchController {

    private final AuthorizationService m_oAuthz = AuthzRegistry.authorizationService();
    private final TeamRepository m_oTeamRepo = PersistenceContext.repositories().teams();
    private final CatalogueRepository m_oCatalogueRepository = PersistenceContext.repositories().catalogues();

    public Iterable<Catalogue> findByTitle(final CatalogueTitle oCatalogueTitle) {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.CLIENT_USER, BaseRoles.HR_REP, BaseRoles.HS_MANAGER,
                BaseRoles.COMMERCIAL_DIR ,BaseRoles.ADMIN, BaseRoles.POWER_USER);
        return m_oCatalogueRepository.findByTitle(oCatalogueTitle);
    }

    public Iterable<Catalogue> findByBriefDescription(final CatalogueBriefDescription oCatalogueBriefDescription) {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.CLIENT_USER, BaseRoles.HR_REP, BaseRoles.HS_MANAGER,
                BaseRoles.COMMERCIAL_DIR ,BaseRoles.ADMIN, BaseRoles.POWER_USER);
        return m_oCatalogueRepository.findByBriefDescription(oCatalogueBriefDescription);
    }

    public Iterable<Catalogue> findByWordBriefDescription(final CatalogueBriefDescription oCatalogueBriefDescription) {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.CLIENT_USER, BaseRoles.HR_REP, BaseRoles.HS_MANAGER,
                BaseRoles.COMMERCIAL_DIR ,BaseRoles.ADMIN, BaseRoles.POWER_USER);
        return m_oCatalogueRepository.findByWordBriefDescription(oCatalogueBriefDescription);
    }

    public Iterable<Catalogue> findByCompleteDescription(final CatalogueCompleteDescription oCatalogueCompleteDescription) {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.CLIENT_USER, BaseRoles.HR_REP, BaseRoles.HS_MANAGER,
                BaseRoles.COMMERCIAL_DIR ,BaseRoles.ADMIN, BaseRoles.POWER_USER);
        return m_oCatalogueRepository.findByCompleteDescription(oCatalogueCompleteDescription);
    }

    public Iterable<Catalogue> findByWordCompleteDescription(final CatalogueCompleteDescription oCatalogueCompleteDescription) {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.CLIENT_USER, BaseRoles.HR_REP, BaseRoles.HS_MANAGER,
                BaseRoles.COMMERCIAL_DIR ,BaseRoles.ADMIN, BaseRoles.POWER_USER);
        return m_oCatalogueRepository.findByWordCompleteDescription(oCatalogueCompleteDescription);
    }

    public Iterable<Catalogue> findByTeam(final Team oTeam) {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.CLIENT_USER, BaseRoles.HR_REP, BaseRoles.HS_MANAGER,
                BaseRoles.COMMERCIAL_DIR ,BaseRoles.ADMIN, BaseRoles.POWER_USER);
        return m_oCatalogueRepository.findByTeam(oTeam);
    }

    public Iterable<Catalogue> getCatalogues() {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.CLIENT_USER, BaseRoles.HR_REP, BaseRoles.HS_MANAGER,
                BaseRoles.COMMERCIAL_DIR ,BaseRoles.ADMIN, BaseRoles.POWER_USER);
        return this.m_oCatalogueRepository.findAll();
    }

    public Iterable<Team> getTeams() {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HR_REP);
        return m_oTeamRepo.findAll();
    }
}
