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
import eapli.base.taskmanagement.domain.ManualTask;
import eapli.base.taskmanagement.domain.TaskDescription;
import eapli.base.taskmanagement.domain.TaskPriority;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.ApplicationService;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
@ApplicationService
public class ServiceDraftSpecificationService {
    private final AuthorizationService m_oAuthz = AuthzRegistry.authorizationService();
    private AttributeBuilder attributeBuilder = new AttributeBuilder();
    private final String APPROVAL_FORM_NAME = "Approval Form";
    private final String APPROVAL_NAME = "Approval";
    private final String APPROVAL_LABEL = "Approval";
    private final String APPROVAL_DESC = "Did this service get approved or rejected";
    private final String APPROVAL_REGEX = "Approval|Rejected";
    private final String APPROVAL_SCRIPT = "D:/folder3/script3.bat";
    private final String APPROVAL_DATA = "STRING";

    public ManualTask addApprovalTask(String strDescription, Form oForm) {
        return new ManualTask(new TaskDescription(strDescription), TaskPriority.HIGH, oForm);
    }

    public Form generateApprovalForm() {
        List<Attribute> lstAttributes = new ArrayList<>();
        lstAttributes.add(this.addAttribute(APPROVAL_NAME, APPROVAL_LABEL, APPROVAL_DESC, APPROVAL_REGEX, APPROVAL_SCRIPT, APPROVAL_DATA));
        return new Form(new FormName(APPROVAL_FORM_NAME), FormType.MANUALTASK, lstAttributes);
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

        return this.attributeBuilder.build();
    }
}
