/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.formulariomanagement.domain;

import javax.persistence.Embeddable;

@Embeddable
public enum FormType {
    SERVICE, MANUAL_TASK;

    public static FormType stringToFormType(String strType) {
        if(strType.compareToIgnoreCase("Servico") == 0){
            return SERVICE;
        }
        return MANUAL_TASK;
    }
}
