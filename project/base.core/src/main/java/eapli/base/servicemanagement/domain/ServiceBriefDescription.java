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
public class ServicoDescricaoBreve implements ValueObject, Comparable<ServicoDescricaoBreve> {

    private static final long serialVersionUID = 1L;

    private String m_strDescricao;

    public ServicoDescricaoBreve(final String strDescricao) {
        if (StringPredicates.isNullOrEmpty(strDescricao)) {
            throw new IllegalArgumentException(
                    "Service Brief Description should neither be null nor empty");
        }
        // expression
        this.m_strDescricao = strDescricao;
    }

    protected ServicoDescricaoBreve() {
        // for ORM
    }

    public static ServicoDescricaoBreve valueOf(final String strDescricao) {
        return new ServicoDescricaoBreve(strDescricao);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServicoDescricaoBreve)) {
            return false;
        }

        final ServicoDescricaoBreve that = (ServicoDescricaoBreve) o;
        return this.m_strDescricao.equals(that.m_strDescricao);
    }

    @Override
    public int hashCode() {
        return this.m_strDescricao.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strDescricao;
    }

    @Override
    public int compareTo(final ServicoDescricaoBreve arg0) {
        return m_strDescricao.compareTo(arg0.m_strDescricao);
    }
}
