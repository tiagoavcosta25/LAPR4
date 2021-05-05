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

import javax.persistence.*;
import java.util.List;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */

@Entity
public class Form implements AggregateRoot<FormID> {

    @Version
    private Long version;

    @GeneratedValue
    private FormID m_oID;

    /**
     * cascade = CascadeType.NONE as the systemUser is part of another aggregate
     */
    @OneToOne()
    private FormName m_oName;

    @OneToOne()
    private FormType m_oFormType;

    @OneToMany()
    private List<Attribute> m_lstAttributes;

    public Form(final FormID oID, final FormName oName, final FormType oFormType, final List<Attribute> lstAttributes) {
        if (oID == null || oName == null || oFormType == null || lstAttributes.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.m_oID = oID;
        this.m_oName = oName;
        this.m_lstAttributes = lstAttributes;
        this.m_oFormType = oFormType;
    }

    protected Form() {
        // for ORM only
    }

    public FormName name() {
        return this.m_oName;
    }
    public List<Attribute> attributes() {
        return this.m_lstAttributes;
    }
    public FormType type() {
        return this.m_oFormType;
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

    public FormID id() {
        return identity();
    }

    @Override
    public FormID identity() {
        return this.m_oID;
    }
}
