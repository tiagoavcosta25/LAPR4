package eapli.base.ticketmanagement.domain;

import eapli.base.activityfluxmanagement.domain.ActivityFlux;
import eapli.base.cataloguemanagement.domain.*;
import eapli.base.collaboratormanagement.domain.*;
import eapli.base.formmanagement.domain.*;
import eapli.base.servicemanagement.domain.*;
import eapli.base.taskmanagement.domain.*;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

import static org.junit.Assert.assertTrue;

public class TicketTest {

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildTicketWithNullUrgency() {
        System.out.println("\nTicket With Null Urgency.\n");
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), AttributeScript.valueOf("D:/folder3/script3.bat"), DataType.STRING))));

        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));

        final Service oService = new ServiceBuilder().withTitle("Title").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).build();

        final Ticket subject = new Ticket(null, TicketLimitDate.valueOf(LocalDateTime.of(2022,01,01,10,10)),
                TicketCreationDate.valueOf(LocalDateTime.of(2020,01,01,10,10)),
                Arrays.asList(new Response(oForm, Arrays.asList("Response1", "Response2"))), Arrays.asList(new TicketFile()), oService);
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildTicketWithNullLimitDate() {
        System.out.println("\nTicket With Null Limit Date.\n");
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), AttributeScript.valueOf("D:/folder3/script3.bat"), DataType.STRING))));

        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));

        final Service oService = new ServiceBuilder().withTitle("Title").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).build();

        final Ticket subject = new Ticket(TicketUrgency.MEDIUM, null, TicketCreationDate.valueOf(LocalDateTime.of(2020,01,01,10,10)),
                Arrays.asList(new Response(oForm, Arrays.asList("Response1", "Response2"))), Arrays.asList(new TicketFile()),
                oService);
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildTicketWithWrongLimitDate() {
        System.out.println("\nTicket With Limit Date Set in the Past.\n");
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), AttributeScript.valueOf("D:/folder3/script3.bat"), DataType.STRING))));

        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));

        final Service oService = new ServiceBuilder().withTitle("Title").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).build();

        final Ticket subject = new Ticket(TicketUrgency.MEDIUM, TicketLimitDate.valueOf(LocalDateTime.of(2019,01,01,10,10)),
                TicketCreationDate.valueOf(LocalDateTime.of(2020,01,01,10,10)),
                Arrays.asList(new Response(oForm, Arrays.asList("Response1", "Response2"))), Arrays.asList(new TicketFile()),
                oService);
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildTicketWithNullCreationDate() {
        System.out.println("\nTicket With Null Creation Date.\n");
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), AttributeScript.valueOf("D:/folder3/script3.bat"), DataType.STRING))));

        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));

        final Service oService = new ServiceBuilder().withTitle("Title").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).build();

        final Ticket subject = new Ticket(TicketUrgency.MEDIUM, TicketLimitDate.valueOf(LocalDateTime.of(2022,01,01,10,10)),
                null, Arrays.asList(new Response(oForm, Arrays.asList("Response1", "Response2"))), Arrays.asList(new TicketFile()),
                oService);
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildTicketWithWrongCreationDate() {
        System.out.println("\nTicket With Creation Date Set in the Future.\n");
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), AttributeScript.valueOf("D:/folder3/script3.bat"), DataType.STRING))));

        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));

        final Service oService = new ServiceBuilder().withTitle("Title").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).build();

        final Ticket subject = new Ticket(TicketUrgency.MEDIUM, TicketLimitDate.valueOf(LocalDateTime.of(2022,01,01,10,10)),
                TicketCreationDate.valueOf(LocalDateTime.of(2023,01,01,10,10)),
                Arrays.asList(new Response(oForm, Arrays.asList("Response1", "Response2"))), Arrays.asList(new TicketFile()),
                oService);
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildTicketWithNullResponsesList() {
        System.out.println("\nTicket With Null Response List.\n");
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), AttributeScript.valueOf("D:/folder3/script3.bat"), DataType.STRING))));

        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));

        final Service oService = new ServiceBuilder().withTitle("Title").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).build();

        final Ticket subject = new Ticket(TicketUrgency.MEDIUM, TicketLimitDate.valueOf(LocalDateTime.of(2022,01,01,10,10)),
                TicketCreationDate.valueOf(LocalDateTime.of(2020,01,01,10,10)),null,
                Arrays.asList(new TicketFile()), oService);
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildTicketWithEmptyResponsesList() {
        System.out.println("\nTicket With Empty Response List.\n");
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), AttributeScript.valueOf("D:/folder3/script3.bat"), DataType.STRING))));

        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));

        final Service oService = new ServiceBuilder().withTitle("Title").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).build();

        final Ticket subject = new Ticket(TicketUrgency.MEDIUM, TicketLimitDate.valueOf(LocalDateTime.of(2022,01,01,10,10)),
                TicketCreationDate.valueOf(LocalDateTime.of(2020,01,01,10,10)),Arrays.asList(),
                Arrays.asList(new TicketFile()), oService);
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildTicketWithNullFilesList() {
        System.out.println("\nTicket With Null File List.\n");
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), AttributeScript.valueOf("D:/folder3/script3.bat"), DataType.STRING))));

        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));

        final Service oService = new ServiceBuilder().withTitle("Title").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).build();

        final Ticket subject = new Ticket(TicketUrgency.MEDIUM, TicketLimitDate.valueOf(LocalDateTime.of(2022,01,01,10,10)),
                TicketCreationDate.valueOf(LocalDateTime.of(2020,01,01,10,10)),
                Arrays.asList(new Response(oForm, Arrays.asList("Response1", "Response2"))), null, oService);
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildTicketWithEmptyFilesList() {
        System.out.println("\nTicket With Empty File List.\n");
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), AttributeScript.valueOf("D:/folder3/script3.bat"), DataType.STRING))));

        final ActivityFlux oActivityFlux = new ActivityFlux(new ArrayList<>(Arrays.asList(new AutomaticTask(TaskDescription.valueOf("Task Description"), TaskPriority.HIGH, AutomaticTaskScript.valueOf("D:/folder3/script3.bat")))));

        final Service oService = new ServiceBuilder().withTitle("Title").withBriefDescription("Description").withCompleteDescription("Complete Description")
                .withFormList(new ArrayList<>(Arrays.asList(oForm))).withKeywordList(new ArrayList<>(Arrays.asList("Keyword")))
                .withFeedback(24d).withActivityFlux(oActivityFlux).build();

        final Ticket subject = new Ticket(TicketUrgency.MEDIUM, TicketLimitDate.valueOf(LocalDateTime.of(2022,01,01,10,10)),
                TicketCreationDate.valueOf(LocalDateTime.of(2020,01,01,10,10)),
                Arrays.asList(new Response(oForm, Arrays.asList("Response1", "Response2"))), Arrays.asList(), oService);
        assertTrue(subject != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureCanBuildTicketWithNullService() {
        System.out.println("\nTicket With Null Service.\n");
        final Form oForm = new Form(FormName.valueOf("Form Name"), FormType.MANUALTASK, new ArrayList<>(Arrays.asList(new Attribute(AttributeName.valueOf("Attribute"),
                AttributeLabel.valueOf("Label"), AttributeDescription.valueOf("Description"), AttributeRegex.valueOf("[0-9]+"), AttributeScript.valueOf("D:/folder3/script3.bat"), DataType.STRING))));

        final Ticket subject = new Ticket(TicketUrgency.MEDIUM, TicketLimitDate.valueOf(LocalDateTime.of(2022,01,01,10,10)),
                TicketCreationDate.valueOf(LocalDateTime.of(2020,01,01,10,10)),
                Arrays.asList(new Response(oForm, Arrays.asList("Ipsum", "Ipsum"))), Arrays.asList(new TicketFile()), null);
        assertTrue(subject != null);
    }


}