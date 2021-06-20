package eapli.base.formmanagement.domain;


import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class FormTest  {
    @Test
    public void ensureCanBuildFormWithEverything() {
        new FormBuilder().withName("Form Name").withScript("D:/folder3/script3.bat").withType(FormType.MANUALTASK.toString())
                .withAttributeList(new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"),
                        AttributeRegex.valueOf("[0-9]+"),
                        DataType.STRING)))).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildFormWithoutName() {
        new FormBuilder().withName("").withScript("D:/folder3/script3.bat").withType(FormType.MANUALTASK.toString())
                .withAttributeList(new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                        AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"),
                        AttributeRegex.valueOf("[0-9]+"),
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
        new FormBuilder().withName(null).withScript("D:/folder3/script3.bat").withType(FormType.MANUALTASK.toString())
                .withAttributeList(new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                        AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"),
                        AttributeRegex.valueOf("[0-9]+"),
                        DataType.STRING)))).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildFormWithNullAttributes() {
        new FormBuilder().withName("Name").withScript("D:/folder3/script3.bat").withType(FormType.MANUALTASK.toString())
                .withAttributeList(null).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildFormWithInvalidName() {
        new FormBuilder().withName("/*#").withScript("D:/folder3/script3.bat").withType(FormType.MANUALTASK.toString())
                .withAttributeList(new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                        AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"),
                        AttributeRegex.valueOf("[0-9]+"),
                        DataType.STRING)))).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildFormWithInvalidNameV2() {
        new FormBuilder().withName("Long Form Name, Actually Too Long Form Name").withScript("D:/folder3/script3.bat").withType(FormType.MANUALTASK.toString())
                .withAttributeList(new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                        AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"),
                        AttributeRegex.valueOf("[0-9]+"),
                        DataType.STRING)))).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildFormWithoutName() {
        new FormBuilder().withScript("D:/folder3/script3.bat").withType(FormType.MANUALTASK.toString())
                .withAttributeList(new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                        AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"),
                        AttributeRegex.valueOf("[0-9]+"),
                        DataType.STRING)))).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildFormWithoutType() {
        new FormBuilder().withName("Form Name").withScript("D:/folder3/script3.bat")
                .withAttributeList(new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                        AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"),
                        AttributeRegex.valueOf("[0-9]+"),
                        DataType.STRING)))).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildFormWithoutAttributes() {
        new FormBuilder().withName("Form Name").withScript("D:/folder3/script3.bat").withType(FormType.MANUALTASK.toString()).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildFormWithWrongNameChars() {
        new FormBuilder().withName("/*$").withScript("D:/folder3/script3.bat").withType(FormType.MANUALTASK.toString())
                .withAttributeList(new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                        AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"),
                        AttributeRegex.valueOf("[0-9]+"),
                        DataType.STRING)))).build();
        assertTrue(true);
    }
}