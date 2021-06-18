package base.server.autotaskexecutor.fcfs;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 *
 */

public class ScriptHandlerFCFS extends Thread {

    private ScriptQueueFCFS m_oQueue;
    private Integer m_intThreadNumber;

    public ScriptHandlerFCFS(ScriptQueueFCFS oQueue, Integer intThreadNumber) {
        this.m_oQueue = oQueue;
        this.m_intThreadNumber = intThreadNumber;
    }

    public void run(){
        while(true){
            while (this.m_oQueue.getSize() < 1){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.printf("Thread %d: %s\n", this.m_intThreadNumber, this.m_oQueue.firstComeFirstServed().toString());
        }
    }
}
