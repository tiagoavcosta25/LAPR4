package eapli.base.servicemanagement.repositories;

import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.domain.ServiceDraft;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public interface ServiceDraftRepository
        extends DomainRepository<Long, ServiceDraft> {

    /**
     * returns the client user (utente) with the given mecanographic number
     *
     * @param lngID
     * @return
     */
    default Optional<ServiceDraft> findByID(Long lngID) {
        return ofIdentity(lngID);
    }
}
