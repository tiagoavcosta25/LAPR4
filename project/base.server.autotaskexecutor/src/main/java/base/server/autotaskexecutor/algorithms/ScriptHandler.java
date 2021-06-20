package base.server.autotaskexecutor.algorithms;

import eapli.base.grammar.ScriptAlgorithms;
import eapli.base.grammar.ScriptMode;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.taskmanagement.execution.domain.TaskExecution;
import eapli.base.taskmanagement.execution.domain.TaskExecutionResult;
import eapli.base.taskmanagement.execution.repositories.TaskExecutionRepository;
import eapli.base.taskmanagement.specification.domain.AutomaticTaskScript;
import eapli.base.ticketmanagement.domain.Ticket;
import eapli.base.ticketmanagement.repository.TicketRepository;
import eapli.base.util.Application;
import javafx.util.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 * @author Pedro Santos 1190967@isep.ipp.pt
 *
 */

public abstract class ScriptHandler extends Thread {

    private static final Logger LOGGER = LogManager.getLogger(ScriptHandler.class);
    private final TaskExecutionRepository m_oTaskExecRepo = PersistenceContext.repositories().taskExecs();
    private final TicketRepository m_oTicketRepo = PersistenceContext.repositories().tickets();

    protected Integer m_intThreadNumber;

    public ScriptHandler(Integer intThreadNumber) {
        this.m_intThreadNumber = intThreadNumber;
    }

    protected void executeTask(Pair<Long, AutomaticTaskScript> oPair){
        try{
            LOGGER.trace("[Handler {}] Executing Automatic Task...", this.m_intThreadNumber);

            Optional<TaskExecution> oOptionalTask = this.m_oTaskExecRepo.findByID(oPair.getKey());

            if(!oOptionalTask.isPresent()){
                throw new Exception();
            }

            TaskExecution oTask = oOptionalTask.get();

            Optional<Ticket> oOptionalTicket = this.m_oTicketRepo.getTicketByTaskExec(oTask.id());

            if(!oOptionalTicket.isPresent()){
                throw new Exception();
            }

            Ticket oTicket = oOptionalTicket.get();

            Boolean blnFLag = ScriptAlgorithms.executeAutoTask(oTicket, oPair.getValue().toString(), ScriptMode.get(Application.settings().getScriptMode()));

            oTask.setExecuted();

            if(blnFLag){
                oTask.setResult(TaskExecutionResult.SUCCESS);
                LOGGER.trace("[Handler {}] Automatic Task Result: Success.", this.m_intThreadNumber);
            } else{
                oTask.setResult(TaskExecutionResult.ERROR);
                LOGGER.trace("[Handler-{}] Automatic Task Result: Error.", this.m_intThreadNumber);
            }
            this.m_oTaskExecRepo.save(oTask);
        } catch(Exception e){
            LOGGER.trace("[Handler {}] Error Executing a Task", this.m_intThreadNumber);
        }
    }

    public abstract void run();
}
