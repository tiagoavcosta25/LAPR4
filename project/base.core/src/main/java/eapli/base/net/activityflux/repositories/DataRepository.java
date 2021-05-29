package eapli.base.net.activityflux.repositories;

import eapli.base.servicemanagement.domain.Service;
import eapli.framework.domain.repositories.DomainRepository;

public interface DataRepository
        extends DomainRepository<Long, Service> {

    public Long numberOfPendingActivities(Long oMecanographicNumber);

    public int numberOfExpiredActivities(Long oMecanographicNumber);

    public int numberOfNearExpiredActivities(Long oMecanographicNumber);

    public int numberOfLowPriorityActivities(Long oMecanographicNumber);

    public int numberOfMediumPriorityActivities(Long oMecanographicNumber);

    public int numberOfHighPriorityActivities(Long oMecanographicNumber);
}
