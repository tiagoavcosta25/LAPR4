package eapli.base.formmanagement.domain;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormTest extends TestCase {

    public final Attribute a = getDummyAttribute("Lorem", "Ipsum", "Lorem", "Ipsum", "D:/folder/script.bin", "Integer");
    public final Form f = getDummyForm("Lorem", "MANUAL_TASK", Arrays.asList(a));

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

    public static Form getDummyForm(final String oName, final String oFormType, final List<Attribute> lstAttributes) {
        FormBuilder formBuilder = new FormBuilder();
        formBuilder = formBuilder.withName(oName);
        formBuilder = formBuilder.withType(oFormType);
        formBuilder = formBuilder.withAttributeList(lstAttributes);
        return formBuilder.build();
    }

    public void testName() {
        FormName real = f.name();
        String expected = "Lorem";
        assertEquals(real.toString(), expected);
    }

    public void testAttributes() {
        List<Attribute> real = f.attributes();
        List<Attribute> expected = new ArrayList<>(Arrays.asList(a));
        assertEquals(real, expected);
    }

    public void testType() {
        FormType real = f.type();
        String expected = "MANUAL_TASK";
        assertEquals(real.toString(), expected);
    }

    public void testTestEquals() {
        boolean real = f.equals(f);
        assertTrue(real);
    }

    public void testTestHashCode() {
        int real = f.hashCode();
        int expected = f.hashCode();
        assertEquals(real, expected);
    }

    public void testSameAs() {
        boolean real = f.sameAs(f);
        assertTrue(real);
    }

    public void testId() {
        FormID real = f.id();
        assertNull(real);
    }

    public void testIdentity() {
        FormID real = f.identity();
        assertNull(real);
    }
}