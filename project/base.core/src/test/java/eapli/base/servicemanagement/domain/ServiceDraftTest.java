package eapli.base.servicemanagement.domain;

import eapli.base.activityfluxmanagement.domain.ActivityFlux;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueBriefDescription;
import eapli.base.cataloguemanagement.domain.CatalogueCompleteDescription;
import eapli.base.cataloguemanagement.domain.CatalogueTitle;
import eapli.base.collaboratormanagement.domain.*;
import eapli.base.formmanagement.domain.*;
import eapli.base.taskmanagement.domain.AutomaticTask;
import eapli.base.taskmanagement.domain.AutomaticTaskScript;
import eapli.base.taskmanagement.domain.TaskDescription;
import eapli.base.taskmanagement.domain.TaskPriority;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class ServiceDraftTest {

    @Test
    public void ensureCanBuildServiceDraftWithEverything() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), AttributeScript.valueOf("D:/folder3/script3.bat"), DataType.STRING))));

        final ServiceDraft subject = new ServiceDraft("Title", "Brief Description",
                "Complete Description", 24d, new ArrayList<>(Arrays.asList("Keyword")), new ArrayList<>(Arrays.asList(oForm)));
        assertTrue(subject != null);
    }

    @Test
    public void ensureCanBuildServiceDraftWithNothing() {
        final ServiceDraft subject = new ServiceDraft("", "",
                "", null, null, null);
        assertTrue(subject != null);
    }

    @Test
    public void ensureCanBuildServiceDraftWithOnlyTitle() {
        final ServiceDraft subject = new ServiceDraft("Title", "",
                "", null, null, null);
        assertTrue(subject != null);
    }

    @Test
    public void ensureCanBuildServiceDraftWithOnlyBriefDescription() {
        final ServiceDraft subject = new ServiceDraft("", "Brief Description",
                "", null, null, null);
        assertTrue(subject != null);
    }

    @Test
    public void ensureCanBuildServiceDraftWithOnlyCompleteDescription() {
        final ServiceDraft subject = new ServiceDraft("", "",
                "Complete Description", null, null, null);
        assertTrue(subject != null);
    }

    @Test
    public void ensureCanBuildServiceDraftWithOnlyFeedback() {
        final ServiceDraft subject = new ServiceDraft("", "",
                "", 1d, null, null);
        assertTrue(subject != null);
    }

    @Test
    public void ensureCanBuildServiceDraftWithNegativeFeedback() {
        final ServiceDraft subject = new ServiceDraft("", "",
                "", -1d, null, null);
        assertTrue(subject != null);
    }

    @Test
    public void ensureCanBuildServiceDraftWithOnlyKeywords() {
        final ServiceDraft subject = new ServiceDraft("", "",
                "", -1d, new ArrayList<>(Arrays.asList("Keyword")), null);
        assertTrue(subject != null);
    }

    @Test
    public void ensureCanBuildServiceDraftWithOnlyForms() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), AttributeScript.valueOf("D:/folder3/script3.bat"), DataType.STRING))));

        final ServiceDraft subject = new ServiceDraft("", "",
                "", -1d, null, new ArrayList<>(Arrays.asList(oForm)));
        assertTrue(subject != null);
    }
}