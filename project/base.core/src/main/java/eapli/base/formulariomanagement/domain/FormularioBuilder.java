package eapli.base.formulariomanagement.domain;

import eapli.framework.domain.model.DomainFactory;

import java.util.List;

/**.
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public class FormularioBuilder implements DomainFactory<Formulario> {

    private FormularioID m_oID;
    private FormularioNome m_oNome;
    private TipoForm m_oTipoForm;
    private List<Atributo> m_lstAtributos;

    public FormularioBuilder withID(FormularioID oID) {
        this.m_oID = oID;
        return this;
    }

    public FormularioBuilder withNome(FormularioNome oNome) {
        this.m_oNome = oNome;
        return this;
    }

    public FormularioBuilder withTipo(TipoForm oTipoForm) {
        this.m_oTipoForm = oTipoForm;
        return this;
    }

    public FormularioBuilder withAtributoList(List<Atributo> lstAtributos) {
        this.m_lstAtributos = lstAtributos;
        return this;
    }

    @Override
    public Formulario build() {
        // since the factory knows that all the parts are needed it could throw
        // an exception. however, we will leave that to the constructor
        return new Formulario(this.m_oID, this.m_oNome, this.m_oTipoForm ,this.m_lstAtributos);
    }
}
