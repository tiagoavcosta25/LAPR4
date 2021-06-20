package eapli.base.taskmanagement.execution.repositories;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.taskmanagement.execution.domain.ManualTaskExecution;
import eapli.base.taskmanagement.execution.domain.TaskExecution;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.infrastructure.authz.domain.model.Username;

import java.util.Optional;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 * @author Jéssica Alves 1190682@isep.ipp.pt
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public interface ManualTaskExecutionRepository extends DomainRepository<Long, ManualTaskExecution> {

    Iterable<ManualTaskExecution> getHisPendingManualTasks(Username oUsername);

    Iterable<ManualTaskExecution> getHisManualTasksFromFlux(Username oUsername, Long idFlux);

    Iterable<ActivityFluxExecution> getHisActivityFluxWithManualTasks(Username oUsername);

    Iterable<ManualTaskExecution> getUnassignedPendingTasks();

    default Optional<ManualTaskExecution> findByID(Long lngID) {
        return ofIdentity(lngID);
    }

    Optional<ActivityFluxExecution> getFluxByManualTaskExec(Long lngTaskID);
}
