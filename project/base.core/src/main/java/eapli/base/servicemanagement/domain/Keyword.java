/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.servicemanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
@Embeddable
public class Keyword implements ValueObject, Comparable<Keyword> {

    private static final long serialVersionUID = 1L;
    private static final String m_strRegex = "[a-zA-Z0-9 ]+";

    private String m_strKeyword;

    public Keyword(final String strKeyword) {
        if (StringPredicates.isNullOrEmpty(strKeyword) || !strKeyword.matches(m_strRegex)) {
            throw new IllegalArgumentException(
                    "Keyword should neither be null, empty nor contain other characters besides letters.");
        }
        // expression
        this.m_strKeyword = strKeyword;
    }

    protected Keyword() {
        // for ORM
    }

    public static Keyword valueOf(final String strKeyword) {
        return new Keyword(strKeyword);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Keyword)) {
            return false;
        }

        final Keyword that = (Keyword) o;
        return this.m_strKeyword.equals(that.m_strKeyword);
    }

    @Override
    public int hashCode() {
        return this.m_strKeyword.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strKeyword;
    }

    @Override
    public int compareTo(final Keyword arg0) {
        return m_strKeyword.compareTo(arg0.m_strKeyword);
    }
}
