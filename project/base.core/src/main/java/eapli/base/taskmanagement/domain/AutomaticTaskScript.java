/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.taskmanagement.domain;

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
public class AutomaticTaskScript implements ValueObject, Comparable<AutomaticTaskScript> {

    private static final long serialVersionUID = 1L;
    private static final String m_strRegex = "([a-zA-Z]:)?(/[a-zA-Z0-9_.-]+)+/[a-zA-Z0-9_.-]+.bat";

    @Column(name = "automaticTaskScriptPath")
    private String m_strScriptPath;

    public AutomaticTaskScript(final String strScriptPath) {
        if (StringPredicates.isNullOrEmpty(strScriptPath) || !strScriptPath.matches(m_strRegex)) {
            throw new IllegalArgumentException(
                    "Attribute Script should neither be null nor empty and be a valid file path");
        }
        // expression
        this.m_strScriptPath = strScriptPath;
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
    public int compareTo(final AutomaticTaskScript arg0) {
        return m_strScriptPath.compareTo(arg0.m_strScriptPath);
    }
}
