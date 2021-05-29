package eapli.base.persistence.impl.inmemory;

import eapli.base.activityfluxmanagement.domain.ActivityFlux;
import eapli.base.activityfluxmanagement.repositories.ActivityFluxRepository;
import eapli.base.ticketmanagement.domain.Response;
import eapli.base.ticketmanagement.repository.ResponseRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class InMemoryResponseRepository
        extends InMemoryDomainRepository<Response, Long>
        implements ResponseRepository {

    static {
        InMemoryInitializer.init();
    }

    @Override
    public Optional<Response> findById(Long number) {
        return Optional.of(data().get(number));
    }
}
