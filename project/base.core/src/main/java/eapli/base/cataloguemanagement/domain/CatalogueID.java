package eapli.base.cataloguemanagement.domain;

import eapli.base.teammanagement.domain.TeamID;
import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;
import javax.persistence.Embeddable;

/**
 *
 * @author Beatriz Seixas 1190424@isep.ipp.pt
 */
@Embeddable
public class CatalogueID implements ValueObject, Comparable<CatalogueID> {

    private static final long serialVersionUID = 1L;

    private String m_strID;

    public CatalogueID(final String strID) {
        if (StringPredicates.isNullOrEmpty(strID)) {
            throw new IllegalArgumentException(
                    "Catalogue's ID can't be null nor empty.");
        }

        this.m_strID = strID;
    }

    protected CatalogueID() {
        // for ORM
    }

    public static CatalogueID valueOf(final String strID) {
        return new CatalogueID(strID);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CatalogueID)) {
            return false;
        }

        final CatalogueID that = (CatalogueID) o;
        return this.m_strID.equals(that.m_strID);
    }

    @Override
    public int hashCode() {
        return this.m_strID.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strID;
    }

    @Override
    public int compareTo(final CatalogueID arg0) {
        return m_strID.compareTo(arg0.m_strID);
    }
}
