package eapli.base.persistence.impl.inmemory;

import eapli.base.taskmanagement.specification.domain.Task;
import eapli.base.taskmanagement.specification.repositories.TaskRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class InMemoryTaskRepository
        extends InMemoryDomainRepository<Task, Long>
        implements TaskRepository {

    static {
        InMemoryInitializer.init();
    }

    @Override
    public Optional<Task> findById(Long number) {
        return matchOne(task -> task.id().equals(number));
    }

    @Override
    public boolean isManualTask(Long lngID) {
        return findByID(lngID).isPresent();
    }
}