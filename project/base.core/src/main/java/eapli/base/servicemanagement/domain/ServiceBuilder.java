package eapli.base.servicemanagement.domain;

import eapli.base.formulariomanagement.domain.*;
import eapli.framework.domain.model.DomainFactory;

import java.util.List;

/**.
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class ServicoBuilder implements DomainFactory<Servico> {

    private ServicoID m_oID;
    private ServicoDescricaoBreve m_oDescricaoBreve;
    private ServicoDescricaoCompleta m_oDescricaoCompleta;
    private Feedback m_oFeedback;
    private List<Keyword> m_lstKeywords;
    private List<Form> m_lstForms;

    public ServicoBuilder withID(ServicoID oID) {
        this.m_oID = oID;
        return this;
    }

    public ServicoBuilder withDescricaoBreve(ServicoDescricaoBreve oDescricaoBreve) {
        this.m_oDescricaoBreve = oDescricaoBreve;
        return this;
    }

    public ServicoBuilder withDescricaoCompleta(ServicoDescricaoCompleta oDescricaoCompleta) {
        this.m_oDescricaoCompleta = oDescricaoCompleta;
        return this;
    }

    public ServicoBuilder withFeedback(Feedback oFeedback) {
        this.m_oFeedback = oFeedback;
        return this;
    }

    public ServicoBuilder withKeywordList(List<Keyword> lstKeywords) {
        this.m_lstKeywords = lstKeywords;
        return this;
    }

    public ServicoBuilder withFormularioList(List<Form> lstForms) {
        this.m_lstForms = lstForms;
        return this;
    }

    @Override
    public Servico build() {
        // since the factory knows that all the parts are needed it could throw
        // an exception. however, we will leave that to the constructor
        return new Servico(this.m_oID, this.m_oDescricaoBreve, this.m_oDescricaoCompleta ,this.m_oFeedback, this.m_lstKeywords, this.m_lstForms);
    }
}
