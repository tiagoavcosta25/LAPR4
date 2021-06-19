package eapli.base.cataloguemanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Beatriz Seixas 1190424@isep.ipp.pt
 */

@Embeddable
public class CatalogueCompleteDescription implements ValueObject, Comparable<CatalogueCompleteDescription> {

    private static final long serialVersionUID = 1L;
    private static final Integer m_intMaxLength = 80;

    @Column(name = "CompleteDescription")
    private String m_strCompleteDescription;

    public CatalogueCompleteDescription(final String strCompleteDescription) {
        if (StringPredicates.isNullOrEmpty(strCompleteDescription)|| !(strCompleteDescription.length() < m_intMaxLength)) {
            throw new IllegalArgumentException(
                    "Complete description can't be null nor empty, or have more then 80 characters.");
        }
        // expression
        this.m_strCompleteDescription = strCompleteDescription;
    }

    protected CatalogueCompleteDescription() {
        // for ORM
    }

    public static CatalogueCompleteDescription valueOf(final String strCompleteDescription) {
        return new CatalogueCompleteDescription(strCompleteDescription);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CatalogueCompleteDescription)) {
            return false;
        }

        final CatalogueCompleteDescription that = (CatalogueCompleteDescription) o;
        return this.m_strCompleteDescription.equals(that.m_strCompleteDescription);
    }

    @Override
    public int hashCode() {
        return this.m_strCompleteDescription.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strCompleteDescription;
    }

    @Override
    public int compareTo(final CatalogueCompleteDescription arg0) {
        return m_strCompleteDescription.compareTo(arg0.m_strCompleteDescription);
    }
}