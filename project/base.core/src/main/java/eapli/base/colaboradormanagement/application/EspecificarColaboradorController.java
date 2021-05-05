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
package eapli.base.colaboradormanagement.application;

import eapli.base.colaboradormanagement.domain.*;
import eapli.base.colaboradormanagement.repositories.ColaboradorRepository;
import eapli.base.formulariomanagement.domain.*;
import eapli.base.formulariomanagement.repositories.FormularioRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.domain.*;
import eapli.base.servicemanagement.repositories.ServicoRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author losa
 */
public class EspecificarColaboradorController {
    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    private final ColaboradorRepository colaboradorRepo = PersistenceContext.repositories().colaboradores();
    private final FuncaoRepository funcaoRepo = PersistenceContext.repositories().funcoes();
    private ColaboradorBuilder colaboradorBuilder = new ColaboradorBuilder();
    private List<Funcao> m_lstFuncoes = new ArrayList<>();

    public void addColab(ColaboradorNomeCurto oNomeCurto, ColaboradorNomeCompleto oNomeCompleto,
                         ColaboradorNumeroMecanografico oNumeroMecanografico, ColaboradorMorada oMorada,
                         ColaboradorContacto oContacto, ColaboradorDataNascimento oDataNascimento) {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN);

        this.colaboradorBuilder = this.colaboradorBuilder.withNomeCurto(oNomeCurto);
        this.colaboradorBuilder = this.colaboradorBuilder.withNomeCompleto(oNomeCompleto);
        this.colaboradorBuilder = this.colaboradorBuilder.withNumeroMecanografico(oNumeroMecanografico);
        this.colaboradorBuilder = this.colaboradorBuilder.withMorada(oMorada);
        this.colaboradorBuilder = this.colaboradorBuilder.withDataNascimento(oDataNascimento);
    }

    public List<Funcao> getFuncaoList() {
        return m_lstFuncoes;
    }

    public void addFuncao(Funcao oFuncao) {
        this.colaboradorBuilder = this.colaboradorBuilder.withFuncao(oFuncao);;
    }

    public Colaborador saveColaborador() {
        Colaborador oColaborador = this.colaboradorBuilder.build();
        this.colaboradorRepo.save(oColaborador); //TODO: Implementar metodo save
        return oColaborador;
    }
}
