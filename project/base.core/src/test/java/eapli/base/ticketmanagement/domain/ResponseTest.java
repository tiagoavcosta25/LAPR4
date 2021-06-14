package eapli.base.ticketmanagement.domain;

import eapli.base.formmanagement.domain.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class ResponseTest {
    /*@Test
    public void ensureCanBuildResponseWithCorrectRegex() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), FormScript.valueOf("D:/folder3/script3.bat"), DataType.STRING))));

        final Response subject = new Response(oForm, new ArrayList<>(Arrays.asList("0")));
        assertTrue(subject != null);
    }

    @Test
    public void ensureCanBuildResponseWithCorrectRegexV2() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+[a-zA-Z]+[0-9]+"), FormScript.valueOf("D:/folder3/script3.bat"), DataType.STRING))));

        final Response subject = new Response(oForm, new ArrayList<>(Arrays.asList("0a2")));
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildResponseWithIncorrectRegex() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[a-zA-Z]+"), FormScript.valueOf("D:/folder3/script3.bat"), DataType.STRING))));

        final Response subject = new Response(oForm, new ArrayList<>(Arrays.asList("19")));
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildResponseWithIncorrectNumberOfResponses() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[a-zA-Z]+"), FormScript.valueOf("D:/folder3/script3.bat"), DataType.STRING))));

        final Response subject = new Response(oForm, new ArrayList<>(Arrays.asList("teste", "jpfa")));
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildResponseWithIncorrectNumberOfResponsesV2() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[a-zA-Z]+"), FormScript.valueOf("D:/folder3/script3.bat"), DataType.STRING), new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[a-zA-Z]+"), FormScript.valueOf("D:/folder3/script3.bat"), DataType.STRING))));

        final Response subject = new Response(oForm, new ArrayList<>(Arrays.asList("teste")));
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildResponseWithEmptyResponses() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[a-zA-Z]+"), FormScript.valueOf("D:/folder3/script3.bat"), DataType.STRING))));

        final Response subject = new Response(oForm, new ArrayList<>(Arrays.asList()));
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildResponseWithNullForm() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[a-zA-Z]+"), FormScript.valueOf("D:/folder3/script3.bat"), DataType.STRING))));

        final Response subject = new Response(null, new ArrayList<>(Arrays.asList("teste")));
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildResponseWithNullResponseList() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[a-zA-Z]+"), FormScript.valueOf("D:/folder3/script3.bat"), DataType.STRING))));

        final Response subject = new Response(oForm, null);
        assertTrue(subject != null);
    }*/
}