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
package eapli.base.servicemanagement.domain;

import eapli.base.formulariomanagement.domain.*;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Version;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */

@Entity
public class Servico implements AggregateRoot<Servico> {

    @Version
    private Long version;

    @EmbeddedId
    private ServicoID m_oID;

    /**
     * cascade = CascadeType.NONE as the systemUser is part of another aggregate
     */
    @OneToOne()
    private ServicoDescricaoBreve m_oDescricaoBreve;

    @OneToOne()
    private ServicoDescricaoCompleta m_oDescricaoCompleta;

    @OneToMany()
    private List<Keyword> m_lstKeywords;

    @OneToMany()
    private List<Formulario> m_lstFormularios;

    public Servico(final ServicoID oID, final ServicoDescricaoBreve oDescricaoBreve, final ServicoDescricaoCompleta oDescricaoCompleta,
                   final List<Keyword> lstKeywords, final List<Formulario> lstFormularios) {
        if (oID == null || oDescricaoBreve == null || oDescricaoCompleta == null || lstKeywords.isEmpty() || lstFormularios.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.m_oID = oID;
        this.m_oDescricaoBreve = oDescricaoBreve;
        this.m_oDescricaoCompleta = oDescricaoCompleta;
        this.m_lstKeywords = lstKeywords;
        this.m_lstFormularios = lstFormularios;
    }

    protected Servico() {
        // for ORM only
    }

    public ServicoDescricaoBreve descricaoBreve() {
        return this.m_oDescricaoBreve;
    }
    public List<Keyword> keywords() {
        return this.m_lstKeywords;
    }
    public List<Formulario> formularios() {
        return this.m_lstFormularios;
    }

    @Override
    public boolean equals(final Object o) {
        return DomainEntities.areEqual(this, o);
    }

    @Override
    public int hashCode() {
        return DomainEntities.hashCode(this);
    }

    @Override
    public boolean sameAs(final Object other) {
        return DomainEntities.areEqual(this, other);
    }

    public ServicoID id() {
        return identity();
    }

    @Override
    public ServicoID identity() {
        return this.m_oID;
    }
}
