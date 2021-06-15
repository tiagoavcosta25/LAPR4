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
import eapli.base.formmanagement.domain.*;
import eapli.base.grammar.ScriptAlgorithms;
import eapli.base.taskmanagement.specification.domain.ManualTask;
import eapli.base.taskmanagement.specification.domain.Task;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.ApplicationService;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
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

    public Attribute addAttribute(String strName, String strLabel, String strDescription,
                                  String strRegex, String strDataType) {
        this.m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER);
        this.attributeBuilder = this.attributeBuilder.withName(strName);
        this.attributeBuilder = this.attributeBuilder.withLabel(strLabel);
        this.attributeBuilder = this.attributeBuilder.withDescription(strDescription);
        this.attributeBuilder = this.attributeBuilder.withRegex(strRegex);
        this.attributeBuilder = this.attributeBuilder.withDataType(strDataType);

        return this.attributeBuilder.build();
    }

    public ActivityFlux createActivityFlux(Boolean blnApprovalFlag, ManualTask oApprovalTask, Task oResolutionTask) {
        List<Task> lstFlux = new ArrayList<>();
        if(blnApprovalFlag){
            lstFlux.add(oApprovalTask);
        }
        lstFlux.add(oResolutionTask);

        return new ActivityFlux(lstFlux);
    }

    public String getScriptContent(String strScriptName, Boolean blnForm) throws IOException {
        String strPath = System.getProperty("user.dir") + "\\script\\" + strScriptName + ".txt";
        File oFile = new File(strPath);

        if(oFile.exists() && !oFile.isDirectory()) {
            if(blnForm){
                if(ScriptAlgorithms.validateForm(strPath)){
                    return FileUtils.readFileToString(oFile, StandardCharsets.UTF_8);
                }
            } else{
                if(ScriptAlgorithms.validateAutoTask(strPath)){
                    return FileUtils.readFileToString(oFile, StandardCharsets.UTF_8);
                }
            }
        }
        throw new IOException();
    }
}
