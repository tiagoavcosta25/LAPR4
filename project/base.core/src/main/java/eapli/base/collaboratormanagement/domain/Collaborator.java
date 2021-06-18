package eapli.base.collaboratormanagement.domain;

import eapli.base.teammanagement.domain.Team;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
@Entity
public class Collaborator implements AggregateRoot<CollaboratorMechanographicNumber> {

    @Version
    private Long version;

    @EmbeddedId
    private CollaboratorMechanographicNumber m_oMechanographicNumber;

    /**
     * cascade = CascadeType.NONE as the systemUser is part of another aggregate
     */
    @OneToOne
    private SystemUser m_oSystemUser;

    @OneToOne
    private Collaborator m_oManager;

    @Embedded
    private CollaboratorPhoneNumber m_oPhoneNumber;

    @Embedded
    private CollaboratorBirthDate m_oBirthDate;

    @Embedded
    private CollaboratorAddress m_oAddress;

    @Embedded
    private CollaboratorCompleteName m_oCompleteName;

    @Embedded
    private CollaboratorShortName m_oShortName;

    @OneToMany(fetch = FetchType.EAGER)
    private Set<Team> m_setTeams;


    public Collaborator(final SystemUser oSystemUser, final Collaborator oManager, final CollaboratorPhoneNumber oPhoneNumber,
                        final CollaboratorBirthDate oBirthDate, final CollaboratorAddress oAddress, final CollaboratorCompleteName oCompleteName,
                        final CollaboratorShortName oShortName, final CollaboratorMechanographicNumber oMechanographicNumber) {
        if (oPhoneNumber == null || oBirthDate == null || oAddress == null || oCompleteName == null
                || oShortName == null || oMechanographicNumber == null){
            throw new IllegalArgumentException();
        }
        this.m_oSystemUser = oSystemUser;
        this.m_oManager = oManager;
        this.m_oPhoneNumber = oPhoneNumber;
        this.m_oBirthDate = oBirthDate;
        this.m_oAddress = oAddress;
        this.m_oCompleteName = oCompleteName;
        this.m_oShortName = oShortName;
        this.m_oMechanographicNumber = oMechanographicNumber;
        this.m_setTeams = new HashSet<>();
    }

    protected Collaborator() {
        // for ORM only
    }

    public CollaboratorPhoneNumber phoneNumber() {
        return this.m_oPhoneNumber;
    }
    public CollaboratorBirthDate birthDate() {
        return this.m_oBirthDate;
    }
    public CollaboratorAddress address() {
        return this.m_oAddress;
    }
    public Collaborator manager() {
        return this.m_oManager;
    }
    public CollaboratorCompleteName completeName() { return this.m_oCompleteName; }
    public CollaboratorShortName shortName() {
        return this.m_oShortName;
    }
    public SystemUser user(){return this.m_oSystemUser;}
    public Set<Team> teams(){return this.m_setTeams;}
    public void addTeam(Team oTeam) {
        if(!oTeam.representation().contains(this))
            this.m_setTeams.add(oTeam);
        else
            throw new IllegalArgumentException("Collaborator is already a representative of the team or in the team!");
    }
    public void removeTeam(Team oTeam) {
        if(this.m_setTeams.contains(oTeam)) {
            Set<Team> set = this.m_setTeams;
            set.remove(oTeam);
            this.m_setTeams = set;
        }
        else
            throw new IllegalArgumentException("Collaborator does not belong to the team and cannot be removed!");
        for (Team m_setTeam : this.m_setTeams) {
            System.out.println(m_setTeam.identity());
        }
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

    public CollaboratorMechanographicNumber id() {
        return identity();
    }

    @Override
    public CollaboratorMechanographicNumber identity() {
        return this.m_oMechanographicNumber;
    }

    public boolean hasMecNumber(CollaboratorMechanographicNumber oMecNumber) {
        return this.m_oMechanographicNumber.equals(oMecNumber);
    }
    @Override
    public String toString() {
        return "Collaborator Mechanographic Number: " + m_oMechanographicNumber + " | Name: " + m_oShortName;
    }

}
