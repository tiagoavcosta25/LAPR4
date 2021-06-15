package eapli.base.ticketmanagement.domain;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.formmanagement.domain.Attribute;
import eapli.base.formmanagement.domain.Form;
import eapli.base.servicemanagement.domain.*;
import eapli.base.taskmanagement.execution.domain.TaskExecution;
import eapli.base.taskmanagement.execution.domain.TaskExecutionStatus;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.*;
import java.util.List;

/**
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
@Entity
public class Ticket implements AggregateRoot<Long> {

    @Version
    private Long version;

    @Id
    @GeneratedValue
    @Column(name = "ticketID")
    private Long m_lngID;

    @Enumerated(EnumType.STRING)
    private TicketUrgency m_oUrgency;

    @Embedded
    private TicketLimitDate m_oLimitDate;

    @Embedded
    private TicketCreationDate m_oCreationDate;

    @Enumerated(EnumType.STRING)
    private TicketStatus m_oStatus;

    @ManyToOne
    @JoinColumn(name="collaborator")
    private Collaborator m_oCollaborator;

    @ManyToOne
    @JoinColumn(name="ServiceID")
    private Service m_oService;

    @OneToOne
    @JoinColumn(name="fluxExecID")
    private ActivityFluxExecution m_oFluxExecution;

    @ElementCollection()
    @CollectionTable(name = "ticketFiles")
    private List<TicketFile> m_lstFiles;

    @OneToMany
    private List<Response> m_lstResponse;

    public Ticket(final TicketUrgency oUrgency, final TicketLimitDate oLimitDate, final TicketCreationDate oCreationDate,
                  final List<Response> lstResponse, final ActivityFluxExecution oFluxExecution, final List<TicketFile> lstFiles, final Service oService,
                  final Collaborator oCollaborator) {
        if (oUrgency == null || oLimitDate == null || oCreationDate == null || oFluxExecution == null || lstFiles == null || lstResponse == null ||
                oService == null || lstFiles.isEmpty() || lstResponse.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.m_oUrgency = oUrgency;
        this.m_oLimitDate = oLimitDate;
        this.m_oCreationDate = oCreationDate;
        this.m_lstResponse = lstResponse;
        this.m_oFluxExecution = oFluxExecution;
        this.m_oStatus = TicketStatus.OPEN;
        this.m_lstFiles = lstFiles;
        this.m_oCollaborator = oCollaborator;
        this.m_oService = oService;
    }

    protected Ticket() {
        // for ORM only
    }

    public TicketUrgency urgency() {
        return this.m_oUrgency;
    }
    public TicketLimitDate limitDate() {
        return this.m_oLimitDate;
    }
    public TicketCreationDate creationDate() {
        return this.m_oCreationDate;
    }
    public TicketStatus status() {
        return this.m_oStatus;
    }
    public List<Response> responses() {
        return this.m_lstResponse;
    }
    public List<TicketFile> files() {
        return this.m_lstFiles;
    }
    public Collaborator collaborator() {
        return this.m_oCollaborator;
    }
    public Service service() {
        return this.m_oService;
    }
    public ActivityFluxExecution executionFlux() {
        return m_oFluxExecution;
    }

    public void setStatus(TicketStatus oStatus) {
        this.m_oStatus = oStatus;
    }
    public void setUrgency(TicketUrgency oUrgency) {
        this.m_oUrgency = oUrgency;
    }
    public void setLimitDate(TicketLimitDate oLimitDate) {
        this.m_oLimitDate = oLimitDate;
    }
    public void setCreationDate(TicketCreationDate oCreationDate) {
        this.m_oCreationDate = oCreationDate;
    }
    public void setCollaborator(Collaborator oCollaborator) {
        this.m_oCollaborator = oCollaborator;
    }
    public void setService(Service oService) {
        this.m_oService = oService;
    }
    public void setFluxExecution(ActivityFluxExecution oFluxExecution) {
        this.m_oFluxExecution = oFluxExecution;
    }
    public void setFiles(List<TicketFile> lstFiles) {
        this.m_lstFiles = lstFiles;
    }
    public void setResponses(List<Response> lstResponse) {
        this.m_lstResponse = lstResponse;
    }

    @Override
    public boolean equals(final Object o) {
        return DomainEntities.areEqual(this, o);
    }

    @Override
    public int hashCode() {
        return DomainEntities.hashCode(this);
    }

    @Override
    public boolean sameAs(final Object other) {
        return DomainEntities.areEqual(this, other);
    }

    public Long id() {
        return identity();
    }

    @Override
    public Long identity() {
        return this.m_lngID;
    }

    public String detailedView() {
        StringBuilder strBody = new StringBuilder(String.format("_______________________________________%n%n\t\t\tTicket Details:%n"));

        strBody.append(String.format("%nTicket Urgency > %s",m_oUrgency));
        strBody.append(String.format("%nLimit Date > %s", m_oLimitDate));
        strBody.append(String.format("%nCreation Date > %s", m_oCreationDate));
        strBody.append(String.format("%nCollaborator Name > %s", m_oCollaborator.shortName()));
        strBody.append(String.format("%nService Description > %s", m_oService.briefDescription()));
        strBody.append(String.format("%n%n---------------------------------------"));
        strBody.append(String.format("%n\t\tActivity Flux Execution:%n---------------------------------------%n"));
        for (TaskExecution t : m_oFluxExecution.flux()){
            strBody.append(String.format("%nTask #%d > Status: %s | Result: %s", t.identity(), t.status(), t.result()));
        }
        strBody.append(String.format("%n%n---------------------------------------"));
        strBody.append(String.format("%n\t\t\tFiles List:%n---------------------------------------%n%n"));
        for (TicketFile f : m_lstFiles) {
            strBody.append(String.format("%s\n", f.toString()));
        }
        strBody.append(String.format("%n---------------------------------------"));
        strBody.append(String.format("%n\t\t\tResponses List:%n---------------------------------------"));
        int i;
        for (Response r : m_lstResponse) {
            i = 0;
            strBody.append(String.format("%n%nForm: %s%n%n---------------------------------------%n%n", r.getForm().name()));
            for (Attribute a : r.getForm().attributes()) {
                strBody.append(String.format("- %s: %s\n", a.label(), r.getResponses().get(i)));
                i++;
            }
            strBody.append(String.format("%n---------------------------------------"));
        }
        strBody.append(String.format("%n%n"));

        return strBody.toString();
    }

    @Override
    public String toString() {
        return "Ticket Urgency: " + m_oUrgency + " | Ticket Limit Date: " + m_oLimitDate;
    }
}
