package eapli.base.persistence.impl.inmemory;

import eapli.base.taskmanagement.specification.domain.ManualTask;
import eapli.base.taskmanagement.specification.repositories.ManualTaskRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class InMemoryManualTaskRepository extends InMemoryDomainRepository<ManualTask, Long>
        implements ManualTaskRepository {

    static {
        InMemoryInitializer.init();
    }

    @Override
    public Optional<ManualTask> findById(Long number) {
        return Optional.of(data().get(number));
    }

    @Override
    public boolean isManualTask(Long lngID) {
        return findByID(lngID).isPresent();
    }
}
