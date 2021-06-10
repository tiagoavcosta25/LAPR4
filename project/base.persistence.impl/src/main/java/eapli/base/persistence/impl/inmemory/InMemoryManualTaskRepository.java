package eapli.base.persistence.impl.inmemory;

import eapli.base.taskmanagement.domain.ManualTask;
import eapli.base.taskmanagement.repositories.ManualTaskRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
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
}
