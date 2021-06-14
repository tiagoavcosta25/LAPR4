package eapli.base.taskmanagement.execution.repositories;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.taskmanagement.execution.domain.ManualTaskExecution;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.infrastructure.authz.domain.model.Username;

/**
 * @author Jéssica Alves 1190682@isep.ipp.pt
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public interface ManualTaskExecutionRepository extends DomainRepository<Long, ManualTaskExecution> {

    Iterable<ManualTaskExecution> getHisPendingManualTasks(Username oUsername);

    Iterable<ManualTaskExecution> getHisManualTasksFromFlux(Username oUsername, Long idFlux);

    Iterable<ActivityFluxExecution> getHisActivityFluxWithManualTasks(Username oUsername);
}
