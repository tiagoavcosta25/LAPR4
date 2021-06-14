package eapli.base.persistence.impl.inmemory;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.activityfluxmanagement.execution.repositories.ActivityFluxExecutionRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.taskmanagement.execution.domain.ManualTaskExecution;
import eapli.base.taskmanagement.execution.domain.TaskExecution;
import eapli.base.taskmanagement.execution.domain.TaskExecutionStatus;
import eapli.base.taskmanagement.execution.repositories.ManualTaskExecutionRepository;
import eapli.framework.infrastructure.authz.domain.model.Username;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class InMemoryManualTaskExecutionRepository extends InMemoryDomainRepository<ManualTaskExecution, Long>
        implements ManualTaskExecutionRepository {

    static {
        InMemoryInitializer.init();
    }

    @Override
    public Iterable<ManualTaskExecution> getHisPendingManualTasks(Username oUsername) {
        return match(manualTaskExecution ->manualTaskExecution.getM_oCollaborator().user().username().equals(oUsername)
                && manualTaskExecution.status().equals(TaskExecutionStatus.PENDING));
    }


}
