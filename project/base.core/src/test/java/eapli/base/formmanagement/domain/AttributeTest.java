package eapli.base.formmanagement.domain;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AttributeTest {

    @Test
    public void ensureCanBuildFormWithEverything() {
        new AttributeBuilder().withName("Name").withLabel("Label").withDescription("Description")
                .withRegex("[0-9]+").withDataType(DataType.STRING.toString()).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildFormWithoutName() {
        new AttributeBuilder().withLabel("Label").withDescription("Description")
                .withRegex("[0-9]+").withDataType(DataType.STRING.toString()).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildFormWithoutLabel() {
        new AttributeBuilder().withName("Name").withDescription("Description")
                .withRegex("[0-9]+").withDataType(DataType.STRING.toString()).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildFormWithoutDescription() {
        new AttributeBuilder().withName("Name").withLabel("Label")
                .withRegex("[0-9]+").withDataType(DataType.STRING.toString()).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildFormWithoutRegex() {
        new AttributeBuilder().withName("Name").withLabel("Label").withDescription("Description")
                .withDataType(DataType.STRING.toString()).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildFormWithoutDataType() {
        new AttributeBuilder().withName("Name").withLabel("Label").withDescription("Description")
                .withRegex("[0-9]+").build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildFormWithEmptyName() {
        new AttributeBuilder().withName("").withLabel("Label").withDescription("Description")
                .withRegex("[0-9]+").withDataType(DataType.STRING.toString()).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildFormWithEmptyLabel() {
        new AttributeBuilder().withName("Name").withLabel("").withDescription("Description")
                .withRegex("[0-9]+").withDataType(DataType.STRING.toString()).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildFormWithEmptyDescription() {
        new AttributeBuilder().withName("Name").withLabel("Label").withDescription("")
                .withRegex("[0-9]+").withDataType(DataType.STRING.toString()).build();
        assertTrue(true);
    }

    @Test()
    public void ensureCanBuildFormWithEmptyRegex() {
        new AttributeBuilder().withName("Name").withLabel("Label").withDescription("Description")
                .withRegex("").withDataType(DataType.STRING.toString()).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildFormWithNullName() {
        new AttributeBuilder().withName(null).withLabel("Label").withDescription("Description")
                .withRegex("[0-9]+").withDataType(DataType.STRING.toString()).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildFormWithNullLabel() {
        new AttributeBuilder().withName("Name").withLabel(null).withDescription("Description")
                .withRegex("[0-9]+").withDataType(DataType.STRING.toString()).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildFormWithNullDescription() {
        new AttributeBuilder().withName("Name").withLabel("Label").withDescription(null)
                .withRegex("[0-9]+").withDataType(DataType.STRING.toString()).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildFormWithNullRegex() {
        new AttributeBuilder().withName("Name").withLabel("Label").withDescription("Description")
                .withRegex(null).withDataType(DataType.STRING.toString()).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildFormWithInvalidName() {
        new AttributeBuilder().withName("***####").withLabel("Label").withDescription("Description")
                .withRegex("[0-9]+").withDataType(DataType.STRING.toString()).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildFormWithInvalidNameV2() {
        new AttributeBuilder().withName("Loooooooooooooooooooooooooooooooooooooong Nameeeeeeeeeeeeeeeeeeeeeeeeeeeeeee").withLabel("Label").withDescription("Description")
                .withRegex("[0-9]+").withDataType(DataType.STRING.toString()).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildFormWithInvalidLabel() {
        new AttributeBuilder().withName("Name").withLabel("***///////").withDescription("Description")
     .withRegex("[0-9]+").withDataType(DataType.STRING.toString()).build();
        assertTrue(true);
    }
}