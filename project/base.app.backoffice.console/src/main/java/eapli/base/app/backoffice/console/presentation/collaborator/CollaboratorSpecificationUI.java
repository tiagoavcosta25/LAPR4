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
package eapli.base.app.backoffice.console.presentation.collaborator;

import eapli.base.app.backoffice.console.presentation.service.PrintList;
import eapli.base.collaboratormanagement.application.CollaboratorSpecificationController;
import eapli.base.collaboratormanagement.domain.*;
import eapli.framework.actions.Actions;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.infrastructure.authz.domain.model.Role;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;

import java.text.SimpleDateFormat;
import java.util.*;

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
            final String strBirthDate = Console.readLine("Birth Date (dd/MM/yyyy)");
            final Date dtBirthDate = new SimpleDateFormat("dd/MM/yyyy").parse(strBirthDate);

            Collaborator oCollaborator = this.theController.addCollaborator(strEmail, strFirstName, strLastName, strShortName, strCompleteName,
                    strMechanographicNumber, strAddress, Double.parseDouble(strPhoneNumber), dtBirthDate);

            List<Role> lstRoles = new ArrayList<>();
            Role oRole = (Role) PrintList.chooseMultiple(lstRoles, "Choose a Role for this Collaborator", "Role");
            lstRoles.add(oRole);
            Set<Role> setRole = new HashSet<>(lstRoles);
            this.theController.addRoles(setRole); //TODO coloca os roles escolhidos na lista?


            List<Collaborator> lstCollaborators = new ArrayList<>();
            Collaborator oManager = (Collaborator) PrintList.chooseOne(lstCollaborators, "Choose your Manager", "Manager");
            this.theController.addManager(oManager);


            String strOp = Console.readLine("Confirm the creation of the following Collaborator (Y/N):\n\n%s\n" +
                    oCollaborator.toString());

            if(strOp.compareToIgnoreCase("Y") == 0){
                this.theController.saveCollaborator();
                System.out.printf("Operation Successful.");
            } else{
                System.out.println("Operation Cancelled.");
            }

        } catch (Exception e){
            System.out.println("Error in creating a Colaborador.");
        }

        return false;
    }

    private boolean showRoles(final Set<Role> lstRoles) {
        final Menu rolesMenu = buildRolesMenu(lstRoles);
        final MenuRenderer renderer = new VerticalMenuRenderer(rolesMenu, MenuItemRenderer.DEFAULT);
        return renderer.render();
    }

    private Menu buildRolesMenu(final Set<Role> lstRoles) {
        final Menu rolesMenu = new Menu();
        int counter = 0;
        rolesMenu.addItem(MenuItem.of(counter++, "No Role", Actions.SUCCESS));
        for (final Role roleType : theController.getRoleList()) {
            rolesMenu.addItem(MenuItem.of(counter++, roleType.toString(), () -> lstRoles.add(roleType)));
        }
        return rolesMenu;
    }

    private boolean showCollaborators(List<Collaborator> lstCollaborators) {
        final Menu collaboratorsMenu = buildCollaboratorsMenu(lstCollaborators);
        final MenuRenderer renderer = new VerticalMenuRenderer(collaboratorsMenu, MenuItemRenderer.DEFAULT);
        return renderer.render();
    }

    private Menu buildCollaboratorsMenu(List<Collaborator> lstCollaborators) {
        final Menu rolesMenu = new Menu();
        int counter = 0;
        rolesMenu.addItem(MenuItem.of(counter++, "No Role", Actions.SUCCESS));
        for (final Collaborator collaboratorType : theController.getCollaborators()) {
            rolesMenu.addItem(MenuItem.of(counter++, collaboratorType.toString(), () -> lstCollaborators.add(collaboratorType)));
        }
        return rolesMenu;
    }

    @Override
    public String headline() {
        return "Specify Colaborator";
    }
}
