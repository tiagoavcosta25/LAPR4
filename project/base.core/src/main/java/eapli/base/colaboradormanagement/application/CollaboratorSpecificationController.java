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
package eapli.base.colaboradormanagement.application;

import eapli.base.colaboradormanagement.domain.*;
import eapli.base.colaboradormanagement.repositories.CollaboratorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
public class CollaboratorSpecificationController {
    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    private final CollaboratorRepository collaboratorRepo = PersistenceContext.repositories().collaborators();
    private CollaboratorBuilder collaboratorBuilder = new CollaboratorBuilder();
    private List<Role> m_lstRoles = new ArrayList<>();

    public void addCollaborator(CollaboratorShortName oShortName, CollaboratorCompleteName oCompleteName,
                               CollaboratorMechanographicNumber oMechanographicNumber, CollaboratorAddress oAddress,
                               CollaboratorPhoneNumber oPhoneNumber, CollaboratorBirthDate oBirthDate) {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN);

        this.collaboratorBuilder = this.collaboratorBuilder.withShortName(oShortName);
        this.collaboratorBuilder = this.collaboratorBuilder.withCompleteName(oCompleteName);
        this.collaboratorBuilder = this.collaboratorBuilder.withMechanographicNumber(oMechanographicNumber);
        this.collaboratorBuilder = this.collaboratorBuilder.withAddress(oAddress);
        this.collaboratorBuilder = this.collaboratorBuilder.withPhoneNumber(oPhoneNumber);
        this.collaboratorBuilder = this.collaboratorBuilder.withBirthDate(oBirthDate);
    }

    public List<Role> getRoleList() {
        m_lstRoles = Arrays.asList(Role.values());
        return m_lstRoles;
    }

    public void addRole(Role oRole) {
        this.collaboratorBuilder = this.collaboratorBuilder.withRole(oRole);;
    }

    public Collaborator saveCollaborator() {
        Collaborator oCollaborator = this.collaboratorBuilder.build();
        this.collaboratorRepo.save(oCollaborator); //TODO: Implementar metodo save
        return oCollaborator;
    }
}
