package eapli.base.app.backoffice.console.presentation.team;

import eapli.base.teammanagement.domain.TeamType;
import eapli.framework.visitor.Visitor;


/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class TeamTypePrinter implements Visitor<TeamType> {

    @Override
    public void visit(final TeamType visitee) {
        System.out.printf("%s", visitee);
    }
}
