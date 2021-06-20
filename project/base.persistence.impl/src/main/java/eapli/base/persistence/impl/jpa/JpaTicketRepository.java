package eapli.base.persistence.impl.jpa;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.taskmanagement.execution.domain.TaskExecutionStatus;
import eapli.base.taskmanagement.specification.domain.TaskOrderFields;
import eapli.base.ticketmanagement.domain.Ticket;
import eapli.base.ticketmanagement.domain.TicketStatus;
import eapli.base.ticketmanagement.domain.TicketUrgency;
import eapli.base.ticketmanagement.repository.TicketRepository;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.Username;

import javax.persistence.TypedQuery;
import java.util.*;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
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
                        "WHERE mte.m_oCollaborator.m_oSystemUser.username =: uname AND te.m_oTaskStatus =: pending ",
                Ticket.class);
        q.setParameter("pending", TaskExecutionStatus.PENDING);
        q.setParameter("uname", oUsername);
        return q.getResultList();
    }

    @Override
    public Iterable<Ticket> getPendingManualTasksByTicketOrdered(Username oUsername, TaskOrderFields orderField) {
        Comparator<Ticket> SortByPriority = (a, b) -> {
            if(a.urgency().equals(TicketUrgency.LOW)) {
                if(b.urgency().equals(TicketUrgency.LOW)) return 0;
                else return -1;
            }
            else if(a.urgency().equals(TicketUrgency.MEDIUM)) {
                if(b.urgency().equals(TicketUrgency.LOW)) return 1;
                else if(b.urgency().equals(TicketUrgency.MEDIUM)) return 0;
                else return -1;
            } else {
                if(b.urgency().equals(TicketUrgency.HIGH)) return 0;
                else return 1;
            }
        };
        StringBuilder query = new StringBuilder();
        query.append("SELECT DISTINCT t FROM ActivityFluxExecution afe JOIN afe.m_lstFlux lst ")
                .append("INNER JOIN Ticket t ON t.m_oFluxExecution = afe.id ")
                .append("INNER JOIN ManualTaskExecution mte ON mte.id = lst.id ")
                .append("INNER JOIN TaskExecution te ON te.id = mte.id ")
                .append("WHERE mte.m_oCollaborator.m_oSystemUser.username =: uname AND te.m_oTaskStatus =: pending ");
        switch(orderField) {
            case FINISHDATE:
                query.append("ORDER BY t.m_oLimitDate");
                break;
            case REVERSEFINISHDATE:
                query.append("ORDER BY t.m_oLimitDate DESC");
                break;
            case PRIORITY:
                Iterable<Ticket> iT = getPendingManualTasksByTicket(oUsername);
                List<Ticket> lstT = new ArrayList<>();
                iT.forEach(lstT::add);
                lstT.sort(SortByPriority);
                return lstT;
            case REVERSEPRIORITY:
                Iterable<Ticket> iTicket = getPendingManualTasksByTicket(oUsername);
                List<Ticket> lstTicket = new ArrayList<>();
                iTicket.forEach(lstTicket::add);
                lstTicket.sort(SortByPriority.reversed());
                return lstTicket;
        }
        final TypedQuery<Ticket> q = entityManager().createQuery(query.toString(), Ticket.class);
        q.setParameter("pending", TaskExecutionStatus.PENDING);
        q.setParameter("uname", oUsername);
        return q.getResultList();
    }

    @Override
    public Optional<Ticket> getTicketFromFlux(Long afeID) {
        final TypedQuery<Ticket> q = entityManager().createQuery(
                "SELECT t FROM Ticket t " +
                        "WHERE t.m_oFluxExecution.id =: afe",
                Ticket.class);
        q.setParameter("afe", afeID);
        return Optional.ofNullable(q.getSingleResult());
    }


    @Override
    public Optional<Ticket> getTicketByTaskExec(Long lngId) {
        final TypedQuery<Ticket> q = entityManager().createQuery(
                "SELECT t FROM ActivityFluxExecution af JOIN af.m_lstFlux lst " +
                        "INNER JOIN Ticket t ON t.m_oFluxExecution.id = af.id " +
                        "INNER JOIN AutomaticTaskExecution ate ON ate.id = lst.id " +
                        "INNER JOIN TaskExecution te ON te.id = ate.id " +
                        "WHERE te.id =: lngId",
                Ticket.class);
        q.setParameter("lngId", lngId);
        return Optional.ofNullable(q.getSingleResult());
    }
}
