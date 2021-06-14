/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.taskmanagement.specification.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.*;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
@Embeddable
@Access(AccessType.FIELD)
public class AutomaticTaskScript implements ValueObject, Comparable<AutomaticTaskScript> {

    private static final long serialVersionUID = 1L;

    @Lob
    @Column(name = "validateFormScript")
    private String m_strScriptContent;

    public AutomaticTaskScript(final String strScriptContent) {
        if (StringPredicates.isNullOrEmpty(strScriptContent)) {
            throw new IllegalArgumentException(
                    "Attribute Script should neither be null nor empty and be a valid file path");
        }
        // expression
        this.m_strScriptContent = strScriptContent;
    }

    protected AutomaticTaskScript() {
        // for ORM
    }

    public static AutomaticTaskScript valueOf(final String strScriptPath) {
        return new AutomaticTaskScript(strScriptPath);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutomaticTaskScript)) {
            return false;
        }

        final AutomaticTaskScript that = (AutomaticTaskScript) o;
        return this.m_strScriptContent.equals(that.m_strScriptContent);
    }

    @Override
    public int hashCode() {
        return this.m_strScriptContent.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strScriptContent;
    }

    @Override
    public int compareTo(final AutomaticTaskScript arg0) {
        return m_strScriptContent.compareTo(arg0.m_strScriptContent);
    }
}
