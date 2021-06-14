package eapli.base.persistence.impl.inmemory;

import eapli.base.taskmanagement.specification.domain.AutomaticTask;
import eapli.base.taskmanagement.specification.domain.Task;
import eapli.base.taskmanagement.specification.repositories.AutomaticTaskRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class InMemoryAutomaticTaskRepository extends InMemoryDomainRepository<AutomaticTask, Long>
        implements AutomaticTaskRepository {

    static {
        InMemoryInitializer.init();
    }

}
