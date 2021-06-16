package eapli.base.persistence.impl.jpa;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.taskmanagement.execution.domain.ManualTaskExecution;
import eapli.base.taskmanagement.execution.domain.TaskExecutionStatus;
import eapli.base.ticketmanagement.domain.Ticket;
import eapli.base.ticketmanagement.domain.TicketStatus;
import eapli.base.ticketmanagement.repository.TicketRepository;
import eapli.base.util.Application;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.Username;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import javax.persistence.TypedQuery;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author Jéssica Alves 1190682@isep.ipp.pt
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
class JpaTicketRepository
        extends HelpDeskJpaRepositoryBase<Ticket, Long, Long>
        implements TicketRepository {

    public JpaTicketRepository() {
        super("ticketID");
    }

    @Override
    public Optional<Ticket> findById(Long lngID) {
        final Map<String, Object> params = new HashMap<>();
        params.put("ticketID", lngID);
        return matchOne("e.id=:ticketID", params);
    }

    @Override
    public Iterable<Ticket> getTicketHistory(SystemUser oUser) {
        final TypedQuery<Ticket> q = entityManager().createQuery(
                "SELECT e FROM Ticket e WHERE e.m_oCollaborator.m_oSystemUser.username = :username AND e.m_oStatus = :status " +
                        "ORDER BY e.m_oCreationDate DESC",
                Ticket.class);
        q.setParameter("username", oUser.identity());
        q.setParameter("status", TicketStatus.CLOSED);
        return q.getResultList();
    }

    @Override
    public Iterable<Ticket> getOnGoingTickets(SystemUser oUser) {
        final TypedQuery<Ticket> q = entityManager().createQuery(
                "SELECT e FROM Ticket e WHERE e.m_oCollaborator.m_oSystemUser.username = :username AND e.m_oStatus = :status " +
                        "ORDER BY e.m_oCreationDate DESC",
                Ticket.class);
        q.setParameter("username", oUser.identity());
        q.setParameter("status", TicketStatus.OPEN);
        return q.getResultList();
    }

    @Override
    public Iterable<Ticket> getPendingManualTasksByTicket(Username oUsername) {
        final TypedQuery<Ticket> q = entityManager().createQuery(
                "SELECT DISTINCT t FROM ActivityFluxExecution afe JOIN afe.m_lstFlux lst " +
                        "INNER JOIN Ticket t ON t.m_oFluxExecution = afe.id " +
                        "INNER JOIN ManualTaskExecution mte ON mte.id = lst.id " +
                        "INNER JOIN TaskExecution te ON te.id = mte.id " +
                        "WHERE mte.m_oCollaborator.m_oSystemUser.username =: uname AND te.m_oTaskStatus =: pending " +
                        "AND afe.m_oProgress = mte.id",
                Ticket.class);
        q.setParameter("pending", TaskExecutionStatus.PENDING);
        q.setParameter("uname", oUsername);
        return q.getResultList();
    }
}
