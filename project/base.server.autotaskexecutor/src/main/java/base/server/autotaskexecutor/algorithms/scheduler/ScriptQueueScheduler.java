package base.server.autotaskexecutor.algorithms.scheduler;

import base.server.autotaskexecutor.algorithms.ScriptQueue;
import eapli.base.taskmanagement.specification.domain.AutomaticTaskScript;
import javafx.util.Pair;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 *
 */

public class ScriptQueueScheduler implements ScriptQueue {

    private List<LinkedList<Pair<Long, AutomaticTaskScript>>> m_lstQueues;
    private List<ReentrantLock> m_lstLocks;

    public ScriptQueueScheduler(Integer intNumberHandlers) {
        this.m_lstQueues = new ArrayList<>();
        this.m_lstLocks = new ArrayList<>();

        for(int i = 0; i < intNumberHandlers; i++){
            this.m_lstQueues.add(new LinkedList<>());
            this.m_lstLocks.add(new ReentrantLock());
        }
    }

    public void addScript(Long lngID, AutomaticTaskScript oScript) {
        int i = 0, intSize = Integer.MAX_VALUE, intThreadNum = -1;
        for(LinkedList<Pair<Long, AutomaticTaskScript>> lst : m_lstQueues){
            if(lst.size() < intSize){
                intSize = lst.size();
                intThreadNum = i;
            }
            i++;
        }

        this.m_lstQueues.get(intThreadNum).add(new Pair<>(lngID, oScript));

        synchronized (this.m_lstLocks.get(intThreadNum)){
            this.m_lstLocks.get(intThreadNum).notify();
        }
    }

    public synchronized LinkedList<Pair<Long, AutomaticTaskScript>> getQueue(Integer intThreadNum) { return this.m_lstQueues.get(intThreadNum); }

    public synchronized Integer getSize(Integer intThreadNum) { return this.m_lstQueues.get(intThreadNum).size(); }

    public synchronized Boolean isEmpty(Integer intThreadNum) { return this.m_lstQueues.get(intThreadNum).isEmpty(); }

    public Pair<Long, AutomaticTaskScript> getScriptForExecution(Integer intThreadNum) throws InterruptedException {
        if(isEmpty(intThreadNum)){
            synchronized (this.m_lstLocks.get(intThreadNum)){
                this.m_lstLocks.get(intThreadNum).wait();
            }
        }

        Pair<Long, AutomaticTaskScript> oPair = getQueue(intThreadNum).getFirst();
        this.m_lstQueues.get(intThreadNum).remove(oPair);
        return oPair;
    }
}
