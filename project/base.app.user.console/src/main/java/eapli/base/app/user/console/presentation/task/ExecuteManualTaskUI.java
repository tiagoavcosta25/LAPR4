package eapli.base.app.user.console.presentation.task;


import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.activityfluxmanagement.specification.domain.ActivityFlux;
import eapli.base.formmanagement.domain.Attribute;
import eapli.base.grammar.ScriptAlgorithms;
import eapli.base.grammar.ScriptMode;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.taskmanagement.execution.application.ExecuteManualTaskController;
import eapli.base.taskmanagement.execution.domain.ManualTaskExecution;
import eapli.base.taskmanagement.specification.domain.ManualTask;
import eapli.base.ticketmanagement.domain.Response;
import eapli.base.ticketmanagement.domain.Ticket;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ExecuteManualTaskUI extends AbstractUI {

    private static final Logger LOGGER = LogManager.getLogger(ExecuteManualTaskUI.class);
    private final ExecuteManualTaskController theController = new ExecuteManualTaskController();

    @Override
    protected boolean doShow() {
        ActivityFluxExecution af;
        try {
            af = selectActivityFlux();
        } catch (Exception e) {
            LOGGER.error("No pending tasks to execute!");
            return false;
        }
        try {
            final ManualTaskExecution manualTask = selectManualTask(af);
            int id = Math.toIntExact(manualTask.identity());
            List<String> responses = new ArrayList<>();
            System.out.println("");
            Optional<Ticket> oT = theController.getTicketFromFlux(af.id());
            oT.ifPresent(ticket -> System.out.println(ticket.detailedView()));
            System.out.println("Complete the form");
            System.out.println();
            for(Attribute attr : manualTask.getM_oManualTask().form().attributes()) {
                responses.add(Console.readLine(attr.label().toString() + " >"));
                System.out.println();
            }
            Response rp = new Response(manualTask.getM_oManualTask().form(), responses);
            String strOp = Console.readLine("Confirm the execution of task with code " + id + "? (Y/N) ");
            if(!theController.verifyResponses(rp, ScriptMode.VISITOR))
                throw new Exception("Responses not valid");
            if(strOp.compareToIgnoreCase("Y") == 0){
                this.theController.executeTask(manualTask, rp, af);

                LOGGER.info("Operation Successful. The Following Manual Task was executed successfully > id:" +
                        " {}\n\n", id);
            } else{
                LOGGER.info("Operation Cancelled");
            }
        } catch (final Exception ex) {
            LOGGER.error("Error while executing a Manual Task.");
        }
        return false;
    }

    private ManualTaskExecution selectManualTask(ActivityFluxExecution af) {
        System.out.println();
        System.out.println("List of Pending Manual Tasks - Select a Manual Task");
        final Iterable<ManualTaskExecution> listTasks = theController.getUserPendingTasks(af);
        if(!listTasks.iterator().hasNext())
            throw new IllegalArgumentException("No Pending Tasks available!");
        final SelectWidget<ManualTaskExecution> selectorManualTask = new SelectWidget<>("Select a Manual Task",
                listTasks, new ManualTaskPrinter());
        selectorManualTask.show();
        return selectorManualTask.selectedElement();
    }

    private ActivityFluxExecution selectActivityFlux() {
        System.out.println();
        System.out.println("List of Activity Flux - Select an Activity Flux");
        final Iterable<ActivityFluxExecution> listActivityFlux = theController.getUserActivityFlux();
        if(!listActivityFlux.iterator().hasNext())
            throw new IllegalArgumentException("No Pending Tasks avaiable!");
        final SelectWidget<ActivityFluxExecution> selectorActivityFlux = new SelectWidget<>("Select an Activity Flow", listActivityFlux,
                new ActivityFluxPrinter());
        selectorActivityFlux.show();
        return selectorActivityFlux.selectedElement();
    }

    @Override
    public String headline() {
        return "Execute Manual Task";
    }
}
