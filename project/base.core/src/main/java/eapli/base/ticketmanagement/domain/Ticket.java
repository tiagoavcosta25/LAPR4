package eapli.base.ticketmanagement.domain;

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

    @ManyToOne
    @JoinColumn(name="ServiceID")
    private Service m_oService;

    @ElementCollection()
    @CollectionTable(name = "ticketFiles")
    private List<TicketFile> m_lstFiles;

    @ElementCollection()
    @CollectionTable(name = "ticketResponses")
    private List<TicketResponse> m_lstResponses;

    public Ticket(final TicketUrgency oUrgency, final TicketLimitDate oLimitDate, final List<TicketResponse> lstResponse,
                  final List<TicketFile> lstFiles, final Service oService) {
        if (oUrgency == null || oLimitDate == null || lstFiles == null || oService == null) {
            throw new IllegalArgumentException();
        }
        this.m_oUrgency = oUrgency;
        this.m_oLimitDate = oLimitDate;
        this.m_lstResponses = lstResponse;
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
    public List<TicketResponse> responses() {
        return this.m_lstResponses;
    }
    public List<TicketFile> files() {
        return this.m_lstFiles;
    }
    public Service service() {
        return this.m_oService;
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