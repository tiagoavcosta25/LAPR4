package base.server.autotaskexecutor.algorithms.fcfs;
import base.server.autotaskexecutor.algorithms.ScriptHandler;
import base.server.autotaskexecutor.algorithms.scheduler.ScriptHandlerScheduler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 *
 */

public class ScriptHandlerFCFS extends ScriptHandler {

    private static final Logger LOGGER = LogManager.getLogger(ScriptHandlerScheduler.class);

    private ScriptQueueFCFS m_oQueue;

    public ScriptHandlerFCFS(ScriptQueueFCFS oQueue, Integer intThreadNumber) {
        super(intThreadNumber);
        this.m_oQueue = oQueue;
    }

    public void run(){
        while(true){
            try {
                executeTask(this.m_oQueue.firstComeFirstServed());
            } catch (InterruptedException e) {
                LOGGER.trace("[Thread {}] Error Executing a Task", this.m_intThreadNumber);
            }
        }
    }
}
