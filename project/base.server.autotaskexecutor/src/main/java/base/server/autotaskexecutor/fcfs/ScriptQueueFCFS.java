package base.server.autotaskexecutor.fcfs;

import eapli.base.taskmanagement.specification.domain.AutomaticTaskScript;
import javafx.util.Pair;

import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 *
 */

public class ScriptQueueFCFS {

    private LinkedList<Pair<Long, AutomaticTaskScript>> m_oQueue;
    private ReentrantLock m_Lock;

    public ScriptQueueFCFS() {
        this.m_oQueue = new LinkedList<>();
        this.m_Lock = new ReentrantLock();
    }

    public void addScript(Long lngID, AutomaticTaskScript oScript) {
        m_oQueue.add(new Pair<>(lngID, oScript));
        synchronized (this.m_Lock){
            this.m_Lock.notify();
        }
    }

    public synchronized LinkedList<Pair<Long, AutomaticTaskScript>> getQueue() { return m_oQueue; }

    public synchronized Integer getSize() { return m_oQueue.size(); }

    public Pair<Long, AutomaticTaskScript> firstComeFirstServed() throws InterruptedException {
        synchronized (this.m_Lock){
            this.m_Lock.wait();
        }
        Pair<Long, AutomaticTaskScript> oPair = this.m_oQueue.getFirst();
        this.m_oQueue.remove(oPair);
        return oPair;
    }
}
