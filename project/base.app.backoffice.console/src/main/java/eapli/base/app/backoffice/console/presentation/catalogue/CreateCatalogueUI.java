package eapli.base.app.backoffice.console.presentation.catalogue;

import eapli.base.app.backoffice.console.presentation.team.CollaboratorPrinter;
import eapli.base.app.backoffice.console.presentation.team.TeamPrinter;
import eapli.base.cataloguemanagement.application.CatalogueSpecificationController;
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.teammanagement.domain.Team;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;

import java.util.HashSet;
import java.util.Set;


public class CreateCatalogueUI extends AbstractUI {

    private final CatalogueSpecificationController theController = new CatalogueSpecificationController();

    @Override
    protected boolean doShow() {
        try {
            final String title = Console.readLine("Title:");
            final String briefDescription = Console.readLine("Brief Description:");
            final String completeDescription = Console.readLine("Complete Description:");
            final Collaborator collaborator = selectCollaborator();
            Set<Team> access = selectTeams();
            if(access.isEmpty()) {
                System.out.println("Catalogue needs atleast one team to access!");
                access = selectTeams();
            }
            String strOp = Console.readLine("Confirm the catalogue with title " + title + " creation? (Y/N) ");

            if(strOp.compareToIgnoreCase("Y") == 0){
                this.theController.createCatalog(title, briefDescription, completeDescription, collaborator,access);
                System.out.printf("Operation Successful. The Following Catalogue was created successfully > title:" +
                        " %s\tBrief Description :%s\n\n", title, briefDescription);
            } else{
                System.out.println("Operation Cancelled.");
            }
        } catch (final IllegalArgumentException ex) {
            System.out.println("Something went wrong");
        }
        return false;
    }


    private Collaborator selectCollaborator() {
        System.out.println("List of Collaborators - Select a Collaborator");
        final Iterable<Collaborator> listCollaborator = theController.getCollaborators();
        final SelectWidget<Collaborator> selectorCollaborator = new SelectWidget<>("Select a Collaborator", listCollaborator,
                new CollaboratorPrinter());
        selectorCollaborator.show();
        return selectorCollaborator.selectedElement();
    }

    private Team selectTeam() {
        System.out.println("List of Teams - Select a Team");
        final Iterable<Team> listTeams = theController.getTeams();
        final SelectWidget<Team> selectorTeam = new SelectWidget<>(" Select a Team to give access", listTeams,
                new TeamPrinter());
        selectorTeam.show();
        return selectorTeam.selectedElement();
    }

    private Set<Team> selectTeams() {
        Set<Team> setTeam = new HashSet<>();
        Team team;
        String decision = "";
        while(decision.equals("") || decision.equalsIgnoreCase("Y")) {
            team = selectTeam();
            if(!setTeam.contains(team) && team != null) {
                setTeam.add(team);
                decision = Console.readLine("Do you wish to add another Team? (Y\\N)");
            } else if(team == null && setTeam.isEmpty()) {
                System.out.println("Didn't select a team!");
            } else if(team == null) {
                break;
            } else if(setTeam.contains(team)) {
                System.out.println("Team already selected!");
            }
        }
        return setTeam;
    }



    @Override
    public String headline() {
        return "Create Catalogue";
    }
}
