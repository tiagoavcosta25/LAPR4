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

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */

@Entity
public class Attribute implements AggregateRoot<AttributeID> {

    @Version
    private Long version;

    @Id
    @GeneratedValue
    @Column(name = "attributeID")
    private AttributeID m_oID;

    /**
     * cascade = CascadeType.NONE as the systemUser is part of another aggregate
     */
    @Embedded
    @Column(name = "name")
    private AttributeName m_oName;

    @Embedded
    @Column(name = "label")
    private AttributeLabel m_oLabel;

    @Embedded
    @Column(name = "description")
    private AttributeDescription m_oDescription;

    @Embedded
    @Column(name = "regex")
    private AttributeRegex m_oRegex;

    @Embedded
    @Column(name = "scriptPath")
    private AttributeScript m_oScript;

    @Embedded
    @Column(name = "dataType")
    private DataType m_oDataType;

    public Attribute(final AttributeID oID, final AttributeName oName, final AttributeLabel oLabel, final AttributeDescription oDescription,
                     final AttributeRegex oRegex, final AttributeScript oScript, final DataType oDataType) {
        if (oID == null || oName == null || oLabel == null || oDescription == null || oRegex == null || oScript == null || oDataType == null) {
            throw new IllegalArgumentException();
        }
        this.m_oID = oID;
        this.m_oName = oName;
        this.m_oLabel = oLabel;
        this.m_oDescription = oDescription;
        this.m_oRegex = oRegex;
        this.m_oScript = oScript;
        this.m_oDataType = oDataType;
    }

    protected Attribute() {
        // for ORM only
    }

    public AttributeName name() {
        return this.m_oName;
    }
    public AttributeLabel label() {
        return this.m_oLabel;
    }
    public AttributeDescription Description() {
        return this.m_oDescription;
    }

    public AttributeRegex regex() {
        return this.m_oRegex;
    }
    public AttributeScript script() {
        return this.m_oScript;
    }
    public DataType dataType() {
        return this.m_oDataType;
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

    public AttributeID id() {
        return identity();
    }

    @Override
    public AttributeID identity() {
        return this.m_oID;
    }
}
