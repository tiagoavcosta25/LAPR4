package eapli.base.formulariomanagement.domain;

import eapli.framework.domain.model.DomainFactory;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class AttributeBuilder implements DomainFactory<Attribute> {

    private AttributeID m_oID;
    private AttributeName m_oNome;
    private AttributeLabel m_oLabel;
    private AttributeDescription m_oDescricao;
    private AttributeRegex m_oRegex;
    private AttributeScript m_oScript;
    private TipoDados m_oTipoDados;

    public AttributeBuilder withID(AttributeID oID) {
        this.m_oID = oID;
        return this;
    }

    public AttributeBuilder withNome(AttributeName oNome) {
        this.m_oNome = oNome;
        return this;
    }

    public AttributeBuilder withLabel(AttributeLabel oLabel) {
        this.m_oLabel = oLabel;
        return this;
    }

    public AttributeBuilder withDescricao(AttributeDescription oDescricao) {
        this.m_oDescricao = oDescricao;
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

    public AttributeBuilder withTipoDados(TipoDados oTipoDados) {
        this.m_oTipoDados = oTipoDados;
        return this;
    }

    @Override
    public Attribute build() {
        // since the factory knows that all the parts are needed it could throw
        // an exception. however, we will leave that to the constructor
        return new Attribute(this.m_oID, this.m_oNome, this.m_oLabel ,this.m_oDescricao, this.m_oRegex, this.m_oScript, this.m_oTipoDados);
    }
}
