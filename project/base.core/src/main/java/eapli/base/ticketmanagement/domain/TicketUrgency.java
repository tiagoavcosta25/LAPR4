package eapli.base.ticketmanagement.domain;

public enum TicketUrgency {
    LOW, MEDIUM, HIGH;

    public static TicketUrgency stringToTicketUrgency(String strPriority) {
        if(strPriority.compareToIgnoreCase("LOW") == 0){
            return LOW;
        } else if(strPriority.compareToIgnoreCase("MEDIUM") == 0){
            return MEDIUM;
        }
        return HIGH;
    }
}
