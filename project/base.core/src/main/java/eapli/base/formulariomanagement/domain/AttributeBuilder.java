package eapli.base.formulariomanagement.domain;

import eapli.framework.domain.model.DomainFactory;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class AttributeBuilder implements DomainFactory<Attribute> {

    private AttributeID m_oID;
    private AttributeName m_oName;
    private AttributeLabel m_oLabel;
    private AttributeDescription m_oDescription;
    private AttributeRegex m_oRegex;
    private AttributeScript m_oScript;
    private DataType m_oDataType;

    public AttributeBuilder withID(AttributeID oID) {
        this.m_oID = oID;
        return this;
    }

    public AttributeBuilder withName(AttributeName oName) {
        this.m_oName = oName;
        return this;
    }

    public AttributeBuilder withLabel(AttributeLabel oLabel) {
        this.m_oLabel = oLabel;
        return this;
    }

    public AttributeBuilder withDescription(AttributeDescription oDescription) {
        this.m_oDescription = oDescription;
        return this;
    }

    public AttributeBuilder withRegex(AttributeRegex oRegex) {
        this.m_oRegex = oRegex;
        return this;
    }

    public AttributeBuilder withScript(AttributeScript oScript) {
        this.m_oScript = oScript;
        return this;
    }

    public AttributeBuilder withDataType(DataType oDataType) {
        this.m_oDataType = oDataType;
        return this;
    }

    @Override
    public Attribute build() {
        // since the factory knows that all the parts are needed it could throw
        // an exception. however, we will leave that to the constructor
        return new Attribute(this.m_oID, this.m_oName, this.m_oLabel ,this.m_oDescription, this.m_oRegex, this.m_oScript, this.m_oDataType);
    }
}
