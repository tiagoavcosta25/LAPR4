package eapli.base.cataloguemanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;
import javax.persistence.Embeddable;
/**
 *
 * @author Beatriz Seixas 1190424@isep.ipp.pt
 */
@Embeddable
public class CatalogueBriefDescription implements ValueObject, Comparable<eapli.base.cataloguemanagement.domain.CatalogueBriefDescription> {

    private static final long serialVersionUID = 1L;

    private String m_strBriefDescription;

    public CatalogueBriefDescription(final String strBriefDescription) {
        if (StringPredicates.isNullOrEmpty(strBriefDescription)) {
            throw new IllegalArgumentException(
                    "Brief Description can't be null nor empty.");
        }
        // expression
        this.m_strBriefDescription = strBriefDescription;
    }

    protected CatalogueBriefDescription() {
        // for ORM
    }

    public static eapli.base.cataloguemanagement.domain.CatalogueBriefDescription valueOf(final String strBriefDescription) {
        return new eapli.base.cataloguemanagement.domain.CatalogueBriefDescription(strBriefDescription);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof eapli.base.cataloguemanagement.domain.CatalogueBriefDescription)) {
            return false;
        }

        final eapli.base.cataloguemanagement.domain.CatalogueBriefDescription that = (eapli.base.cataloguemanagement.domain.CatalogueBriefDescription) o;
        return this.m_strBriefDescription.equals(that.m_strBriefDescription);
    }

    @Override
    public int hashCode() {
        return this.m_strBriefDescription.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strBriefDescription;
    }

    @Override
    public int compareTo(final eapli.base.cataloguemanagement.domain.CatalogueBriefDescription arg0) {
        return m_strBriefDescription.compareTo(arg0.m_strBriefDescription);
    }
}
