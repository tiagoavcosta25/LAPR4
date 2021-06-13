/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.taskmanagement.specification.domain;

public enum TaskPriority {
    LOW, MEDIUM, HIGH;

    public static TaskPriority stringToTaskPriority(String strPriority) {
        if(strPriority.compareToIgnoreCase("LOW") == 0){
            return LOW;
        } else if(strPriority.compareToIgnoreCase("MEDIUM") == 0){
            return MEDIUM;
        }
        return HIGH;
    }
}
