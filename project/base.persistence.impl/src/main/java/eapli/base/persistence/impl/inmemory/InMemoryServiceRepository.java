package eapli.base.persistence.impl.inmemory;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.repositories.ServiceRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class InMemoryServiceRepository
        extends InMemoryDomainRepository<Service, Long>
        implements ServiceRepository {

    static {
        InMemoryInitializer.init();
    }

    @Override
    public Optional<Service> findByID(Long number) {
        return Optional.of(data().get(number));
    }

    @Override
    public Iterable<Service> findByCatalogue(Catalogue oCatalogue) {
        return match(e -> e.catalogue().equals(oCatalogue));
    }
}
