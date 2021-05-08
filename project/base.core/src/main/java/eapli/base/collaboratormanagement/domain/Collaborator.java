package eapli.base.collaboratormanagement.domain;

import javax.persistence.*;

import eapli.base.teammanagement.domain.Team;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.Username;
import eapli.framework.strings.util.StringPredicates;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
@Entity
public class Collaborator implements AggregateRoot<CollaboratorMechanographicNumber> {

    private String m_strCollaborator;

    @Version
    private Long version;

    @EmbeddedId
    @Column(name = "mechanographicNumber")
    private CollaboratorMechanographicNumber m_oMechanographicNumber;

    /**
     * cascade = CascadeType.NONE as the systemUser is part of another aggregate
     */
    @OneToOne
    private SystemUser m_oSystemUser;

    @OneToOne
    @JoinColumn(name="manager")
    private Collaborator m_oManager;

    @Embedded
    @Column(name = "phonenNumber")
    private CollaboratorPhoneNumber m_oPhoneNumber;

    @Embedded
    @Column(name = "birthDate")
    private CollaboratorBirthDate m_oBirthDate;

    @Embedded
    @Column(name = "address")
    private CollaboratorAddress m_oAddress;

    @Embedded
    @Column(name = "completeName")
    private CollaboratorCompleteName m_oCompleteName;

    @Embedded
    @Column(name = "shortName")
    private CollaboratorShortName m_oShortName;

    @ManyToMany(mappedBy = "m_setRepresentation")
    private Set<Team> m_setTeams;


    public Collaborator(final SystemUser oSystemUser, final Collaborator oManager, final CollaboratorPhoneNumber oPhoneNumber,
                        final CollaboratorBirthDate oBirthDate, final CollaboratorAddress oAddress, final CollaboratorCompleteName oCompleteName,
                        final CollaboratorShortName oShortName, final CollaboratorMechanographicNumber oMechanographicNumber) {
        if (oSystemUser == null || oPhoneNumber == null || oBirthDate == null || oAddress == null || oCompleteName == null
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

    public Collaborator(String strCollaborator) {
        if (StringPredicates.isNullOrEmpty(strCollaborator)) {
            throw new IllegalArgumentException(
                    "Collaborator can't be null nor empty.");
        }
        // expression
        this.m_strCollaborator = strCollaborator;
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
    public CollaboratorCompleteName completeName() { return this.m_oCompleteName; }
    public CollaboratorShortName shortName() {
        return this.m_oShortName;
    }
    public SystemUser user(){return this.m_oSystemUser;}
    public Set<Team> teams(){return this.m_setTeams;}
    public void addTeam(Team oTeam) {
        this.m_setTeams.add(oTeam);
    }
    public void removeTeam(Team oTeam) {
        this.m_setTeams.remove(oTeam);
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

}
