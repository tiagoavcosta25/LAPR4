package eapli.base.formulariomanagement.domain;

import eapli.framework.domain.model.DomainFactory;

/**
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class AtributoBuilder implements DomainFactory<Atributo> {

    private AtributoID m_oID;
    private AttributeName m_oNome;
    private AttributeLabel m_oLabel;
    private AttributeDescription m_oDescricao;
    private AttributeRegex m_oRegex;
    private AttributeScript m_oScript;
    private TipoDados m_oTipoDados;

    public AtributoBuilder withID(AtributoID oID) {
        this.m_oID = oID;
        return this;
    }

    public AtributoBuilder withNome(AttributeName oNome) {
        this.m_oNome = oNome;
        return this;
    }

    public AtributoBuilder withLabel(AttributeLabel oLabel) {
        this.m_oLabel = oLabel;
        return this;
    }

    public AtributoBuilder withDescricao(AttributeDescription oDescricao) {
        this.m_oDescricao = oDescricao;
        return this;
    }

    public AtributoBuilder withRegex(AttributeRegex oRegex) {
        this.m_oRegex = oRegex;
        return this;
    }

    public AtributoBuilder withScript(AttributeScript oScript) {
        this.m_oScript = oScript;
        return this;
    }

    public AtributoBuilder withTipoDados(TipoDados oTipoDados) {
        this.m_oTipoDados = oTipoDados;
        return this;
    }

    @Override
    public Atributo build() {
        // since the factory knows that all the parts are needed it could throw
        // an exception. however, we will leave that to the constructor
        return new Atributo(this.m_oID, this.m_oNome, this.m_oLabel ,this.m_oDescricao, this.m_oRegex, this.m_oScript, this.m_oTipoDados);
    }
}
