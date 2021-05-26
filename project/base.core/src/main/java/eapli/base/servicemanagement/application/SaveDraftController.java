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
package eapli.base.servicemanagement.application;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.repositories.CatalogueRepository;
import eapli.base.formmanagement.domain.Form;
import eapli.base.formmanagement.repositories.FormRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.domain.*;
import eapli.base.servicemanagement.repositories.ServiceDraftRepository;
import eapli.base.servicemanagement.repositories.ServiceRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
@UseCaseController
public class SaveDraftController {
    private final AuthorizationService m_oAuthz = AuthzRegistry.authorizationService();

    private final ServiceRepository serviceRepo = PersistenceContext.repositories().services();
    private final ServiceDraftRepository draftRepo = PersistenceContext.repositories().serviceDrafts();
    private final CatalogueRepository catalogueRepo = PersistenceContext.repositories().catalogues();
    private ServiceBuilder serviceBuilder = new ServiceBuilder();
    private ServiceDraft m_oServiceDraft = new ServiceDraft();
    private SaveDraftService m_oSaveDraftService = new SaveDraftService();

    public Iterable<ServiceDraft> getDrafts() {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        return this.draftRepo.findAll();
    }
    public Iterable<Catalogue> getCatalogues() {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        return this.catalogueRepo.findAll();
    }

    public Service saveService(ServiceDraft oServiceDraft, Catalogue oCatalogue) {
        this.m_oServiceDraft = oServiceDraft;
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);

        this.serviceBuilder = this.m_oSaveDraftService.buildService(this.serviceBuilder, this.m_oServiceDraft, oCatalogue);
        this.draftRepo.delete(this.m_oServiceDraft);
        Service oService = this.serviceRepo.save(this.serviceBuilder.build());
        return oService;
    }
}
