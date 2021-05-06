package eapli.base.servicemanagement.domain;

import eapli.base.formmanagement.domain.*;
import eapli.framework.domain.model.DomainFactory;

import java.util.ArrayList;
import java.util.List;

/**.
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class ServiceBuilder implements DomainFactory<Service> {

    private ServiceTitle m_oTitle;
    private ServiceBriefDescription m_oBriefDescription;
    private ServiceCompleteDescription m_oCompleteDescription;
    private Feedback m_oFeedback;
    private Catalogue m_oCatalogue;
    private List<Keyword> m_lstKeywords;
    private List<Form> m_lstForms;

    public ServiceBuilder withTitle(String strTitle) {
        this.m_oTitle = ServiceTitle.valueOf(strTitle);
        return this;
    }

    public ServiceBuilder withBriefDescription(String strBriefDescription) {
        this.m_oBriefDescription = ServiceBriefDescription.valueOf(strBriefDescription);
        return this;
    }

    public ServiceBuilder withCompleteDescription(String strCompleteDescription) {
        this.m_oCompleteDescription = ServiceCompleteDescription.valueOf(strCompleteDescription);
        return this;
    }

    public ServiceBuilder withFeedback(Double dblFeedback) {
        this.m_oFeedback = Feedback.valueOf(dblFeedback);
        return this;
    }

    public ServiceBuilder withCatalogue(Catalogue oCatalogue) {
        this.m_oCatalogue = oCatalogue;
        return this;
    }

    public ServiceBuilder withKeywordList(List<String> lstKeywords) {
        List<Keyword> lstTemp = new ArrayList<>();
        for(String s : lstKeywords){
            lstTemp.add(Keyword.valueOf(s));
        }
        this.m_lstKeywords = lstTemp;
        return this;
    }

    public ServiceBuilder withFormList(List<Form> lstForms) {
        this.m_lstForms = lstForms;
        return this;
    }

    @Override
    public Service build() {
        // since the factory knows that all the parts are needed it could throw
        // an exception. however, we will leave that to the constructor
        return new Service(this.m_oTitle, this.m_oBriefDescription, this.m_oCompleteDescription ,this.m_oFeedback, this.m_oCatalogue, this.m_lstKeywords, this.m_lstForms);
    }
}
