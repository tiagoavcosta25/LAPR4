package eapli.base.app.backoffice.console.presentation.collaborator;

import eapli.base.collaboratormanagement.application.CollaboratorSpecificationController;
import eapli.framework.infrastructure.authz.domain.model.Role;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ImportCollaboratorCSV {

    public boolean run(String strFileName) throws FileNotFoundException {
        CollaboratorSpecificationController controller = new CollaboratorSpecificationController();
        Set<Role> lstRoles = new HashSet<>();

        File file = new File(System.getProperty("user.dir") + "\\import_files\\" + strFileName + ".txt");
        Scanner scFile = new Scanner(file);

        String line;

        while (scFile.hasNextLine()) {

            line = scFile.nextLine();

            String strEmail = line.split(";")[0].trim();
            String strFirstName = line.split(";")[1].trim();
            String strLastName = line.split(";")[2].trim();
            String strCompleteName = line.split(";")[3].trim();
            Long lngMechanographicNumber = Long.parseLong(line.split(";")[4].trim());
            String strAddress = line.split(";")[5].trim();
            String strPhoneCode = line.split(";")[6].trim();
            Double dblPhoneNumber = Double.parseDouble(line.split(";")[7].trim());
            String strDate = line.split(";")[8].trim();
            Integer intYear = Integer.parseInt(strDate.split("-")[0].trim());
            Integer intMonth = Integer.parseInt(strDate.split("-")[1].trim());
            Integer intDay = Integer.parseInt(strDate.split("-")[2].trim());
            Long lngManager = Long.parseLong(line.split(";")[9].trim());

            final LocalDate dtBirthDate = LocalDate.of(intYear, intMonth, intDay);

            for (int i = 10; i < line.split(";").length; i++){
                Role oRole = Role.valueOf(line.split(";")[i].trim());
                lstRoles.add(oRole);
            }

            if (!controller.importHistoricalTransactions(strEmail, strFirstName, strLastName, strCompleteName,
                    lngMechanographicNumber, strAddress, strPhoneCode, dblPhoneNumber, dtBirthDate, lngManager,
                    lstRoles)){
                return false;
            }
        }

        scFile.close();
        return true;
    }
}