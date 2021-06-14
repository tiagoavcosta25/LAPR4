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

import java.io.IOException;
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
        draftForm("Repair Form", "validate_form_script", 2, new ArrayList<>(Arrays.asList("ProductID", "CustomerNameEmail")),
                new ArrayList<>(Arrays.asList("Product ID", "Customer Name Email")),
                new ArrayList<>(Arrays.asList("ID of the product", "Email referring to the customer")),
                new ArrayList<>(Arrays.asList("[0-9]+", "[a-zA-Z]+[0-9]*@[a-z]+.[a-z]+")),
                new ArrayList<>(Arrays.asList(DataType.INTEGER, DataType.STRING)));

        draftForm("Network Form", "validate_form_script", 2, new ArrayList<>(Arrays.asList("IPAddress", "VLANID")),
                new ArrayList<>(Arrays.asList("IP Address", "VLAN ID")),
                new ArrayList<>(Arrays.asList("Address of the end node with problems", "Identification of the Virtual LAN")),
                new ArrayList<>(Arrays.asList("[0-9.]*[0-9]", "[0-9]+")),
                new ArrayList<>(Arrays.asList(DataType.STRING, DataType.INTEGER)));
        return true;
    }

    private ServiceDraft draftForm(String strFormName, String strScript, Integer intNumAttributes,
                                    List<String> lstNames, List<String> lstLabels, List<String> lstDescriptions,
                                   List<String> lstRegex, List<DataType> lstDataType) {
        ServiceDraft oServiceDraft = null;
        try {

            this.m_oCtrl.clearForm();
            Iterator<ServiceDraft> itServiceDrafts = this.m_oCtrl.getDrafts().iterator();
            oServiceDraft = itServiceDrafts.next();


            this.m_oCtrl.addForm(oServiceDraft, strFormName, FormType.SERVICE.toString(), strScript);

            for(int i = 0; i < intNumAttributes; i++){
                this.m_oCtrl.addAttribute(lstNames.get(i), lstLabels.get(i), lstDescriptions.get(i), lstRegex.get(i),
                        lstDataType.get(i).toString());
            }

            this.m_oCtrl.saveForm();
            oServiceDraft = this.m_oCtrl.addFormsToDraft();
            this.m_oCtrl.saveServiceDraft();
        } catch (final Exception e) {
            LOGGER.error("\nError Saving the Draft (Form).\n");
        }
        return oServiceDraft;
    }
}
