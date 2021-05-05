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

import eapli.base.servicemanagement.application.EspecificarServicoController;
import eapli.framework.actions.Actions;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.infrastructure.authz.domain.model.Role;
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
public class EspecificarServicoUI extends AbstractUI {

    private final EspecificarServicoController theController = new EspecificarServicoController();

    @Override
    protected boolean doShow() {
        try{
            final String strDescricaoBreve = Console.readLine("Brief Description");
            final String strDescricaoCompleta = Console.readLine("Complete Description");

            this.theController.addServico(strDescricaoBreve, strDescricaoCompleta);

            boolean blFlag;
            do {
                blFlag = readKeywords();
            } while (!blFlag);

            this.theController.addKeywordListToService();

            if(Console.readLine("Do you want the ability to receive feedback on this service?")){
                final Double dblDuration = Console.readLine("Feedback Duration");
                this.theController.enableFeedback(dblDuration);
            }

            final Set<Catalogo> lstCatalogos = new HashSet<>();
            do {
                blFlag = showCatalogos(lstCatalogos);
            } while (!blFlag);

            do {
                blFlag = insertForm();
                this.theController.saveFormulario();
            } while (!blFlag);

            if(Console.readLine("Confirm the creation of the Service")){
                Servico oServico = this.theController.saveServico();
            } else{
                System.out.println("Operation Cancelled.");
            }

        } catch (Exception e){
            System.out.println("Error in creating a service.");
        }

        return false;
    }

    private boolean readKeywords() {
        final String strKeyword = Console.readLine("Keyword");
        this.theController.addKeyword(strKeyword);
        return Console.readLine("Do you want to add another keyword to this service?");
    }

    private boolean showCatalogos(final Set<Catalogo> lstCatalogos) {
        final Menu catalogosMenu = buildCatalogosMenu(lstCatalogos);
        final MenuRenderer renderer = new VerticalMenuRenderer(lstCatalogos, MenuItemRenderer.DEFAULT);
        return renderer.render();
    }

    private Menu buildCatalogosMenu(final Set<Catalogo> lstCatalogos) {
        final Menu catalogosMenu = new Menu();
        int counter = 0;
        catalogosMenu.addItem(MenuItem.of(counter++, "No Catalogue", Actions.SUCCESS));
        for (final Catalogo catalogo : theController.getCatalogos()) {
            catalogosMenu.addItem(MenuItem.of(counter++, catalogo.toString(), () -> lstCatalogos.add(catalogo)));
        }
        return catalogosMenu;
    }

    private boolean insertForm() {
        final String strFormName = Console.readLine("Form Name");
        final Set<TipoForm> lstTipoForm = new HashSet<>();
        final TipoForm oTipoForm = showTipoForm(lstTipoForm);
        this.theController.addFormulario(strFormName, oTipoForm);
        boolean blFlag;
        do {
            blFlag = insertAttribute();
        } while (!blFlag);
        return Console.readLine("Do you want to add another form to this service?");
    }

    private boolean showTipoForm(final Set<TipoForm> lstTipoForm) {
        final Menu tipoFormMenu = buildTipoFormMenu(lstTipoForm);
        final MenuRenderer renderer = new VerticalMenuRenderer(tipoFormMenu, MenuItemRenderer.DEFAULT);
        return renderer.render();
    }

    private Menu buildTipoFormMenu(final Set<TipoForm> lstTipoForm) {
        final Menu tipoFormMenu = new Menu();
        int counter = 0;
        tipoFormMenu.addItem(MenuItem.of(counter++, "No Tipo Form", Actions.SUCCESS));
        for (final TipoForm tipoForm : TipoForm.values()) {
            tipoFormMenu.addItem(MenuItem.of(counter++, tipoForm.toString(), () -> lstTipoForm.add(tipoForm)));
        }
        return tipoFormMenu;
    }

    private boolean insertAttribute() {
        final String strAttributeName = Console.readLine("Attribute Name");
        final String strAttributeLabel = Console.readLine("Attribute Label");
        final String strAttributeDescription = Console.readLine("Attribute Description");
        final String strAttributeRegex = Console.readLine("Attribute Regex");
        final String strAttributeScript = Console.readLine("Attribute Script");

        this.theController.addAtributo(strAttributeName, strAttributeLabel, strAttributeDescription, strAttributeRegex, strAttributeScript);

        final Set<TipoDados> lstTipoDados = new HashSet<>();
        final TipoDados oTipoDados = showTipoDados(lstTipoDados);

        this.theController.addAtributoTipo(oTipoDados);

        return Console.readLine("Do you want to add another attribute to this service?");
    }

    private boolean showTipoDados(final Set<TipoDados> lstTipoDados) {
        final Menu tipoDadosMenu = buildTipoDadosMenu(lstTipoDados);
        final MenuRenderer renderer = new VerticalMenuRenderer(tipoDadosMenu, MenuItemRenderer.DEFAULT);
        return renderer.render();
    }

    private Menu buildTipoDadosMenu(final Set<TipoDados> lstTipoDados) {
        final Menu tipoDadosMenu = new Menu();
        int counter = 0;
        tipoDadosMenu.addItem(MenuItem.of(counter++, "No Tipo Form", Actions.SUCCESS));
        for (final TipoDados tipoDados : TipoDados.values()) {
            tipoDadosMenu.addItem(MenuItem.of(counter++, tipoDados.toString(), () -> lstTipoDados.add(tipoDados)));
        }
        return tipoDadosMenu;
    }


    @Override
    public String headline() {
        return "Specify Service";
    }
}
