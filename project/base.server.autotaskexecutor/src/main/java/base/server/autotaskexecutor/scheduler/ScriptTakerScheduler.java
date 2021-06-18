package base.server.autotaskexecutor.scheduler;

import eapli.base.taskmanagement.specification.domain.AutomaticTaskScript;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 *
 */

public class ScriptTakerScheduler extends Thread {

    private ScriptQueueScheduler m_oQueue;
    private AutomaticTaskScript m_oScript;

    public ScriptTakerScheduler(ScriptQueueScheduler oQueue, String strScript) {
        this.m_oQueue = oQueue;
        this.m_oScript = AutomaticTaskScript.valueOf(strScript);
    }

    public void run(){
        this.m_oQueue.addScript(m_oScript);
    }
}
