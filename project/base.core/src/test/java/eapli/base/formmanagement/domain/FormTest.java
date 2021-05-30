package eapli.base.formmanagement.domain;


import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class FormTest  {
    @Test
    public void ensureCanBuildFormWithEverything() {
        new FormBuilder().withName("Form Name").withType(FormType.MANUALTASK.toString())
                .withAttributeList(new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"),
                        AttributeRegex.valueOf("[0-9]+"), AttributeScript.valueOf("D:/folder3/script3.bat"),
                        DataType.STRING)))).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildFormWithoutName() {
        new FormBuilder().withName("").withType(FormType.MANUALTASK.toString())
                .withAttributeList(new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                        AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"),
                        AttributeRegex.valueOf("[0-9]+"), AttributeScript.valueOf("D:/folder3/script3.bat"),
                        DataType.STRING)))).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildFormWithoutAttributes() {
        new FormBuilder().withName("Form Name").withType(FormType.MANUALTASK.toString())
                .withAttributeList(new ArrayList<>(Arrays.asList())).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildFormWithNullName() {
        new FormBuilder().withName(null).withType(FormType.MANUALTASK.toString())
                .withAttributeList(new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                        AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"),
                        AttributeRegex.valueOf("[0-9]+"), AttributeScript.valueOf("D:/folder3/script3.bat"),
                        DataType.STRING)))).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildFormWithNullAttributes() {
        new FormBuilder().withName("Name").withType(FormType.MANUALTASK.toString())
                .withAttributeList(null).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildFormWithInvalidName() {
        new FormBuilder().withName("/*#").withType(FormType.MANUALTASK.toString())
                .withAttributeList(new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                        AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"),
                        AttributeRegex.valueOf("[0-9]+"), AttributeScript.valueOf("D:/folder3/script3.bat"),
                        DataType.STRING)))).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildFormWithInvalidNameV2() {
        new FormBuilder().withName("Long Form Name, Actually Too Long Form Name").withType(FormType.MANUALTASK.toString())
                .withAttributeList(new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                        AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"),
                        AttributeRegex.valueOf("[0-9]+"), AttributeScript.valueOf("D:/folder3/script3.bat"),
                        DataType.STRING)))).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildFormWithoutName() {
        new FormBuilder().withType(FormType.MANUALTASK.toString())
                .withAttributeList(new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                        AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"),
                        AttributeRegex.valueOf("[0-9]+"), AttributeScript.valueOf("D:/folder3/script3.bat"),
                        DataType.STRING)))).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildFormWithoutType() {
        new FormBuilder().withName("Form Name")
                .withAttributeList(new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                        AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"),
                        AttributeRegex.valueOf("[0-9]+"), AttributeScript.valueOf("D:/folder3/script3.bat"),
                        DataType.STRING)))).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildFormWithoutAttributes() {
        new FormBuilder().withName("Form Name").withType(FormType.MANUALTASK.toString()).build();
        assertTrue(true);
    }
}