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
package eapli.base.app.backoffice.console.presentation;

import eapli.base.app.backoffice.console.presentation.catalogue.*;
import eapli.base.app.backoffice.console.presentation.collaborator.*;
import eapli.base.app.backoffice.console.presentation.service.*;
import eapli.base.app.backoffice.console.presentation.teamtype.TeamTypeRegisterAction;
import eapli.base.app.backoffice.console.presentation.team.CreateTeamAction;
import eapli.base.app.backoffice.console.presentation.team.ListTeamTypeAction;
import eapli.base.app.backoffice.console.presentation.team.ListTeamsAction;
import eapli.base.app.common.console.presentation.authz.MyUserMenu;
import eapli.base.util.Application;
import eapli.base.app.backoffice.console.presentation.authz.AddUserUI;
import eapli.base.app.backoffice.console.presentation.authz.DeactivateUserAction;
import eapli.base.app.backoffice.console.presentation.authz.ListUsersAction;
import eapli.base.app.backoffice.console.presentation.clientuser.AcceptRefuseSignupRequestAction;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.actions.Actions;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.ExitWithMessageAction;
import eapli.framework.presentation.console.ShowMessageAction;
import eapli.framework.presentation.console.menu.HorizontalMenuRenderer;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;

/**
 * TODO split this class in more specialized classes for each menu
 *
 * @author Paulo Gandra Sousa
 */
public class MainMenu extends AbstractUI {

    private static final String RETURN_LABEL = "Return ";

    private static final int EXIT_OPTION = 0;

    // USERS
    private static final int ADD_USER_OPTION = 1;
    private static final int LIST_USERS_OPTION = 2;
    private static final int DEACTIVATE_USER_OPTION = 3;
    private static final int ACCEPT_REFUSE_SIGNUP_REQUEST_OPTION = 4;

    // SETTINGS
    private static final int SET_KITCHEN_ALERT_LIMIT_OPTION = 1;

    // SERVICES
    private static final int SERVICES_LIST = 1;
    private static final int SERVICES_DRAFT_LIST = 2;
    private static final int SERVICES_ADD_FIELD = 3;
    private static final int SERVICES_ADD_FORM = 4;
    private static final int SERVICES_ADD_TASK = 5;
    private static final int SERVICES_SAVE = 6;

    // CATALOGUE
    private static final int CATALOGUE_SPECIFY = 1;
    private static final int CATALOGUE_LIST = 2;
    private static final int CATALOGUE_SEARCH = 3;

    // CATALOGUE SEARCH
    private static final int CATALOGUE_SEARCH_TITLE = 1;
    private static final int CATALOGUE_SEARCH_TITLE_WORD = 2;
    private static final int CATALOGUE_SEARCH_BRIEF_DESCRIPTION = 3;
    private static final int CATALOGUE_SEARCH_BRIEF_DESCRIPTION_WORD = 4;
    private static final int CATALOGUE_SEARCH_COMPLETE_DESCRIPTION = 5;
    private static final int CATALOGUE_SEARCH_COMPLETE_DESCRIPTION_WORD = 6;
    private static final int CATALOGUE_SEARCH_TEAMS = 7;

    // COLLABORATOR
    private static final int LIST_COLLABORATORS_OPTION = 1;
    private static final int COLLABORATORS_SPECIFY = 2;
    private static final int ADD_COLLABORATOR_TO_TEAM_OPTION = 3;
    private static final int REMOVE_COLLABORATOR_FROM_TEAM_OPTION = 4;
    private static final int LIST_TEAM_FROM_COLLABORATOR = 5;

    // TEAMS
    private static final int LIST_TEAMS_OPTION = 1;
    private static final int LIST_TEAM_TYPES_OPTION = 2;
    private static final int CREATE_TEAMS_OPTION = 3;

    // TEAM TYPES
    private static final int TEAM_TYPES_REGISTRY = 1;

