package eapli.base.net.activityflux.repositories;

import eapli.base.servicemanagement.domain.Service;
import eapli.framework.domain.repositories.DomainRepository;

public interface DataRepository
        extends DomainRepository<Long, Service> {

    public int numberOfPendingActivities(Long oMecanographicNumber);

    public int numberOfExpiredActivities();

    public int numberOfNearExpiredActivities();

    public int numberOfLowPriorityActivities();

    public int numberOfMediumPriorityActivities();

    public int numberOfHighPriorityActivities();
}
