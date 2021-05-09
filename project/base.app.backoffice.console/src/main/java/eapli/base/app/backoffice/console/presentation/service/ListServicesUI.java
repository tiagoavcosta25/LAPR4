package eapli.base.app.backoffice.console.presentation.service;

import eapli.base.app.backoffice.console.presentation.collaborator.CollaboratorPrinter;
import eapli.base.collaboratormanagement.application.ListCollaboratorsController;
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.servicemanagement.application.ListServicesController;
import eapli.base.servicemanagement.domain.Service;
import eapli.framework.presentation.console.AbstractListUI;
import eapli.framework.visitor.Visitor;

/**
 * Pedro Santos 1190967@isep.ipp.pt
 */
public class ListServicesUI extends AbstractListUI<Service> {
    private final ListServicesController theController = new ListServicesController();

    @Override
    public String headline() {
        return "List Services";
    }

    @Override
    protected String emptyMessage() {
        return "No data.";
    }

    @Override
    protected Iterable<Service> elements() {
        return theController.getServices();
    }

    @Override
    protected Visitor<Service> elementPrinter() {
        return new ServicePrinter();
    }

    @Override
    protected String elementName() {
        return "Service";
    }

    @Override
    protected String listHeader() {
        return String.format("#  %-10s%-30s%-50s", "ID" , "TITLE", "BRIEF DESCRIPTION");
    }
}
