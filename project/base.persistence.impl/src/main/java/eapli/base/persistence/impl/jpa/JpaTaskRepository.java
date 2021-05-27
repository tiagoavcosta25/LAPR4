package eapli.base.persistence.impl.jpa;

import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.taskmanagement.domain.ManualTask;
import eapli.base.taskmanagement.domain.Task;
import eapli.base.taskmanagement.domain.TaskFilterFields;
import eapli.base.taskmanagement.repositories.TaskRepository;
import eapli.base.util.Application;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
class JpaTaskRepository
        extends JpaAutoTxRepository<Task, Long, Long>
        implements TaskRepository {

    public JpaTaskRepository(TransactionalContext autoTx) {
        super(autoTx, "taskID");
    }

    public JpaTaskRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "taskID");
    }

    @Override
    public Optional<Task> findById(Long lngID) {
        final Map<String, Object> params = new HashMap<>();
        params.put("taskID", lngID);
        return matchOne("e.id=:taskID", params);
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
}
