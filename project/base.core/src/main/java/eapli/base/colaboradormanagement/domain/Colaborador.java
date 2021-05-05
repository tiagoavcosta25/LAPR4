/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.colaboradormanagement.domain;

import javax.persistence.Embeddable;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

/**
 *
 * @author Jorge Santos ajs@isep.ipp.pt
 */
@Embeddable
public class Colaborador implements ValueObject, Comparable<Colaborador> {

    private static final long serialVersionUID = 1L;

    private String number;

    public Colaborador(final String mecanographicNumber) {
        if (StringPredicates.isNullOrEmpty(mecanographicNumber)) {
            throw new IllegalArgumentException(
                    "Mecanographic Number should neither be null nor empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.number = mecanographicNumber;
    }

    protected Colaborador() {
        // for ORM
    }

    public static Colaborador valueOf(final String mecanographicNumber) {
        return new Colaborador(mecanographicNumber);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Colaborador)) {
            return false;
        }

        final Colaborador that = (Colaborador) o;
        return this.number.equals(that.number);
    }

    @Override
    public int hashCode() {
        return this.number.hashCode();
    }

    @Override
    public String toString() {
        return this.number;
    }

    @Override
    public int compareTo(final Colaborador arg0) {
        return number.compareTo(arg0.number);
    }
}
