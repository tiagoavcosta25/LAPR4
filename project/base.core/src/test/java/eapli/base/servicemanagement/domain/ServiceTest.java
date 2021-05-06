package eapli.base.servicemanagement.domain;

import eapli.base.formmanagement.domain.*;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServiceTest extends TestCase {

    public final Attribute a = new Attribute(AttributeName.valueOf("Lorem"), AttributeLabel.valueOf("Ipsum"), AttributeDescription.valueOf("Lorem"),
            AttributeRegex.valueOf("Ipsum"), AttributeScript.valueOf("Lorem"), DataType.stringToDataType("Integer"));
    public final Form f = new Form(FormName.valueOf("Lorem"), FormType.valueOf("Service"), Arrays.asList(a));
    public final Catalogue c = new Catalogue();
    public final Service s = getDummyService("Lorem", "Ipsum", "Lorem", 2, c, Arrays.asList("Ipsum"), Arrays.asList(f));

    public static Service getDummyService(final String strTitle, final String strBriefDescription, final String strCompleteDescription,
                                              final Double dblFeedback, Catalogue oCatalogue, final List<String> lstKeywords, final List<Form> lstForms) {
        ServiceBuilder serviceBuilder = new ServiceBuilder();
        serviceBuilder = serviceBuilder.withTitle(strTitle);
        serviceBuilder = serviceBuilder.withBriefDescription(strBriefDescription);
        serviceBuilder = serviceBuilder.withCompleteDescription(strCompleteDescription);
        serviceBuilder = serviceBuilder.withFeedback(dblFeedback);
        serviceBuilder = serviceBuilder.withCatalogue(oCatalogue);
        serviceBuilder = serviceBuilder.withKeywordList(lstKeywords);
        serviceBuilder = serviceBuilder.withFormList(lstForms);
        return serviceBuilder.build();
    }

    public void testTitle() {
        ServiceTitle real = s.title();
        String expected = "Lorem";
        assertEquals(real.toString(), expected);
    }

    public void testBriefDescription() {
        ServiceBriefDescription real = s.briefDescription();
        String expected = "Ipsum";
        assertEquals(real.toString(), expected);
    }

    public void testCompleteDescription() {
        ServiceCompleteDescription real = s.completeDescription();
        String expected = "Lorem";
        assertEquals(real.toString(), expected);
    }

    public void testFeedback() {
        Feedback real = s.feedback();
        String expected = "Ipsum";
        assertEquals(real.toString(), expected);
    }

    public void testCatalogue() {
        Catalogue real = s.catalogue();
        Catalogue expected = c;
        assertEquals(real, c);
    }

    public void testKeywords() {
        List<Keyword> real = s.keywords();
        List<Keyword> expected = new ArrayList<>(Arrays.asList(new Keyword("Ipsum")));
        assertEquals(real, expected);
    }

    public void testForms() {
        List<Form> real = s.forms();
        List<Form> expected = new ArrayList<>(Arrays.asList(f));
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
        ServiceID real = s.id();
        assertNull(real);
    }

    public void testIdentity() {
        ServiceID real = s.identity();
        assertNull(real);
    }
}