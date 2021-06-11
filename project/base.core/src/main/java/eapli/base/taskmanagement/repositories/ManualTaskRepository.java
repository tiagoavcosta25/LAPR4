package eapli.base.taskmanagement.repositories;

import eapli.base.taskmanagement.domain.ManualTask;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public interface ManualTaskRepository extends DomainRepository<Long, ManualTask> {

    /**
     * returns the form with the given id
     *
     * @param lngID
     * @return
     */
    default Optional<ManualTask> findByID(Long lngID) {
        return ofIdentity(lngID);
    }

}
