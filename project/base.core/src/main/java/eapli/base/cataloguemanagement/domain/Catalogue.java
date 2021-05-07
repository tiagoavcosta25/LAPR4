package eapli.base.cataloguemanagement.domain;

import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.teammanagement.domain.Team;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.validations.Preconditions;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Catalogue implements AggregateRoot<CatalogueID> {

    private static final long serialVersionUID = 1L;

    @Version
    private Long version;

    @EmbeddedId
    @Column(name = "catalogueID")
    private CatalogueID m_oID;

    @Column(name = "cataloguetitle")
    private CatalogueTitle m_oCatalogueTitle;

    @Column(name = "catalogueBriefDescription")
    private CatalogueBriefDescription m_oCatalogueBriefDescription;

    @Column(name = "catalogueCompleteDescription")
    private CatalogueCompleteDescription m_oCatalogueCompleteDescription;

    @ManyToMany
    @JoinTable(
            name = "catalogue_collaborator",
            joinColumns = @JoinColumn(name = "catalogueID"),
            inverseJoinColumns = @JoinColumn(name = "collaboratorID")
    )
    private Set<Collaborator> m_setRepresentation;


    @ManyToMany
    @JoinTable(
            name = "catalogue_team",
            joinColumns = @JoinColumn(name = "catalogueID"),
            inverseJoinColumns = @JoinColumn(name = "teamID")
    )
    private Set<Team> m_setAccess;

    public Catalogue(CatalogueBriefDescription oCatalogueBriefDescription, CatalogueCompleteDescription oCatalogueCompleteDescription,
                     CatalogueTitle oCatalogueTitle, Set<Collaborator> setRepresentation, Set<Team> setAccess){

        Preconditions.noneNull(oCatalogueBriefDescription, oCatalogueCompleteDescription, oCatalogueTitle, setRepresentation,setAccess);
        this.m_oCatalogueBriefDescription = oCatalogueBriefDescription;
        this.m_oCatalogueCompleteDescription = oCatalogueCompleteDescription;
        this.m_oCatalogueTitle = oCatalogueTitle;
        this.m_setRepresentation = setRepresentation;
        this.m_setAccess = setAccess;
    }

    protected Catalogue() {
        //for ORM only
    }

    @Override
    public boolean equals(final Object o) {
        return DomainEntities.areEqual(this, o);
    }

    @Override
    public int hashCode() {
        return DomainEntities.hashCode(this);
    }

    @Override
    public boolean sameAs(final Object other) {
        if(!(other instanceof Catalogue)) {
            return false;
        }

        final Catalogue that = (Catalogue) other;
        if(this == that) {
            return true;
        }

        return identity().equals(that.identity()) && m_oCatalogueTitle.equals(that.m_oCatalogueTitle)
                && m_oCatalogueBriefDescription.equals(that.m_oCatalogueBriefDescription) &&
                m_oCatalogueCompleteDescription.equals(that.m_oCatalogueCompleteDescription) &&
                m_setAccess.equals(that.m_setAccess) &&
                m_setRepresentation.equals(that.m_setRepresentation) ;
    }

    @Override
    public CatalogueID identity() {
        return this.m_oID;
    }

    public CatalogueTitle catalogueTitle() {
        return this.catalogueTitle();
    }

    public CatalogueBriefDescription catalogueBriefDescription() {
        return this.catalogueBriefDescription();
    }

    public CatalogueCompleteDescription catalogueCompleteDescription() {
        return this.catalogueCompleteDescription();
    }

    public Set<Collaborator> representation() {
        return this.m_setRepresentation;
    }

    public Set<Team> access() {
        return this.m_setAccess;
    }
}
