package eapli.base.app.backoffice.console.presentation.collaborator;

import eapli.base.collaboratormanagement.application.ListCollaboratorsController;
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.framework.presentation.console.AbstractListUI;
import eapli.framework.visitor.Visitor;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ListCollaboratorsUI extends AbstractListUI<Collaborator> {
    private final ListCollaboratorsController theController = new ListCollaboratorsController();

    @Override
    public String headline() {
        return "List Collaborators";
    }

    @Override
    protected String emptyMessage() {
        return "No data.";
    }

    @Override
    protected Iterable<Collaborator> elements() {
        return theController.getCollaborators();
    }

    @Override
    protected Visitor<Collaborator> elementPrinter() {
        return new CollaboratorPrinter();
    }

    @Override
    protected String elementName() {
        return "Collaborator";
    }

    @Override
    protected String listHeader() {
        return String.format("#  %-20s%-20s", "ID" , "FULL NAME");
    }
}
