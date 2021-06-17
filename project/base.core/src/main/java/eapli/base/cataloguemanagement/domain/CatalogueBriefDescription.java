package eapli.base.cataloguemanagement.domain;

import eapli.base.collaboratormanagement.domain.CollaboratorCompleteName;
import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Column;
import javax.persistence.Embeddable;
/**
 *
 * @author Beatriz Seixas 1190424@isep.ipp.pt
 */
@Embeddable
public class CatalogueBriefDescription implements ValueObject, Comparable<eapli.base.cataloguemanagement.domain.CatalogueBriefDescription> {

    private static final long serialVersionUID = 1L;
    private static final Integer m_intMaxLength = 40;

    @Column(name = "BriefDescription")
    private String m_strBriefDescription;

    public CatalogueBriefDescription(final String strBriefDescription  ) {
        if (StringPredicates.isNullOrEmpty(strBriefDescription)|| !(strBriefDescription.length() < m_intMaxLength)) {
            throw new IllegalArgumentException(
                    "Brief Description can't be null nor empty, or have more then 80 characters.");
        }
        // expression
        this.m_strBriefDescription = strBriefDescription;
    }

    protected CatalogueBriefDescription() {
        // for ORM
    }



    public static CatalogueBriefDescription valueOf(final String strBriefDescription) {
        return new CatalogueBriefDescription(strBriefDescription);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CatalogueBriefDescription)) {
            return false;
        }

        final CatalogueBriefDescription that = (CatalogueBriefDescription) o;
        return this.m_strBriefDescription.equals(that.m_strBriefDescription);
    }


    @Override
    public String toString() {
        return this.m_strBriefDescription;
    }

    @Override
    public int hashCode() {
        return this.m_strBriefDescription.hashCode();
    }

    @Override
    public int compareTo(final eapli.base.cataloguemanagement.domain.CatalogueBriefDescription arg0) {
        return m_strBriefDescription.compareTo(arg0.m_strBriefDescription);
    }
}