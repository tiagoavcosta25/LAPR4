package eapli.base.app.backoffice.console.presentation.service;

import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.servicemanagement.domain.Service;
import eapli.framework.visitor.Visitor;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class ServicePrinter implements Visitor<Service> {

    @Override
    public void visit(final Service visitee) {
        System.out.printf("%-10s%-30s%-50s", visitee.identity(), visitee.title(), visitee.briefDescription());
    }

}
