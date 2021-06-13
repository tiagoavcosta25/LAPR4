package eapli.base.ticketmanagement.domain;

import eapli.base.activityfluxmanagement.domain.ActivityFluxExecution;
import eapli.base.servicemanagement.domain.*;
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
                  final List<Response> lstResponse, final ActivityFluxExecution oFluxExecution, final List<TicketFile> lstFiles, final Service oService) {
        if (oUrgency == null || oLimitDate == null || oCreationDate == null || oFluxExecution == null || lstFiles == null || lstResponse == null ||
                oService == null || lstFiles.isEmpty() || lstResponse.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.m_oUrgency = oUrgency;
        this.m_oLimitDate = oLimitDate;
        this.m_oCreationDate = oCreationDate;
        this.m_lstResponse = lstResponse;
        this.m_oFluxExecution = oFluxExecution;
        this.m_lstFiles = lstFiles;
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
    public List<Response> responses() {
        return this.m_lstResponse;
    }
    public List<TicketFile> files() {
        return this.m_lstFiles;
    }
    public Service service() {
        return this.m_oService;
    }
    public ActivityFluxExecution executionFlux() {
        return m_oFluxExecution;
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

    @Override
    public String toString() {
        return "Ticket Urgency: " + m_oUrgency + " | Ticket Limit Date: " + m_oLimitDate;
    }
}
