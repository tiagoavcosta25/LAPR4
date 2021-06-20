package base.server.fluxmotor;

import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class FCFSQueue implements GenericQueue{

    private final LinkedList<Long> queue;
    private final ReentrantLock lock;

    public FCFSQueue() {
        this.queue = new LinkedList<>();
        this.lock = new ReentrantLock(true); //FCFS
    }

    public void addToQueue(long number) {
        this.queue.add(number);
        synchronized (this.lock){
            this.lock.notify();
        }
    }

    public long peekQueue() {
        lock.lock();
        try{
            return this.queue.getFirst();
        } finally {
            lock.unlock();
        }
    }

    public long removeFromQueue() throws InterruptedException {
        if(isEmpty()) {
            synchronized (this.lock){
                this.lock.wait();
            }
        }
        lock.lock();
        try {
            return this.queue.removeFirst();
        } finally {
            lock.unlock();
        }
    }

    private boolean isEmpty() {
        return this.queue.isEmpty();
    }
}
