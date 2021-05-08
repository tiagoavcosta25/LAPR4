package eapli.base.teamtypemanagement.domain;

import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.validations.Preconditions;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Version;

/**
 * @author João Parente 1190740@isep.ipp.pt
 */
@Entity
public final class TeamType implements AggregateRoot<TeamTypeId> {
    private static final long serialVersionUID = 1L;

    @Version
    private Long version;

    @EmbeddedId
    @Column(name = "id")
    private TeamTypeId id;

    @Column(name = "description")
    private TeamTypeDescription description;

    @Column(name = "color")
    private TeamTypeColor color;

    public TeamType(
        final TeamTypeId id,
        final TeamTypeDescription description,
        final TeamTypeColor color
    ) {
        Preconditions.noneNull(id, description, color);
        this.id = id;
        this.description = description;
        this.color = color;
    }

    protected TeamType() {
    }

    @Override
    public boolean equals(final Object object) {
        return DomainEntities.areEqual(this, object);
    }

    @Override
    public int hashCode() {
        return DomainEntities.hashCode(this);
    }

    @Override
    public boolean sameAs(Object other) {
        if (!(other instanceof TeamType)) return false;

        final TeamType that = (TeamType) other;
        if (this == that) return true;

        return identity().equals(that.identity()) &&
               description().equals(that.description()) &&
               color().equals(that.color());
    }

    @Override
    public boolean hasIdentity(TeamTypeId otherId) {
        return id.equals(otherId);
    }

    @Override
    public TeamTypeId identity() {
        return id;
    }

    public TeamTypeDescription description() {
        return description;
    }

    public TeamTypeColor color() {
        return color;
    }
}
