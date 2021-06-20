package eapli.base.taskmanagement.domain;

import eapli.base.formmanagement.domain.*;
import eapli.base.taskmanagement.execution.domain.AutomaticTaskExecution;
import eapli.base.taskmanagement.execution.domain.ManualTaskExecution;
import eapli.base.taskmanagement.specification.domain.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class TaskExecutionTest {

    @Test
    public void ensureCanBuildAutoTaskExecWithAutoTask() {
        final AutomaticTask oAutoTask = new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat"));
        final AutomaticTaskExecution subject = new AutomaticTaskExecution(oAutoTask);
        assertTrue(subject != null);
    }

    @Test
    public void ensureCanBuildManualTaskExecWithEverything() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"),
                new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                        AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final ManualTask oManual = new ManualTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, oForm);
        final ManualTaskExecution subject = new ManualTaskExecution(oManual);
        assertTrue(subject != null);
    }

}