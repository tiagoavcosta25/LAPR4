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
package eapli.base.servicemanagement.application;

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
public class EspecificarServicoController {
    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    private final ServicoRepository servicoRepo = PersistenceContext.repositories().servicos();
    private final FormularioRepository formularioRepo = PersistenceContext.repositories().formularios();
    private ServicoBuilder servicoBuilder = new ServicoBuilder();
    private FormBuilder formBuilder = new FormBuilder();
    private AttributeBuilder attributeBuilder = new AttributeBuilder();
    private List<Keyword> m_lstKeywords = new ArrayList<>();
    private List<Attribute> m_lstAttributes = new ArrayList<>();
    private List<Form> m_lstForms = new ArrayList<>();

    public void addServico(ServicoDescricaoBreve oDescricaoBreve, ServicoDescricaoCompleta oDescricaoCompleta) {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN);

        this.servicoBuilder = this.servicoBuilder.withDescricaoBreve(oDescricaoBreve);
        this.servicoBuilder = this.servicoBuilder.withDescricaoCompleta(oDescricaoCompleta);
    }

    public void addKeyword(Keyword oKeyword) {
        this.m_lstKeywords.add(oKeyword);
    }

    public void addKeywordListToService() {
        this.servicoBuilder = this.servicoBuilder.withKeywordList(this.m_lstKeywords);
    }

    public void enableFeedback(Feedback oDuracao) {
        this.servicoBuilder = this.servicoBuilder.withFeedback(oDuracao);
    }

    public List<Catalogo> getCatalogos() {
        return null; // TODO: Falta adicionar catalogos
    }

    public void addFormulario(FormNome oNome, FormType oTipo) {
        this.formBuilder = this.formBuilder.withNome(oNome);
        this.formBuilder = this.formBuilder.withTipo(oTipo);
    }

    public void addAtributo(AttributeName oNome, AttributeLabel oLabel, AttributeDescription oDescricao,
                            AttributeRegex oRegex, AttributeScript oScript) {
        this.attributeBuilder = this.attributeBuilder.withNome(oNome);
        this.attributeBuilder = this.attributeBuilder.withLabel(oLabel);
        this.attributeBuilder = this.attributeBuilder.withDescricao(oDescricao);
        this.attributeBuilder = this.attributeBuilder.withRegex(oRegex);
        this.attributeBuilder = this.attributeBuilder.withScript(oScript);
    }

    public Attribute addTipoDados(DataType oDataType) {
        this.attributeBuilder = this.attributeBuilder.withTipoDados(oDataType);
        Attribute oAttribute = this.attributeBuilder.build();
        this.m_lstAttributes.add(oAttribute);
        return oAttribute;
    }

    public Form saveFormulario() {
        this.formBuilder = this.formBuilder.withAtributoList(this.m_lstAttributes);
        Form oForm = this.formBuilder.build();
        this.m_lstForms.add(oForm);
        this.formularioRepo.save(oForm); //TODO: Implementar metodo save
        return oForm;
    }

    public Servico saveServico() {
        this.servicoBuilder = this.servicoBuilder.withFormularioList(this.m_lstForms);
        Servico oServico = this.servicoBuilder.build();
        this.servicoRepo.save(oServico); //TODO: Implementar metodo save
        return oServico;
    }
}
