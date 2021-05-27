package eapli.base.servicemanagement.repositories;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.servicemanagement.domain.Service;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public interface ServiceRepository
        extends DomainRepository<Long, Service> {

    /**
     * returns the client user (utente) with the given mecanographic number
     *
     * @param lngID
     * @return
     */
    default Optional<Service> findByID(Long lngID) {
        return ofIdentity(lngID);
    }

    public Iterable<Service> findByCatalogue(Catalogue oCatalogue);
}
