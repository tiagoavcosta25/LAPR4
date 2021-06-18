package base.server.autotaskexecutor.fcfs;

import eapli.base.taskmanagement.specification.domain.AutomaticTaskScript;
import java.util.LinkedList;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 *
 */

public class ScriptQueueFCFS {
    private LinkedList<AutomaticTaskScript> m_oQueue;

    public ScriptQueueFCFS() {
        this.m_oQueue = new LinkedList<>();
    }

    public synchronized void addScript(AutomaticTaskScript oScript) {
        m_oQueue.add(oScript);
    }

    public synchronized LinkedList<AutomaticTaskScript> getQueue() { return m_oQueue; }

    public synchronized Integer getSize() { return m_oQueue.size(); }

    public synchronized AutomaticTaskScript firstComeFirstServed() {
        AutomaticTaskScript oScript = this.m_oQueue.getFirst();
        this.m_oQueue.remove(oScript);
        return oScript;
    }
}
