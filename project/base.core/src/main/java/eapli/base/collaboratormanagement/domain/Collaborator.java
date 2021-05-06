/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.collaboratormanagement.domain;

import javax.persistence.*;

import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
@Entity
public class Collaborator implements AggregateRoot<CollaboratorID> {

    @Version
    private Long version;

    @Id
    @GeneratedValue
    private CollaboratorID m_oID;

    /**
     * cascade = CascadeType.NONE as the systemUser is part of another aggregate
     */
    @OneToOne
    @Column(name = "user")
    private SystemUser m_oSystemUser;

    @OneToOne
    @Column(name = "manager")
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

    @Embedded
    @Column(name = "mechanographicNumber")
    private CollaboratorMechanographicNumber m_oMechanographicNumber;


    public Collaborator(final SystemUser oSystemUser, final Collaborator oManager, final CollaboratorPhoneNumber oPhoneNumber,
                        final CollaboratorBirthDate oBirthDate, final CollaboratorAddress oAddress, final CollaboratorCompleteName oCompleteName,
                        final CollaboratorShortName oShortName, final CollaboratorMechanographicNumber oMechanographicNumber) {
        if (oSystemUser == null || oManager == null || oPhoneNumber == null || oBirthDate == null || oAddress == null || oCompleteName == null
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
    public CollaboratorCompleteName completeName() { return this.m_oCompleteName; }
    public CollaboratorShortName shortName() {
        return this.m_oShortName;
    }
    public CollaboratorMechanographicNumber mechanographicNumber() {
        return this.m_oMechanographicNumber;
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

    public CollaboratorID id() {
        return identity();
    }

    @Override
    public CollaboratorID identity() {
        return this.m_oID;
    }
}
