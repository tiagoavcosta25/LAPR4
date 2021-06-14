/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.ticketmanagement.domain;

/**
 * @author Jéssica Alves 1190682@isep.ipp.pt
 * @author Pedro Santos 1190967@isep.ipp.pt
 */

public enum TicketStatus {
    OPEN, CLOSED;

    public static TicketStatus stringToTicketStatus(String strStatus) {
        if(strStatus.compareToIgnoreCase("OPEN") == 0){
            return OPEN;
        }
        return CLOSED;
    }
}
