/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.infrastructure.bootstrapers.demo;

import eapli.base.formmanagement.domain.*;
import eapli.base.servicemanagement.application.ServiceDraftSpecificationController;
import eapli.base.servicemanagement.domain.ServiceDraft;
import eapli.framework.actions.Action;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class ServiceDraftFormBootstrapper implements Action {
    private static final Logger LOGGER = LoggerFactory.getLogger(
            ServiceDraftFormBootstrapper.class);

    private final ServiceDraftSpecificationController m_oCtrl = new ServiceDraftSpecificationController();

    @Override
    public boolean execute() {
        draftForm(1l, "Mouse Repair Form", FormType.SERVICE, 2, new ArrayList<>(Arrays.asList("Product_ID", "Customer_Name_Email")),
                new ArrayList<>(Arrays.asList("Product ID", "Customer Name Email")),
                new ArrayList<>(Arrays.asList("ID of the product", "Email referring to the customer")),
                new ArrayList<>(Arrays.asList("[0-9]+", "[a-zA-Z]+[0-9]*@[a-z].[a-z]")),
                new ArrayList<>(Arrays.asList("/scripts/script1.java", "/scripts/script2.java")),
                new ArrayList<>(Arrays.asList(DataType.INTEGER, DataType.STRING)));
        return true;
    }

    private ServiceDraft draftForm(final Long lngDraftId, String strFormName, FormType oFormType, Integer intNumAttributes,
                                    List<String> lstNames, List<String> lstLabels, List<String> lstDescriptions, List<String> lstRegex,
                                    List<String> lstScripts, List<DataType> lstDataType) {
        ServiceDraft oServiceDraft = null;
        try {
            if(lngDraftId != -1) {
                oServiceDraft = this.m_oCtrl.getServiceDraftById(lngDraftId);
            } else {
                oServiceDraft = this.m_oCtrl.newDraft();
            }

            this.m_oCtrl.addForm(strFormName, oFormType.toString());

            for(int i = 0; i < intNumAttributes; i++){
                this.m_oCtrl.addAttribute(lstNames.get(i), lstLabels.get(i), lstDescriptions.get(i), lstRegex.get(i),
                        lstScripts.get(i), lstDataType.get(i).toString());
            }

            oServiceDraft = this.m_oCtrl.addFormsToDraft();
            this.m_oCtrl.saveServiceDraft();
        } catch (final ConcurrencyException | IntegrityViolationException e) {
            LOGGER.error("Error Saving the Draft.");
        }
        return oServiceDraft;
    }
}
