package eapli.base.app.backoffice.console.presentation.service;

import eapli.base.servicemanagement.domain.ServiceDraft;
import eapli.framework.visitor.Visitor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class ServiceDraftPrinter implements Visitor<ServiceDraft> {

    private static final Logger LOGGER = LogManager.getLogger(ServiceDraftPrinter.class);

    @Override
    public void visit(final ServiceDraft visitee) {
        LOGGER.info("%-10s%-30s%-50s", visitee.identity(), visitee.getTitle(), visitee.getBriefDescription());
    }

}
