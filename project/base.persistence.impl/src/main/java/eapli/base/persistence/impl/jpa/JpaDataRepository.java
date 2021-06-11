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
        return null;
    }

    @Override
    public Long numberOfExpiredActivities(String oUserName) {
       return null;
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
