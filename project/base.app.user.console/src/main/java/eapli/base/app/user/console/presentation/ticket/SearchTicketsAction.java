package eapli.base.app.user.console.presentation.ticket;

import eapli.framework.actions.Action;

/**
 * @author Jéssica Alves 1190682@isep.ipp.pt
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class SearchTicketsAction implements Action {
    @Override
    public boolean execute() {
        return new SearchTicketsUI().show();
    }
}
