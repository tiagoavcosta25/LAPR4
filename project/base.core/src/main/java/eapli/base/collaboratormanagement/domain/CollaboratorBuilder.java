package eapli.base.collaboratormanagement.domain;

import eapli.framework.domain.model.DomainFactory;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import java.time.LocalDate;

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

    public CollaboratorBuilder withPhoneNumber(Double dbPhoneNumber, String strPhoneCode) {
        this.m_oPhoneNumber = CollaboratorPhoneNumber.valueOf(strPhoneCode, dbPhoneNumber);
        return this;
    }

    public CollaboratorBuilder withBirthDate(LocalDate dtBirthDate) {
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

    public CollaboratorBuilder withShortName(String strFirstName, String strLastName) {
        this.m_oShortName = CollaboratorShortName.valueOf(strFirstName, strLastName);
        return this;
    }

    public CollaboratorBuilder withMechanographicNumber(Long lngMechanographicNumber) {
        this.m_oMechanographicNumber = CollaboratorMechanographicNumber.valueOf(lngMechanographicNumber);
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
        return new Collaborator(this.m_oSystemUser, this.m_oManager, this.m_oPhoneNumber, this.m_oBirthDate ,this.m_oAddress,
                this.m_oCompleteName, this.m_oShortName, this.m_oMechanographicNumber);
    }
}
