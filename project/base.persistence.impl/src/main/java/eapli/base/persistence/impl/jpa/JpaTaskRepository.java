package eapli.base.persistence.impl.jpa;

import eapli.base.servicemanagement.domain.Service;
import eapli.base.taskmanagement.specification.domain.ManualTask;
import eapli.base.taskmanagement.specification.domain.Task;
import eapli.base.taskmanagement.specification.domain.TaskFilterFields;
import eapli.base.taskmanagement.specification.domain.TaskOrderFields;
import eapli.base.taskmanagement.specification.repositories.TaskRepository;
import eapli.framework.infrastructure.authz.domain.model.Username;

import javax.persistence.TypedQuery;

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
    public Iterable<Service> getTasksOfCollaborator(Username oUsername) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //TODO: Finish method getTasksOfCollaborator (filter)
    @Override
    public Iterable<Service> getTasksOfCollaborator(Username oUsername, TaskFilterFields enumFilterBy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //TODO: Finish method getTasksOfCollaborator (order)
    public Iterable<Service> getTasksOfCollaborator(Username oUsername, TaskOrderFields enumOrderBy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //TODO: Finish method getTasksOfCollaborator (filter and order)
    @Override
    public Iterable<Service> getTasksOfCollaborator(Username oUsername, TaskFilterFields enumFilterBy, TaskOrderFields enumOrderBy) {
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
    public Iterable<ManualTask> getHisPendingManualTasks(Username oUsername, Long idFlux) {
        final TypedQuery<ManualTask> q = entityManager().createQuery(
                "Select distinct mt from ActivityFlux af join af.m_lstFlux lst " +
                        "inner join Task t on t.id = lst.id " +
                        "inner join ManualTask mt on mt.id = t.id " +
                        "where mt.m_oCollaborator.m_oSystemUser.username = :uname and t.m_oTaskStatus = 'PENDING' and af.id =:idflux",
                ManualTask.class);
        q.setParameter("uname", oUsername);
        q.setParameter("idflux", idFlux);
        return q.getResultList();
    }

    @Override
    public Iterable<Service> getActivityFlux(Username oUsername) {
        final TypedQuery<Service> q = entityManager().createQuery(
                "Select distinct s from ActivityFlux af join af.m_lstFlux lst " +
                        "inner join Service s on s.m_oActivityFlux.id = af.id " +
                        "inner join ManualTask mt on mt.id = lst.id " +
                        "inner join Task t on t.id = mt.id " +
                        "where mt.m_oCollaborator.m_oSystemUser.username = :uname and t.m_oTaskStatus = 'PENDING'",
                Service.class);
        q.setParameter("uname", oUsername);
        return q.getResultList();
    }
}