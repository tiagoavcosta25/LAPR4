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
import eapli.base.taskmanagement.specification.domain.TaskPriority;
import eapli.framework.actions.Action;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

        draftTask(true, "Approval Network", true, "Resolution Task Network", TaskPriority.HIGH,
                "Resolution Network Form", "D:/folder4/script4.txt", 2, new ArrayList<>(Arrays.asList("Resolution", "Problems")),
                new ArrayList<>(Arrays.asList("Task Resolution", "Problems")),
                new ArrayList<>(Arrays.asList("Task Resolution Field", "Problems Encountered")),
                new ArrayList<>(Arrays.asList("Success|Error", "[a-zA-Z0-9]+")),
                new ArrayList<>(Arrays.asList(DataType.STRING, DataType.STRING)), null);

        return true;
    }

    private ServiceDraft draftTask(Boolean blApproval, String strApprovalDescription, Boolean blResolutionTask, String strDescription,
                                   TaskPriority oTaskPriority, String strFormName, String strValidateScript, Integer intNumAttributes,
                                   List<String> lstNames, List<String> lstLabels, List<String> lstDescriptions, List<String> lstRegex,
                                   List<DataType> lstDataType, String strScript) {
        ServiceDraft oServiceDraft = null;
        try {
            Iterator<ServiceDraft> itServiceDrafts = this.m_oCtrl.getDrafts().iterator();
            oServiceDraft = itServiceDrafts.next();

            if(blApproval){
                this.m_oCtrl.addApprovalTask(strApprovalDescription);
            }

            if(blResolutionTask){
                this.m_oCtrl.addForm(oServiceDraft, strFormName, FormType.MANUALTASK.toString(), strValidateScript);

                for(int i = 0; i < intNumAttributes; i++){
                    this.m_oCtrl.addAttribute(lstNames.get(i), lstLabels.get(i), lstDescriptions.get(i), lstRegex.get(i),
                            lstDataType.get(i).toString());
                }
                Form oForm = this.m_oCtrl.saveForm();
                this.m_oCtrl.newManualTask(strDescription, oTaskPriority.toString(), oForm);
            } else{
                this.m_oCtrl.newAutoTask(strDescription, oTaskPriority.toString(), strScript);
            }

            this.m_oCtrl.addTaskToDraft();

            this.m_oCtrl.saveServiceDraft();
        } catch (final ConcurrencyException | IntegrityViolationException e) {
            LOGGER.error("\nError Saving the Draft.\n");
        }
        return oServiceDraft;
    }
}
