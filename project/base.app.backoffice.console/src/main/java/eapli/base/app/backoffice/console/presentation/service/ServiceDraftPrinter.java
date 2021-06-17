package eapli.base.app.backoffice.console.presentation.service;

import eapli.base.servicemanagement.domain.ServiceDraft;
import eapli.framework.visitor.Visitor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class ServiceDraftPrinter implements Visitor<ServiceDraft> {

    @Override
    public void visit(final ServiceDraft visitee) {
        System.out.printf("%-10s%-30s%-50s", visitee.identity(), visitee.getTitle(), visitee.getBriefDescription());
    }

}
