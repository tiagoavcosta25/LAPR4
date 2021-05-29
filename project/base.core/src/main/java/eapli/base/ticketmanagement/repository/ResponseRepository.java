package eapli.base.ticketmanagement.repository;

import eapli.base.ticketmanagement.domain.Response;
import eapli.base.ticketmanagement.domain.Ticket;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

public interface ResponseRepository
        extends DomainRepository<Long, Response> {

    /**
     * returns the ticket with the given id
     *
     * @param lngID
     * @return
     */
    default Optional<Response> findByID(Long lngID) {
        return ofIdentity(lngID);
    }
}
