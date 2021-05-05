/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.formulariomanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
@Embeddable
public class AttributeRegex implements ValueObject, Comparable<AttributeRegex> {

    private static final long serialVersionUID = 1L;

    private String m_strRegex;

    public AttributeRegex(final String strRegex) {
        if (StringPredicates.isNullOrEmpty(strRegex)) {
            throw new IllegalArgumentException(
                    "Attribute Regex should neither be null nor empty");
        }
        // expression
        this.m_strRegex = strRegex;
    }

    protected AttributeRegex() {
        // for ORM
    }

    public static AttributeRegex valueOf(final String strNome) {
        return new AttributeRegex(strNome);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttributeRegex)) {
            return false;
        }

        final AttributeRegex that = (AttributeRegex) o;
        return this.m_strRegex.equals(that.m_strRegex);
    }

    @Override
    public int hashCode() {
        return this.m_strRegex.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strRegex;
    }

    @Override
    public int compareTo(final AttributeRegex arg0) {
        return m_strRegex.compareTo(arg0.m_strRegex);
    }
}
