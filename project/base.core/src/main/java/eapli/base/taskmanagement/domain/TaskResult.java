/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.taskmanagement.domain;

public enum TaskResult {
    APPROVED, DENIED, SUCCESS, ERROR;

    public static TaskResult stringToTaskResult(String strResult) {
        if(strResult.compareToIgnoreCase("APPROVED") == 0){
            return APPROVED;
        } else if(strResult.compareToIgnoreCase("DENIED") == 0){
            return DENIED;
        } else if(strResult.compareToIgnoreCase("SUCCESS") == 0){
            return SUCCESS;
        }
        return ERROR;
    }
}
