package eapli.base.app.backoffice.console.presentation.catalogue;

import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.framework.visitor.Visitor;


public class CollaboratorPrinter implements Visitor<Collaborator> {

    @Override
    public void visit(final Collaborator visitee) {
        System.out.printf("%-30s%-4s", visitee.identity(), visitee.completeName());
    }
}
