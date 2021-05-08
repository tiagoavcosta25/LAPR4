package eapli.base.cataloguemanagement.repositories;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueID;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.List;
import java.util.Optional;

public interface CatalogueRepository
        extends DomainRepository<Long, Catalogue> {

    /**
     * returns the catalog with the given ID
     *
     * @param lngID
     * @return
     */
    default Optional<Catalogue> findByID(Long lngID) {
        return ofIdentity(lngID);
    }

    public Iterable<Catalogue> findAllActive();
}
