package eapli.base.app.user.console.presentation.task;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.servicemanagement.domain.Service;
import eapli.framework.visitor.Visitor;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ActivityFluxPrinter implements Visitor<ActivityFluxExecution> {
    @Override
    public void visit(ActivityFluxExecution visitee) {
        System.out.printf("Activity Flux %s", visitee.toString());
    }
}