    // MAIN MENU
    private static final int MY_USER_OPTION = 1;
    private static final int USERS_OPTION = 2;
    private static final int SETTINGS_OPTION = 4;
    private static final int TEAMS_OPTION = 5;
    private static final int TEAM_TYPES_OPTION = 6;
    private static final int COLLABORATOR_OPTION = 7;
    private static final int CATALOGUE_OPTION = 8;
    private static final int SERVICES_OPTION = 9;
    private static final int TASKS_OPTION = 10;

    private static final String SEPARATOR_LABEL = "--------------";

    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    @Override
    public boolean show() {
        drawFormTitle();
        return doShow();
    }

    /**
     * @return true if the user selected the exit option
     */
    @Override
    public boolean doShow() {
        final Menu menu = buildMainMenu();
        final MenuRenderer renderer;
        if (Application.settings().isMenuLayoutHorizontal()) {
            renderer = new HorizontalMenuRenderer(menu, MenuItemRenderer.DEFAULT);
        } else {
            renderer = new VerticalMenuRenderer(menu, MenuItemRenderer.DEFAULT);
        }
        return renderer.render();
    }

    @Override
    public String headline() {

        return authz.session().map(s -> "Base [ @" + s.authenticatedUser().identity() + " ]")
                .orElse("Base [ ==Anonymous== ]");
    }

    private Menu buildMainMenu() {
        final Menu mainMenu = new Menu();

        final Menu myUserMenu = new MyUserMenu();
        mainMenu.addSubMenu(MY_USER_OPTION, myUserMenu);

        if (!Application.settings().isMenuLayoutHorizontal()) {
            mainMenu.addItem(MenuItem.separator(SEPARATOR_LABEL));
        }

        if (authz.isAuthenticatedUserAuthorizedTo(BaseRoles.POWER_USER, BaseRoles.ADMIN)) {
            final Menu usersMenu = buildUsersMenu();
            mainMenu.addSubMenu(USERS_OPTION, usersMenu);
            final Menu settingsMenu = buildAdminSettingsMenu();
            mainMenu.addSubMenu(SETTINGS_OPTION, settingsMenu);
        }

        if (authz.isAuthenticatedUserAuthorizedTo(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HR_REP)) {
            final Menu teamsMenu = buildTeamsMenu();
            mainMenu.addSubMenu(TEAMS_OPTION, teamsMenu);

            mainMenu.addSubMenu(TEAM_TYPES_OPTION, buildTeamTypesMenu());

            final Menu settingsMenu = buildCollaboratorsMenu();
            mainMenu.addSubMenu(COLLABORATOR_OPTION, settingsMenu);
        }
        if (authz.isAuthenticatedUserAuthorizedTo(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HS_MANAGER)) {
            final Menu teamsMenu = buildCataloguesMenu();
            mainMenu.addSubMenu(CATALOGUE_OPTION, teamsMenu);
            final Menu servicesMenu = buildServicesMenu();
            mainMenu.addSubMenu(SERVICES_OPTION, servicesMenu);
        }

        if (!Application.settings().isMenuLayoutHorizontal()) {
            mainMenu.addItem(MenuItem.separator(SEPARATOR_LABEL));
        }

        mainMenu.addItem(EXIT_OPTION, "Exit", new ExitWithMessageAction("Bye, Bye"));

        return mainMenu;
    }

