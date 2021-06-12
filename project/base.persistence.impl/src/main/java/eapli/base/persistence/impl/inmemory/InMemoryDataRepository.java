package eapli.base.persistence.impl.inmemory;

import eapli.base.servicemanagement.repositories.DataRepository;
import eapli.base.ticketmanagement.domain.Ticket;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;


/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class InMemoryDataRepository extends InMemoryDomainRepository<Ticket, Long> implements DataRepository {

    static {
        InMemoryInitializer.init();
    }

    //TODO: whole class
    @Override
    public Long numberOfPendingActivities(String oUserName) {
        return null;
    }

    @Override
    public Long numberOfExpiredActivities(String oUserName) {
        return 0L;
    }

    @Override
    public Long numberOfNearExpiredActivities(String oUserName) {
        return 0L;
    }

    @Override
    public Long numberOfLowPriorityActivities(String oUserName) {
        return 0L;
    }

    @Override
    public Long numberOfMediumPriorityActivities(String oUserName) {
        return 0L;
    }

    @Override
    public Long numberOfHighPriorityActivities(String oUserName) {
        return 0L;
    }
}
