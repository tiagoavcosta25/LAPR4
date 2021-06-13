package eapli.base.persistence.impl.inmemory;

import eapli.base.taskmanagement.execution.domain.TaskExecution;
import eapli.base.taskmanagement.execution.repositories.TaskExecutionRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class InMemoryTaskExecutionRepository extends InMemoryDomainRepository<TaskExecution, Long>
        implements TaskExecutionRepository {

    static {
        InMemoryInitializer.init();
    }

    @Override
    public Optional<TaskExecution> findById(Long number) {
        return Optional.of(data().get(number));
    }
}
