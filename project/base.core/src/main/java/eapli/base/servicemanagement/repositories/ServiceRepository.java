package eapli.base.servicemanagement.repositories;

import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.domain.ServiceID;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public interface ServiceRepository
        extends DomainRepository<ServiceID, Service> {

    /**
     * returns the client user (utente) with the given mecanographic number
     *
     * @param oID
     * @return
     */
    default Optional<Service> findByID(ServiceID oID) {
        return ofIdentity(oID);
    }

    public Iterable<Service> findAllActive();

    Service save(Service oService);
}
