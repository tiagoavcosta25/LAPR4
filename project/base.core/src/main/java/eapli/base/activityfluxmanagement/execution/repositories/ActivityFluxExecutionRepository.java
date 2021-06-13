package eapli.base.activityfluxmanagement.execution.repositories;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public interface ActivityFluxExecutionRepository
        extends DomainRepository<Long, ActivityFluxExecution> {

    /**
     * returns the form with the given id
     *
     * @param lngID
     * @return
     */
    default Optional<ActivityFluxExecution> findByID(Long lngID) {
        return ofIdentity(lngID);
    }
}
