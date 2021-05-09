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
public class CatalogueTitle implements ValueObject, Comparable<CatalogueTitle> {

    private static final long serialVersionUID = 1L;
    private static final Integer m_intMaxLength = 50;

    @Column(name = "title")
    private String m_strTitle;

    public CatalogueTitle(final String strTitle) {
        if (StringPredicates.isNullOrEmpty(strTitle) || !(strTitle.length() < m_intMaxLength)) {
            throw new IllegalArgumentException(
                    "Catalogue´s title can't be null, empty or have more than 50 characters.");
        }

        this.m_strTitle = strTitle;
    }

    protected CatalogueTitle() {
        // for ORM
    }

    public static CatalogueTitle valueOf(final String strTitle) {
        return new CatalogueTitle(strTitle);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CatalogueTitle)) {
            return false;
        }

        final CatalogueTitle that = (CatalogueTitle) o;
        return this.m_strTitle.equals(that.m_strTitle);
    }

    @Override
    public int hashCode() {
        return this.m_strTitle.hashCode();
    }

    @Override
    public String toString() {
        return this.m_strTitle;
    }

    @Override
    public int compareTo(final CatalogueTitle arg0) {
        return m_strTitle.compareTo(arg0.m_strTitle);
    }
}