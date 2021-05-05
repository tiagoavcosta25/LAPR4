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

import eapli.base.formulariomanagement.domain.*;
import eapli.base.servicemanagement.application.EspecificarServicoController;
import eapli.base.servicemanagement.domain.*;
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

            final ServicoDescricaoBreve oDescricaoBreve = new ServicoDescricaoBreve(strDescricaoBreve);
            final ServicoDescricaoCompleta oDescricaoCompleta = new ServicoDescricaoCompleta(strDescricaoCompleta);

            this.theController.addServico(oDescricaoBreve, oDescricaoCompleta);

            boolean blFlag;
            do {
                blFlag = readKeywords();
            } while (!blFlag);

            this.theController.addKeywordListToService();

            String strOp = Console.readLine("Do you want the ability to receive feedback on this service? (Y/N)");

            if(strOp.compareToIgnoreCase("Y") == 0){
                final Double dblDuration = Double.parseDouble(Console.readLine("Feedback Duration"));
                Feedback oFeedback = new Feedback(dblDuration);
                this.theController.enableFeedback(oFeedback);
            }

            final Set<Catalogo> lstCatalogos = new HashSet<>();
            do {
                blFlag = showCatalogos(lstCatalogos);
            } while (!blFlag);

            do {
                blFlag = insertForm();
                this.theController.saveFormulario();
            } while (!blFlag);

            strOp = Console.readLine("Confirm the creation of the Service (Y/N)");

            if(strOp.compareToIgnoreCase("Y") == 0){
                Servico oServico = this.theController.saveServico();
                System.out.printf("Created the following Service:\n\n%s\n", oServico.toString());
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
        final Keyword oKeyword = new Keyword(strKeyword);
        this.theController.addKeyword(oKeyword);
        String strOp = Console.readLine("Do you want to add another keyword to this service? (Y/N)");
        return strOp.compareToIgnoreCase("Y") == 0;
    }

    private boolean showCatalogos(final Set<Catalogo> lstCatalogos) {
        final Menu catalogosMenu = buildCatalogosMenu(lstCatalogos);
        final MenuRenderer renderer = new VerticalMenuRenderer(catalogosMenu, MenuItemRenderer.DEFAULT);
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
        FormularioNome oFormName = new FormularioNome(strFormName);
        final Set<TipoForm> lstTipoForm = new HashSet<>();
        final TipoForm oTipoForm = showTipoForm(lstTipoForm);
        this.theController.addFormulario(oFormName, oTipoForm);
        boolean blFlag;
        do {
            blFlag = insertAttribute();
        } while (!blFlag);
        String strOp = Console.readLine("Do you want to add another form to this service? (Y/N)");
        return strOp.compareToIgnoreCase("Y") == 0;
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
        final AttributeName oAttributeName = new AttributeName(strAttributeName);
        final String strAttributeLabel = Console.readLine("Attribute Label");
        final AttributeLabel oAttributeLabel = new AttributeLabel(strAttributeLabel);
        final String strAttributeDescription = Console.readLine("Attribute Description");
        final AttributeDescription oAttributeDescription = new AttributeDescription(strAttributeDescription);
        final String strAttributeRegex = Console.readLine("Attribute Regex");
        final AttributeRegex oAttributeRegex = new AttributeRegex(strAttributeRegex);
        final String strAttributeScript = Console.readLine("Attribute Script");
        final AttributeScript oAttributeScript = new AttributeScript(strAttributeScript);

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
