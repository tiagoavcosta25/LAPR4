package eapli.base.teammanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@Embeddable
public class Acronym implements ValueObject, Comparable<Acronym> {

    private static final long serialVersionUID = 1L;
    private static final String m_strRegex = "[a-z-A-Z0-9]{1,10}";

    @Column(unique = true, name = "acronym")
    private String m_strAcronym;

    public Acronym(final String strAcronym) {
        if(StringPredicates.isNullOrEmpty(strAcronym) || !strAcronym.matches(m_strRegex)) {
            throw new IllegalArgumentException(
                    "Acronym should neither be null, empty, nor contain characters besides letters and numbers. " +
                            "It also should have a max of 10 characters");
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
