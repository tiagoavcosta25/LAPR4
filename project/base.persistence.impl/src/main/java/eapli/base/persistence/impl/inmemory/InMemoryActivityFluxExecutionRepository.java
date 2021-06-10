package eapli.base.persistence.impl.inmemory;

import eapli.base.activityfluxmanagement.domain.ActivityFlux;
import eapli.base.activityfluxmanagement.domain.ActivityFluxExecution;
import eapli.base.activityfluxmanagement.repositories.ActivityFluxExecutionRepository;
import eapli.base.activityfluxmanagement.repositories.ActivityFluxRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class InMemoryActivityFluxExecutionRepository
        extends InMemoryDomainRepository<ActivityFluxExecution, Long>
        implements ActivityFluxExecutionRepository {

    static {
        InMemoryInitializer.init();
    }

    @Override
    public Optional<ActivityFluxExecution> findById(Long number) {
        return Optional.of(data().get(number));
    }
}
