package eapli.base.app.backoffice.console.presentation.team;

import eapli.base.teammanagement.application.ListTeamController;
import eapli.base.teammanagement.domain.Team;
import eapli.framework.presentation.console.AbstractListUI;
import eapli.framework.visitor.Visitor;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@SuppressWarnings({ "squid:S106" })
public class ListTeamsUI extends AbstractListUI<Team> {
    private final ListTeamController theController = new ListTeamController();

    @Override
    public String headline() {
        return "List Teams";
    }

    @Override
    protected String emptyMessage() {
        return "No data.";
    }

    @Override
    protected Iterable<Team> elements() {
        return theController.allTeams();
    }

    @Override
    protected Visitor<Team> elementPrinter() {
        return new TeamPrinter();
    }

    @Override
    protected String elementName() {
        return "Team";
    }

    @Override
    protected String listHeader() {
        return String.format("#  %-20s%-20s%-30s%-15s", "ACRONYM", "TEAM TYPE", "TEAM DESCRIPTION", "REPRESENTATION");
    }
}