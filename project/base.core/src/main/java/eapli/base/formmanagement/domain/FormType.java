/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.formmanagement.domain;

public enum FormType {
    SERVICE, MANUALTASK;

    public static FormType stringToFormType(String strType) {
        if(strType.compareToIgnoreCase("Service") == 0){
            return SERVICE;
        }
        return MANUALTASK;
    }
}
