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
package eapli.base.formulariomanagement.domain;

import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity
public class Atributo implements AggregateRoot<Formulario> {

    @Version
    private Long version;

    @EmbeddedId
    private AtributoID m_oID;

    /**
     * cascade = CascadeType.NONE as the systemUser is part of another aggregate
     */
    @OneToOne()
    private AtributoNome m_oNome;

    @OneToOne()
    private AtributoLabel m_oLabel;

    @OneToOne()
    private AtributoDescricao m_oDescricao;

    @OneToOne()
    private AtributoRegex m_oRegex;

    @OneToOne()
    private AtributoScript m_oScript;

    @OneToOne()
    private TipoDados m_oTipoDados;

    public Atributo(final AtributoID oID, final AtributoNome oNome, final AtributoLabel oLabel, final AtributoDescricao oDescricao,
                    final AtributoRegex oRegex, final AtributoScript oScript, final TipoDados oTipoDados) {
        if (oID == null || oNome == null || oLabel == null || oDescricao == null || oRegex == null || oScript == null || oTipoDados == null) {
            throw new IllegalArgumentException();
        }
        this.m_oID = oID;
        this.m_oNome = oNome;
        this.m_oLabel = oLabel;
        this.m_oDescricao = oDescricao;
        this.m_oRegex = oRegex;
        this.m_oScript = oScript;
        this.m_oTipoDados = oTipoDados;
    }

    protected Atributo() {
        // for ORM only
    }

    public AtributoNome name() {
        return this.m_oNome;
    }
    public AtributoLabel label() {
        return this.m_oLabel;
    }
    public AtributoDescricao descricao() {
        return this.m_oDescricao;
    }
    public AtributoRegex regex() {
        return this.m_oRegex;
    }
    public AtributoScript script() {
        return this.m_oScript;
    }
    public TipoDados user() {
        return this.m_oTipoDados;
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

    public AtributoID id() {
        return identity();
    }

    @Override
    public AtributoID identity() {
        return this.m_oID;
    }
}
