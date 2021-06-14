/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.taskmanagement.execution.domain;

/**
 * @author Jéssica Alves 1190682@isep.ipp.pt
 * @author Pedro Santos 1190967@isep.ipp.pt
 */

public enum TaskExecutionStatus {
    PENDING, DOING, DONE;

    public static TaskExecutionStatus stringToTaskStatus(String strStatus) {
        if(strStatus.compareToIgnoreCase("PENDING") == 0){
            return PENDING;
        } else if(strStatus.compareToIgnoreCase("DOING") == 0){
            return DOING;
        }
        return DONE;
    }
}
