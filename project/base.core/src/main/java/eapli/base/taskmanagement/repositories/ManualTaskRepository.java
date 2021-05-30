package eapli.base.taskmanagement.repositories;

import eapli.base.activityfluxmanagement.domain.ActivityFlux;
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.taskmanagement.domain.*;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.infrastructure.authz.domain.model.Username;

import java.util.Optional;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public interface ManualTaskRepository
        extends DomainRepository<Long, ManualTaskExecution> {

    /**
     * returns the form with the given id
     *
     * @param lngID
     * @return
     */
    default Optional<ManualTaskExecution> findByID(Long lngID) {
        return ofIdentity(lngID);
    }

}