package eapli.base.taskmanagement.repositories;

import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.taskmanagement.domain.ManualTask;
import eapli.base.taskmanagement.domain.Task;
import eapli.base.taskmanagement.domain.TaskFilterFields;
import eapli.base.taskmanagement.domain.TaskOrderFields;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
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

    public Iterable<ManualTask> getTasksOfCollaborator(final Collaborator oCollaborator);

    public Iterable<ManualTask> getTasksOfCollaborator(final Collaborator oCollaborator, TaskFilterFields enumFilterBy);

    public Iterable<ManualTask> getTasksOfCollaborator(final Collaborator oCollaborator, TaskOrderFields enumOrderBy);


}
