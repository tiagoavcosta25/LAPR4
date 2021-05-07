package eapli.base.servicemanagement.domain;

import eapli.base.formmanagement.domain.*;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServiceDraftTest extends TestCase {

    public final List<String> lstKeywords = new ArrayList<>(Arrays.asList("Ipsum"));

    public final Attribute a = getDummyAttribute("Lorem", "Ipsum", "Lorem", "Ipsum", "D:/folder/script.bin", "Integer");
    public final Form f = getDummyForm("Lorem", "MANUAL_TASK", Arrays.asList(a));
    public List<Form> lstForms = new ArrayList<>(Arrays.asList(f));
    public final ServiceDraft s = new ServiceDraft("Lorem", "Ipsum", "Lorem",
            1d, lstKeywords, lstForms);

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

    public void testGetID() {
        s.setID(1l);
        Long real = s.getID();
        Long expected = 1l;
        assertEquals(real, expected);
    }

    public void testGetTitle() {
        String real = s.getTitle();
        String expected = "Lorem";
        assertEquals(real, expected);
    }

    public void testGetBriefDescription() {
        String real = s.getBriefDescription();
        String expected = "Ipsum";
        assertEquals(real, expected);
    }

    public void testGetCompleteDescription() {
        String real = s.getCompleteDescription();
        String expected = "Lorem";
        assertEquals(real, expected);
    }

    public void testGetFeedback() {
        Double real = s.getFeedback();
        Double expected = 1d;
        assertEquals(real, expected);
    }

    public void testGetKeywordList() {
        List<String> real = s.getKeywordList();
        List<String> expected = lstKeywords;
        assertEquals(real, expected);
    }

    public void testGetFormList() {
        Form real = s.getFormList().get(0);
        Form expected = f;
        assertEquals(real, expected);
    }

    public void testSetID() {
        s.setID(1l);
        Long real = s.getID();
        Long expected = 1l;
        assertEquals(real, expected);
    }

    public void testSetTitle() {
        s.setTitle("Lorem");
        String real = s.getTitle();
        String expected = "Lorem";
        assertEquals(real, expected);
    }

    public void testSetBriefDescription() {
        s.setBriefDescription("Ipsum");
        String real = s.getBriefDescription();
        String expected = "Ipsum";
        assertEquals(real, expected);
    }

    public void testSetCompleteDescription() {
        s.setCompleteDescription("Lorem");
        String real = s.getCompleteDescription();
        String expected = "Lorem";
        assertEquals(real, expected);
    }

    public void testSetFeedback() {
        s.setFeedback(1d);
        Double real = s.getFeedback();
        Double expected = 1d;
        assertEquals(real, expected);
    }

    public void testSetKeywordList() {
        s.setKeywordList(lstKeywords);
        List<String> real = s.getKeywordList();
        List<String> expected = lstKeywords;
        assertEquals(real, expected);
    }

    public void testSetFormList() {
        s.setFormList(lstForms);
        List<Form> real = s.getFormList();
        List<Form> expected = lstForms;
        assertEquals(real, expected);
    }

    public void testTestEquals() {
        boolean real = s.equals(s);
        assertTrue(real);
    }

    public void testTestHashCode() {
        int real = s.hashCode();
        int expected = s.hashCode();
        assertEquals(real, expected);
    }

    public void testSameAs() {
        boolean real = s.sameAs(s);
        assertTrue(real);
    }

    public void testId() {
        s.setID(1l);
        Long real = s.id();
        Long expected = 1l;
        assertEquals(real, expected);
    }

    public void testIdentity() {
        s.setID(1l);
        Long real = s.identity();
        Long expected = 1l;
        assertEquals(real, expected);
    }
}