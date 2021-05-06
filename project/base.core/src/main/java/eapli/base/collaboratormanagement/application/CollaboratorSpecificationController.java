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
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.application.UserManagementService;
import eapli.framework.infrastructure.authz.domain.model.RandomRawPassword;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.Role;

import java.util.*;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
public class CollaboratorSpecificationController {
    private final AuthorizationService m_oAuthz = AuthzRegistry.authorizationService();

    private final CollaboratorRepository m_oCollaboratorRepo = PersistenceContext.repositories().collaborators();
    private CollaboratorBuilder m_oCollaboratorBuilder = new CollaboratorBuilder();
    private RandomRawPassword m_oRandomRawPassword = new RandomRawPassword();
    private List<Collaborator> m_lstCollaborators = new ArrayList<>();
    private String m_strEmail, m_strFirstName, m_strLastName;

    public Collaborator addCollaborator(String strEmail, String strFirstName, String strLastName, String strShortName,
                                        String strCompleteName, String strMechanographicNumber, String strAddress,
                                        Double dblPhoneNumber, Date dtBirthDate) {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN);

        this.m_oCollaboratorBuilder = this.m_oCollaboratorBuilder.withShortName(strShortName);
        this.m_oCollaboratorBuilder = this.m_oCollaboratorBuilder.withCompleteName(strCompleteName);
        this.m_oCollaboratorBuilder = this.m_oCollaboratorBuilder.withMechanographicNumber(strMechanographicNumber);
        this.m_oCollaboratorBuilder = this.m_oCollaboratorBuilder.withAddress(strAddress);
        this.m_oCollaboratorBuilder = this.m_oCollaboratorBuilder.withPhoneNumber(dblPhoneNumber);
        this.m_oCollaboratorBuilder = this.m_oCollaboratorBuilder.withBirthDate(dtBirthDate);
        this.m_strEmail = strEmail;
        this.m_strFirstName = strFirstName;
        this.m_strLastName = strLastName;

        Collaborator oCollaborator = this.m_oCollaboratorBuilder.build();
        return oCollaborator;
    }

    public Role[] getRoleList() {
        return BaseRoles.nonUserValues();
    }

    public void addRoles(Set<Role> lstRoles) {
        String strRawPassword = m_oRandomRawPassword.toString();
        UserManagementService oUserService = AuthzRegistry.userService();
        String strUsername = this.m_strEmail.substring(0, this.m_strEmail.indexOf("@") - 1);
        SystemUser oSystemUser = oUserService.registerNewUser(strUsername, strRawPassword, m_strFirstName,
                m_strLastName, m_strEmail, lstRoles);
        this.m_oCollaboratorBuilder = this.m_oCollaboratorBuilder.withSystemUser(oSystemUser);

    }

    public List<Collaborator> getCollaborators() {
        m_lstCollaborators = m_oCollaboratorRepo.all();
        return m_lstCollaborators;
    }

    public void addManager(Collaborator oManager) {
        this.m_oCollaboratorBuilder = this.m_oCollaboratorBuilder.withManager(oManager);
    }

    public Collaborator saveCollaborator() {
        Collaborator oCollaborator = this.m_oCollaboratorBuilder.build();
        this.m_oCollaboratorRepo.save(oCollaborator);
        return oCollaborator;
    }
}
