package eapli.base.servicemanagement.repositories;

import eapli.base.servicemanagement.domain.Service;
import eapli.framework.domain.repositories.DomainRepository;

public interface DataRepository
        extends DomainRepository<Long, Service> {

    public Long numberOfPendingActivities(String oUserName);

    public int numberOfExpiredActivities(String oUserName);

    public int numberOfNearExpiredActivities(String oUserName);

    public int numberOfLowPriorityActivities(String oUserName);

    public int numberOfMediumPriorityActivities(String oUserName);

    public int numberOfHighPriorityActivities(String oUserName);
}
