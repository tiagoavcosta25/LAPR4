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

    public boolean run(String strFilePath) throws FileNotFoundException {
        CollaboratorSpecificationController controller = new CollaboratorSpecificationController();
        Set<Role> lstRoles = new HashSet<>();

        File file = new File(strFilePath);
        Scanner scFile = new Scanner(file);

        String line;

        line = scFile.nextLine();

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
            Integer intYear = Integer.parseInt(line.split("-")[8].trim());
            Integer intMonth = Integer.parseInt(line.split("-")[9].trim());
            Integer intDay = Integer.parseInt(line.split("-")[10].trim());
            Long lngManager = Long.parseLong(line.split(";")[11].trim());

            final LocalDate dtBirthDate = LocalDate.of(intYear, intMonth, intDay);

            for (int i = 10; i < file.length(); i++){
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
