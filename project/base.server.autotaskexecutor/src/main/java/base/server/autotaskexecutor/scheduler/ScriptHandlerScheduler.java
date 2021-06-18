package base.server.autotaskexecutor.scheduler;

import eapli.base.grammar.ScriptAlgorithms;
import eapli.base.grammar.ScriptMode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 *
 */

public class ScriptHandlerScheduler extends Thread {

    private static final Logger LOGGER = LogManager.getLogger(ScriptHandlerScheduler.class);

    private ScriptQueueScheduler m_oQueue;
    private Integer m_intThreadNumber;

    public ScriptHandlerScheduler(ScriptQueueScheduler oQueue, Integer intThreadNumber) {
        this.m_oQueue = oQueue;
        this.m_intThreadNumber = intThreadNumber;
    }

    public void run(){
        while(true){
            while (this.m_oQueue.getSize(this.m_intThreadNumber) < 1){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            LOGGER.trace("Executing Automatic Task...");

            ScriptAlgorithms.executeAutoTask(this.m_oQueue.getScriptForExecution(this.m_intThreadNumber).toString(), ScriptMode.LISTENER);
        }
    }
}
