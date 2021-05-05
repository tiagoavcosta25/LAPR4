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

import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Version;
import java.util.List;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */

@Entity
public class Formulario implements AggregateRoot<Formulario> {

    @Version
    private Long version;

    @EmbeddedId
    private FormularioID m_oID;

    /**
     * cascade = CascadeType.NONE as the systemUser is part of another aggregate
     */
    @OneToOne()
    private FormularioNome m_oNome;

    @OneToOne()
    private TipoForm m_oTipoForm;

    @OneToMany()
    private List<Attribute> m_lstAttributes;

    public Formulario(final FormularioID oID, final FormularioNome oNome, final TipoForm oTipoForm, final List<Attribute> lstAttributes) {
        if (oID == null || oNome == null || oTipoForm == null || lstAttributes.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.m_oID = oID;
        this.m_oNome = oNome;
        this.m_lstAttributes = lstAttributes;
        this.m_oTipoForm = oTipoForm;
    }

    protected Formulario() {
        // for ORM only
    }

    public FormularioNome name() {
        return this.m_oNome;
    }
    public List<Attribute> atributos() {
        return this.m_lstAttributes;
    }
    public TipoForm tipo() {
        return this.m_oTipoForm;
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

    public FormularioID id() {
        return identity();
    }

    @Override
    public FormularioID identity() {
        return this.m_oID;
    }
}
