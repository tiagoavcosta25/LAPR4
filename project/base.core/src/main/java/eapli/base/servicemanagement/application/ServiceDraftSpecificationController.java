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

import eapli.base.activityfluxmanagement.specification.domain.ActivityFlux;
import eapli.base.activityfluxmanagement.specification.repositories.ActivityFluxRepository;
import eapli.base.formmanagement.domain.*;
import eapli.base.formmanagement.repositories.FormRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.domain.*;
import eapli.base.servicemanagement.repositories.ServiceDraftRepository;
import eapli.base.taskmanagement.specification.domain.*;
import eapli.base.taskmanagement.specification.repositories.TaskRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.io.IOException;
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
    private final TaskRepository taskRepo = PersistenceContext.repositories().tasks();
    private final ActivityFluxRepository fluxRepo = PersistenceContext.repositories().fluxes();
    private FormBuilder formBuilder = new FormBuilder();
    private List<Attribute> m_lstAttributes = new ArrayList<>();
    private List<Form> m_lstForms = new ArrayList<>();
    private ServiceDraft m_oServiceDraft = new ServiceDraft();
    private ManualTask m_oApprovalTask;
    private Task m_oResolutionTask;
    private Boolean m_blnApprovalFlag = false;
    private ServiceDraftSpecificationService m_oServiceDraftSpecificationService = new ServiceDraftSpecificationService();

    public Iterable<ServiceDraft> getDrafts() {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        return this.draftRepo.findAll();
    }

    public ServiceDraft newDraft() {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        this.m_oServiceDraft = new ServiceDraft();
        return this.m_oServiceDraft;
    }

    public void addForm(ServiceDraft oServiceDraft, String strName, String strType, String strScriptName) throws IOException {
        this.m_oServiceDraft = oServiceDraft;
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        this.formBuilder = this.formBuilder.withName(strName);
        this.formBuilder = this.formBuilder.withType(strType);
        String strScriptContent = this.m_oServiceDraftSpecificationService.getScriptContent(strScriptName, true);
        this.formBuilder = this.formBuilder.withScript(strScriptContent);
    }

    public List<DataType> showDataTypes() {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        return Arrays.asList(DataType.values());
    }

    public void clearForm() {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        this.m_lstAttributes.clear();
        this.formBuilder = new FormBuilder();
    }

    public Attribute addAttribute(String strName, String strLabel, String strDescription,
                                  String strRegex, String strDataType) {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        Attribute oAttribute = this.m_oServiceDraftSpecificationService.addAttribute(strName, strLabel, strDescription, strRegex, strDataType);
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
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        this.m_oServiceDraft = oServiceDraft;
        this.m_oServiceDraft.setKeywordList(keywordList);
    }

    public void addTitle(ServiceDraft oServiceDraft, String strTitle) {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        this.m_oServiceDraft = oServiceDraft;
        this.m_oServiceDraft.setTitle(strTitle);
    }

    public void addIcon(ServiceDraft oServiceDraft, String strIcon) {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        this.m_oServiceDraft = oServiceDraft;
        this.m_oServiceDraft.setIcon(strIcon);
    }

    public void addBriefDescription(ServiceDraft oServiceDraft, String strBriefDescription) {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        this.m_oServiceDraft = oServiceDraft;
        this.m_oServiceDraft.setBriefDescription(strBriefDescription);
    }

    public void addCompleteDescription(ServiceDraft oServiceDraft, String strCompleteDescription) {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        this.m_oServiceDraft = oServiceDraft;
        this.m_oServiceDraft.setCompleteDescription(strCompleteDescription);
    }

    public void addFeedback(ServiceDraft oServiceDraft, Double dblFeedback) {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        this.m_oServiceDraft = oServiceDraft;
        this.m_oServiceDraft.setFeedback(dblFeedback);
    }

    public void chooseDraft(ServiceDraft oServiceDraft) {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        this.m_oServiceDraft = oServiceDraft;
    }

    public void approvalTask(ManualTask oApprovalTask) throws IOException {
        this.m_blnApprovalFlag = true;
        this.m_oApprovalTask = oApprovalTask;
    }

    public ManualTask saveManualTask(ManualTask oManualTask) {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        oManualTask = this.taskRepo.save(oManualTask);
        return oManualTask;
    }

    public AutomaticTask saveAutomaticTask(AutomaticTask oAutomaticTask) {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        oAutomaticTask = this.taskRepo.save(oAutomaticTask);
        return oAutomaticTask;
    }

    public ManualTask newManualTask(String strDescription, String strPriority, Form oForm) {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        ManualTask oManualTask = new ManualTask(new TaskDescription(strDescription), TaskPriority.stringToTaskPriority(strPriority), oForm);
        oManualTask = this.saveManualTask(oManualTask);
        this.m_oResolutionTask = oManualTask;
        return oManualTask;
    }

    public AutomaticTask newAutoTask(String strDescription, String strPriority, String strScriptName) throws IOException {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        String strScriptContent = this.m_oServiceDraftSpecificationService.getScriptContent(strScriptName, false);
        AutomaticTask oAutomaticTask = new AutomaticTask(new TaskDescription(strDescription), TaskPriority.stringToTaskPriority(strPriority),
                new AutomaticTaskScript(strScriptContent));
        oAutomaticTask = this.saveAutomaticTask(oAutomaticTask);
        this.m_oResolutionTask = oAutomaticTask;
        return oAutomaticTask;
    }

    public ServiceDraft addTaskToDraft() {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        ActivityFlux oActivityFlux = this.m_oServiceDraftSpecificationService.createActivityFlux(this.m_blnApprovalFlag, this.m_oApprovalTask, this.m_oResolutionTask);
        oActivityFlux = this.fluxRepo.save(oActivityFlux);
        this.m_oServiceDraft.setActivityFlux(oActivityFlux);
        return this.m_oServiceDraft;
    }

    public List<TaskPriority> showTaskPriorities() {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        return Arrays.asList(TaskPriority.values());
    }
}
