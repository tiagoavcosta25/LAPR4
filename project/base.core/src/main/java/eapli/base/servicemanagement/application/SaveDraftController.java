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
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.domain.*;
import eapli.base.servicemanagement.repositories.ServiceDraftRepository;
import eapli.base.servicemanagement.repositories.ServiceRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.List;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class SaveDraftController {
    private final AuthorizationService m_oAuthz = AuthzRegistry.authorizationService();

    private final ServiceRepository serviceRepo = PersistenceContext.repositories().services();
    private final ServiceDraftRepository draftRepo = PersistenceContext.repositories().serviceDrafts();
    private final CatalogueRepository catalogueRepo = PersistenceContext.repositories().catalogues();
    private ServiceBuilder serviceBuilder = new ServiceBuilder();
    private ServiceDraft m_oServiceDraft = new ServiceDraft();

    public ServiceDraft getServiceDraftById(Long lngID) {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        this.m_oServiceDraft = this.draftRepo.findByID(lngID).get();
        return this.m_oServiceDraft;
    }


    public Iterable<Catalogue> getCatalogues() {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        return this.catalogueRepo.findAll();
    }

    public Catalogue getCatalogueById(Long lngID) {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        return this.catalogueRepo.findByID(lngID).get();
    }

    public Service saveService(Catalogue oCatalogue) {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        String strTitle = this.m_oServiceDraft.getTitle();
        String strBriefDescription = this.m_oServiceDraft.getBriefDescription();
        String strCompleteDescription = this.m_oServiceDraft.getCompleteDescription();
        Double dblFeedback = this.m_oServiceDraft.getFeedback();
        List<String> keywordList  = this.m_oServiceDraft.getKeywordList();
        List<Form> formList  = this.m_oServiceDraft.getFormList();

        this.serviceBuilder = this.serviceBuilder.withTitle(strTitle);
        this.serviceBuilder = this.serviceBuilder.withBriefDescription(strBriefDescription);
        this.serviceBuilder = this.serviceBuilder.withCompleteDescription(strCompleteDescription);
        this.serviceBuilder = this.serviceBuilder.withFeedback(dblFeedback);
        this.serviceBuilder = this.serviceBuilder.withCatalogue(oCatalogue);
        this.serviceBuilder = this.serviceBuilder.withKeywordList(keywordList);
        this.serviceBuilder = this.serviceBuilder.withFormList(formList);
        return this.serviceRepo.save(this.serviceBuilder.build());
    }
}
