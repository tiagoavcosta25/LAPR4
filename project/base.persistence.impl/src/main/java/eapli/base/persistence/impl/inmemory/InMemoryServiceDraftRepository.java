package eapli.base.persistence.impl.inmemory;

import eapli.base.servicemanagement.domain.ServiceDraft;
import eapli.base.servicemanagement.repositories.ServiceDraftRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class InMemoryServiceDraftRepository
        extends InMemoryDomainRepository<ServiceDraft, Long>
        implements ServiceDraftRepository {

    static {
        InMemoryInitializer.init();
    }

    @Override
    public Optional<ServiceDraft> findByID(Long number) {
        return Optional.of(data().get(number));
    }
}
