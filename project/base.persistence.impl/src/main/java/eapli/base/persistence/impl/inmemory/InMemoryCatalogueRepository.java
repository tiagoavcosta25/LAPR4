package eapli.base.persistence.impl.inmemory;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueBriefDescription;
import eapli.base.cataloguemanagement.domain.CatalogueCompleteDescription;
import eapli.base.cataloguemanagement.domain.CatalogueTitle;
import eapli.base.cataloguemanagement.repositories.CatalogueRepository;

import eapli.base.teammanagement.domain.Team;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.Username;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

/**
 *
 *
 * @author Beatriz Seixas 1190424@isep.ipp.pt
 */

public class InMemoryCatalogueRepository
        extends InMemoryDomainRepository<Catalogue, Long>
        implements CatalogueRepository {

    static {
        InMemoryInitializer.init();
    }

    @Override
    public Optional<Catalogue> findById(Long number) {

        return Optional.of(data().get(number));
    }

    @Override
    public Iterable<Catalogue> findByTitle(CatalogueTitle oCatalogueTitle) {
        return match(e -> e.catalogueTitle().equals(findByTitle(oCatalogueTitle)));

    }

    @Override
    public Iterable<Catalogue> findByWordTitle(CatalogueTitle oCatalogueTitle) {
        return match(e -> e.catalogueTitle().equals(oCatalogueTitle));
    }

    @Override
    public Iterable<Catalogue> findByBriefDescription(CatalogueBriefDescription oCatalogueBriefDescription) {
        return null;
    }

    @Override
    public Iterable<Catalogue> findByCompleteDescription(CatalogueCompleteDescription oCatalogueCompleteDescription) {
        return match(e -> e.catalogueCompleteDescription().equals(oCatalogueCompleteDescription));
    }

    @Override
    public Iterable<Catalogue> findByWordBriefDescription(CatalogueBriefDescription oCatalogueBriefDescription) {
        return match(e -> e.catalogueBriefDescription().equals(findByWordBriefDescription(oCatalogueBriefDescription)));

    }

    @Override
    public Iterable<Catalogue> findByWordCompleteDescription(CatalogueCompleteDescription oCatalogueCompleteDescription) {
         return match(e -> e.catalogueCompleteDescription().equals(oCatalogueCompleteDescription));
    }

    @Override
    public Iterable<Catalogue> findByTeam(Team oTeam) {
        return match(e -> e.access().equals(oTeam));
    }

    @Override
    public Iterable<Catalogue> findByUser(SystemUser oUser) {
        return null;
    }


}
