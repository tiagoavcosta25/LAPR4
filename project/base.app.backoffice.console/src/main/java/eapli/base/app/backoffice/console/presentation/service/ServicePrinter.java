package eapli.base.app.backoffice.console.presentation.service;

import eapli.base.servicemanagement.domain.Service;
import eapli.framework.visitor.Visitor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class ServicePrinter implements Visitor<Service> {

    private static final Logger LOGGER = LogManager.getLogger(ServicePrinter.class);

    @Override
    public void visit(final Service visitee) {
        System.out.printf("%-10s%-30s%-50s", visitee.identity(), visitee.title(), visitee.briefDescription());
    }

}
