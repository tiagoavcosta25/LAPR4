package eapli.base.servicemanagement.repositories;

import eapli.base.ticketmanagement.domain.Ticket;
import eapli.framework.domain.repositories.DomainRepository;

public interface DataRepository
        extends DomainRepository<Long, Ticket> {

    public Long numberOfPendingActivities(String oUserName);

    public Long numberOfExpiredActivities(String oUserName);

    public Long numberOfNearExpiredActivities(String oUserName);

    public Long numberOfLowPriorityActivities(String oUserName);

    public Long numberOfMediumPriorityActivities(String oUserName);

    public Long numberOfHighPriorityActivities(String oUserName);
}
