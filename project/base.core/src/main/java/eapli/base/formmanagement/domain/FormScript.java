/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.formmanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.*;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
@Embeddable
public class FormScript implements ValueObject, Comparable<FormScript> {

    private static final long serialVersionUID = 1L;
    private static final String m_strRegex = "([a-zA-Z]:)?(/[a-zA-Z0-9_.-]+)+/[a-zA-Z0-9_.-]+.txt";

    @Column(name = "validateFormScriptPath")
    private String m_strScriptPath;

    @Lob
    @Column(name = "validateFormScript")
    private String m_strScript;

    public FormScript(final String strScriptPath) {
        if (StringPredicates.isNullOrEmpty(strScriptPath) || !strScriptPath.matches(m_strRegex)) {
            throw new IllegalArgumentException(
                    "Attribute Script should neither be null nor empty and be a valid file path");
        }

        // expression
        this.m_strScriptPath = strScriptPath;
    }

    protected FormScript() {
        // for ORM
    }

    public static FormScript valueOf(final String strScriptPath) {
        return new FormScript(strScriptPath);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FormScript)) {
            return false;
        }

        final FormScript that = (FormScript) o;
        return this.m_strScriptPath.equals(that.m_strScriptPath);
    }

    @Override
    public int hashCode() {
        return this.m_strScriptPath.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strScriptPath;
    }

    @Override
    public int compareTo(final FormScript arg0) {
        return m_strScriptPath.compareTo(arg0.m_strScriptPath);
    }
}
