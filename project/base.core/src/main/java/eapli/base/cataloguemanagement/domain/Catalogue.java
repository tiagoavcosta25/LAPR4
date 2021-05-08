package eapli.base.cataloguemanagement.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.teammanagement.domain.Team;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Catalogue implements AggregateRoot<CatalogueID> {

    private static final long serialVersionUID = 1L;

    @Version
    private Long version;

    @Id
    @GeneratedValue
    @Column(name = "catalogueID")
    private CatalogueID m_oID;

    @JsonProperty
    @Column(name = "title")
    private CatalogueTitle m_oCatalogueTitle;

    @Embedded
    @Column(name = "BriefDescription")
    private CatalogueBriefDescription m_oCatalogueBriefDescription;

    @Column(name = "CompleteDescription")
    private CatalogueCompleteDescription m_oCatalogueCompleteDescription;

    @OneToOne
    @JoinColumn(name="colaboratorID")
    private Collaborator m_oCollaborator;


    @ManyToMany
    @JoinTable(
            name = "catalogue_team",
            joinColumns = @JoinColumn(name = "catalogueID"),
            inverseJoinColumns = @JoinColumn(name = "teamID")
    )
    private Set<Team> m_setAccess;

    public Catalogue(CatalogueBriefDescription oCatalogueBriefDescription, CatalogueCompleteDescription oCatalogueCompleteDescription,
                     CatalogueTitle oCatalogueTitle, Collaborator oCollaborator, Set<Team> setAccess){
        if (oCatalogueBriefDescription == null || oCatalogueCompleteDescription == null || oCatalogueTitle == null || oCollaborator == null) {
            throw new IllegalArgumentException();
        }this.m_oCatalogueBriefDescription = oCatalogueBriefDescription;
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


    public CatalogueID id() {
        return identity();
    }


    public Set<Team> access() {
        return this.m_setAccess;
    }

    public boolean hasID(CatalogueID oID) {
        return this.m_oID.equals(oID);
    }

    @Override
    public CatalogueID identity() {
        return this.m_oID;
    }
}
