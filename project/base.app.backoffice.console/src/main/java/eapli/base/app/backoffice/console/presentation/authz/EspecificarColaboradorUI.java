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

import eapli.base.colaboradormanagement.application.CollaboratorSpecificationController;
import eapli.base.colaboradormanagement.domain.*;
import eapli.framework.actions.Actions;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
public class EspecificarColaboradorUI extends AbstractUI {

    private final CollaboratorSpecificationController theController = new CollaboratorSpecificationController();

    @Override
    protected boolean doShow() {
        try{
            final String strNomeCurto = Console.readLine("Nome Curto");
            final String strNomeCompleto = Console.readLine("Nome Completo");
            final String strNumeroMecanografico = Console.readLine("Numero Mecanografico");
            final String strMorada = Console.readLine("Morada");
            final String strContacto = Console.readLine("Contacto");
            final String strDataNascimento = Console.readLine("Data Nascimento");

            final CollaboratorShortName oNomeCurto = new CollaboratorShortName(strNomeCurto);
            final CollaboratorCompleteName oNomeCompleto = new CollaboratorCompleteName(strNomeCompleto);
            final CollaboratorMechanographicNumber oNumeroMecanografico = new CollaboratorMechanographicNumber(strNumeroMecanografico) ;
            final CollaboratorAddress oMorada = new CollaboratorAddress(strMorada);
            final CollaboratorPhoneNumber oContacto = new CollaboratorPhoneNumber(Double.parseDouble(strContacto));
            final CollaboratorBirthDate oDataNascimento = new CollaboratorBirthDate(strDataNascimento);

            this.theController.addColaborador(oNomeCurto, oNomeCompleto, oNumeroMecanografico,
                    oMorada, oContacto, oDataNascimento);

            boolean blFlag;

            final Set<Role> lstFuncoes = new HashSet<>();
            do {
                blFlag = showFuncoes(lstFuncoes);
            } while (!blFlag);

            if(Console.readLine("Confirm the creation of the Colaborador")){
                Collaborator oCollaborator = this.theController.saveColaborador();
            } else{
                System.out.println("Operation Cancelled.");
            }

        } catch (Exception e){
            System.out.println("Error in creating a Colaborador.");
        }

        return false;
    }


    private boolean showFuncoes(final Set<Role> lstFuncoes) {
        final Menu funcoesMenu = buildfuncoesMenu(lstFuncoes);
        final MenuRenderer renderer = new VerticalMenuRenderer(lstFuncoes, MenuItemRenderer.DEFAULT);
        return renderer.render();
    }

    private Menu buildFuncoesMenu(final Set<Role> lstFuncoes) {
        final Menu funcoesMenu = new Menu();
        int counter = 0;
        funcoesMenu.addItem(MenuItem.of(counter++, "No Tipo Form", Actions.SUCCESS));
        for (final Role role : TipoForm.values()) {
            funcoesMenu.addItem(MenuItem.of(counter++, role.toString(), () -> lstFuncoes.add(role)));
        }
        return funcoesMenu;
    }


    @Override
    public String headline() {
        return "Specify Colaborator";
    }
}
