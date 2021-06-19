package eapli.base.cataloguemanagement.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.teammanagement.domain.Team;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.*;
import java.util.Set;
/**
 * @author Beatriz Seixas 1190424@isep.ipp.pt
 */

@Entity
public class Catalogue implements AggregateRoot<Long> {

    private static final long serialVersionUID = 1L;

    @Version
    private Long version;

    @Id
    @GeneratedValue
    @Column(name = "catalogueID")
    private Long m_lngID;

    @JsonProperty
    private CatalogueTitle m_oCatalogueTitle;

    private CatalogueBriefDescription m_oCatalogueBriefDescription;

    private CatalogueCompleteDescription m_oCatalogueCompleteDescription;

    @OneToOne
    @JoinColumn(name = "collaboratorID")
    private Collaborator m_oCollaborator;

    @ManyToMany
    private Set<Team> m_setAccess;

    public Catalogue(CatalogueBriefDescription oCatalogueBriefDescription, CatalogueCompleteDescription oCatalogueCompleteDescription,
                     CatalogueTitle oCatalogueTitle, Collaborator oCollaborator, Set<Team> setAccess) {
        if (oCatalogueBriefDescription == null || oCatalogueCompleteDescription == null || oCatalogueTitle == null || oCollaborator == null) {
            throw new IllegalArgumentException();
        }
        this.m_oCatalogueBriefDescription = oCatalogueBriefDescription;
        this.m_oCatalogueCompleteDescription = oCatalogueCompleteDescription;
        this.m_oCatalogueTitle = oCatalogueTitle;
        this.m_oCollaborator = oCollaborator;
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
        return DomainEntities.areEqual(this, other);
    }

    public Long id() {
        return identity();
    }

    public Set<Team> access() {
        return this.m_setAccess;
    }

    @Override
    public Long identity() {
        return this.m_lngID;
    }

    public CatalogueTitle catalogueTitle() {
        return this.m_oCatalogueTitle;
    }

    public CatalogueBriefDescription catalogueBriefDescription() {
        return this.m_oCatalogueBriefDescription;
    }

    public CatalogueCompleteDescription catalogueCompleteDescription() {
        return this.m_oCatalogueCompleteDescription;
    }

    @Override
    public String toString() {
        return "Catalogue Title: " + m_oCatalogueTitle + " | Brief Description: " + m_oCatalogueBriefDescription;
    }
}
