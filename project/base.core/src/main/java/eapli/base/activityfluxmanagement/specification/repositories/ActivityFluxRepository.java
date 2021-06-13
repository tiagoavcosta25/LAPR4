package eapli.base.activityfluxmanagement.specification.repositories;

import eapli.base.activityfluxmanagement.specification.domain.ActivityFlux;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public interface ActivityFluxRepository
        extends DomainRepository<Long, ActivityFlux> {

    /**
     * returns the form with the given id
     *
     * @param lngID
     * @return
     */
    default Optional<ActivityFlux> findByID(Long lngID) {
        return ofIdentity(lngID);
    }
}
