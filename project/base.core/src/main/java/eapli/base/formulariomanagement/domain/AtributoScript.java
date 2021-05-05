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
public class AtributoScript implements ValueObject, Comparable<AtributoScript> {

    private static final long serialVersionUID = 1L;

    private String m_strScript;

    public AtributoScript(final String strScript) {
        if (StringPredicates.isNullOrEmpty(strScript)) {
            throw new IllegalArgumentException(
                    "Attribute Script should neither be null nor empty");
        }
        // expression
        this.m_strScript = strScript;
    }

    protected AtributoScript() {
        // for ORM
    }

    public static AtributoScript valueOf(final String strNome) {
        return new AtributoScript(strNome);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AtributoScript)) {
            return false;
        }

        final AtributoScript that = (AtributoScript) o;
        return this.m_strScript.equals(that.m_strScript);
    }

    @Override
    public int hashCode() {
        return this.m_strScript.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strScript;
    }

    @Override
    public int compareTo(final AtributoScript arg0) {
        return m_strScript.compareTo(arg0.m_strScript);
    }
}
