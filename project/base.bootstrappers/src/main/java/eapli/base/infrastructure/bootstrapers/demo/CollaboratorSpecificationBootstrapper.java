/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.infrastructure.bootstrapers.demo;

import eapli.base.collaboratormanagement.application.CollaboratorSpecificationController;
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.collaboratormanagement.domain.CollaboratorMechanographicNumber;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.actions.Action;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.infrastructure.authz.domain.model.Role;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt e Jéssica Alves 1190682@isep.ipp.pt
 */
public class CollaboratorSpecificationBootstrapper implements Action {
    private static final Logger LOGGER = LoggerFactory.getLogger(
            CollaboratorSpecificationBootstrapper.class);

    private final CollaboratorSpecificationController m_oCtrl = new CollaboratorSpecificationController();

    @Override
    public boolean execute() {
        Set<Role> setRoles = new HashSet<>();
        setRoles.add(BaseRoles.COMMERCIAL_DIR);
        setRoles.add(BaseRoles.ADMIN);
        specifyCollaborator("doe@company.com", "John", "Doe", "John James Doe",
                123456l, "Doe Street, Number 123", "+351", 912345678d, LocalDate.of(2000,01,01),
                setRoles, null);
        setRoles.clear();
        setRoles.add(BaseRoles.HR_REP);
        specifyCollaborator("jane@company.com", "Jane", "Doe", "Jane Mary Doe",
                987654l, "Downtown Street, Number 56", "+351", 987654321d, LocalDate.of(2001, 02, 02),
                setRoles, 123456l);
        setRoles.clear();
        setRoles.add(BaseRoles.HS_MANAGER);
        specifyCollaborator("walker@company.com", "Tony", "Walker", "Tony Steven Walker",
                564821l, "Bleecker Street, Number 117", "", 955123682d, LocalDate.of(1989, 11, 11),
                setRoles, 987654l);
        return true;
    }

    private Collaborator specifyCollaborator(String strEmail, String strFirstName, String strLastName,
                                             String strCompleteName, Long lngMechanographicNumber, String strAddress,
                                             String strPhoneCode, Double dblPhoneNumber, LocalDate dtBirthDate, Set<Role> setRoles,
                                             Long lngManagerMecNumber) {
        Collaborator oCollaborator = null;
        try {
            this.m_oCtrl.addCollaborator(strEmail, strFirstName, strLastName, strCompleteName, lngMechanographicNumber, strAddress, strPhoneCode, dblPhoneNumber, dtBirthDate);
            this.m_oCtrl.addRoles(setRoles);
            Collaborator oManager = null;
            if(lngManagerMecNumber != null){
                for(Collaborator c : this.m_oCtrl.getCollaborators()){
                    if(c.hasMecNumber(CollaboratorMechanographicNumber.valueOf(lngManagerMecNumber))){
                        oManager = c;
                        break;
                    }
                }
            }
            this.m_oCtrl.addManager(oManager);
            oCollaborator = this.m_oCtrl.saveCollaborator();

        } catch (final ConcurrencyException | IntegrityViolationException e) {
            LOGGER.error("Error Specifying Collaborator.");
        }
        return oCollaborator;
    }
}
