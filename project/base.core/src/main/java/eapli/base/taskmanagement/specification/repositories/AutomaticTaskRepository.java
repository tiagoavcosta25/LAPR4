package eapli.base.taskmanagement.specification.repositories;

import eapli.base.taskmanagement.specification.domain.AutomaticTask;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public interface AutomaticTaskRepository extends DomainRepository<Long, AutomaticTask> {

    /**
     * returns the form with the given id
     *
     * @param lngID
     * @return
     */
    default Optional<AutomaticTask> findByID(Long lngID) {
        return ofIdentity(lngID);
    }
}
