package eapli.base.ticketmanagement.repository;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.taskmanagement.specification.domain.TaskOrderFields;
import eapli.base.ticketmanagement.domain.Ticket;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.Username;

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

    Iterable<Ticket> getTicketHistory(final SystemUser oUser);

    Iterable<Ticket> getOnGoingTickets(final SystemUser oUser);

    Iterable<Ticket> getPendingManualTasksByTicket(final Username oUsername);

    Iterable<Ticket> getPendingManualTasksByTicketOrdered(final Username oUsername, final TaskOrderFields orderField);

    Optional<Ticket> getTicketFromFlux(final Long afe);

    Optional<Ticket> getTicketByTaskExec(Long lngId);
}
