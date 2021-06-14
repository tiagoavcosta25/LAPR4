package eapli.base.persistence.impl.inmemory;

import eapli.base.taskmanagement.specification.domain.AutomaticTask;
import eapli.base.taskmanagement.specification.repositories.AutomaticTaskRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class InMemoryAutomaticTaskRepository extends InMemoryDomainRepository<AutomaticTask, Long>
        implements AutomaticTaskRepository {

    static {
        InMemoryInitializer.init();
    }

    @Override
    public Optional<AutomaticTask> findById(Long number) {
        return matchOne(automaticTask -> automaticTask.id().equals(number));
    }

    @Override
    public boolean isAutoTask(Long lngID) {
        return findByID(lngID).isPresent();
    }
}
