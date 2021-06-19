package eapli.base.activityfluxmanagement.domain;

import eapli.base.activityfluxmanagement.specification.domain.ActivityFlux;
import eapli.base.formmanagement.domain.*;
import eapli.base.taskmanagement.specification.domain.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class ActivityFluxTest {

    @Test
    public void ensureCanBuildActivityFluxWithApprovalAndManualTask() {
        final Form oApprovalForm = new Form(FormName.valueOf("Approval Form"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat")
                , new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Approval"),
                AttributeLabel.valueOf("Approval"), AttributeDescription.valueOf("Approval|Rejected"),
                AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final ManualTask oApprovalTask = new ManualTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, oApprovalForm);
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"), new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final ManualTask oManualTask = new ManualTask(TaskDescription.valueOf("Task Description"), TaskPriority.LOW, oForm);
        final ActivityFlux subject = new ActivityFlux(new ArrayList<>(Arrays.asList(oApprovalTask, oManualTask)));
        assertTrue(subject != null);
    }

    @Test
    public void ensureCanBuildActivityFluxWithOnlyManualTask() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"), new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final ManualTask oManualTask = new ManualTask(TaskDescription.valueOf("Task Description"), TaskPriority.LOW, oForm);
        final ActivityFlux subject = new ActivityFlux(new ArrayList<>(Arrays.asList(oManualTask)));
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
        final ActivityFlux subject = new ActivityFlux(new ArrayList<>(Arrays.asList(oApprovalTask, oAutoTask)));
        assertTrue(subject != null);
    }

    @Test
    public void ensureCanBuildActivityFluxWithOnlyAutoTask() {
        final AutomaticTask oAutoTask = new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat"));
        final ActivityFlux subject = new ActivityFlux(new ArrayList<>(Arrays.asList(oAutoTask)));
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildActivityFluxWithoutTasks() {
        final ActivityFlux subject = new ActivityFlux(new ArrayList<>());
        assertTrue(subject != null);
    }

}