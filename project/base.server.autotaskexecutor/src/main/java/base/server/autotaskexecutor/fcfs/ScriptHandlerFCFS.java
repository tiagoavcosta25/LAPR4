package base.server.autotaskexecutor.fcfs;
import base.server.autotaskexecutor.scheduler.ScriptHandlerScheduler;
import base.server.autotaskexecutor.scheduler.ScriptQueueScheduler;
import eapli.base.grammar.ScriptAlgorithms;
import eapli.base.grammar.ScriptMode;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.taskmanagement.execution.domain.TaskExecution;
import eapli.base.taskmanagement.execution.domain.TaskExecutionResult;
import eapli.base.taskmanagement.execution.repositories.TaskExecutionRepository;
import eapli.base.taskmanagement.specification.domain.AutomaticTaskScript;
import javafx.util.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 *
 */

public class ScriptHandlerFCFS extends Thread {

    private static final Logger LOGGER = LogManager.getLogger(ScriptHandlerFCFS.class);
    private final TaskExecutionRepository m_oTaskExecRepo = PersistenceContext.repositories().taskExecs();

    private ScriptQueueFCFS m_oQueue;
    private Integer m_intThreadNumber;

    public ScriptHandlerFCFS(ScriptQueueFCFS oQueue, Integer intThreadNumber) {
        this.m_oQueue = oQueue;
        this.m_intThreadNumber = intThreadNumber;
    }

    public void run(){
        while(true){
            LOGGER.trace("Executing Automatic Task...");

            try {
                Pair<Long, AutomaticTaskScript> oPair = this.m_oQueue.firstComeFirstServed();

                Boolean blnFLag = ScriptAlgorithms.executeAutoTask(oPair.getValue().toString(), ScriptMode.LISTENER);

                TaskExecution oTask = this.m_oTaskExecRepo.findByID(oPair.getKey()).get();
                oTask.setExecuted();

                if(blnFLag){
                    oTask.setResult(TaskExecutionResult.SUCCESS);
                    LOGGER.trace("Automatic Task Result: Success.");
                    ;               } else{
                    oTask.setResult(TaskExecutionResult.ERROR);
                    LOGGER.trace("Automatic Task Result: Error.");
                }

                this.m_oTaskExecRepo.save(oTask);

            } catch (InterruptedException e) {
                //e.printStackTrace();
            }
        }
    }
}
