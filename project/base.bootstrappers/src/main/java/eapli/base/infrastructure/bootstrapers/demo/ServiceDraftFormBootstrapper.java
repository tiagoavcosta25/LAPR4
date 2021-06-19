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
        draftForm("Repair Form", "validate_form_script_repair", 4, new ArrayList<>(Arrays.asList("ProductID",
                "CustomerNameEmail", "Problem Date", "Purchase Date")),
                new ArrayList<>(Arrays.asList("Product ID", "Customer Name Email", "Problem Date (dd/MM/yyyy)", "Purchase Date (dd/MM/yyyy)")),
                new ArrayList<>(Arrays.asList("ID of the product", "Email referring to the customer", "Date that the Problem Occurred", "Date that the Customer Bought the Product")),
                new ArrayList<>(Arrays.asList("[0-9]+", "[a-zA-Z]+[0-9]*@[a-z]+.[a-z]+", "[0-9]{2}/[0-9]{2}/[0-9]{4}", "[0-9]{2}/[0-9]{2}/[0-9]{4}")),
                new ArrayList<>(Arrays.asList(DataType.INTEGER, DataType.STRING, DataType.DATA, DataType.DATA)));

        draftForm("Network Form", "validate_form_script_products", 3, new ArrayList<>(Arrays.asList("Product Code",
                "Quantity", "Client Type (National, European or World)")),
                new ArrayList<>(Arrays.asList("Product Code", "Quantity", "Client Type (National, European or World)")),
                new ArrayList<>(Arrays.asList("Code of the Product", "Product Quantity", "Type of the Client")),
                new ArrayList<>(Arrays.asList("[0-9a-zA-Z]+", "[0-9]+(.[0-9]{2})?", "[a-zA-Z]+")),
                new ArrayList<>(Arrays.asList(DataType.INTEGER, DataType.INTEGER, DataType.STRING)));
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
