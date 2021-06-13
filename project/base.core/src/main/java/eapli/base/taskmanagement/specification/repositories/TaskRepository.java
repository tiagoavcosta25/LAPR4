package eapli.base.taskmanagement.specification.repositories;

import eapli.base.servicemanagement.domain.Service;
import eapli.base.taskmanagement.specification.domain.ManualTask;
import eapli.base.taskmanagement.specification.domain.Task;
import eapli.base.taskmanagement.specification.domain.TaskFilterFields;
import eapli.base.taskmanagement.specification.domain.TaskOrderFields;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.infrastructure.authz.domain.model.Username;

import java.util.Optional;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public interface TaskRepository
        extends DomainRepository<Long, Task> {

    /**
     * returns the form with the given id
     *
     * @param lngID
     * @return
     */
    default Optional<Task> findByID(Long lngID) {
        return ofIdentity(lngID);
    }

    public Iterable<Service> getTasksOfCollaborator(final Username oUsername);

    public Iterable<Service> getTasksOfCollaborator(final Username oUsername, TaskFilterFields enumFilterBy);

    public Iterable<Service> getTasksOfCollaborator(final Username oUsername, TaskOrderFields enumOrderBy);

    public Iterable<Service> getTasksOfCollaborator(final Username oUsername, TaskFilterFields enumFilterBy,
                                                       TaskOrderFields enumOrderBy);

    public Iterable<ManualTask> getPendingManualTasks(final Username oUsername);

    public Iterable<ManualTask> getHisPendingManualTasks(final Username oUsername, Long idFlux);

    public Iterable<Service> getActivityFlux(final Username oUsername);
}