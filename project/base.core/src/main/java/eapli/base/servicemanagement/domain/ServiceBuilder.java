package eapli.base.servicemanagement.domain;

import eapli.base.formulariomanagement.domain.*;
import eapli.framework.domain.model.DomainFactory;

import java.util.ArrayList;
import java.util.List;

/**.
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class ServiceBuilder implements DomainFactory<Service> {

    private ServiceID m_oID;
    private ServiceTitle m_oTitle;
    private ServiceBriefDescription m_oBriefDescription;
    private ServiceCompleteDescription m_oCompleteDescription;
    private Feedback m_oFeedback;
    private List<Keyword> m_lstKeywords;
    private List<Form> m_lstForms;

    public ServiceBuilder withID(ServiceID oID) {
        this.m_oID = oID;
        return this;
    }

    public ServiceBuilder withTitle(String oTitle) {
        this.m_oTitle = new ServiceTitle(oTitle);
        return this;
    }

    public ServiceBuilder withBriefDescription(String oBriefDescription) {
        this.m_oBriefDescription = new ServiceBriefDescription(oBriefDescription);
        return this;
    }

    public ServiceBuilder withCompleteDescription(String oCompleteDescription) {
        this.m_oCompleteDescription = new ServiceCompleteDescription(oCompleteDescription);
        return this;
    }

    public ServiceBuilder withFeedback(Double oFeedback) {
        this.m_oFeedback = new Feedback(oFeedback);
        return this;
    }

    public ServiceBuilder withKeywordList(List<String> lstKeywords) {
        List<Keyword> lstTemp = new ArrayList<>();
        for(String s : lstKeywords){
            lstTemp.add(new Keyword(s));
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
        return new Service(this.m_oID, this.m_oTitle, this.m_oBriefDescription, this.m_oCompleteDescription ,this.m_oFeedback, this.m_lstKeywords, this.m_lstForms);
    }
}
