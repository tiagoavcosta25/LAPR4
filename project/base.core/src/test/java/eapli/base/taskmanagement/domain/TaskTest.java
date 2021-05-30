package eapli.base.taskmanagement.domain;

import eapli.base.formmanagement.domain.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class TaskTest {

    @Test
    public void ensureCanBuildAutoTaskWithDescriptionAndPriorityAndScript() {
        final AutomaticTask subject = new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat"));
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildAutoTaskWithWrongScript() {
        final AutomaticTask subject = new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("Wrong Format"));
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildAutoTaskWithEmptyDescription() {
        final AutomaticTask subject = new AutomaticTask(TaskDescription.valueOf(""), TaskPriority.HIGH, AutomaticTaskScript.valueOf("Wrong Format"));
        assertTrue(subject != null);
    }

    @Test
    public void ensureCanBuildManualTaskWithEverything() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), AttributeScript.valueOf("D:/folder3/script3.bat"), DataType.STRING))));
        final ManualTask subject = new ManualTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, oForm);
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildManualTaskWithEmptyForm() {
        final Form oForm = null;
        final ManualTask subject = new ManualTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, oForm);
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildManualTaskWithEmptyDescription() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), AttributeScript.valueOf("D:/folder3/script3.bat"), DataType.STRING))));
        final ManualTask subject = new ManualTask(TaskDescription.valueOf(""), TaskPriority.LOW, oForm);
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildManualTaskWithNullPriority() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), AttributeScript.valueOf("D:/folder3/script3.bat"), DataType.STRING))));
        final ManualTask subject = new ManualTask(TaskDescription.valueOf("Task Description"), null, oForm);
        assertTrue(subject != null);
    }

}