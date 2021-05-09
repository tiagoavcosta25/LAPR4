package eapli.base.app.backoffice.console.presentation.catalogue;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.teammanagement.domain.Team;
import eapli.framework.visitor.Visitor;

import java.util.Set;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class CataloguePrinter implements Visitor<Catalogue> {

    @Override
    public void visit(final Catalogue visitee) {
        System.out.printf("%-60s%-50s%-90s", visitee.catalogueTitle(), visitee.catalogueBriefDescription(),
                visitee.catalogueCompleteDescription());
        printAccess(visitee.access());
    }

    public void printAccess(Set<Team> access) {
        for (Team team : access) {
            System.out.printf("%-15s", team.identity());
        }
    }
}
