/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package base.server.autotaskexecutor;

/**
 * @author Jéssica Alves 1190682@isep.ipp.pt
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public enum AlgorithmMode {
    /**
     * Modes.
     */
    FCFS(0),
    SCHEDULER(1);

    /**
     * Mode.
     */
    private int m_intMode;

    /**
     * An empty constructor of ScriptMode.
     * @param intMode Mode.
     */
    AlgorithmMode(int intMode) {
        this.m_intMode = intMode;
    }

    public int getMode() {
        return m_intMode;
    }

    public boolean equals(AlgorithmMode oMode){
        return this.getMode() == oMode.getMode();
    }

    public static AlgorithmMode getMode(Integer intMode) {
        if(intMode == AlgorithmMode.FCFS.getMode()){
            return AlgorithmMode.FCFS;
        } else if(intMode == AlgorithmMode.SCHEDULER.getMode()){
            return AlgorithmMode.SCHEDULER;
        }
        return null;
    }
}
