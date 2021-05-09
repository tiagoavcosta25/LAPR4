package eapli.base.cataloguemanagement.repositories;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueBriefDescription;
import eapli.base.cataloguemanagement.domain.CatalogueCompleteDescription;
import eapli.base.cataloguemanagement.domain.CatalogueTitle;
import eapli.base.teammanagement.domain.Team;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.List;
import java.util.Optional;

public interface CatalogueRepository
        extends DomainRepository<Long, Catalogue> {

    public Iterable<Catalogue> findByTitle(final CatalogueTitle oCatalogueTitle);

    public Iterable<Catalogue> findByWordTitle(final CatalogueTitle oCatalogueTitle);

    public Iterable<Catalogue> findByBriefDescription(final CatalogueBriefDescription oCatalogueBriefDescription);

    public Iterable<Catalogue> findByCompleteDescription(final CatalogueCompleteDescription oCatalogueCompleteDescription);

    public Iterable<Catalogue> findByWordBriefDescription(final CatalogueBriefDescription oCatalogueBriefDescription);

    public Iterable<Catalogue> findByWordCompleteDescription(final CatalogueCompleteDescription oCatalogueCompleteDescription);

    public Iterable<Catalogue> findByTeam(final Team oTeam);
}
