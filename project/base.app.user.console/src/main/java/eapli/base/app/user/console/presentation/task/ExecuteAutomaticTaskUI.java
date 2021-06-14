package eapli.base.app.user.console.presentation.task;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.activityfluxmanagement.specification.domain.ActivityFlux;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.taskmanagement.execution.application.ExecuteAutomaticTaskController;
import eapli.base.taskmanagement.execution.domain.AutomaticTaskExecution;
import eapli.base.taskmanagement.specification.domain.AutomaticTask;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ExecuteAutomaticTaskUI extends AbstractUI {
    private final ExecuteAutomaticTaskController theController = new ExecuteAutomaticTaskController();

}
