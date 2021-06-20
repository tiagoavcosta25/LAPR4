/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.infrastructure.bootstrapers.demo;

import eapli.base.formmanagement.domain.DataType;
import eapli.base.formmanagement.domain.Form;
import eapli.base.formmanagement.domain.FormType;
import eapli.base.servicemanagement.application.ServiceDraftSpecificationController;
import eapli.base.servicemanagement.domain.ServiceDraft;
import eapli.base.taskmanagement.specification.domain.ManualTask;
import eapli.base.taskmanagement.specification.domain.TaskPriority;
import eapli.framework.actions.Action;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
public class ServiceDraftTaskBootstrapper implements Action {
    private static final Logger LOGGER = LoggerFactory.getLogger(
            ServiceDraftTaskBootstrapper.class);

    private final ServiceDraftSpecificationController m_oCtrl = new ServiceDraftSpecificationController();

    @Override
    public boolean execute() {

        draftTask(true, "Approval Network", "Approval Network Form", "validate_form_script_v2",
                2, new ArrayList<>(Arrays.asList("Approval", "Notes")),
                new ArrayList<>(Arrays.asList("Approval", "Notes")),
                new ArrayList<>(Arrays.asList("Approval State", "Approval Notes")),
                new ArrayList<>(Arrays.asList("Approved|Reproved", "[a-zA-Z0-9 ]+")),
                new ArrayList<>(Arrays.asList(DataType.STRING, DataType.STRING)),
                true, "Resolution Task Network", TaskPriority.LOW,
                "Resolution Network Form", "validate_form_script_v2", 2, new ArrayList<>(Arrays.asList("Resolution", "Problems")),
                new ArrayList<>(Arrays.asList("Task Resolution", "Problems")),
                new ArrayList<>(Arrays.asList("Task Resolution Field", "Problems Encountered")),
                new ArrayList<>(Arrays.asList("Success|Error", "[a-zA-Z0-9 ]+")),
                new ArrayList<>(Arrays.asList(DataType.STRING, DataType.STRING)), null);

        return true;
    }

    private ServiceDraft draftTask(Boolean blApproval, String strApprovalDescription, String strApprovalFormName, String strApprovalValidateScript,
                                   Integer intApprovalNumAttributes, List<String> lstApprovalNames, List<String> lstApprovalLabels,
                                   List<String> lstApprovalDescriptions, List<String> lstApprovalRegex,
                                   List<DataType> lstApprovalDataType, Boolean blResolutionTask, String strDescription,
                                   TaskPriority oTaskPriority, String strFormName, String strValidateScript, Integer intNumAttributes,
                                   List<String> lstNames, List<String> lstLabels, List<String> lstDescriptions, List<String> lstRegex,
                                   List<DataType> lstDataType, String strScript) {
        ServiceDraft oServiceDraft = null;
        try {
            Iterator<ServiceDraft> itServiceDrafts = this.m_oCtrl.getDrafts().iterator();
            oServiceDraft = itServiceDrafts.next();

            this.m_oCtrl.clearForm();

            if(blApproval){
                ManualTask oApproval = manualTask(oServiceDraft, strApprovalDescription, oTaskPriority.HIGH, strApprovalFormName,
                        strApprovalValidateScript, intApprovalNumAttributes, lstApprovalNames, lstApprovalLabels, lstApprovalDescriptions,
                        lstApprovalRegex, lstApprovalDataType);

                this.m_oCtrl.approvalTask(oApproval);
            }

            if(blResolutionTask){
                manualTask(oServiceDraft, strDescription, oTaskPriority.HIGH, strFormName,
                        strValidateScript, intNumAttributes, lstNames, lstLabels, lstDescriptions,
                        lstRegex, lstDataType);
            } else{
                this.m_oCtrl.newAutoTask(strDescription, oTaskPriority.toString(), strScript);
            }

            this.m_oCtrl.addTaskToDraft();

            this.m_oCtrl.saveServiceDraft();
        } catch (final Exception e) {
            LOGGER.error("\nError Saving the Draft (Task).\n");
        }
        return oServiceDraft;
    }

    public ManualTask manualTask(ServiceDraft oServiceDraft, String strDescription,
                           TaskPriority oTaskPriority, String strFormName, String strValidateScript, Integer intNumAttributes,
                           List<String> lstNames, List<String> lstLabels, List<String> lstDescriptions, List<String> lstRegex,
                           List<DataType> lstDataType) throws IOException {
        this.m_oCtrl.clearForm();
        this.m_oCtrl.addForm(oServiceDraft, strFormName, FormType.MANUALTASK.toString(), strValidateScript);

        for(int i = 0; i < intNumAttributes; i++){
            this.m_oCtrl.addAttribute(lstNames.get(i), lstLabels.get(i), lstDescriptions.get(i), lstRegex.get(i),
                    lstDataType.get(i).toString());
        }
        Form oForm = this.m_oCtrl.saveForm();
        return this.m_oCtrl.newManualTask(strDescription, oTaskPriority.toString(), oForm);
    }
}
