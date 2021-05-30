package eapli.base.app.user.console.presentation.task;

import eapli.base.servicemanagement.domain.Service;
import eapli.framework.visitor.Visitor;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ActivityFluxPrinter implements Visitor<Service> {
    @Override
    public void visit(Service visitee) {
        System.out.println("Activity Flux " +  visitee.briefDescription().toString());
    }
}
