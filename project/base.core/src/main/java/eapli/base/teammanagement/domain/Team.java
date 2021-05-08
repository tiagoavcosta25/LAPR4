package eapli.base.teammanagement.domain;

import eapli.base.cataloguemanagement.domain.CatalogueID;
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.validations.Preconditions;

import javax.persistence.*;
import java.util.Set;

/**
 *
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@Entity
public class Team implements AggregateRoot<Long> {

    private static final long serialVersionUID = 1L;

    @Version
    private Long version;

    @Id
    @GeneratedValue
    @Column(name = "teamID")
    private Long m_oID;

    @Enumerated(EnumType.STRING)
    private TeamType m_enumTeamType;

    @Column(unique = true, name = "acronym")
    private Acronym m_oAcronym;

    @Column(name = "teamDescription")
    private TeamDescription m_oTeamDescription;

    @ManyToMany
    @JoinTable(
            name = "team_collaborator",
            joinColumns = @JoinColumn(name = "teamID"),
            inverseJoinColumns = @JoinColumn(name = "collaboratorID")
    )
    private Set<Collaborator> m_setRepresentation;

    public Team(TeamType enumTeamType, Acronym oAcronym, TeamDescription oTeamDescription,
                Set<Collaborator> setRepresentation) {
        Preconditions.noneNull(oAcronym, oTeamDescription, enumTeamType, setRepresentation);
        this.m_enumTeamType = enumTeamType;
        this.m_oAcronym = oAcronym;
        this.m_oTeamDescription = oTeamDescription;
        this.m_setRepresentation = setRepresentation;
    }

    protected Team() {
        //for ORM only
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
        if(!(other instanceof Team)) {
            return false;
        }

        final Team that = (Team) other;
        if(this == that) {
            return true;
        }

        return identity().equals(that.identity()) && m_oAcronym.equals(that.m_oAcronym)
                && m_oTeamDescription.equals(that.m_oTeamDescription) &&
                m_enumTeamType.equals(that.m_enumTeamType) && m_setRepresentation.equals(that.m_setRepresentation);
    }

    @Override
    public Long identity() {
        return this.m_oID;
    }

    public Long id() {
        return this.identity();
    }

    public Acronym acronym() {
        return this.acronym();
    }

    public TeamDescription teamDescription() {
        return this.teamDescription();
    }

    public TeamType teamType() {
        return this.teamType();
    }

    public Set<Collaborator> representation() {
        return this.m_setRepresentation;
    }

    public boolean hasID(Long lngID) {
        return this.m_oID.equals(lngID);
    }
}
