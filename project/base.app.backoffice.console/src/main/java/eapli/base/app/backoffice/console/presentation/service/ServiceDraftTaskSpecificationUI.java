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
package eapli.base.app.backoffice.console.presentation.service;

import eapli.base.app.backoffice.console.presentation.utils.PrintList;
import eapli.base.formmanagement.domain.DataType;
import eapli.base.formmanagement.domain.Form;
import eapli.base.formmanagement.domain.FormType;
import eapli.base.servicemanagement.application.ServiceDraftSpecificationController;
import eapli.base.servicemanagement.domain.ServiceDraft;
import eapli.base.taskmanagement.specification.domain.ManualTask;
import eapli.base.taskmanagement.specification.domain.TaskPriority;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class ServiceDraftTaskSpecificationUI extends AbstractUI {

    private static final Logger LOGGER = LogManager.getLogger(ServiceDraftTaskSpecificationUI.class);
    private final ServiceDraftSpecificationController theController = new ServiceDraftSpecificationController();

    @Override
    protected boolean doShow() {
        try{
            ServiceDraft oServiceDraft;
            String strOp = Console.readLine("Do you want to use an existing draft? (Y/N) >");

            if(strOp.compareToIgnoreCase("Y") == 0){
                Iterable<ServiceDraft> itDrafts = this.theController.getDrafts();
                oServiceDraft = PrintList.chooseOne(itDrafts, "Choose the Service Draft to Save", "Service Draft");
            } else{
                oServiceDraft = this.theController.newDraft();
            }

            if(oServiceDraft == null){this.theController.newDraft();}

            this.theController.chooseDraft(oServiceDraft);

            strOp = Console.readLine("Do you want this service to have approval? (Y/N) >");

            if(strOp.compareToIgnoreCase("Y") == 0){
                String strApprovalDescription = Console.readLine("Task Description? >");
                insertForm(oServiceDraft);
                Form oForm = this.theController.saveForm();
                ManualTask oApproval = this.theController.newManualTask(strApprovalDescription, TaskPriority.HIGH.toString(), oForm);


                this.theController.approvalTask(oApproval);
            }

            List<String> lstTaskTypes = new ArrayList<>(Arrays.asList("Manual Task", "Automatic Task"));
            strOp = PrintList.chooseOne(lstTaskTypes, "Choose the Type of Task for the Resolution Task", "Task Type");

            String strDescription = Console.readLine("Task Description >");

            TaskPriority oTaskPriority = PrintList.chooseOne(this.theController.showTaskPriorities(), "Choose a Priority for this Task", "Task Priority");

            if(strOp.compareToIgnoreCase("Manual Task") == 0){
                insertForm(oServiceDraft);
                Form oForm = this.theController.saveForm();
                this.theController.newManualTask(strDescription, oTaskPriority.toString(), oForm);
            } else{
                String strScript = Console.readLine("Automatic Task Script Name (present in the script folder) >");
                this.theController.newAutoTask(strDescription, oTaskPriority.toString(), strScript);
            }

            this.theController.addTaskToDraft();

            strOp = Console.readLine("Confirm the changes made on the Draft (Y/N) >");

            if(strOp.compareToIgnoreCase("Y") == 0){
                oServiceDraft = this.theController.saveServiceDraft();
                LOGGER.info("\nOperation Successful. New Draft > {}\n\n", oServiceDraft.toString());
            } else{
                LOGGER.info("\nOperation Cancelled.\n");
            }

        } catch (Exception e){
            LOGGER.error("\nError in adding tasks to a service draft.\n");
        }

        return false;
    }
    private void insertForm(ServiceDraft oServiceDraft) throws IOException {
        this.theController.clearForm();
        final String strFormName = Console.readLine("Form Name >");
        final String strScript = Console.readLine("Validation Script >");
        this.theController.addForm(oServiceDraft, strFormName.trim(), FormType.MANUALTASK.toString(), strScript);
        boolean blFlag;
        do {
            blFlag = insertAttribute();
        } while (!blFlag);
    }

    private boolean insertAttribute() {
        final String strAttributeName = Console.readLine("Attribute Name >");
        final String strAttributeLabel = Console.readLine("Attribute Label >");
        final String strAttributeDescription = Console.readLine("Attribute Description >");
        final String strAttributeRegex = Console.readLine("Attribute Regex >");


        DataType oDataType = PrintList.chooseOne(this.theController.showDataTypes(), "Choose a Data Type for this Attribute", "Data Type");

        this.theController.addAttribute(strAttributeName, strAttributeLabel, strAttributeDescription, strAttributeRegex, oDataType.toString());

        String strOp = Console.readLine("Do you want to add another attribute to this service? (Y/N) >");
        return strOp.compareToIgnoreCase("N") == 0;
    }

    @Override
    public String headline() {
        return "Service Draft Task Specification";
    }
}
