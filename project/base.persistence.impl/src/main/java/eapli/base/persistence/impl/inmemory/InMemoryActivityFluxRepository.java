package eapli.base.persistence.impl.inmemory;

import eapli.base.activityfluxmanagement.domain.ActivityFlux;
import eapli.base.activityfluxmanagement.repositories.ActivityFluxRepository;
import eapli.base.formmanagement.domain.Form;
import eapli.base.formmanagement.repositories.FormRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class InMemoryActivityFluxRepository
        extends InMemoryDomainRepository<ActivityFlux, Long>
        implements ActivityFluxRepository {

    static {
        InMemoryInitializer.init();
    }

    @Override
    public Optional<ActivityFlux> findById(Long number) {
        return Optional.of(data().get(number));
    }
}
