package eapli.base.formulariomanagement.domain;

import eapli.base.clientusermanagement.domain.ClientUser;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.framework.domain.model.DomainFactory;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

/**
 * A factory for User entities.
 *
 * This class demonstrates the use of the factory (DDD) pattern using a fluent
 * interface. it acts as a Builder (GoF).
 *
 * @author Jorge Santos ajs@isep.ipp.pt 02/04/2016
 */
public class AtributoBuilder implements DomainFactory<Atributo> {

    private AtributoID m_oID;
    private AtributoNome m_oNome;
    private AtributoLabel m_oLabel;
    private AtributoDescricao m_oDescricao;
    private AtributoRegex m_oRegex;
    private AtributoScript m_oScript;
    private TipoDados m_oTipoDados;

    public AtributoBuilder withID(AtributoID oID) {
        this.m_oID = oID;
        return this;
    }

    public AtributoBuilder withNome(AtributoNome oNome) {
        this.m_oNome = oNome;
        return this;
    }

    public AtributoBuilder withLabel(AtributoLabel oLabel) {
        this.m_oLabel = oLabel;
        return this;
    }

    public AtributoBuilder withDescricao(AtributoDescricao oDescricao) {
        this.m_oDescricao = oDescricao;
        return this;
    }

    public AtributoBuilder withRegex(AtributoRegex oRegex) {
        this.m_oRegex = oRegex;
        return this;
    }

    public AtributoBuilder withScript(AtributoScript oScript) {
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
