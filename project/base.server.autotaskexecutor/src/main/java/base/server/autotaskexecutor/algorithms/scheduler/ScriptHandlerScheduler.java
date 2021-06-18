package base.server.autotaskexecutor.algorithms.scheduler;

import base.server.autotaskexecutor.algorithms.ScriptHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 *
 */

public class ScriptHandlerScheduler extends ScriptHandler {

    private static final Logger LOGGER = LogManager.getLogger(ScriptHandlerScheduler.class);

    private ScriptQueueScheduler m_oQueue;

    public ScriptHandlerScheduler(ScriptQueueScheduler oQueue, Integer intThreadNumber) {
        super(intThreadNumber);
        this.m_oQueue = oQueue;
    }

    public void run(){
        while(true){
            try {
                executeTask(this.m_oQueue.getScriptForExecution(this.m_intThreadNumber));
            } catch (InterruptedException e) {
                LOGGER.trace("[Thread {}] Error Executing a Task", this.m_intThreadNumber);
            }
        }
    }
}
