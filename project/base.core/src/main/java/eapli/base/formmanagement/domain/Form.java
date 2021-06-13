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
package eapli.base.formmanagement.domain;

import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */

@Entity
public class Form implements AggregateRoot<Long> {

    @Version
    private Long version;

    @Id
    @GeneratedValue
    @Column(name = "formID")
    private Long m_oID;

    @Embedded
    private FormName m_oName;

    @Enumerated(EnumType.STRING)
    private FormType m_oFormType;

    @Embedded
    private FormScript m_oScript;

    @ElementCollection()
    @CollectionTable(name = "attribute")
    private List<Attribute> m_lstAttributes;

    public Form(final FormName oName, final FormType oFormType, final FormScript oScript, final List<Attribute> lstAttributes) {
        if (oName == null || oFormType == null || oScript == null || lstAttributes == null || lstAttributes.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.m_oName = oName;
        this.m_oFormType = oFormType;
        this.m_oScript = oScript;
        this.m_lstAttributes = lstAttributes;
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
    public FormScript script() {
        return this.m_oScript;
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

    public Long id() {
        return identity();
    }

    @Override
    public Long identity() {
        return this.m_oID;
    }
}
