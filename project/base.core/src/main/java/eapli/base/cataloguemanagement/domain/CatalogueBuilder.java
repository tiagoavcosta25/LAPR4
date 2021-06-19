package eapli.base.cataloguemanagement.domain;

import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.servicemanagement.domain.ServiceBuilder;
import eapli.base.teammanagement.domain.Team;
import eapli.framework.domain.model.DomainFactory;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Beatriz Seixas 1190424@isep.ipp.pt
 */
public class CatalogueBuilder implements DomainFactory<Catalogue> {

    private CatalogueTitle m_oCatalogueTitle;
    private CatalogueBriefDescription m_oCatalogueBriefDescription;
    private CatalogueCompleteDescription m_oCatalogueCompleteDescription;
    private Collaborator m_oCollaborator;
    private Set<Team> m_setAccess;



    public CatalogueBuilder withTitle(String strTitle) {
        this.m_oCatalogueTitle = CatalogueTitle.valueOf(strTitle);
        return this;
    }

    public CatalogueBuilder withBriefDescription(String srtCatalogueBriefDescription) {
        this.m_oCatalogueBriefDescription = CatalogueBriefDescription.valueOf(srtCatalogueBriefDescription);
        return this;
    }


    public CatalogueBuilder withCompleteDescription(String strCatalogueCompleteDescription) {
        this.m_oCatalogueCompleteDescription =  CatalogueCompleteDescription.valueOf(strCatalogueCompleteDescription);
        return this;
    }


    public CatalogueBuilder withCollaborator(Collaborator oCollaborator) {
        this.m_oCollaborator = oCollaborator;
        return this;
    }


    public CatalogueBuilder withAccess(Set<Team> setAccess) {
        Set<Team> setTemp = new HashSet<>(setAccess);
        this.m_setAccess = setTemp;
        return this;
    }

    @Override
    public Catalogue build() {
        return new Catalogue(m_oCatalogueBriefDescription,m_oCatalogueCompleteDescription,m_oCatalogueTitle , m_oCollaborator, m_setAccess);
    }
}
