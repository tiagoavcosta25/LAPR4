package eapli.base.servicemanagement.repositories;

import eapli.base.clientusermanagement.domain.ClientUser;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.formulariomanagement.domain.Formulario;
import eapli.base.servicemanagement.domain.Servico;
import eapli.base.servicemanagement.domain.ServicoID;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.infrastructure.authz.domain.model.Username;

import java.util.Optional;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
public interface ServicoRepository
        extends DomainRepository<ServicoID, Servico> {

    /**
     * returns the client user (utente) with the given mecanographic number
     *
     * @param number
     * @return
     */
    default Optional<Servico> findByID(ServicoID oID) {
        return ofIdentity(oID);
    }

    public Iterable<Servico> findAllActive();

    void save(Servico oServico);
}
