package eapli.base.activityfluxmanagement.domain;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.activityfluxmanagement.specification.domain.ActivityFlux;
import eapli.base.formmanagement.domain.*;
import eapli.base.taskmanagement.execution.domain.AutomaticTaskExecution;
import eapli.base.taskmanagement.execution.domain.ManualTaskExecution;
import eapli.base.taskmanagement.specification.domain.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class ActivityFluxExecTest {

    @Test
    public void ensureCanBuildActivityFluxExecWithApprovalAndManualTask() {
        final Form oApprovalForm = new Form(FormName.valueOf("Approval Form"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat")
                , new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Approval"),
                AttributeLabel.valueOf("Approval"), AttributeDescription.valueOf("Approval|Rejected"),
                AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final ManualTask oApprovalTask = new ManualTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, oApprovalForm);
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"), new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final ManualTask oManualTask = new ManualTask(TaskDescription.valueOf("Task Description"), TaskPriority.LOW, oForm);

        final ManualTaskExecution oApprovalExec = new ManualTaskExecution(oManualTask);
        final ManualTaskExecution oResExec = new ManualTaskExecution(oApprovalTask);

        final ActivityFluxExecution subject = new ActivityFluxExecution(new ArrayList<>(Arrays.asList(oApprovalExec, oResExec)));
        assertTrue(subject != null);
    }

    @Test
    public void ensureCanBuildActivityFluxExecWithOnlyManualTask() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"), new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final ManualTask oManualTask = new ManualTask(TaskDescription.valueOf("Task Description"), TaskPriority.LOW, oForm);

        final ManualTaskExecution oTaskExec = new ManualTaskExecution(oManualTask);

        final ActivityFluxExecution subject = new ActivityFluxExecution(new ArrayList<>(Arrays.asList(oTaskExec)));
        assertTrue(subject != null);
    }

    @Test
    public void ensureCanBuildActivityFluxWithApprovalAndAutoTask() {
        final Form oApprovalForm = new Form(FormName.valueOf("Approval Form"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"),
                new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Approval"),
                AttributeLabel.valueOf("Approval"), AttributeDescription.valueOf("Approval|Rejected"),
                        AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final ManualTask oApprovalTask = new ManualTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, oApprovalForm);
        final AutomaticTask oAutoTask = new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat"));

        final ManualTaskExecution oApprovalExec = new ManualTaskExecution(oApprovalTask);
        final AutomaticTaskExecution oAutoExec = new AutomaticTaskExecution(oAutoTask);

        final ActivityFluxExecution subject = new ActivityFluxExecution(new ArrayList<>(Arrays.asList(oApprovalExec, oAutoExec)));
        assertTrue(subject != null);
    }

    @Test
    public void ensureCanBuildActivityFluxWithOnlyAutoTask() {
        final AutomaticTask oAutoTask = new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH,
                AutomaticTaskScript.valueOf("D:/folder3/script3.bat"));

        final AutomaticTaskExecution oAutoExec = new AutomaticTaskExecution(oAutoTask);

        final ActivityFluxExecution subject = new ActivityFluxExecution(new ArrayList<>(Arrays.asList(oAutoExec)));
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildActivityFluxExecWithoutTasks() {
        final ActivityFluxExecution subject = new ActivityFluxExecution(new ArrayList<>());
        assertTrue(subject != null);
    }

}