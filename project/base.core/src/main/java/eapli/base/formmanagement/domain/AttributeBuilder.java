package eapli.base.formmanagement.domain;

import eapli.framework.domain.model.DomainFactory;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class AttributeBuilder implements DomainFactory<Attribute> {

    private AttributeName m_oName;
    private AttributeLabel m_oLabel;
    private AttributeDescription m_oDescription;
    private AttributeRegex m_oRegex;
    private AttributeScript m_oScript;
    private DataType m_oDataType;

    public AttributeBuilder withName(String strName) {
        this.m_oName = AttributeName.valueOf(strName);
        return this;
    }

    public AttributeBuilder withLabel(String strLabel) {
        this.m_oLabel = AttributeLabel.valueOf(strLabel);
        return this;
    }

    public AttributeBuilder withDescription(String strDescription) {
        this.m_oDescription = AttributeDescription.valueOf(strDescription);
        return this;
    }

    public AttributeBuilder withRegex(String strRegex) {
        this.m_oRegex = AttributeRegex.valueOf(strRegex);
        return this;
    }

    public AttributeBuilder withScript(String strScriptPath) {
        this.m_oScript = AttributeScript.valueOf(strScriptPath);
        return this;
    }

    public AttributeBuilder withDataType(String strDataType) {
        this.m_oDataType = DataType.stringToDataType(strDataType);
        return this;
    }

    @Override
    public Attribute build() {
        // since the factory knows that all the parts are needed it could throw
        // an exception. however, we will leave that to the constructor
        return new Attribute(this.m_oName, this.m_oLabel ,this.m_oDescription, this.m_oRegex, this.m_oScript, this.m_oDataType);
    }
}
