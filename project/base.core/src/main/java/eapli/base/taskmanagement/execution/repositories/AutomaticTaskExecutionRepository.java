package eapli.base.taskmanagement.execution.repositories;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.taskmanagement.execution.domain.AutomaticTaskExecution;
import eapli.framework.domain.repositories.DomainRepository;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 * @author Jéssica Alves 1190682@isep.ipp.pt
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public interface AutomaticTaskExecutionRepository extends DomainRepository<Long, AutomaticTaskExecution> {

    public Iterable<AutomaticTaskExecution> getPendingAutomaticTasks(Long idFlux);

    public Iterable<ActivityFluxExecution> getActivityFlux();
}
