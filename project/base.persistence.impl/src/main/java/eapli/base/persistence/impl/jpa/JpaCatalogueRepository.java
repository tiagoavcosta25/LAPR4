package eapli.base.persistence.impl.jpa;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueBriefDescription;
import eapli.base.cataloguemanagement.domain.CatalogueCompleteDescription;
import eapli.base.cataloguemanagement.domain.CatalogueTitle;
import eapli.base.cataloguemanagement.repositories.CatalogueRepository;
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.teammanagement.domain.Team;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import javax.persistence.TypedQuery;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class JpaCatalogueRepository
        extends HelpDeskJpaRepositoryBase<Catalogue, Long, Long>
        implements CatalogueRepository {

    public JpaCatalogueRepository() {
        super("m_lngID");
    }

    @Override
    public Iterable<Catalogue> findByTitle(final CatalogueTitle oCatalogueTitle) {
        final Map<String, Object> params = new HashMap<>();
        params.put("title", oCatalogueTitle);
        return match("e.m_oCatalogueTitle = :title", params);
    }

    @Override
    public Iterable<Catalogue> findByWordTitle(CatalogueTitle oCatalogueTitle) {
        final TypedQuery<Catalogue> q = entityManager().createQuery(
                "SELECT e FROM Catalogue e WHERE e.m_oCatalogueTitle LIKE CONCAT('%', :title,'%')",
                Catalogue.class);
        q.setParameter("title", oCatalogueTitle.toString());
        return q.getResultList();
    }

    @Override
    public Iterable<Catalogue> findByBriefDescription(CatalogueBriefDescription oCatalogueBriefDescription) {
        final Map<String, Object> params = new HashMap<>();
        params.put("description", oCatalogueBriefDescription);
        return match("e.m_oCatalogueBriefDescription = :description", params);
    }

    @Override
    public Iterable<Catalogue> findByCompleteDescription(CatalogueCompleteDescription oCatalogueCompleteDescription) {
        final Map<String, Object> params = new HashMap<>();
        params.put("description", oCatalogueCompleteDescription);
        return match("e.m_oCatalogueCompleteDescription = :description", params);
    }

    @Override
    public Iterable<Catalogue> findByWordBriefDescription(CatalogueBriefDescription oCatalogueBriefDescription) {
        final TypedQuery<Catalogue> q = entityManager().createQuery(
                "SELECT e FROM Catalogue e WHERE e.m_oCatalogueBriefDescription LIKE CONCAT('%', :description,'%')",
                Catalogue.class);
        q.setParameter("description", oCatalogueBriefDescription.toString());
        return q.getResultList();
    }

    @Override
    public Iterable<Catalogue> findByWordCompleteDescription(CatalogueCompleteDescription oCatalogueCompleteDescription) {
        final TypedQuery<Catalogue> q = entityManager().createQuery(
                "SELECT e FROM Catalogue e WHERE e.m_oCatalogueCompleteDescription LIKE CONCAT('%', :description,'%')",
                Catalogue.class);
        q.setParameter("description", oCatalogueCompleteDescription.toString());
        return q.getResultList();
    }

    @Override
    public Iterable<Catalogue> findByTeam(Team oTeam) {
        final TypedQuery<Catalogue> q = entityManager().createQuery(
                "SELECT e FROM Catalogue e JOIN e.m_setAccess t WHERE t.m_oID = :description",
                Catalogue.class);
        q.setParameter("description", oTeam.identity());
        return q.getResultList();
    }

    @Override
    public Iterable<Catalogue> findByUser(SystemUser oUser) {

        final TypedQuery<Catalogue> q = entityManager().createQuery(
                "SELECT e FROM Catalogue e WHERE e.m_oCollaborator.m_oSystemUser.username = :username",
                Catalogue.class);
        q.setParameter("username", oUser.identity());
        return q.getResultList();
    }

}
