package eapli.base.servicemanagement.domain;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueBriefDescription;
import eapli.base.cataloguemanagement.domain.CatalogueCompleteDescription;
import eapli.base.cataloguemanagement.domain.CatalogueTitle;
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.collaboratormanagement.domain.CollaboratorBuilder;
import eapli.base.formmanagement.domain.*;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.domain.model.*;
import junit.framework.TestCase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ServiceTest extends TestCase {

    public final Attribute a = getDummyAttribute("Lorem", "Ipsum", "Lorem", "Ipsum", "D:/folder/script.bat", "Integer");

    public final Form f = getDummyForm("Lorem", "MANUAL_TASK", Arrays.asList(a));

    public final Collaborator c = getDummyCollaborator(dummyUser("dummy", BaseRoles.ADMIN), null, 919191919d,
            "+351", LocalDate.of(2000,01,01), "Lorem", "Ipsum",
            "Lorem", 123456l);

    public final Catalogue cat = new Catalogue(CatalogueBriefDescription.valueOf("Lorem"), CatalogueCompleteDescription.valueOf("Lorem"),
            CatalogueTitle.valueOf("Lorem"), c, null);
    public final Service s = getDummyService("Lorem", "Ipsum", "Lorem", 2d, cat, Arrays.asList("Ipsum"), Arrays.asList(f));

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

    public static SystemUser dummyUser(final String username, final Role... roles) {
        final SystemUserBuilder userBuilder = new SystemUserBuilder(new NilPasswordPolicy(), new PlainTextEncoder());
        return userBuilder.with(username, "duMMy1", "dummy", "dummy", "a@b.ro").withRoles(roles).build();
    }

    public static Collaborator getDummyCollaborator(final SystemUser oSystemUser, final Collaborator oManager, final Double dblPhoneNumber, final String strPhoneCode,
                                                    final LocalDate dtBirthDate, final String strAddress, final String strCompleteName,
                                                    final String strShortName, final Long lngMechanographicNumber) {
        CollaboratorBuilder collaboratorBuilder = new CollaboratorBuilder();
        collaboratorBuilder = collaboratorBuilder.withSystemUser(oSystemUser);
        collaboratorBuilder = collaboratorBuilder.withManager(oManager);
        collaboratorBuilder = collaboratorBuilder.withPhoneNumber(dblPhoneNumber, strPhoneCode);
        collaboratorBuilder = collaboratorBuilder.withBirthDate(dtBirthDate);
        collaboratorBuilder = collaboratorBuilder.withAddress(strAddress);
        collaboratorBuilder = collaboratorBuilder.withCompleteName(strCompleteName);
        collaboratorBuilder = collaboratorBuilder.withShortName(strShortName, strShortName);
        collaboratorBuilder = collaboratorBuilder.withMechanographicNumber(lngMechanographicNumber);
        return collaboratorBuilder.build();
    }

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

    public ServiceTest() throws ParseException {
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
        String expected = "2.0";
        assertEquals(real.toString(), expected);
    }

    public void testCatalogue() {
        Catalogue real = s.catalogue();
        Catalogue expected = cat;
        assertEquals(real, expected);
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
        Long real = s.id();
        assertNull(real);
    }

    public void testIdentity() {
        Long real = s.identity();
        assertNull(real);
    }
}