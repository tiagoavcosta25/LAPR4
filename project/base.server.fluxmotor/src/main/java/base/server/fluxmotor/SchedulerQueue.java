package base.server.fluxmotor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;


/**
 * @author Beatriz Seixas 1190424@isep.ipp.pt
 */
public class SchedulerQueue implements GenericQueue {

    private List<LinkedList<Long>> m_lstQueues;
    private List<ReentrantLock> m_lstLocks;

    public SchedulerQueue(Integer intNumberHandlers) {
        this.m_lstQueues = new ArrayList<>();
        this.m_lstLocks = new ArrayList<>();

        for(int i = 0; i < intNumberHandlers; i++){
            this.m_lstQueues.add(new LinkedList<>());
            this.m_lstLocks.add(new ReentrantLock());
        }
    }

    @Override
    public void addToQueue(long number) {
        int i = 0, intSize = Integer.MAX_VALUE, intThreadNum = -1;
        for(LinkedList<Long> lst : m_lstQueues){
            if(lst.size() < intSize){
                intSize = lst.size();
                intThreadNum = i;
            }
            i++;
        }

        this.m_lstQueues.get(intThreadNum).add(number);

        synchronized (this.m_lstLocks.get(intThreadNum)){
            this.m_lstLocks.get(intThreadNum).notify();
        }
    }

    public synchronized LinkedList<Long> getQueue(Integer intThreadNum) {
        return this.m_lstQueues.get(intThreadNum);
    }

    public synchronized Integer getSize(Integer intThreadNum) { return this.m_lstQueues.get(intThreadNum).size(); }

    public synchronized Boolean isEmpty(Integer intThreadNum) { return this.m_lstQueues.get(intThreadNum).isEmpty(); }

    public Long removeFromQueue(Integer intThreadNum) throws InterruptedException {
        if(isEmpty(intThreadNum)){
            synchronized (this.m_lstLocks.get(intThreadNum)){
                this.m_lstLocks.get(intThreadNum).wait();
            }
        }
        Long number = getQueue(intThreadNum).getFirst();
        this.m_lstQueues.get(intThreadNum).remove(number);
        return number;
    }
    
}