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

import eapli.base.colaboradormanagement.application.CollaboratorSpecificationController;
import eapli.base.colaboradormanagement.domain.*;
import eapli.framework.actions.Actions;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
public class CollaboratorSpecificationUI extends AbstractUI {

    private final CollaboratorSpecificationController theController = new CollaboratorSpecificationController();

    @Override
    protected boolean doShow() {
        try{
            final String strEmail = Console.readLine("Email");
            final String strFirstName = Console.readLine("First Name");
            final String strLastName = Console.readLine("Last Name");
            final String strShortName = Console.readLine("Short Name");
            final String strCompleteName = Console.readLine("Complete Name");
            final String strMechanographicNumber = Console.readLine("Mechanographic Number");
            final String strAddress = Console.readLine("Address");
            final String strPhoneNumber = Console.readLine("Phone Number");
            final String strBirthDate = Console.readLine("Birth Date");

            final CollaboratorShortName oShortName = new CollaboratorShortName(strShortName);
            final CollaboratorCompleteName oCompleteName = new CollaboratorCompleteName(strCompleteName);
            final CollaboratorMechanographicNumber oMechanographicNumber = new CollaboratorMechanographicNumber(strMechanographicNumber) ;
            final CollaboratorAddress oAddress = new CollaboratorAddress(strAddress);
            final CollaboratorPhoneNumber oPhoneNumber = new CollaboratorPhoneNumber(Double.parseDouble(strPhoneNumber));
            final CollaboratorBirthDate oBirthDate = new CollaboratorBirthDate(strBirthDate);

            this.theController.addCollaborator(strEmail, strFirstName, strLastName, oShortName, oCompleteName, oMechanographicNumber,
                    oAddress, oPhoneNumber, oBirthDate);

            boolean blFlag;

            List<Role> lstRoles = new ArrayList<>();
            lstRoles = this.theController.getRoleList();

            do {
                blFlag = showRoles(lstRoles);
            } while (!blFlag);

            Console.readLine("Confirm the creation of the Colaborador");

            if(blFlag){
                Collaborator oCollaborator = this.theController.saveCollaborator();
            } else{
                System.out.println("Operation Cancelled.");
            }

        } catch (Exception e){
            System.out.println("Error in creating a Colaborador.");
        }

        return false;
    }

    private boolean showRoles(List<Role> lstRoles) {
        final Menu catalogosMenu = buildRolesMenu(lstRoles);
        final MenuRenderer renderer = new VerticalMenuRenderer(catalogosMenu, MenuItemRenderer.DEFAULT);
        return renderer.render();
    }

    private Menu buildRolesMenu(List<Role> lstRoless) {
        final Menu rolesMenu = new Menu();
        int counter = 0;
        rolesMenu.addItem(MenuItem.of(counter++, "No Role", Actions.SUCCESS));
        for (final Role role : theController.getRoleList()) {
            rolesMenu.addItem(MenuItem.of(counter++, role.toString(), () -> lstRoless.add(role)));
        }
        return rolesMenu;
    }

    @Override
    public String headline() {
        return "Specify Colaborator";
    }
}