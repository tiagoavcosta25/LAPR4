/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.formmanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
@Embeddable
@Access(AccessType.FIELD)
public class AttributeLabel implements ValueObject, Comparable<AttributeLabel> {

    private static final long serialVersionUID = 1L;
    private static final String m_strRegex = "[a-zA-Z0-9 /(),]{1,50}";

    @Column(name = "attributeLabel")
    private String m_strLabel;

    public AttributeLabel(final String strLabel) {
        if (StringPredicates.isNullOrEmpty(strLabel) || !strLabel.matches(m_strRegex)) {
            throw new IllegalArgumentException(
                    "Attribute Label should neither be null, empty, contain other characters besides letters nor have more than 50 characters");
        }
        // expression
        this.m_strLabel = strLabel;
    }

    protected AttributeLabel() {
        // for ORM
    }

    public static AttributeLabel valueOf(final String strLabel) {
        return new AttributeLabel(strLabel);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttributeLabel)) {
            return false;
        }

        final AttributeLabel that = (AttributeLabel) o;
        return this.m_strLabel.equals(that.m_strLabel);
    }

    @Override
    public int hashCode() {
        return this.m_strLabel.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strLabel;
    }

    @Override
    public int compareTo(final AttributeLabel arg0) {
        return m_strLabel.compareTo(arg0.m_strLabel);
    }
}
