package eapli.base.persistence.impl.jpa;

import eapli.base.ticketmanagement.domain.Ticket;
import eapli.base.ticketmanagement.repository.TicketRepository;
import eapli.base.util.Application;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
class JpaTicketRepository
        extends JpaAutoTxRepository<Ticket, Long, Long>
        implements TicketRepository {

    public JpaTicketRepository(TransactionalContext autoTx) {
        super(autoTx, "ticketID");
    }

    public JpaTicketRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "ticketID");
    }

    @Override
    public Optional<Ticket> findById(Long lngID) {
        final Map<String, Object> params = new HashMap<>();
        params.put("ticketID", lngID);
        return matchOne("e.id=:ticketID", params);
    }
}
