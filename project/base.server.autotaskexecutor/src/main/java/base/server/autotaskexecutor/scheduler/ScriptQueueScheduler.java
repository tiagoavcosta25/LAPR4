package base.server.autotaskexecutor.scheduler;

import eapli.base.taskmanagement.specification.domain.AutomaticTaskScript;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 *
 */

public class ScriptQueueScheduler {

    private List<LinkedList<AutomaticTaskScript>> m_lstQueues;
    private List<ReentrantLock> m_lstLocks;

    public ScriptQueueScheduler(Integer intNumberHandlers) {
        this.m_lstQueues = new ArrayList<>();
        this.m_lstLocks = new ArrayList<>();

        for(int i = 0; i < intNumberHandlers; i++){
            this.m_lstQueues.add(new LinkedList<>());
            this.m_lstLocks.add(new ReentrantLock());
        }
    }

    public void addScript(AutomaticTaskScript oScript) {
        int i = 0, intSize = Integer.MAX_VALUE, intThreadNum = -1;
        for(LinkedList<AutomaticTaskScript> lst : m_lstQueues){
            if(lst.size() < intSize){
                intSize = lst.size();
                intThreadNum = i;
            }
            i++;
        }

        this.m_lstQueues.get(intThreadNum).add(oScript);

        synchronized (this.m_lstLocks.get(intThreadNum)){
            this.m_lstLocks.get(intThreadNum).notify();
        }
    }

    public synchronized LinkedList<AutomaticTaskScript> getQueue(Integer intThreadNum) { return this.m_lstQueues.get(intThreadNum); }

    public synchronized Integer getSize(Integer intThreadNum) { return this.m_lstQueues.get(intThreadNum).size(); }

    public AutomaticTaskScript getScriptForExecution(Integer intThreadNum) throws InterruptedException {
        synchronized (this.m_lstLocks.get(intThreadNum)){
            this.m_lstLocks.get(intThreadNum).wait();
        }

        AutomaticTaskScript oScript = this.m_lstQueues.get(intThreadNum).getFirst();
        this.m_lstQueues.get(intThreadNum).remove(oScript);
        return oScript;
    }
}
