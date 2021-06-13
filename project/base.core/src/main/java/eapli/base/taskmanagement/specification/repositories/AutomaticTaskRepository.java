package eapli.base.taskmanagement.specification.repositories;

import eapli.base.servicemanagement.domain.Service;
import eapli.base.taskmanagement.specification.domain.AutomaticTask;
import eapli.framework.domain.repositories.DomainRepository;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public interface AutomaticTaskRepository extends DomainRepository<Long, AutomaticTask> {

    public Iterable<AutomaticTask> getPendingAutomaticTasks(Long idFlux);

    public Iterable<Service> getActivityFlux();
}
