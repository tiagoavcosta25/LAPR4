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
public class ServicoDescricaoCompleta implements ValueObject, Comparable<ServicoDescricaoCompleta> {

    private static final long serialVersionUID = 1L;

    private String m_strDescricao;

    public ServicoDescricaoCompleta(final String strDescricao) {
        if (StringPredicates.isNullOrEmpty(strDescricao)) {
            throw new IllegalArgumentException(
                    "Attribute Complete Description should neither be null nor empty");
        }
        // expression
        this.m_strDescricao = strDescricao;
    }

    protected ServicoDescricaoCompleta() {
        // for ORM
    }

    public static ServicoDescricaoCompleta valueOf(final String strDescricao) {
        return new ServicoDescricaoCompleta(strDescricao);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServicoDescricaoCompleta)) {
            return false;
        }

        final ServicoDescricaoCompleta that = (ServicoDescricaoCompleta) o;
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
    public int compareTo(final ServicoDescricaoCompleta arg0) {
        return m_strDescricao.compareTo(arg0.m_strDescricao);
    }
}
