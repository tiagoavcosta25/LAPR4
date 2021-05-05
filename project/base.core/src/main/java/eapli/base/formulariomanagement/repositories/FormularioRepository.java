package eapli.base.formulariomanagement.repositories;

import eapli.base.clientusermanagement.domain.ClientUser;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.formulariomanagement.domain.Formulario;
import eapli.base.formulariomanagement.domain.FormularioID;
import eapli.base.servicemanagement.domain.Servico;
import eapli.base.servicemanagement.domain.ServicoID;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.infrastructure.authz.domain.model.Username;

import java.util.Optional;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public interface FormularioRepository
        extends DomainRepository<FormularioID, Formulario> {

    /**
     * returns the form with the given id
     *
     * @param oID
     * @return
     */
    default Optional<Formulario> findByID(FormularioID oID) {
        return ofIdentity(oID);
    }

    public Iterable<Formulario> findAllActive();

    void save(Formulario oFormulario);
}
