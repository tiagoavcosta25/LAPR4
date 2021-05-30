package eapli.base.persistence.impl.jpa;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.taskmanagement.domain.ManualTask;
import eapli.base.taskmanagement.domain.Task;
import eapli.base.taskmanagement.domain.TaskFilterFields;
import eapli.base.taskmanagement.domain.TaskOrderFields;
import eapli.base.taskmanagement.repositories.TaskRepository;
import eapli.base.util.Application;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.Username;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import javax.persistence.TypedQuery;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
class JpaTaskRepository
        extends HelpDeskJpaRepositoryBase<Task, Long, Long>
        implements TaskRepository {

    public JpaTaskRepository() {
        super("m_lngID");
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
    public Iterable<ManualTask> getTasksOfCollaborator(Collaborator oCollaborator, TaskOrderFields enumOrderBy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //TODO: Finish method getTasksOfCollaborator (filter and order)
    @Override
    public Iterable<ManualTask> getTasksOfCollaborator(Collaborator oCollaborator, TaskFilterFields enumFilterBy, TaskOrderFields enumOrderBy) {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public Iterable<ManualTask> getPendingManualTasks(Username oUsername) {
        final TypedQuery<ManualTask> q = entityManager().createQuery(
                "SELECT e FROM ManualTask e WHERE e.m_oTaskStatus LIKE 'PENDING'",
                ManualTask.class);
        //q.setParameter("username", oUsername.toString());
        return q.getResultList();

    }

    @Override
    public Iterable<ManualTask> getHisPendingManualTasks(Username oUsername) {
        final TypedQuery<ManualTask> q = entityManager().createQuery(
                "Select mt from ManualTask mt " +
                        "inner join Task t on t.id = mt.id " +
                        "where mt.m_oCollaborator.m_oSystemUser.username = :uname and t.m_oTaskStatus = 'PENDING'",
                ManualTask.class);
        q.setParameter("uname", oUsername);
        return q.getResultList();
    }
}