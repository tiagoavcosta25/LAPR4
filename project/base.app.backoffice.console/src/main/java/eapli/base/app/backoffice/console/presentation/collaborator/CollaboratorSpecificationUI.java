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

import eapli.base.app.backoffice.console.presentation.utils.PrintList;
import eapli.base.collaboratormanagement.application.CollaboratorSpecificationController;
import eapli.base.collaboratormanagement.domain.*;
import eapli.framework.infrastructure.authz.domain.model.Role;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.util.*;

/**
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
public class CollaboratorSpecificationUI extends AbstractUI {

    private static final Logger LOGGER = LogManager.getLogger(CollaboratorSpecificationUI.class);
    private final CollaboratorSpecificationController theController = new CollaboratorSpecificationController();

    @Override
    protected boolean doShow() {
        try {

            String strOption = Console.readLine("Do you want to import a Collaborator from a CSV file? (Y/N) >");

            if (strOption.compareToIgnoreCase("Y") == 0) {
                final ImportCollaboratorCSV oImport = new ImportCollaboratorCSV();
                final String strFileName = Console.readLine("File Name >");
                if(oImport.run(strFileName)){
                    LOGGER.info("Operation Successful. The Collaborator was imported successfully.\n\n");
                } else {
                    LOGGER.error("There was a error during the file importation.\n\n");
                }
            } else {

                final String strEmail = Console.readLine("Email >");
                final String strFirstName = Console.readLine("First Name >");
                final String strLastName = Console.readLine("Last Name >");
                final String strCompleteName = Console.readLine("Complete Name >");
                final String strMechanographicNumber = Console.readLine("Mechanographic Number >");
                final String strAddress = Console.readLine("Address >");
                final String strPhoneCode = Console.readLine("Phone Code >");
                final String strPhoneNumber = Console.readLine("Phone Number >");
                final Integer intYear = Integer.parseInt(Console.readLine("Birth Date (year) >"));
                final Integer intMonth = Integer.parseInt(Console.readLine("Birth Date (month) >"));
                final Integer intDay = Integer.parseInt(Console.readLine("Birth Date (day) >"));

                final LocalDate dtBirthDate = LocalDate.of(intYear, intMonth, intDay);

                this.theController.addCollaborator(strEmail, strFirstName, strLastName,
                        strCompleteName, Long.parseLong(strMechanographicNumber), strAddress, strPhoneCode,
                        Double.parseDouble(strPhoneNumber), dtBirthDate);

                List<Role> lstRoles = Arrays.asList(this.theController.getRoleList());
                lstRoles = PrintList.chooseMultiple(lstRoles, "Choose a Role for this Collaborator", "Role");
                Set<Role> setRole = new HashSet<>(lstRoles);
                this.theController.addRoles(setRole);


                Iterable<Collaborator> lstCollaborators = this.theController.getCollaborators();
                Collaborator oManager = PrintList.chooseOne(lstCollaborators, "Choose your Manager", "Manager");
                this.theController.addManager(oManager);


                String strOp = Console.readLine("Confirm the creation of this Collaborator (Y/N) >");

                if (strOp.compareToIgnoreCase("Y") == 0) {
                    Collaborator oCollaborator = this.theController.saveCollaborator();
                    LOGGER.info("Operation Successful. The Following Collaborator was created successfully > {}\n\n", oCollaborator.shortName());
                } else {
                    LOGGER.info("Operation Cancelled.");
                }
            }

            } catch(Exception e){
            LOGGER.error("Error in creating a Colaborador.");
            }

            return false;
        }

    @Override
    public String headline() {
        return "Specify Collaborator";
    }
}
