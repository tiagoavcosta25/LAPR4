package eapli.base.app.backoffice.console.presentation.teamtype;

import eapli.base.teamtypemanagement.application.TeamTypeRegisterController;
import eapli.base.teamtypemanagement.domain.TeamType;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author João Parente 1190740@isep.ipp.pt
 */
public final class TeamTypeRegisterUI extends AbstractUI {
    private static final Logger LOGGER = LoggerFactory.getLogger(TeamTypeRegisterUI.class);

    private final TeamTypeRegisterController controller = new TeamTypeRegisterController();

    @Override
    protected boolean doShow() {
        try {
            final String id = Console.readLine("Id");
            final String description = Console.readLine("Description");
            final String color = Console.readLine("Color");

            final TeamType teamType = controller.buildTeamType(id, description, color);
            System.out.println("\nID: " + teamType.identity());
            System.out.println("Description: " + teamType.description());
            System.out.println("Color: " + teamType.color());

            String confirmationOption = Console.readLine("Confirm team type registration (Y/n):");
            if (confirmationOption.compareToIgnoreCase("Y") == 0) {
                controller.registerTeamType();
                System.out.println("\nYour team type was successfully created.");
            } else {
                System.out.println("\nOperation cancelled.");
            }
        } catch (IllegalArgumentException ex) {
            LOGGER.error(ex.getLocalizedMessage());
        } catch (Exception ex) {
            LOGGER.error(
                "Something unexpected went wrong. Your team type wasn't registered in the system."
            );
        }

        return false;
    }

    @Override
    public String headline() {
        return "Team Type registration";
    }
}
