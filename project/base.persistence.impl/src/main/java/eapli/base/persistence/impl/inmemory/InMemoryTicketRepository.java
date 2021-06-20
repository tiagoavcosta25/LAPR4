package eapli.base.persistence.impl.inmemory;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.activityfluxmanagement.execution.repositories.ActivityFluxExecutionRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.taskmanagement.execution.domain.AutomaticTaskExecution;
import eapli.base.taskmanagement.execution.domain.ManualTaskExecution;
import eapli.base.taskmanagement.execution.domain.TaskExecution;
import eapli.base.taskmanagement.execution.domain.TaskExecutionStatus;
import eapli.base.taskmanagement.execution.repositories.AutomaticTaskExecutionRepository;
import eapli.base.taskmanagement.execution.repositories.TaskExecutionRepository;
import eapli.base.taskmanagement.specification.domain.TaskOrderFields;
import eapli.base.ticketmanagement.domain.Ticket;
import eapli.base.ticketmanagement.domain.TicketStatus;
import eapli.base.ticketmanagement.repository.TicketRepository;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.Username;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.*;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
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

    @Override
    public Iterable<Ticket> getPendingManualTasksByTicketOrdered(Username oUsername, TaskOrderFields orderField) {
        Iterable<Ticket> iT = getPendingManualTasksByTicket(oUsername);
        List<Ticket> lstT = new ArrayList<>();
        iT.forEach(lstT::add);
        Comparator<Ticket> SortByFinishDate = Comparator.comparingInt(a -> a.limitDate().getM_dtLimitDate().getNano());
        Comparator<Ticket> SortByPriority = Comparator.comparing(Ticket::urgency);
        switch(orderField) {
            case FINISHDATE:
                lstT.sort(SortByFinishDate);
                break;
            case REVERSEFINISHDATE:
                lstT.sort(SortByFinishDate.reversed());
                break;
            case PRIORITY:
                lstT.sort(SortByPriority);
                break;
            case REVERSEPRIORITY:
                lstT.sort(SortByPriority.reversed());
                break;
        }
        return lstT;
    }

    @Override
    public Optional<Ticket> getTicketFromFlux(Long afe) {
        return matchOne(ticket -> ticket.executionFlux().equals(afe));
    }

    @Override
    public Optional<Ticket> getTicketByTaskExec(Long lngId) {
        TaskExecutionRepository oTaskRepo = PersistenceContext.repositories().taskExecs();
        TicketRepository oTicketRepo = PersistenceContext.repositories().tickets();
        Optional<TaskExecution> oOptional = oTaskRepo.findByID(lngId);
        Iterable<Ticket> itTickets = oTicketRepo.findAll();
        if(oOptional.isPresent()) {
            return Optional.ofNullable(null);
        }

        TaskExecution oTask = oOptional.get();

        for(Ticket oTicket : itTickets) {
            for(TaskExecution t : oTicket.executionFlux().flux()){
                if(t.sameAs(oTask)){
                    return Optional.ofNullable(oTicket);
                }
            }
        }
        return Optional.ofNullable(null);
    }
}
