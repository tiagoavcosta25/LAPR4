/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.net.dashboard;

public enum SDP2021Code {
    SERVICE, MANUALTASK;

    public static SDP2021Code stringToFormType(String strType) {
        if(strType.compareToIgnoreCase("Service") == 0){
            return SERVICE;
        }
        return MANUALTASK;
    }
}
