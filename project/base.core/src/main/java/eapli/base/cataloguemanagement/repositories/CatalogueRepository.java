package eapli.base.cataloguemanagement.repositories;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueID;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.List;
import java.util.Optional;

public interface CatalogueRepository
        extends DomainRepository<CatalogueID, Catalogue> {

    /**
     * returns the catalog with the given ID
     *
     * @param oID
     * @return
     */
    default Optional<Catalogue> findByID(CatalogueID oID) {
        return ofIdentity(oID);
    }

    public Iterable<Catalogue> findAllActive();

    List<Catalogue> all();
}
