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
import eapli.base.formulariomanagement.domain.*;
import eapli.base.formulariomanagement.repositories.FormRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.domain.*;
import eapli.base.servicemanagement.repositories.ServiceDraftRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author losa
 */
public class ServiceDraftSpecificationController {
    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    private final ServiceDraftRepository draftRepo = PersistenceContext.repositories().serviceDrafts();
    private final FormRepository formRepo = PersistenceContext.repositories().forms();
    private FormBuilder formBuilder = new FormBuilder();
    private AttributeBuilder attributeBuilder = new AttributeBuilder();
    private List<Keyword> m_lstKeywords = new ArrayList<>();
    private List<Attribute> m_lstAttributes = new ArrayList<>();
    private List<Form> m_lstForms = new ArrayList<>();
    private ServiceDraft m_oServiceDraft = new ServiceDraft();

    public ServiceDraft getServiceDraftById(Long lngID) {
        this.m_oServiceDraft = this.draftRepo.findByID(lngID);
        return this.m_oServiceDraft;
    }

    public ServiceDraft newDraft() {
        this.m_oServiceDraft = new ServiceDraft();
        return this.m_oServiceDraft;
    }

    public List<FormType> showFormTypes() {
        return Arrays.asList(FormType.values());
    }

    public void addForm(FormName oName, FormType oType) {
        this.formBuilder = this.formBuilder.withName(oName);
        this.formBuilder = this.formBuilder.withType(oType);
    }

    public List<DataType> showDataTypes() {
        return Arrays.asList(DataType.values());
    }

    public Attribute addAttribute(AttributeName oName, AttributeLabel oLabel, AttributeDescription oDescription,
                                  AttributeRegex oRegex, AttributeScript oScript, DataType oDataType) {
        this.attributeBuilder = this.attributeBuilder.withName(oName);
        this.attributeBuilder = this.attributeBuilder.withLabel(oLabel);
        this.attributeBuilder = this.attributeBuilder.withDescription(oDescription);
        this.attributeBuilder = this.attributeBuilder.withRegex(oRegex);
        this.attributeBuilder = this.attributeBuilder.withScript(oScript);
        this.attributeBuilder = this.attributeBuilder.withDataType(oDataType);

        Attribute oAtrribute = this.attributeBuilder.build();
        this.m_lstAttributes.add(oAtrribute);
        return oAtrribute;
    }

    public Form saveForm() {
        this.formBuilder = this.formBuilder.withAttributeList(this.m_lstAttributes);
        Form oForm = this.formBuilder.build();
        this.m_lstForms.add(oForm);
        this.formRepo.save(oForm);
        return oForm;
    }

    public ServiceDraft addFormToDraft() {
        this.m_oServiceDraft.setFormList(this.m_lstForms);
        return this.m_oServiceDraft;
    }

    public ServiceDraft saveServiceDraft() {
        return this.draftRepo.save(this.m_oServiceDraft);
    }

    public void addKeywordList(List<String> keywordList) {
        this.m_oServiceDraft.setKeywordList(keywordList);
    }

    public void addTitle(String strTitle) {
        this.m_oServiceDraft.setTitle(strTitle);
    }

    public void addBriefDescription(String strBriefDescription) {
        this.m_oServiceDraft.setBriefDescription(strBriefDescription);
    }

    public void addCompleteDescription(String strCompleteDescription) {
        this.m_oServiceDraft.setCompleteDescription(strCompleteDescription);
    }

    public void addFeedback(Double dblFeedback) {
        this.m_oServiceDraft.setFeedback(dblFeedback);
    }
}
