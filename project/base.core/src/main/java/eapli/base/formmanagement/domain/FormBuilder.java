package eapli.base.formmanagement.domain;

import eapli.framework.domain.model.DomainFactory;

import java.util.List;

/**.
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class FormBuilder implements DomainFactory<Form> {

    private FormName m_oName;
    private FormType m_oFormType;
    private FormScript m_oFormScriptContent;
    private List<Attribute> m_lstAttributes;

    public FormBuilder withName(String strName) {
        this.m_oName = FormName.valueOf(strName);
        return this;
    }

    public FormBuilder withType(String strFormType) {
        this.m_oFormType = FormType.stringToFormType(strFormType);
        return this;
    }

    public FormBuilder withScript(String strScriptContent) {
        this.m_oFormScriptContent = FormScript.valueOf(strScriptContent);
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
        return new Form(this.m_oName, this.m_oFormType, this.m_oFormScriptContent,this.m_lstAttributes);
    }
}
