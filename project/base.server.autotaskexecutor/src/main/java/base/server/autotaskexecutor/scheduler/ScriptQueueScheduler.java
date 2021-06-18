package base.server.autotaskexecutor.scheduler;

import eapli.base.taskmanagement.specification.domain.AutomaticTaskScript;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 *
 */

public class ScriptQueueScheduler {
    private List<LinkedList<AutomaticTaskScript>> m_lstQueues;

    public ScriptQueueScheduler(Integer intNumberHandlers) {
        this.m_lstQueues = new ArrayList<>();

        for(int i = 0; i < intNumberHandlers; i++){
            this.m_lstQueues.add(new LinkedList<>());
        }
    }

    public synchronized void addScript(AutomaticTaskScript oScript) {
        int i = 0, intSize = Integer.MAX_VALUE, intThread = -1;
        for(LinkedList<AutomaticTaskScript> lst : m_lstQueues){
            if(lst.size() < intSize){
                intSize = lst.size();
                intThread = i;
            }
            i++;
        }
        this.m_lstQueues.get(intThread).add(oScript);
    }

    public synchronized LinkedList<AutomaticTaskScript> getQueue(Integer intThreadNum) { return this.m_lstQueues.get(intThreadNum); }

    public synchronized Integer getSize(Integer intThreadNum) { return this.m_lstQueues.get(intThreadNum).size(); }

    public synchronized AutomaticTaskScript getScriptForExecution(Integer intThreadNum) {
        AutomaticTaskScript oScript = this.m_lstQueues.get(intThreadNum).getFirst();
        this.m_lstQueues.get(intThreadNum).remove(oScript);
        return oScript;
    }
}
