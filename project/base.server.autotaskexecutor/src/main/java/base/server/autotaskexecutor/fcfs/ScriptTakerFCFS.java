package base.server.autotaskexecutor.fcfs;

import eapli.base.taskmanagement.specification.domain.AutomaticTaskScript;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 *
 */

public class ScriptTakerFCFS extends Thread {

    private ScriptQueueFCFS m_oQueue;
    private AutomaticTaskScript m_oScript;

    public ScriptTakerFCFS(ScriptQueueFCFS oQueue, String strScript) {
        this.m_oQueue = oQueue;
        this.m_oScript = AutomaticTaskScript.valueOf(strScript);
    }

    public void run(){
        this.m_oQueue.addScript(m_oScript);
    }
}
