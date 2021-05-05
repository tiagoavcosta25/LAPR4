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
public class AtributoNome implements ValueObject, Comparable<AtributoNome> {

    private static final long serialVersionUID = 1L;

    private String m_strNome;

    public AtributoNome(final String strNome) {
        if (StringPredicates.isNullOrEmpty(strNome)) {
            throw new IllegalArgumentException(
                    "Attribute Name should neither be null nor empty");
        }
        // expression
        this.m_strNome = strNome;
    }

    protected AtributoNome() {
        // for ORM
    }

    public static AtributoNome valueOf(final String strNome) {
        return new AtributoNome(strNome);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AtributoNome)) {
            return false;
        }

        final AtributoNome that = (AtributoNome) o;
        return this.m_strNome.equals(that.m_strNome);
    }

    @Override
    public int hashCode() {
        return this.m_strNome.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strNome;
    }

    @Override
    public int compareTo(final AtributoNome arg0) {
        return m_strNome.compareTo(arg0.m_strNome);
    }
}
