package eapli.base.formulariomanagement.domain;

import eapli.framework.domain.model.DomainFactory;

import java.util.List;

/**.
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class FormBuilder implements DomainFactory<Form> {

    private FormID m_oID;
    private FormName m_oName;
    private FormType m_oFormType;
    private List<Attribute> m_lstAttributes;

    public FormBuilder withID(FormID oID) {
        this.m_oID = oID;
        return this;
    }

    public FormBuilder withName(FormName oName) {
        this.m_oName = oName;
        return this;
    }

    public FormBuilder withType(FormType oFormType) {
        this.m_oFormType = oFormType;
        return this;
    }

    public FormBuilder withAttributeList(List<Attribute> lstAttributes) {
        this.m_lstAttributes = lstAttributes;
        return this;
    }

    @Override
    public Form build() {
        // since the factory knows that all the parts are needed it could throw
        // an exception. however, we will leave that to the constructor
        return new Form(this.m_oID, this.m_oName, this.m_oFormType,this.m_lstAttributes);
    }
}
