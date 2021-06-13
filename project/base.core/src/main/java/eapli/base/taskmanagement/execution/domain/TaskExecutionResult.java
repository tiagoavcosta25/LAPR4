/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.taskmanagement.execution.domain;

public enum TaskExecutionResult {
    NO_RESULT, APPROVED, DENIED, SUCCESS, ERROR;

    public static TaskExecutionResult stringToTaskResult(String strResult) {
        if(strResult.compareToIgnoreCase("APPROVED") == 0){
            return APPROVED;
        } else if(strResult.compareToIgnoreCase("DENIED") == 0){
            return DENIED;
        } else if(strResult.compareToIgnoreCase("SUCCESS") == 0){
            return SUCCESS;
        } else if(strResult.compareToIgnoreCase("ERROR") == 0){
            return ERROR;
        }
        return NO_RESULT;
    }
}
