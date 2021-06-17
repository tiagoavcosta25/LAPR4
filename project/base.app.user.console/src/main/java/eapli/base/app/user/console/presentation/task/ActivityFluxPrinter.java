package eapli.base.app.user.console.presentation.task;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.taskmanagement.execution.domain.ManualTaskExecution;
import eapli.base.taskmanagement.execution.domain.TaskExecution;
import eapli.framework.visitor.Visitor;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ActivityFluxPrinter implements Visitor<ActivityFluxExecution> {
    @Override
    public void visit(ActivityFluxExecution visitee) {
        System.out.printf("Activity Flux - %s", titleChooser(visitee));
    }

    private String titleChooser(ActivityFluxExecution visitee) {
        for(TaskExecution te : visitee.flux()) {
            if(te.id().equals(visitee.currentProgress().currentProgress())) {
                ManualTaskExecution mte = (ManualTaskExecution) te;
                return mte.getM_oManualTask().description().toString();
            }
        }
        return visitee.id().toString();
    }
}
