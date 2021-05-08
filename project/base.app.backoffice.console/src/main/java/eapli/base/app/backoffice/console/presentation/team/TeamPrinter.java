package eapli.base.app.backoffice.console.presentation.team;

import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.teammanagement.domain.Team;
import eapli.framework.visitor.Visitor;

import java.util.Set;


/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@SuppressWarnings("squid:S106")
public class TeamPrinter implements Visitor<Team> {

    @Override
    public void visit(final Team visitee) {
        System.out.printf("%-20s%-20s%-20s%-30s", visitee.id(), visitee.acronym(), visitee.teamType(),
                visitee.teamDescription());
        printRepresentation(visitee.representation());
    }

    public void printRepresentation(Set<Collaborator> representation) {
        for (Collaborator collaborator : representation) {
            System.out.printf("%-15s", collaborator.identity());
        }
    }


}
