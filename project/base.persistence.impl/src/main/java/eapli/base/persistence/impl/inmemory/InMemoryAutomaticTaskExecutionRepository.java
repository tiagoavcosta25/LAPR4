package eapli.base.persistence.impl.inmemory;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.activityfluxmanagement.execution.repositories.ActivityFluxExecutionRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.taskmanagement.execution.domain.AutomaticTaskExecution;
import eapli.base.taskmanagement.execution.domain.TaskExecution;
import eapli.base.taskmanagement.execution.repositories.AutomaticTaskExecutionRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class InMemoryAutomaticTaskExecutionRepository extends InMemoryDomainRepository<AutomaticTaskExecution, Long>
        implements AutomaticTaskExecutionRepository {

    static {
        InMemoryInitializer.init();
    }

  
}
