package eapli.base.collaboratormanagement.domain;

import eapli.framework.domain.model.DomainFactory;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import java.util.Date;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
public class CollaboratorBuilder implements DomainFactory<Collaborator> {

    private CollaboratorPhoneNumber m_oPhoneNumber;
    private CollaboratorBirthDate m_oBirthDate;
    private CollaboratorAddress m_oAddress;
    private CollaboratorCompleteName m_oCompleteName;
    private CollaboratorShortName m_oShortName;
    private CollaboratorMechanographicNumber m_oMechanographicNumber;
    private SystemUser m_oSystemUser;
    private Collaborator m_oManager;

    public CollaboratorBuilder withPhoneNumber(Double dblPhoneNumber) {
        this.m_oPhoneNumber = CollaboratorPhoneNumber.valueOf(dblPhoneNumber);
        return this;
    }

    public CollaboratorBuilder withBirthDate(Date dtBirthDate) {
        this.m_oBirthDate = CollaboratorBirthDate.valueOf(dtBirthDate);
        return this;
    }

    public CollaboratorBuilder withAddress(String strAddress) {
        this.m_oAddress = CollaboratorAddress.valueOf(strAddress);
        return this;
    }

    public CollaboratorBuilder withCompleteName(String strCompleteName) {
        this.m_oCompleteName = CollaboratorCompleteName.valueOf(strCompleteName);
        return this;
    }

    public CollaboratorBuilder withShortName(String strShortName) {
        this.m_oShortName = CollaboratorShortName.valueOf(strShortName);
        return this;
    }

    public CollaboratorBuilder withMechanographicNumber(String strMechanographicNumber) {
        this.m_oMechanographicNumber = CollaboratorMechanographicNumber.valueOf(strMechanographicNumber);
        return this;
    }

    public CollaboratorBuilder withSystemUser(SystemUser oSystemUser) {
        this.m_oSystemUser = oSystemUser;
        return this;
    }

    public CollaboratorBuilder withManager(Collaborator oManager) {
        this.m_oManager = oManager;
        return this;
    }

    @Override
    public Collaborator build() {
        // since the factory knows that all the parts are needed it could throw
        // an exception. however, we will leave that to the constructor
        return new Collaborator(this.m_oSystemUser, this.m_oManager, this.m_oPhoneNumber, this.m_oBirthDate ,this.m_oAddress,
                this.m_oCompleteName, this.m_oShortName, this.m_oMechanographicNumber);
    }
}
