package eapli.base.app.backoffice.console.presentation.team;

import eapli.base.teammanagement.application.ListTeamTypeController;
import eapli.base.teammanagement.domain.TeamType;
import eapli.framework.presentation.console.AbstractListUI;
import eapli.framework.visitor.Visitor;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ListTeamTypeUI extends AbstractListUI<TeamType> {

    private final ListTeamTypeController theController = new ListTeamTypeController();

    @Override
    protected Iterable<TeamType> elements() {
        return this.theController.getTeamTypes();
    }

    @Override
    protected Visitor<TeamType> elementPrinter() {
        return new TeamTypePrinter();
    }

    @Override
    protected String elementName() {
        return "Team Type";
    }

    @Override
    protected String listHeader() {
        return "TEAM TYPES";
    }

    @Override
    protected String emptyMessage() {
        return "No data.";
    }

    @Override
    public String headline() {
        return "List team types";
    }
}
