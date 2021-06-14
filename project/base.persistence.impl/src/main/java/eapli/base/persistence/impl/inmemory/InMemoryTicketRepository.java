package eapli.base.persistence.impl.inmemory;

import eapli.base.ticketmanagement.domain.Ticket;
import eapli.base.ticketmanagement.repository.TicketRepository;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Jéssica Alves 1190682@isep.ipp.pt
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class InMemoryTicketRepository
        extends InMemoryDomainRepository<Ticket, Long>
        implements TicketRepository {

    static {
        InMemoryInitializer.init();
    }

    @Override
    public Optional<Ticket> findByID(Long number) {
        return Optional.of(data().get(number));
    }

    @Override
    public Iterable<Ticket> getTicketHistory(SystemUser oUser) {
        return match(e -> e.collaborator().user().username().equals(oUser.username()));
    }

    @Override
    public Iterable<Ticket> getOnGoingTickets(SystemUser oUser) {
        return match(e -> e.collaborator().user().username().equals(oUser.username()));
    }
}
