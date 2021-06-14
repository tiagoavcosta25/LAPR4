package eapli.base.taskmanagement.specification.repositories;

import eapli.base.taskmanagement.specification.domain.ManualTask;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
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

    boolean isManualTask(Long lngID);

}
