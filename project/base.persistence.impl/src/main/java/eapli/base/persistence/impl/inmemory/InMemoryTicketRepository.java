package eapli.base.persistence.impl.inmemory;

import eapli.base.taskmanagement.execution.domain.ManualTaskExecution;
import eapli.base.taskmanagement.execution.domain.TaskExecution;
import eapli.base.taskmanagement.execution.domain.TaskExecutionStatus;
import eapli.base.ticketmanagement.domain.Ticket;
import eapli.base.ticketmanagement.domain.TicketStatus;
import eapli.base.ticketmanagement.repository.TicketRepository;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.Username;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.ArrayList;
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
        return match(e -> e.collaborator().user().username().equals(oUser.username())
                && e.status().equals(TicketStatus.CLOSED));
    }

    @Override
    public Iterable<Ticket> getOnGoingTickets(SystemUser oUser) {
        return match(e -> e.collaborator().user().username().equals(oUser.username())
                && e.status().equals(TicketStatus.OPEN));
    }

    @Override
    public Iterable<Ticket> getPendingManualTasksByTicket(Username oUsername) {
        Iterable<Ticket> tLst = findAll();
        List<Ticket> tFinalLst = new ArrayList<>();
        for(Ticket t : tLst) {
            for(TaskExecution te : t.executionFlux().flux()) {
                if(te.getClass().equals(ManualTaskExecution.class)) {
                    ManualTaskExecution mte = (ManualTaskExecution) te;
                    if (mte.getM_oCollaborator().user().username().equals(oUsername)
                            && te.status().equals(TaskExecutionStatus.PENDING)
                            && t.executionFlux().currentProgress().currentProgress().equals(te.id())) {
                        tFinalLst.add(t);
                    }
                }
            }
        }
        return tFinalLst;
    }
}
