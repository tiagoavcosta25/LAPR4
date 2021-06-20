/*
 * Copyright (c) 2013-2019 the original author or authors.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package eapli.base.collaboratormanagement.application;

import eapli.base.collaboratormanagement.domain.*;
import eapli.base.collaboratormanagement.repositories.CollaboratorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.base.util.EmailSender;
import eapli.base.util.RandomRawPassword;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.application.UserManagementService;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.Role;

import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
@UseCaseController
public class CollaboratorSpecificationController {
    private final AuthorizationService m_oAuthz = AuthzRegistry.authorizationService();

    private final CollaboratorRepository m_oCollaboratorRepo = PersistenceContext.repositories().collaborators();
    private CollaboratorBuilder m_oCollaboratorBuilder = new CollaboratorBuilder();
    private final RandomRawPassword m_oRandomRawPassword = new RandomRawPassword();
    private String m_strEmail;
    private String m_strFirstName;
    private String m_strLastName;
    private Set<Role> m_setRoles;

    public void addCollaborator(String strEmail, String strFirstName, String strLastName,
                                String strCompleteName, Long lngMechanographicNumber, String strAddress,
                                String strPhoneCode, Double dblPhoneNumber, LocalDate dtBirthDate) {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN);

        this.m_oCollaboratorBuilder = this.m_oCollaboratorBuilder.withShortName(strFirstName, strLastName);
        this.m_oCollaboratorBuilder = this.m_oCollaboratorBuilder.withCompleteName(strCompleteName);
        this.m_oCollaboratorBuilder = this.m_oCollaboratorBuilder.withMechanographicNumber(lngMechanographicNumber);
        this.m_oCollaboratorBuilder = this.m_oCollaboratorBuilder.withAddress(strAddress);
        this.m_oCollaboratorBuilder = this.m_oCollaboratorBuilder.withPhoneNumber(dblPhoneNumber, strPhoneCode);
        this.m_oCollaboratorBuilder = this.m_oCollaboratorBuilder.withBirthDate(dtBirthDate);
        this.m_strEmail = strEmail;
        this.m_strFirstName = strFirstName;
        this.m_strLastName = strLastName;
    }

    public Role[] getRoleList() {
        return BaseRoles.nonUserValues();
    }

    public void addRoles(Set<Role> setRoles) {
        this.m_setRoles = setRoles;

    }

    public Iterable<Collaborator> getCollaborators() {
        return m_oCollaboratorRepo.findAll();
    }

    public void addManager(Collaborator oManager) {
        this.m_oCollaboratorBuilder = this.m_oCollaboratorBuilder.withManager(oManager);
    }

    public Collaborator saveCollaborator() {
        UserManagementService oUserService = AuthzRegistry.userService();
        String m_strUsername = this.m_strEmail.substring(0, this.m_strEmail.indexOf("@"));
        this.m_setRoles.add(BaseRoles.COLLABORATOR);
        SystemUser oSystemUser = oUserService.registerNewUser(m_strUsername, m_oRandomRawPassword.toString(), m_strFirstName,
                m_strLastName, m_strEmail, this.m_setRoles);
        this.m_oCollaboratorBuilder = this.m_oCollaboratorBuilder.withSystemUser(oSystemUser);
        Collaborator oCollaborator = this.m_oCollaboratorBuilder.build();
        this.m_oCollaboratorRepo.save(oCollaborator);
        EmailSender.send("info@helpdesk.pt", m_strEmail, "Collaborator creation.", "Your collaborator was created with success.\n" +
                "Username: " + m_strUsername + "\nPassword: "
                + m_oRandomRawPassword, m_strEmail);
        return oCollaborator;
    }


    public boolean importHistoricalTransactions(String strEmail, String strFirstName, String strLastName,
                                                String strCompleteName, Long lngMechanographicNumber,
                                                String strAddress, String strPhoneCode, Double dblPhoneNumber,
                                                LocalDate dtBirthDate, Long lngManager, Set<Role> lstRoles) {

        try {

            addCollaborator(strEmail, strFirstName, strLastName, strCompleteName, lngMechanographicNumber,
                    strAddress, strPhoneCode, dblPhoneNumber, dtBirthDate);

            addRoles(lstRoles);
            Optional<Collaborator> oM = m_oCollaboratorRepo.findByMecanographicNumber(CollaboratorMechanographicNumber.valueOf(lngManager));
            oM.ifPresent(this::addManager);

            saveCollaborator();

            return true;
        } catch (Exception e){
            return false;
        }
    }
}