    private Menu buildAdminSettingsMenu() {
        final Menu menu = new Menu("Settings >");

        menu.addItem(SET_KITCHEN_ALERT_LIMIT_OPTION, "Set kitchen alert limit",
                new ShowMessageAction("Not implemented yet"));
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildUsersMenu() {
        final Menu menu = new Menu("Users >");

        menu.addItem(ADD_USER_OPTION, "Add User", new AddUserUI()::show);
        menu.addItem(LIST_USERS_OPTION, "List all Users", new ListUsersAction());
        menu.addItem(DEACTIVATE_USER_OPTION, "Deactivate User", new DeactivateUserAction());
        menu.addItem(ACCEPT_REFUSE_SIGNUP_REQUEST_OPTION, "Accept/Refuse Signup Request",
                new AcceptRefuseSignupRequestAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildServicesMenu() {
        final Menu menu = new Menu("Services >");

        menu.addItem(SERVICES_LIST, "List Services", new ListServicesAction());
        menu.addItem(SERVICES_DRAFT_LIST, "List Service Drafts", new ListServicesDraftAction());
        menu.addItem(SERVICES_ADD_FIELD, "Add/Update Service Draft (Field)", new ServiceDraftFieldSpecificationAction());
        menu.addItem(SERVICES_ADD_FORM, "Add/Update Service Draft (Form)", new ServiceDraftFormSpecificationAction());
        menu.addItem(SERVICES_ADD_TASK, "Add/Update Service Draft (Task)", new ServiceDraftTaskSpecificationAction());
        menu.addItem(SERVICES_SAVE, "Save Service", new SaveDraftAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildCollaboratorsMenu() {
        final Menu menu = new Menu("Collaborators >");

        menu.addItem(LIST_COLLABORATORS_OPTION, "List Collaborator's", new ListCollaboratorsAction());
        menu.addItem(COLLABORATORS_SPECIFY, "Specify Collaborator", new CollaboratorSpecificationUI()::show);
        menu.addItem(ADD_COLLABORATOR_TO_TEAM_OPTION, "Add Collaborator to Team", new AddCollabToTeamAction());
        menu.addItem(REMOVE_COLLABORATOR_FROM_TEAM_OPTION, "Remove Collaborator from Team",
                new RemoveCollabFromTeamAction());
        menu.addItem(LIST_TEAM_FROM_COLLABORATOR, "List Collaborator's Team's",
                new ListCollaboratorTeamsAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildCataloguesMenu() {
        final Menu menu = new Menu("Catalogue >");

        menu.addItem(CATALOGUE_SPECIFY, "Specify Catalogue", new CreateCatologueAction());
        menu.addItem(CATALOGUE_LIST, "List Catalogues", new ListCatalogueAction());
        final Menu catalogueSearchMenu = buildCataloguesSearchMenu();
        menu.addSubMenu(CATALOGUE_SEARCH, catalogueSearchMenu);
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildCataloguesSearchMenu() {
        final Menu menu = new Menu("Catalogue Search");

        menu.addItem(CATALOGUE_SEARCH_TITLE, "Search for Catalogue by Title", new CatalogueSearchTitleAction());
        menu.addItem(CATALOGUE_SEARCH_TITLE_WORD, "Search for Catalogue by Word on Title",
                new CatalogueSearchTitleByWordAction());
        menu.addItem(CATALOGUE_SEARCH_BRIEF_DESCRIPTION, "Search for Catalogue by Brief Description",
                new CatalogueSearchBriefAction());
        menu.addItem(CATALOGUE_SEARCH_BRIEF_DESCRIPTION_WORD, "Search for Catalogue by word on Brief Description",
                new CatalogueSearchBriefByWordAction());
        menu.addItem(CATALOGUE_SEARCH_COMPLETE_DESCRIPTION, "Search for Catalogue by Complete Description",
                new CatalogueSearchCompleteAction());
        menu.addItem(CATALOGUE_SEARCH_COMPLETE_DESCRIPTION_WORD, "Search for Catalogue by word on Complete Description",
                new CatalogueSearchCompleteByWordAction());
        menu.addItem(CATALOGUE_SEARCH_TEAMS, "Search for Catalogue by a Team",
                new CatalogueSearchByTeamAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildTeamsMenu() {
        final Menu menu = new Menu("Teams >");

        menu.addItem(LIST_TEAMS_OPTION, "List all Teams", new ListTeamsAction());
        menu.addItem(LIST_TEAM_TYPES_OPTION, "List all Team types", new ListTeamTypeAction());
        menu.addItem(CREATE_TEAMS_OPTION, "Create Team", new CreateTeamAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildTeamTypesMenu() {
        final Menu menu = new Menu("Team types >");
        menu.addItem(TEAM_TYPES_REGISTRY, "Register Team Type", new TeamTypeRegisterAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);
        return menu;
    }

}
