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
public class FormularioNome implements ValueObject, Comparable<FormularioNome> {

    private static final long serialVersionUID = 1L;

    private String m_strNome;

    public FormularioNome(final String strNome) {
        if (StringPredicates.isNullOrEmpty(strNome)) {
            throw new IllegalArgumentException(
                    "Form Name should neither be null nor empty");
        }
        // expression
        this.m_strNome = strNome;
    }

    protected FormularioNome() {
        // for ORM
    }

    public static FormularioNome valueOf(final String strNome) {
        return new FormularioNome(strNome);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FormularioNome)) {
            return false;
        }

        final FormularioNome that = (FormularioNome) o;
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
    public int compareTo(final FormularioNome arg0) {
        return m_strNome.compareTo(arg0.m_strNome);
    }
}
