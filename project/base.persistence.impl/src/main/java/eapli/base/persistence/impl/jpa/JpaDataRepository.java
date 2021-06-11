package eapli.base.persistence.impl.jpa;

import eapli.base.servicemanagement.repositories.DataRepository;
import eapli.base.taskmanagement.domain.TaskPriority;
import eapli.base.ticketmanagement.domain.Ticket;

import javax.persistence.TypedQuery;
import java.time.LocalDateTime;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
class JpaDataRepository extends HelpDeskJpaRepositoryBase<Ticket, Long, Long>
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
                        "where mte.m_oCollaborator.m_oSystemUser.username.value =: un and te.m_oTaskStatus = 'PENDING' " +
                        "and t.m_oLimitDate.m_dtLimitDate > CURRENT_TIMESTAMP",
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
        return null;
    }

    @Override
    public Long numberOfLowPriorityActivities(String oUserName) {
        return null;
    }

    @Override
    public Long numberOfMediumPriorityActivities(String oUserName) {
        return null;
    }

    @Override
    public Long numberOfHighPriorityActivities(String oUserName) {
       return null;
    }
}
