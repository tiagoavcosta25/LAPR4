package base.server.autotaskexecutor.scheduler;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 *
 */

public class ScriptHandlerScheduler extends Thread {

    private ScriptQueueScheduler m_oQueue;
    private Integer m_intThreadNumber;

    public ScriptHandlerScheduler(ScriptQueueScheduler oQueue, Integer intThreadNumber) {
        this.m_oQueue = oQueue;
        this.m_intThreadNumber = intThreadNumber;
    }

    public void run(){
        while(true){
            while (this.m_oQueue.getSize(this.m_intThreadNumber) < 1){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.printf("Thread %d: %s\n", this.m_intThreadNumber, this.m_oQueue.getScriptForExecution(this.m_intThreadNumber).toString());

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
