package eapli.base.cataloguemanagement.domain;
        import eapli.framework.domain.model.ValueObject;
        import eapli.framework.strings.util.StringPredicates;
        import javax.persistence.Embeddable;

/**
 *
 * @author Beatriz Seixas 1190424@isep.ipp.pt
 */

@Embeddable
public class CatalogueTitle implements ValueObject, Comparable<CatalogueTitle> {



    private String m_strTitle;

    public CatalogueTitle(final String strTitle) {
        if (StringPredicates.isNullOrEmpty(m_strTitle)) {
            throw new IllegalArgumentException(
                    "Catalogue´s title can't be null nor empty.");
        }

        this.m_strTitle = strTitle;
    }

    protected CatalogueTitle() {
        // for ORM
    }

    public static eapli.base.cataloguemanagement.domain.CatalogueTitle valueOf(final String strTitle) {
        return new eapli.base.cataloguemanagement.domain.CatalogueTitle(strTitle);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof eapli.base.cataloguemanagement.domain.CatalogueTitle)) {
            return false;
        }

        final eapli.base.cataloguemanagement.domain.CatalogueTitle that = (eapli.base.cataloguemanagement.domain.CatalogueTitle) o;
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
    public int compareTo(final eapli.base.cataloguemanagement.domain.CatalogueTitle arg0) {
        return m_strTitle.compareTo(arg0.m_strTitle);
    }
}
