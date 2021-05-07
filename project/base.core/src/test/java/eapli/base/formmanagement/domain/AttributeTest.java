package eapli.base.formmanagement.domain;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AttributeTest extends TestCase {

    public final Attribute a = getDummyAttribute("Lorem", "Ipsum", "Lorem", "Ipsum", "D:\\folder\\script.bin", "Integer");

    public static Attribute getDummyAttribute(final String strName, final String strLabel, final String strDescription,
                                           final String strRegex, final String strScript, final String strDataType) {
        AttributeBuilder attributeBuilder = new AttributeBuilder();
        attributeBuilder = attributeBuilder.withName(strName);
        attributeBuilder = attributeBuilder.withLabel(strLabel);
        attributeBuilder = attributeBuilder.withDescription(strDescription);
        attributeBuilder = attributeBuilder.withRegex(strRegex);
        attributeBuilder = attributeBuilder.withScript(strScript);
        attributeBuilder = attributeBuilder.withDataType(strDataType);
        return attributeBuilder.build();
    }

    @Test
    public void testName() {
        AttributeName real = a.name();
        String expected = "Lorem";
        assertEquals(real.toString(), expected);
    }

    @Test
    public void testLabel() {
        AttributeLabel real = a.label();
        String expected = "Ipsum";
        assertEquals(real.toString(), expected);
    }

    @Test
    public void testDescription() {
        AttributeDescription real = a.description();
        String expected = "Lorem";
        assertEquals(real.toString(), expected);
    }

    @Test
    public void testRegex() {
        AttributeRegex real = a.regex();
        String expected = "Ipsum";
        assertEquals(real.toString(), expected);
    }

    @Test
    public void testScript() {
        AttributeScript real = a.script();
        String expected = "Lorem";
        assertEquals(real.toString(), expected);
    }

    @Test
    public void testDataType() {
        DataType real = a.dataType();
        String expected = "Ipsum";
        assertEquals(real.toString(), expected);
    }

    @Test
    public void testTestEquals() {
        boolean real = a.equals(a);
        assertTrue(real);
    }

    @Test
    public void testTestHashCode() {
        int real = a.hashCode();
        int expected = a.hashCode();
        assertEquals(real, expected);
    }

    @Test
    public void testSameAs() {
        boolean real = a.sameAs(a);
        assertTrue(real);
    }

    @Test
    public void testId() {
        AttributeID real = a.id();
        assertNull(real);
    }

    @Test
    public void testIdentity() {
        AttributeID real = a.identity();
        assertNull(real);
    }
}