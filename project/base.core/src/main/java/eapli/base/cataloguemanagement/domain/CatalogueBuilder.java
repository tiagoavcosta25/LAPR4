package eapli.base.cataloguemanagement.domain;

import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.servicemanagement.domain.ServiceBuilder;
import eapli.base.teammanagement.domain.Team;
import eapli.framework.domain.model.DomainFactory;

import java.util.Set;

public class CatalogueBuilder implements DomainFactory<Catalogue> {

    private CatalogueTitle m_oCatalogueTitle;

    private CatalogueBriefDescription m_oCatalogueBriefDescription;

    private CatalogueCompleteDescription m_oCatalogueCompleteDescription;

    private Collaborator m_oCollaborator;

    private Set<Team> m_setAccess;



    public CatalogueBuilder withTitle(CatalogueTitle oTitle) {
        this.m_oCatalogueTitle = oTitle;
        return this;
    }

    public CatalogueBuilder withBriefDescription(CatalogueBriefDescription oCatalogueBriefDescription) {
        this.m_oCatalogueBriefDescription = oCatalogueBriefDescription;
        return this;
    }


    public CatalogueBuilder withCompleteDescription(CatalogueCompleteDescription oCatalogueCompleteDescription) {
        this.m_oCatalogueCompleteDescription = oCatalogueCompleteDescription;
        return this;
    }


    public CatalogueBuilder withCollaborator(Collaborator oCollaborator) {
        this.m_oCollaborator = oCollaborator;
        return this;
    }


    public CatalogueBuilder withAccess(Set<Team> setAccess) {
        this.m_setAccess = setAccess;
        return this;
    }

    @Override
    public Catalogue build() {
        return new Catalogue(m_oCatalogueBriefDescription,m_oCatalogueCompleteDescription,m_oCatalogueTitle , m_oCollaborator, m_setAccess);
    }
}
