package eapli.base.teammanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 *
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@Embeddable
public class Acronym implements ValueObject, Comparable<Acronym> {

    private static final long serialVersionUID = 1L;

    private String m_strAcronym;

    public Acronym(final String strAcronym) {
        if(StringPredicates.isNullOrEmpty(strAcronym)) {
            throw new IllegalArgumentException(
                    "Acronym should neither be null nor empty.");
        }
        this.m_strAcronym = strAcronym;
    }

    protected Acronym() {
        //for ORM only
    }

    public static Acronym valueOf(final String strAcronym) {
        return new Acronym(strAcronym);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Acronym)) return false;
        final Acronym that = (Acronym) o;
        return this.m_strAcronym.equals(that.m_strAcronym);
    }

    @Override
    public int hashCode() {
        return this.m_strAcronym.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strAcronym;
    }

    @Override
    public int compareTo(final Acronym arg0) {
        return m_strAcronym.compareTo(arg0.m_strAcronym);
    }
}
