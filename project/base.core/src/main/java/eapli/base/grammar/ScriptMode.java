/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.grammar;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public enum ScriptMode {
    /**
     * Modes.
     */
    LISTENER(0),
    VISITOR(1);

    /**
     * Mode.
     */
    private int m_intMode;

    /**
     * An empty constructor of ScriptMode.
     * @param intMode Mode.
     */
    ScriptMode(int intMode) {
        this.m_intMode = intMode;
    }

    public int getMode() {
        return m_intMode;
    }

    public boolean equals(ScriptMode oMode){
        return this.getMode() == oMode.getMode();
    }

    public static ScriptMode get(int intCode){
        if(intCode == 0){
            return ScriptMode.LISTENER;
        }
        return ScriptMode.VISITOR;
    }
}
