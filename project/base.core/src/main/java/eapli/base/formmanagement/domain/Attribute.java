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

import eapli.base.servicemanagement.domain.Keyword;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.domain.model.ValueObject;

import javax.persistence.*;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */

@Embeddable
public class Attribute implements ValueObject, Comparable<Attribute>{

    /**
     * cascade = CascadeType.NONE as the systemUser is part of another aggregate
     */
    @Embedded
    @Column(name = "attributeName")
    private AttributeName m_oName;

    @Embedded
    @Column(name = "attributeLabel")
    private AttributeLabel m_oLabel;

    @Embedded
    @Column(name = "attributeDescription")
    private AttributeDescription m_oDescription;

    @Embedded
    @Column(name = "attributeRegex")
    private AttributeRegex m_oRegex;

    @Embedded
    @Column(name = "attributeScriptPath")
    private AttributeScript m_oScript;

    @Enumerated(EnumType.STRING)
    @Column(name = "attributeDataType")
    private DataType m_oDataType;

    public Attribute(final AttributeName oName, final AttributeLabel oLabel, final AttributeDescription oDescription,
                     final AttributeRegex oRegex, final AttributeScript oScript, final DataType oDataType) {
        if (oName == null || oLabel == null || oDescription == null || oRegex == null || oScript == null || oDataType == null) {
            throw new IllegalArgumentException();
        }
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
    public AttributeDescription description() {
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
    public int hashCode() {
        return this.m_oName.hashCode();
    }

    @Override
    public String toString() {
        return this.m_oName.toString();
    }

    @Override
    public int compareTo(final Attribute arg0) {
        return m_oName.compareTo(arg0.m_oName);
    }
}
