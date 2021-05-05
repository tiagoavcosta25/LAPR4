package eapli.base.colaboradormanagement.domain;

import eapli.framework.domain.model.DomainFactory;

import javax.persistence.OneToOne;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
public class CollaboratorBuilder implements DomainFactory<Collaborator> {

    private CollaboratorID m_oID;
    private CollaboratorPhoneNumber m_oPhoneNumber;
    private CollaboratorBirthDate m_oBirthDate;
    private CollaboratorAddress m_oAddress;
    private CollaboratorCompleteName m_oCompleteName;
    private CollaboratorShortName m_oShortName;
    private CollaboratorMechanographicNumber m_oMechanographicNumber;
    private Role m_oRole;

    public CollaboratorBuilder withID(CollaboratorID oID) {
        this.m_oID = oID;
        return this;
    }

    public CollaboratorBuilder withPhoneNumber(CollaboratorPhoneNumber oPhoneNumber) {
        this.m_oPhoneNumber = oPhoneNumber;
        return this;
    }

    public CollaboratorBuilder withBirthDate(CollaboratorBirthDate oBirthDate) {
        this.m_oBirthDate = oBirthDate;
        return this;
    }

    public CollaboratorBuilder withAddress(CollaboratorAddress oAddress) {
        this.m_oAddress = oAddress;
        return this;
    }

    public CollaboratorBuilder withCompleteName(CollaboratorCompleteName oCompleteName) {
        this.m_oCompleteName = oCompleteName;
        return this;
    }

    public CollaboratorBuilder withShortName(CollaboratorShortName oShortName) {
        this.m_oShortName = oShortName;
        return this;
    }

    public CollaboratorBuilder withMechanographicNumber(CollaboratorMechanographicNumber oMechanographicNumber) {
        this.m_oMechanographicNumber = oMechanographicNumber;
        return this;
    }

    public CollaboratorBuilder withRole(Role oRole) {
        this.m_oRole = oRole;
        return this;
    }

    @Override
    public Collaborator build() {
        // since the factory knows that all the parts are needed it could throw
        // an exception. however, we will leave that to the constructor
        return new Collaborator(this.m_oID, this.m_oPhoneNumber, this.m_oBirthDate ,this.m_oAddress,
                this.m_oCompleteName, this.m_oShortName, this.m_oMechanographicNumber, this.m_oRole);
    }
}
