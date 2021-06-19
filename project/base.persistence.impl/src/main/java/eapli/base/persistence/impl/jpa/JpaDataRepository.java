package eapli.base.persistence.impl.jpa;

import eapli.base.servicemanagement.repositories.DataRepository;
import eapli.base.taskmanagement.specification.domain.TaskPriority;
import eapli.base.ticketmanagement.domain.Ticket;

import javax.persistence.TypedQuery;
import java.time.LocalDateTime;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class JpaDataRepository extends HelpDeskJpaRepositoryBase<Ticket, Long, Long>
        implements DataRepository {

    public JpaDataRepository() {
        super("m_lngID");
    }

    @Override
    public Long numberOfPendingActivities(String oUserName) {
        final TypedQuery<Long> q = entityManager().createQuery(
                "Select count(mte) from ActivityFluxExecution a join a.m_lstFlux lst " +
                        "inner join Ticket t on t.m_oFluxExecution.id = a.id " +
                        "inner join TaskExecution te on te.id = lst.id " +
                        "inner join ManualTaskExecution mte on mte.id = te.id " +
                        "where mte.m_oCollaborator.m_oSystemUser.username.value =: un and te.m_oTaskStatus = 'PENDING' ",
                Long.class);
        q.setParameter("un", oUserName);
        return q.getSingleResult();
    }

    @Override
    public Long numberOfExpiredActivities(String oUserName) {
        final TypedQuery<Long> q = entityManager().createQuery(
                "Select count(mte) from ActivityFluxExecution a join a.m_lstFlux lst " +
                        "inner join Ticket t on t.m_oFluxExecution.id = a.id " +
                        "inner join TaskExecution te on te.id = lst.id " +
                        "inner join ManualTaskExecution mte on mte.id = te.id " +
                        "where mte.m_oCollaborator.m_oSystemUser.username.value =: un and te.m_oTaskStatus = 'PENDING' " +
                        "and t.m_oLimitDate.m_dtLimitDate < CURRENT_TIMESTAMP",
                Long.class);
        q.setParameter("un", oUserName);
        return q.getSingleResult();
    }

    @Override
    public Long numberOfNearExpiredActivities(String oUserName) {
        final TypedQuery<Long> q = entityManager().createQuery(
                "Select count(mte) from ActivityFluxExecution a join a.m_lstFlux lst " +
                        "inner join Ticket t on t.m_oFluxExecution.id = a.id " +
                        "inner join TaskExecution te on te.id = lst.id " +
                        "inner join ManualTaskExecution mte on mte.id = te.id " +
                        "where mte.m_oCollaborator.m_oSystemUser.username.value =: un and te.m_oTaskStatus = 'PENDING' " +
                        "and (t.m_oLimitDate.m_dtLimitDate BETWEEN CURRENT_TIMESTAMP and :finish)",
                Long.class);

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime in1h = now.plusHours(1);
        System.out.println(in1h);

        q.setParameter("un", oUserName);
        q.setParameter("finish", in1h);
        return q.getSingleResult();
    }

    @Override
    public Long numberOfLowPriorityActivities(String oUserName) {
        final TypedQuery<Long> q = entityManager().createQuery(
                "Select count(mte) from ActivityFluxExecution a join a.m_lstFlux lst " +
                        "inner join Ticket t on t.m_oFluxExecution.id = a.id " +
                        "inner join TaskExecution te on te.id = lst.id " +
                        "inner join ManualTaskExecution mte on mte.id = te.id " +
                        "inner join ManualTask mt on mt.id = mte.m_oManualTask.id " +
                        "where mte.m_oCollaborator.m_oSystemUser.username.value =: un and te.m_oTaskStatus = 'PENDING' " +
                        "and mt.m_oTaskPriority =: lowPrio",
                Long.class);
        q.setParameter("un", oUserName);
        q.setParameter("lowPrio", TaskPriority.LOW);
        return q.getSingleResult();
    }

    @Override
    public Long numberOfMediumPriorityActivities(String oUserName) {
        final TypedQuery<Long> q = entityManager().createQuery(
                "Select count(mte) from ActivityFluxExecution a join a.m_lstFlux lst " +
                        "inner join Ticket t on t.m_oFluxExecution.id = a.id " +
                        "inner join TaskExecution te on te.id = lst.id " +
                        "inner join ManualTaskExecution mte on mte.id = te.id " +
                        "inner join ManualTask mt on mt.id = mte.m_oManualTask.id " +
                        "where mte.m_oCollaborator.m_oSystemUser.username.value =: un and te.m_oTaskStatus = 'PENDING' " +
                        "and mt.m_oTaskPriority =: midPrio",
                Long.class);
        q.setParameter("un", oUserName);
        q.setParameter("midPrio", TaskPriority.MEDIUM);
        return q.getSingleResult();
    }

    @Override
    public Long numberOfHighPriorityActivities(String oUserName) {
        final TypedQuery<Long> q = entityManager().createQuery(
                "Select count(mte) from ActivityFluxExecution a join a.m_lstFlux lst " +
                        "inner join Ticket t on t.m_oFluxExecution.id = a.id " +
                        "inner join TaskExecution te on te.id = lst.id " +
                        "inner join ManualTaskExecution mte on mte.id = te.id " +
                        "inner join ManualTask mt on mt.id = mte.m_oManualTask.id " +
                        "where mte.m_oCollaborator.m_oSystemUser.username.value =: un and te.m_oTaskStatus = 'PENDING' " +
                        "and mt.m_oTaskPriority =: highPrio",
                Long.class);
        q.setParameter("un", oUserName);
        q.setParameter("highPrio", TaskPriority.HIGH);
        return q.getSingleResult();
    }
}
