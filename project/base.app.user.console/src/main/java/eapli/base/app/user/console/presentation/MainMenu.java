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
package eapli.base.app.user.console.presentation;

import eapli.base.app.common.console.presentation.authz.MyUserMenu;
import eapli.base.app.user.console.net.dashboard.HttpAjaxDashboardRequest;
import eapli.base.app.user.console.net.dashboard.HttpServerAjaxDashboard;
import eapli.base.app.user.console.presentation.task.*;
import eapli.base.app.user.console.presentation.ticket.SearchTicketsAction;
import eapli.base.app.user.console.presentation.ticket.ServiceSolicitationAction;
import eapli.base.util.OsUtils;
import eapli.framework.actions.Actions;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.presentation.console.ExitWithMessageAction;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;

import java.io.File;

/**
 * @author Paulo Gandra Sousa
 */
class MainMenu extends ClientUserBaseUI {

    private static final String SEPARATOR_LABEL = "--------------";

    private static final String RETURN = "Return ";

    private static final String NOT_IMPLEMENTED_YET = "Not implemented yet";

    private static final int EXIT_OPTION = 0;

    // MAIN MENU
    private static final int MY_USER_OPTION = 1;
    private static final int TICKET_OPTION = 2;
    private static final int TASK_OPTION = 3;

    // TICKET MENU
    private static final int SERVICES_SOLICITATION = 1;
    private static final int SEARCH_TICKET = 2;

    // TASKS
    private static final int ASSIGN_TASKS = 1;
    private static final int EXECUTE_MANUAL_TASK = 2;
    private static final int CONSULT_PENDING_TASKS = 3;

    // SETTINGS
    private static final int SET_USER_ALERT_LIMIT_OPTION = 1;

    // HTTP SERVER
    private static final int HTTP_SERVER_PORT = 8000;

    private boolean blnHttpFlag = true;

    private final AuthorizationService authz =
            AuthzRegistry.authorizationService();

    @Override
    public boolean show() {
        drawFormTitle();

        if(blnHttpFlag){
            Runnable r = new Runnable() {
                public void run() {
                    try {
                        /*String strHomeDir = System.getProperty("user.dir") + "\\base.app.user.console\\src\\main\\java\\eapli\\base\\app\\user\\console\\net\\dashboard\\certification";
                        Process oProcess;

                        System.out.println(strHomeDir);

                        if (OsUtils.isWindows()) {
                            oProcess = Runtime.getRuntime()
                                    .exec(String.format("cmd.exe /c dir %s", strHomeDir));
                        } else {
                            oProcess = Runtime.getRuntime()
                                    .exec(String.format("sh -c ls %s", strHomeDir));
                        }

                        oProcess.waitFor();*/
                        HttpServerAjaxDashboard.main(HTTP_SERVER_PORT);
                    } catch (Exception e) {
                        //e.printStackTrace();
                    }
                }
            };
            new Thread(r).start();
            blnHttpFlag = false;
        }

        return doShow();
    }

    /**
     * @return true if the user selected the exit option
     */
    @Override
    public boolean doShow() {
        final Menu menu = buildMainMenu();
        final MenuRenderer renderer =
                new VerticalMenuRenderer(menu, MenuItemRenderer.DEFAULT);
        return renderer.render();
    }

    private Menu buildMainMenu() {
        final Menu mainMenu = new Menu();

        final Menu myUserMenu = new MyUserMenu();
        mainMenu.addSubMenu(MY_USER_OPTION, myUserMenu);

        final Menu ticketMenu = buildTicketMenu();
        mainMenu.addSubMenu(TICKET_OPTION, ticketMenu);

        final Menu taskMenu = buildTasksMenu();
        mainMenu.addSubMenu(TASK_OPTION, taskMenu);

        mainMenu.addItem(MenuItem.separator(SEPARATOR_LABEL));

        mainMenu.addItem(EXIT_OPTION, "Exit", new ExitWithMessageAction("Bye, Bye"));

        return mainMenu;
    }

    private Menu buildTicketMenu() {
        final Menu menu = new Menu("Ticket >");

        menu.addItem(SERVICES_SOLICITATION, "Service Solicitation (Ticket)", new ServiceSolicitationAction());
        menu.addItem(SEARCH_TICKET, "Search My Tickets", new SearchTicketsAction());

        menu.addItem(EXIT_OPTION, RETURN, Actions.SUCCESS);


        return menu;
    }

    private Menu buildTasksMenu() {
        final Menu menu = new Menu("Tasks >");
        menu.addItem(ASSIGN_TASKS, "Assign Task", new AssignTasksAction());
        menu.addItem(EXECUTE_MANUAL_TASK, "Execute Manual Task", new ExecuteManualTaskAction());
        menu.addItem(CONSULT_PENDING_TASKS, "Consult Pending Tasks", new ConsultAssignedPendingTaskAction());
        menu.addItem(EXIT_OPTION, RETURN, Actions.SUCCESS);
        return menu;
    }
}
