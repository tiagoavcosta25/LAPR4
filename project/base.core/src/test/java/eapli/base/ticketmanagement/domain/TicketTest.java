package eapli.base.ticketmanagement.domain;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.activityfluxmanagement.specification.domain.ActivityFlux;
import eapli.base.collaboratormanagement.domain.*;
import eapli.base.formmanagement.domain.*;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.domain.ServiceBuilder;
import eapli.base.taskmanagement.execution.domain.AutomaticTaskExecution;
import eapli.base.taskmanagement.specification.domain.*;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class TicketTest {

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildTicketWithNullUrgency() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"),
                new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));

        final AutomaticTask oAutoTask = new AutomaticTask(TaskDescription.valueOf("Task Description"),
                TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat"));

        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(oAutoTask)));

        final Service oService = new ServiceBuilder().withTitle("Title").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).build();

        final AutomaticTaskExecution oAutoExec = new AutomaticTaskExecution(oAutoTask);

        final ActivityFluxExecution oFluxExec = new ActivityFluxExecution(new ArrayList<>(Arrays.asList(oAutoExec)));

        final Collaborator oCollaborator = new Collaborator(null, null,
                null, CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"),
                CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l));

        final Ticket subject = new Ticket(null, TicketLimitDate.valueOf(LocalDateTime.of(2022,01,01,10,10)),
                TicketCreationDate.valueOf(LocalDateTime.of(2020,01,01,10,10)),
                Arrays.asList(new Response(oForm, Arrays.asList("Response1", "Response2"))), oFluxExec, Arrays.asList(new TicketFile()), oService, oCollaborator);
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildTicketWithNullLimitDate() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"),
                new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                        AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));

        final AutomaticTask oAutoTask = new AutomaticTask(TaskDescription.valueOf("Task Description"),
                TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat"));

        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(oAutoTask)));

        final Service oService = new ServiceBuilder().withTitle("Title").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).build();

        final AutomaticTaskExecution oAutoExec = new AutomaticTaskExecution(oAutoTask);

        final ActivityFluxExecution oFluxExec = new ActivityFluxExecution(new ArrayList<>(Arrays.asList(oAutoExec)));

        final Collaborator oCollaborator = new Collaborator(null, null,
                null, CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"),
                CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l));

        final Ticket subject = new Ticket(TicketUrgency.MEDIUM, null, TicketCreationDate.valueOf(LocalDateTime.of(2020,01,01,10,10)),
                Arrays.asList(new Response(oForm, Arrays.asList("Response1", "Response2"))), oFluxExec, Arrays.asList(new TicketFile()),
                oService, oCollaborator);
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildTicketWithWrongLimitDate() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"), new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));

        AutomaticTask oAutoTask = new AutomaticTask(TaskDescription.valueOf("Task Description"),
                TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat"));

        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(oAutoTask)));

        final Service oService = new ServiceBuilder().withTitle("Title").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).build();

        final AutomaticTaskExecution oAutoExec = new AutomaticTaskExecution(oAutoTask);

        final ActivityFluxExecution oFluxExec = new ActivityFluxExecution(new ArrayList<>(Arrays.asList(oAutoExec)));

        final Collaborator oCollaborator = new Collaborator(null, null,
                null, CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"),
                CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l));

        final Ticket subject = new Ticket(TicketUrgency.MEDIUM, TicketLimitDate.valueOf(LocalDateTime.of(2019,01,01,10,10)),
                TicketCreationDate.valueOf(LocalDateTime.of(2020,01,01,10,10)),
                Arrays.asList(new Response(oForm, Arrays.asList("Response1", "Response2"))), oFluxExec, Arrays.asList(new TicketFile()),
                oService, oCollaborator);
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildTicketWithNullCreationDate() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"), new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));

        AutomaticTask oAutoTask = new AutomaticTask(TaskDescription.valueOf("Task Description"),
                TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat"));

        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(oAutoTask)));

        final Service oService = new ServiceBuilder().withTitle("Title").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).build();

        final AutomaticTaskExecution oAutoExec = new AutomaticTaskExecution(oAutoTask);

        final ActivityFluxExecution oFluxExec = new ActivityFluxExecution(new ArrayList<>(Arrays.asList(oAutoExec)));

        final Collaborator oCollaborator = new Collaborator(null, null,
                null, CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"),
                CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l));

        final Ticket subject = new Ticket(TicketUrgency.MEDIUM, TicketLimitDate.valueOf(LocalDateTime.of(2022,01,01,10,10)),
                null, Arrays.asList(new Response(oForm, Arrays.asList("Response1", "Response2"))), oFluxExec, Arrays.asList(new TicketFile()),
                oService, oCollaborator);
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildTicketWithWrongCreationDate() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"), new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));

        AutomaticTask oAutoTask = new AutomaticTask(TaskDescription.valueOf("Task Description"),
                TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat"));

        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(oAutoTask)));

        final Service oService = new ServiceBuilder().withTitle("Title").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).build();

        final AutomaticTaskExecution oAutoExec = new AutomaticTaskExecution(oAutoTask);

        final ActivityFluxExecution oFluxExec = new ActivityFluxExecution(new ArrayList<>(Arrays.asList(oAutoExec)));

        final Collaborator oCollaborator = new Collaborator(null, null,
                null, CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"),
                CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l));

        final Ticket subject = new Ticket(TicketUrgency.MEDIUM, TicketLimitDate.valueOf(LocalDateTime.of(2022,01,01,10,10)),
                TicketCreationDate.valueOf(LocalDateTime.of(2023,01,01,10,10)),
                Arrays.asList(new Response(oForm, Arrays.asList("Response1", "Response2"))), oFluxExec, Arrays.asList(new TicketFile()),
                oService, oCollaborator);
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildTicketWithNullResponsesList() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"), new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));

        AutomaticTask oAutoTask = new AutomaticTask(TaskDescription.valueOf("Task Description"),
                TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat"));

        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(oAutoTask)));

        final Service oService = new ServiceBuilder().withTitle("Title").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).build();

        final AutomaticTaskExecution oAutoExec = new AutomaticTaskExecution(oAutoTask);

        final ActivityFluxExecution oFluxExec = new ActivityFluxExecution(new ArrayList<>(Arrays.asList(oAutoExec)));

        final Collaborator oCollaborator = new Collaborator(null, null,
                null, CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"),
                CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l));

        final Ticket subject = new Ticket(TicketUrgency.MEDIUM, TicketLimitDate.valueOf(LocalDateTime.of(2022,01,01,10,10)),
                TicketCreationDate.valueOf(LocalDateTime.of(2020,01,01,10,10)),null, oFluxExec,
                Arrays.asList(new TicketFile()), oService, oCollaborator);
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildTicketWithEmptyResponsesList() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"), new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));

        AutomaticTask oAutoTask = new AutomaticTask(TaskDescription.valueOf("Task Description"),
                TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat"));

        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(oAutoTask)));

        final Service oService = new ServiceBuilder().withTitle("Title").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).build();

        final AutomaticTaskExecution oAutoExec = new AutomaticTaskExecution(oAutoTask);

        final ActivityFluxExecution oFluxExec = new ActivityFluxExecution(new ArrayList<>(Arrays.asList(oAutoExec)));

        final Collaborator oCollaborator = new Collaborator(null, null,
                null, CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"),
                CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l));

        final Ticket subject = new Ticket(TicketUrgency.MEDIUM, TicketLimitDate.valueOf(LocalDateTime.of(2022,01,01,10,10)),
                TicketCreationDate.valueOf(LocalDateTime.of(2020,01,01,10,10)),Arrays.asList(), oFluxExec,
                Arrays.asList(new TicketFile()), oService, oCollaborator);
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildTicketWithNullFilesList() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"),
                new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));

        AutomaticTask oAutoTask = new AutomaticTask(TaskDescription.valueOf("Task Description"),
                TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat"));

        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(oAutoTask)));

        final Service oService = new ServiceBuilder().withTitle("Title").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).build();

        final AutomaticTaskExecution oAutoExec = new AutomaticTaskExecution(oAutoTask);

        final ActivityFluxExecution oFluxExec = new ActivityFluxExecution(new ArrayList<>(Arrays.asList(oAutoExec)));

        final Collaborator oCollaborator = new Collaborator(null, null,
                null, CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"),
                CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l));

        final Ticket subject = new Ticket(TicketUrgency.MEDIUM, TicketLimitDate.valueOf(LocalDateTime.of(2022,01,01,10,10)),
                TicketCreationDate.valueOf(LocalDateTime.of(2020,01,01,10,10)),
                Arrays.asList(new Response(oForm, Arrays.asList("Response1", "Response2"))), oFluxExec, null, oService, oCollaborator);
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildTicketWithEmptyFilesList() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"), new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));

        AutomaticTask oAutoTask = new AutomaticTask(TaskDescription.valueOf("Task Description"),
                TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat"));

        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(oAutoTask)));

        final Service oService = new ServiceBuilder().withTitle("Title").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).build();

        final AutomaticTaskExecution oAutoExec = new AutomaticTaskExecution(oAutoTask);

        final ActivityFluxExecution oFluxExec = new ActivityFluxExecution(new ArrayList<>(Arrays.asList(oAutoExec)));

        final Collaborator oCollaborator = new Collaborator(null, null,
                null, CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"),
                CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l));

        final Ticket subject = new Ticket(TicketUrgency.MEDIUM, TicketLimitDate.valueOf(LocalDateTime.of(2022,01,01,10,10)),
                TicketCreationDate.valueOf(LocalDateTime.of(2020,01,01,10,10)),
                Arrays.asList(new Response(oForm, Arrays.asList("Response1", "Response2"))), oFluxExec, Arrays.asList(), oService, oCollaborator);
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildTicketWithNullService() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"), new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));

        AutomaticTask oAutoTask = new AutomaticTask(TaskDescription.valueOf("Task Description"),
                TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat"));

        final AutomaticTaskExecution oAutoExec = new AutomaticTaskExecution(oAutoTask);

        final ActivityFluxExecution oFluxExec = new ActivityFluxExecution(new ArrayList<>(Arrays.asList(oAutoExec)));

        final Collaborator oCollaborator = new Collaborator(null, null,
                null, CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"),
                CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l));

        final Ticket subject = new Ticket(TicketUrgency.MEDIUM, TicketLimitDate.valueOf(LocalDateTime.of(2022,01,01,10,10)),
                TicketCreationDate.valueOf(LocalDateTime.of(2020,01,01,10,10)),
                Arrays.asList(new Response(oForm, Arrays.asList("Ipsum", "Ipsum"))), oFluxExec, Arrays.asList(new TicketFile()), null, oCollaborator);
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildTicketWithNullFlux() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"), new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));

        AutomaticTask oAutoTask = new AutomaticTask(TaskDescription.valueOf("Task Description"),
                TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat"));

        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(oAutoTask)));

        final Service oService = new ServiceBuilder().withTitle("Title").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).build();

        final Collaborator oCollaborator = new Collaborator(null, null,
                null, CollaboratorBirthDate.valueOf(LocalDate.of(2000,01,01)),
                CollaboratorAddress.valueOf("Address Street"), CollaboratorCompleteName.valueOf("Complete Name"),
                CollaboratorShortName.valueOf("First", "Last"),
                CollaboratorMechanographicNumber.valueOf(1919l));

        final Ticket subject = new Ticket(TicketUrgency.MEDIUM, TicketLimitDate.valueOf(LocalDateTime.of(2022,01,01,10,10)),
                TicketCreationDate.valueOf(LocalDateTime.of(2020,01,01,10,10)),
                Arrays.asList(new Response(oForm, Arrays.asList("Ipsum", "Ipsum"))), null, Arrays.asList(new TicketFile()), oService, oCollaborator);
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildTicketWithNullCollab() {
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, FormScript.valueOf("D:/folder3/script3.bat"), new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), DataType.STRING))));

        AutomaticTask oAutoTask = new AutomaticTask(TaskDescription.valueOf("Task Description"),
                TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat"));

        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(oAutoTask)));

        final Service oService = new ServiceBuilder().withTitle("Title").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).build();

        final AutomaticTaskExecution oAutoExec = new AutomaticTaskExecution(oAutoTask);

        final ActivityFluxExecution oFluxExec = new ActivityFluxExecution(new ArrayList<>(Arrays.asList(oAutoExec)));

        final Ticket subject = new Ticket(TicketUrgency.MEDIUM, TicketLimitDate.valueOf(LocalDateTime.of(2022,01,01,10,10)),
                TicketCreationDate.valueOf(LocalDateTime.of(2020,01,01,10,10)),
                Arrays.asList(new Response(oForm, Arrays.asList("Ipsum", "Ipsum"))), oFluxExec, Arrays.asList(new TicketFile()), oService, null);
        assertTrue(subject != null);
    }

}