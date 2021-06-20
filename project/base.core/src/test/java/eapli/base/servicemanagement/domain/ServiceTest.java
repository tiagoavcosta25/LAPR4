package eapli.base.servicemanagement.domain;

import eapli.base.activityfluxmanagement.specification.domain.ActivityFlux;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueBriefDescription;
import eapli.base.cataloguemanagement.domain.CatalogueCompleteDescription;
import eapli.base.cataloguemanagement.domain.CatalogueTitle;
import eapli.base.collaboratormanagement.domain.*;
import eapli.base.formmanagement.domain.*;
import eapli.base.taskmanagement.specification.domain.AutomaticTask;
import eapli.base.taskmanagement.specification.domain.AutomaticTaskScript;
import eapli.base.taskmanagement.specification.domain.TaskDescription;
import eapli.base.taskmanagement.specification.domain.TaskPriority;
import org.junit.Test;
import java.time.LocalDate;
import java.util.*;
import static org.junit.Assert.assertTrue;

public class ServiceTest {

    @Test
    public void ensureCanBuildServiceWithApprovalAndManualTask() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"),
                new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                        AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));
        final Catalogue oCatalogue = new Catalogue(CatalogueBriefDescription.valueOf("Description"), CatalogueCompleteDescription.valueOf("Complete Description"),
                CatalogueTitle.valueOf("Title"), new Collaborator(null,
                null, CollaboratorPhoneNumber.valueOf("+351", 966666666d), CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"), CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l)), new HashSet<>());

        new ServiceBuilder().withTitle("Title").withIcon("C:/img/icon.png").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).withCatalogue(oCatalogue).build();
        assertTrue(true);
    }

    @Test
    public void ensureCanBuildServiceWithoutFeedback() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"),
                new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                        AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));
        final Catalogue oCatalogue = new Catalogue(CatalogueBriefDescription.valueOf("Description"), CatalogueCompleteDescription.valueOf("Complete Description"),
                CatalogueTitle.valueOf("Title"), new Collaborator(null,
                null, CollaboratorPhoneNumber.valueOf("+351", 966666666d), CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"), CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l)), new HashSet<>());

        new ServiceBuilder().withTitle("Title").withIcon("C:/img/icon.png").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withActivityFlux(oActivityFlux).withCatalogue(oCatalogue).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildServiceWithoutCatalogue() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"),
                new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                        AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));

        new ServiceBuilder().withTitle("Title").withIcon("C:/img/icon.png").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildServiceWithoutActivityFlux() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"),
                new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                        AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));
        final Catalogue oCatalogue = new Catalogue(CatalogueBriefDescription.valueOf("Description"), CatalogueCompleteDescription.valueOf("Complete Description"),
                CatalogueTitle.valueOf("Title"), new Collaborator(null,
                null, CollaboratorPhoneNumber.valueOf("+351", 966666666d), CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"), CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l)), new HashSet<>());

        new ServiceBuilder().withTitle("Title").withIcon("C:/img/icon.png").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withCatalogue(oCatalogue).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildServiceWithoutKeywordList() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"),
                new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                        AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));
        final Catalogue oCatalogue = new Catalogue(CatalogueBriefDescription.valueOf("Description"), CatalogueCompleteDescription.valueOf("Complete Description"),
                CatalogueTitle.valueOf("Title"), new Collaborator(null,
                null, CollaboratorPhoneNumber.valueOf("+351", 966666666d), CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"), CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l)), new HashSet<>());

        new ServiceBuilder().withTitle("Title").withIcon("C:/img/icon.png").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm)))
                .withFeedback(24d).withActivityFlux(oActivityFlux).withCatalogue(oCatalogue).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildServiceWithoutFormList() {
        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));
        final Catalogue oCatalogue = new Catalogue(CatalogueBriefDescription.valueOf("Description"), CatalogueCompleteDescription.valueOf("Complete Description"),
                CatalogueTitle.valueOf("Title"), new Collaborator(null,
                null, CollaboratorPhoneNumber.valueOf("+351", 966666666d), CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"), CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l)), new HashSet<>());

        new ServiceBuilder().withTitle("Title").withIcon("C:/img/icon.png").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).withCatalogue(oCatalogue).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildServiceWithoutCompleteDescription() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"),
                new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                        AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));
        final Catalogue oCatalogue = new Catalogue(CatalogueBriefDescription.valueOf("Description"), CatalogueCompleteDescription.valueOf("Complete Description"),
                CatalogueTitle.valueOf("Title"), new Collaborator(null,
                null, CollaboratorPhoneNumber.valueOf("+351", 966666666d), CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"), CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l)), new HashSet<>());

        new ServiceBuilder().withTitle("Title").withIcon("C:/img/icon.png").withBriefDescription("Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).withCatalogue(oCatalogue).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildServiceWithoutBriefDescription() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"),
                new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                        AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));
        final Catalogue oCatalogue = new Catalogue(CatalogueBriefDescription.valueOf("Description"), CatalogueCompleteDescription.valueOf("Complete Description"),
                CatalogueTitle.valueOf("Title"), new Collaborator(null,
                null, CollaboratorPhoneNumber.valueOf("+351", 966666666d), CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"), CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l)), new HashSet<>());

        new ServiceBuilder().withTitle("Title").withIcon("C:/img/icon.png").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).withCatalogue(oCatalogue).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildServiceWithoutIcon() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"),
                new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                        AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));
        final Catalogue oCatalogue = new Catalogue(CatalogueBriefDescription.valueOf("Description"), CatalogueCompleteDescription.valueOf("Complete Description"),
                CatalogueTitle.valueOf("Title"), new Collaborator(null,
                null, CollaboratorPhoneNumber.valueOf("+351", 966666666d), CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"), CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l)), new HashSet<>());

        new ServiceBuilder().withTitle("Title").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).withCatalogue(oCatalogue).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildServiceWithoutTitle() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"),
                new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                        AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));
        final Catalogue oCatalogue = new Catalogue(CatalogueBriefDescription.valueOf("Description"), CatalogueCompleteDescription.valueOf("Complete Description"),
                CatalogueTitle.valueOf("Title"), new Collaborator(null,
                null, CollaboratorPhoneNumber.valueOf("+351", 966666666d), CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"), CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l)), new HashSet<>());

        new ServiceBuilder().withIcon("C:/img/icon.png").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).withCatalogue(oCatalogue).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildServiceWithEmptyTitle() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"),
                new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                        AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));
        final Catalogue oCatalogue = new Catalogue(CatalogueBriefDescription.valueOf("Description"), CatalogueCompleteDescription.valueOf("Complete Description"),
                CatalogueTitle.valueOf("Title"), new Collaborator(null,
                null, CollaboratorPhoneNumber.valueOf("+351", 966666666d), CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"), CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l)), new HashSet<>());

        new ServiceBuilder().withTitle("").withIcon("C:/img/icon.png").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).withCatalogue(oCatalogue).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildServiceWithEmptyIcon() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"),
                new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                        AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));
        final Catalogue oCatalogue = new Catalogue(CatalogueBriefDescription.valueOf("Description"), CatalogueCompleteDescription.valueOf("Complete Description"),
                CatalogueTitle.valueOf("Title"), new Collaborator(null,
                null, CollaboratorPhoneNumber.valueOf("+351", 966666666d), CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"), CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l)), new HashSet<>());

        new ServiceBuilder().withTitle("Title").withIcon("").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).withCatalogue(oCatalogue).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildServiceWithEmptyBriefDescription() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"),
                new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                        AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));
        final Catalogue oCatalogue = new Catalogue(CatalogueBriefDescription.valueOf("Description"), CatalogueCompleteDescription.valueOf("Complete Description"),
                CatalogueTitle.valueOf("Title"), new Collaborator(null,
                null, CollaboratorPhoneNumber.valueOf("+351", 966666666d), CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"), CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l)), new HashSet<>());

        new ServiceBuilder().withTitle("Description").withIcon("C:/img/icon.png").withBriefDescription("").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).withCatalogue(oCatalogue).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildServiceWithEmptyCompleteDescription() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"),
                new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                        AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));
        final Catalogue oCatalogue = new Catalogue(CatalogueBriefDescription.valueOf("Description"), CatalogueCompleteDescription.valueOf("Complete Description"),
                CatalogueTitle.valueOf("Title"), new Collaborator(null,
                null, CollaboratorPhoneNumber.valueOf("+351", 966666666d), CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"), CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l)), new HashSet<>());

        new ServiceBuilder().withTitle("Description").withIcon("C:/img/icon.png").withBriefDescription("Description").withCompleteDescription("")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).withCatalogue(oCatalogue).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildServiceWithEmptyFormList() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"),
                new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));
        final Catalogue oCatalogue = new Catalogue(CatalogueBriefDescription.valueOf("Description"), CatalogueCompleteDescription.valueOf("Complete Description"),
                CatalogueTitle.valueOf("Title"), new Collaborator(null,
                null, CollaboratorPhoneNumber.valueOf("+351", 966666666d), CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"), CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l)), new HashSet<>());

        new ServiceBuilder().withTitle("Description").withIcon("C:/img/icon.png").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>()).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).withCatalogue(oCatalogue).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildServiceWithEmptyKeywordList() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"),
                new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));
        final Catalogue oCatalogue = new Catalogue(CatalogueBriefDescription.valueOf("Description"), CatalogueCompleteDescription.valueOf("Complete Description"),
                CatalogueTitle.valueOf("Title"), new Collaborator(null,
                null, CollaboratorPhoneNumber.valueOf("+351", 966666666d), CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"), CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l)), new HashSet<>());

        new ServiceBuilder().withTitle("Description").withIcon("C:/img/icon.png").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>())
                .withFeedback(24d).withActivityFlux(oActivityFlux).withCatalogue(oCatalogue).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildServiceWithNegativeFeedback() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"),
                new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));
        final Catalogue oCatalogue = new Catalogue(CatalogueBriefDescription.valueOf("Description"), CatalogueCompleteDescription.valueOf("Complete Description"),
                CatalogueTitle.valueOf("Title"), new Collaborator(null,
                null, CollaboratorPhoneNumber.valueOf("+351", 966666666d), CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"), CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l)), new HashSet<>());

        new ServiceBuilder().withTitle("Description").withIcon("C:/img/icon.png").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(-1d).withActivityFlux(oActivityFlux).withCatalogue(oCatalogue).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildServiceWithNullActivityFlux() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"),
                new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final Catalogue oCatalogue = new Catalogue(CatalogueBriefDescription.valueOf("Description"), CatalogueCompleteDescription.valueOf("Complete Description"),
                CatalogueTitle.valueOf("Title"), new Collaborator(null,
                null, CollaboratorPhoneNumber.valueOf("+351", 966666666d), CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"), CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l)), new HashSet<>());

        new ServiceBuilder().withTitle("Description").withIcon("C:/img/icon.png").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(null).withCatalogue(oCatalogue).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildServiceWithNullCatalogue() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"), new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));
        new ServiceBuilder().withTitle("Description").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).withCatalogue(null).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildServiceWithInvalidTitle() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"),
                new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));
        final Catalogue oCatalogue = new Catalogue(CatalogueBriefDescription.valueOf("Description"), CatalogueCompleteDescription.valueOf("Complete Description"),
                CatalogueTitle.valueOf("Title"), new Collaborator(null,
                null, CollaboratorPhoneNumber.valueOf("+351", 966666666d), CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"), CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l)), new HashSet<>());

        new ServiceBuilder().withTitle("Description*$$").withIcon("C:/img/icon.png").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).withCatalogue(oCatalogue).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildServiceWithInvalidIcon() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"), new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));
        final Catalogue oCatalogue = new Catalogue(CatalogueBriefDescription.valueOf("Description"), CatalogueCompleteDescription.valueOf("Complete Description"),
                CatalogueTitle.valueOf("Title"), new Collaborator(null,
                null, CollaboratorPhoneNumber.valueOf("+351", 966666666d), CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"), CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l)), new HashSet<>());

        new ServiceBuilder().withTitle("Description").withIcon("Invalid Icon Path").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).withCatalogue(oCatalogue).build();
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCantBuildServiceWithMoreThan40CharsBriefDescription() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"),
                new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));
        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));
        final Catalogue oCatalogue = new Catalogue(CatalogueBriefDescription.valueOf("Description"), CatalogueCompleteDescription.valueOf("Complete Description"),
                CatalogueTitle.valueOf("Title"), new Collaborator(null,
                null, CollaboratorPhoneNumber.valueOf("+351", 966666666d), CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"), CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l)), new HashSet<>());

        new ServiceBuilder().withTitle("Description").withIcon("C:/img/icon.png").withBriefDescription("Description11111111111111111111111111111111111111111111111111").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).withCatalogue(oCatalogue).build();
        assertTrue(true);
    }
}