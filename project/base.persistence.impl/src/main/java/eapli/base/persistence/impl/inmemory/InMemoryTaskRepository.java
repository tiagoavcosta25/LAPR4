package eapli.base.persistence.impl.inmemory;

import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.taskmanagement.domain.ManualTask;
import eapli.base.taskmanagement.domain.Task;
import eapli.base.taskmanagement.domain.TaskFilterFields;
import eapli.base.taskmanagement.domain.TaskOrderFields;
import eapli.base.taskmanagement.repositories.TaskRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class InMemoryTaskRepository
        extends InMemoryDomainRepository<Task, Long>
        implements TaskRepository {

    static {
        InMemoryInitializer.init();
    }

    @Override
    public Optional<Task> findById(Long number) {
        return Optional.of(data().get(number));
    }

    //TODO: Finish method getTasksOfCollaborator (no filter nor order)
    @Override
    public Iterable<ManualTask> getTasksOfCollaborator(Collaborator oCollaborator) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //TODO: Finish method getTasksOfCollaborator (filter)
    @Override
    public Iterable<ManualTask> getTasksOfCollaborator(Collaborator oCollaborator, TaskFilterFields enumFilterBy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //TODO: Finish method getTasksOfCollaborator (order)
    @Override
    public Iterable<ManualTask> getTasksOfCollaborator(Collaborator oCollaborator, TaskOrderFields enumOrderBy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
