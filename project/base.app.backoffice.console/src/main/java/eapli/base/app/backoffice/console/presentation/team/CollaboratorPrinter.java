package eapli.base.app.backoffice.console.presentation.team;

import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.framework.visitor.Visitor;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class CollaboratorPrinter implements Visitor<Collaborator> {

    @Override
    public void visit(final Collaborator visitee) {
        System.out.printf("%-30s%-4s", visitee.identity(), visitee.completeName());
    }
}
