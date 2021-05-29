package eapli.base.net.activityflux.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.net.activityflux.repositories.DataRepository;
import eapli.base.teammanagement.repositories.TeamRepository;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class Test {

    private final DataRepository dataRepository = PersistenceContext.repositories().data();

    public void testdata() {
        Long x = dataRepository.numberOfPendingActivities(123456L);
        System.out.println("PRINT: " + x);
    }
}
