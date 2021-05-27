package eapli.base.servicesolicitationmanagement.repository;

import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicesolicitationmanagement.domain.Ticket;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

public interface TicketRepository
        extends DomainRepository<Long, Ticket> {

    /**
     * returns the ticket with the given id
     *
     * @param lngID
     * @return
     */
    default Optional<Ticket> findByID(Long lngID) {
        return ofIdentity(lngID);
    }
}
