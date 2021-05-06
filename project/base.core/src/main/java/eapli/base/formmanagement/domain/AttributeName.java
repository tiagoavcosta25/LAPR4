/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.formmanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
@Embeddable
public class AttributeName implements ValueObject, Comparable<AttributeName> {

    private static final long serialVersionUID = 1L;

    private String m_strName;

    public AttributeName(final String strName) {
        if (StringPredicates.isNullOrEmpty(strName)) {
            throw new IllegalArgumentException(
                    "Attribute Name should neither be null nor empty");
        }
        // expression
        this.m_strName = strName;
    }

    protected AttributeName() {
        // for ORM
    }

    public static AttributeName valueOf(final String strName) {
        return new AttributeName(strName);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttributeName)) {
            return false;
        }

        final AttributeName that = (AttributeName) o;
        return this.m_strName.equals(that.m_strName);
    }

    @Override
    public int hashCode() {
        return this.m_strName.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strName;
    }

    @Override
    public int compareTo(final AttributeName arg0) {
        return m_strName.compareTo(arg0.m_strName);
    }
}