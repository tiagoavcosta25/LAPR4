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

import eapli.base.formmanagement.domain.*;
import eapli.base.formmanagement.repositories.formRepository;
import eapli.base.formulariomanagement.domain.Form;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.domain.*;
import eapli.base.servicemanagement.repositories.ServiceDraftRepository;
import eapli.base.servicemanagement.repositories.ServiceRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class SaveDraftController {
    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    private final ServiceRepository serviceRepo = PersistenceContext.repositories().services();
    private final ServiceDraftRepository draftRepo = PersistenceContext.repositories().serviceDrafts();
    private final CatalogueRepository catalogueRepo = PersistenceContext.repositories().catalogues();
    private ServiceBuilder serviceBuilder = new ServiceBuilder();

    public ServiceDraft getServiceDraftById(Long lngID) {
        return this.draftRepo.findByID(lngID);
    }

    public List<Catalogue> getCatalogues() {
        return this.catalogueRepo.all();
    }

    public Service saveService(ServiceDraft oServiceDraft) {
        String strTitle = oServiceDraft.getTitle();
        String strBriefDescription = oServiceDraft.getBriefDescription();
        String strCompleteDescription = oServiceDraft.getCompleteDescription();
        Double strFeedback = oServiceDraft.getFeedback();
        List<String> keywordList  = oServiceDraft.getKeywordList();
        List<Form> formList  = oServiceDraft.getFormList();

        this.serviceBuilder.withTitle(strTitle);
        this.serviceBuilder.withBriefDescription(strBriefDescription);
        this.serviceBuilder.withCompleteDescription(strCompleteDescription);
        this.serviceBuilder.withFeedback(strFeedback);
        this.serviceBuilder.withKeywordList(keywordList);
        this.serviceBuilder.withFormList(formList);
        return this.serviceRepo.save(this.serviceBuilder.build());
    }
}
