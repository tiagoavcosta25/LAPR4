package eapli.base.app.backoffice.console.presentation.service;

import eapli.base.servicemanagement.application.ListServiceDraftsController;
import eapli.base.servicemanagement.domain.ServiceDraft;
import eapli.framework.presentation.console.AbstractListUI;
import eapli.framework.visitor.Visitor;

/**
 * Pedro Santos 1190967@isep.ipp.pt
 */
public class ListServicesDraftUI extends AbstractListUI<ServiceDraft> {
    private final ListServiceDraftsController theController = new ListServiceDraftsController();

    @Override
    public String headline() {
        return "List Service Drafts";
    }

    @Override
    protected String emptyMessage() {
        return "No data.";
    }

    @Override
    protected Iterable<ServiceDraft> elements() {
        return theController.getDrafts();
    }

    @Override
    protected Visitor<ServiceDraft> elementPrinter() {
        return new ServiceDraftPrinter();
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
