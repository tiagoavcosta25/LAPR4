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
import eapli.base.formmanagement.domain.Form;
import eapli.base.formmanagement.repositories.FormRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.domain.ServiceBuilder;
import eapli.base.servicemanagement.domain.ServiceDraft;
import eapli.framework.application.ApplicationService;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
@ApplicationService
public class SaveDraftService {

    private final FormRepository formRepo = PersistenceContext.repositories().forms();

    public ServiceBuilder buildService(ServiceBuilder oServiceBuilder, ServiceDraft oServiceDraft, Catalogue oCatalogue) {
        oServiceBuilder = oServiceBuilder.withTitle(oServiceDraft.getTitle());
        oServiceBuilder = oServiceBuilder.withIcon(oServiceDraft.getIcon());
        oServiceBuilder = oServiceBuilder.withBriefDescription(oServiceDraft.getBriefDescription());
        oServiceBuilder = oServiceBuilder.withCompleteDescription(oServiceDraft.getCompleteDescription());
        oServiceBuilder = oServiceBuilder.withFeedback(oServiceDraft.getFeedback());
        oServiceBuilder = oServiceBuilder.withCatalogue(oCatalogue);
        oServiceBuilder = oServiceBuilder.withKeywordList(oServiceDraft.getKeywordList());
        oServiceBuilder = oServiceBuilder.withActivityFlux(oServiceDraft.getActivityFlux());
        List<Form> formPersisted = new ArrayList<>();
        for(Form f : oServiceDraft.getFormList()){
            formPersisted.add(this.formRepo.save(f));
        }
        return oServiceBuilder.withFormList(formPersisted);
    }
}
