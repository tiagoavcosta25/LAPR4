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
import eapli.base.formmanagement.repositories.FormRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.domain.*;
import eapli.base.servicemanagement.repositories.ServiceDraftRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import org.springframework.dao.support.DataAccessUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
@UseCaseController
public class ServiceDraftSpecificationController {
    private final AuthorizationService m_oAuthz = AuthzRegistry.authorizationService();

    private final ServiceDraftRepository draftRepo = PersistenceContext.repositories().serviceDrafts();
    private final FormRepository formRepo = PersistenceContext.repositories().forms();
    private FormBuilder formBuilder = new FormBuilder();
    private AttributeBuilder attributeBuilder = new AttributeBuilder();
    private List<Attribute> m_lstAttributes = new ArrayList<>();
    private List<Form> m_lstForms = new ArrayList<>();
    private ServiceDraft m_oServiceDraft = new ServiceDraft();

    public Iterable<ServiceDraft> getDrafts() {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        return this.draftRepo.findAll();
    }

    public ServiceDraft newDraft() {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        this.m_oServiceDraft = new ServiceDraft();
        return this.m_oServiceDraft;
    }

    public List<FormType> showFormTypes() {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        return Arrays.asList(FormType.values());
    }

    public void addForm(ServiceDraft oServiceDraft, String strName, String strType) {
        this.m_oServiceDraft = oServiceDraft;
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        this.formBuilder = this.formBuilder.withName(strName);
        this.formBuilder = this.formBuilder.withType(strType);
    }

    public List<DataType> showDataTypes() {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        return Arrays.asList(DataType.values());
    }

    public Attribute addAttribute(String strName, String strLabel, String strDescription,
                                  String strRegex, String strScript, String strDataType) {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        this.attributeBuilder = this.attributeBuilder.withName(strName);
        this.attributeBuilder = this.attributeBuilder.withLabel(strLabel);
        this.attributeBuilder = this.attributeBuilder.withDescription(strDescription);
        this.attributeBuilder = this.attributeBuilder.withRegex(strRegex);
        this.attributeBuilder = this.attributeBuilder.withScript(strScript);
        this.attributeBuilder = this.attributeBuilder.withDataType(strDataType);

        Attribute oAttribute = this.attributeBuilder.build();
        this.m_lstAttributes.add(oAttribute);
        return oAttribute;
    }

    public Form saveForm() {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        this.formBuilder = this.formBuilder.withAttributeList(this.m_lstAttributes);
        Form oForm = this.formBuilder.build();
        oForm = this.formRepo.save(oForm);
        this.m_lstForms.add(oForm);
        return oForm;
    }

    public ServiceDraft addFormsToDraft() {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        this.m_oServiceDraft.setFormList(this.m_lstForms);
        return this.m_oServiceDraft;
    }

    public ServiceDraft saveServiceDraft() {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        return this.draftRepo.save(this.m_oServiceDraft);
    }

    public void addKeywordList(ServiceDraft oServiceDraft, List<String> keywordList) {
        this.m_oServiceDraft = oServiceDraft;
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        this.m_oServiceDraft.setKeywordList(keywordList);
    }

    public void addTitle(ServiceDraft oServiceDraft, String strTitle) {
        this.m_oServiceDraft = oServiceDraft;
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        this.m_oServiceDraft.setTitle(strTitle);
    }

    public void addBriefDescription(ServiceDraft oServiceDraft, String strBriefDescription) {
        this.m_oServiceDraft = oServiceDraft;
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        this.m_oServiceDraft.setBriefDescription(strBriefDescription);
    }

    public void addCompleteDescription(ServiceDraft oServiceDraft, String strCompleteDescription) {
        this.m_oServiceDraft = oServiceDraft;
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        this.m_oServiceDraft.setCompleteDescription(strCompleteDescription);
    }

    public void addFeedback(ServiceDraft oServiceDraft, Double dblFeedback) {
        this.m_oServiceDraft = oServiceDraft;
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        this.m_oServiceDraft.setFeedback(dblFeedback);
    }
}
