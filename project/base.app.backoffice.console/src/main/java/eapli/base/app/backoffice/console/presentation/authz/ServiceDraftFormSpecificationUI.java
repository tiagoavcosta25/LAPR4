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
package eapli.base.app.backoffice.console.presentation.authz;

import eapli.base.formulariomanagement.domain.*;
import eapli.base.servicemanagement.application.ServiceDraftSpecificationController;
import eapli.base.servicemanagement.domain.*;
import eapli.framework.actions.Actions;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class ServiceDraftFormSpecificationUI extends AbstractUI {

    private final ServiceDraftSpecificationController theController = new ServiceDraftSpecificationController();

    @Override
    protected boolean doShow() {
        try{
            ServiceDraft oServiceDraft;
            String strOp = Console.readLine("Do you want to use an existing draft? (Y/N)");

            if(strOp.compareToIgnoreCase("Y") == 0){
                Long lngID = Long.parseLong(Console.readLine("Draft ID"));
                oServiceDraft = this.theController.getServiceDraftById(lngID);
            } else{
                oServiceDraft = this.theController.newDraft();
            }

            String strFormName = Console.readLine("Form Name");

            boolean blFlag;
            do {
                blFlag = insertForm();
                this.theController.saveForm();
            } while (!blFlag);

            oServiceDraft = this.theController.addFormToDraft();

            strOp = Console.readLine("Confirm the following Service Draft(Y/N):\n\n%s" + oServiceDraft.toString() + "\n\n");

            if(strOp.compareToIgnoreCase("Y") == 0){
                oServiceDraft = this.theController.saveServiceDraft();
                System.out.printf("Service Created");
            } else{
                System.out.println("Operation Cancelled.");
            }

        } catch (Exception e){
            System.out.println("Error in creating a service.");
        }

        return false;
    }
    private boolean insertForm() {
        final String strFormName = Console.readLine("Form Name");
        FormName oFormName = new FormName(strFormName);
        final Set<FormType> lstFormType = new HashSet<>();
        showFormType(lstFormType);
        final FormType oFormType = FormType.stringToFormType(Console.readLine("Form Type"));
        this.theController.addForm(oFormName, oFormType);
        boolean blFlag;
        do {
            blFlag = insertAttribute();
        } while (!blFlag);
        String strOp = Console.readLine("Do you want to add another form to this service? (Y/N)");
        return strOp.compareToIgnoreCase("N") == 0;
    }

    private boolean showFormType(final Set<FormType> lstFormType) {
        final Menu tipoFormMenu = buildTipoFormMenu(lstFormType);
        final MenuRenderer renderer = new VerticalMenuRenderer(tipoFormMenu, MenuItemRenderer.DEFAULT);
        return renderer.render();
    }

    private Menu buildTipoFormMenu(final Set<FormType> lstFormType) {
        final Menu tipoFormMenu = new Menu();
        int counter = 0;
        tipoFormMenu.addItem(MenuItem.of(counter++, "No Tipo Form", Actions.SUCCESS));
        for (final FormType formType : this.theController.showFormTypes()) {
            tipoFormMenu.addItem(MenuItem.of(counter++, formType.toString(), () -> lstFormType.add(formType)));
        }
        return tipoFormMenu;
    }

    private boolean insertAttribute() {
        final String strAttributeName = Console.readLine("Attribute Name");
        final AttributeName oAttributeName = new AttributeName(strAttributeName);
        final String strAttributeLabel = Console.readLine("Attribute Label");
        final AttributeLabel oAttributeLabel = new AttributeLabel(strAttributeLabel);
        final String strAttributeDescription = Console.readLine("Attribute Description");
        final AttributeDescription oAttributeDescription = new AttributeDescription(strAttributeDescription);
        final String strAttributeRegex = Console.readLine("Attribute Regex");
        final AttributeRegex oAttributeRegex = new AttributeRegex(strAttributeRegex);
        final String strAttributeScript = Console.readLine("Attribute Script");
        final AttributeScript oAttributeScript = new AttributeScript(strAttributeScript);


        final Set<DataType> lstDataType = new HashSet<>();
        showDataType(lstDataType);
        final DataType oDataType = DataType.stringToDataType(Console.readLine("Data Type"));

        this.theController.addAttribute(oAttributeName, oAttributeLabel, oAttributeDescription, oAttributeRegex, oAttributeScript, oDataType);

        String strOp = Console.readLine("Do you want to add another attribute to this service? (Y/N)");
        return strOp.compareToIgnoreCase("N") == 0;
    }

    private boolean showDataType(final Set<DataType> lstTipoDados) {
        final Menu tipoDadosMenu = buildDataTypeMenu(lstTipoDados);
        final MenuRenderer renderer = new VerticalMenuRenderer(tipoDadosMenu, MenuItemRenderer.DEFAULT);
        return renderer.render();
    }

    private Menu buildDataTypeMenu(final Set<DataType> lstTipoDados) {
        final Menu tipoDadosMenu = new Menu();
        int counter = 0;
        tipoDadosMenu.addItem(MenuItem.of(counter++, "No Tipo Form", Actions.SUCCESS));
        for (final DataType dataType : this.theController.showDataTypes()) {
            tipoDadosMenu.addItem(MenuItem.of(counter++, dataType.toString(), () -> lstTipoDados.add(dataType)));
        }
        return tipoDadosMenu;
    }


    @Override
    public String headline() {
        return "Specify Service";
    }
}
