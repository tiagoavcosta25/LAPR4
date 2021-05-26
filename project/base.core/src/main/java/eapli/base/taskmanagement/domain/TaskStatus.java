/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.taskmanagement.domain;

public enum TaskStatus {
    PENDING, DOING, DONE;

    public static TaskStatus stringToTaskStatus(String strStatus) {
        if(strStatus.compareToIgnoreCase("PENDING") == 0){
            return PENDING;
        } else if(strStatus.compareToIgnoreCase("DOING") == 0){
            return DOING;
        }
        return DONE;
    }
}
