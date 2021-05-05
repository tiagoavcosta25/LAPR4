package eapli.base.servicemanagement.repositories;

import eapli.base.servicemanagement.domain.Servico;
import eapli.base.servicemanagement.domain.ServicoID;
import eapli.framework.domain.repositories.DomainRepository;

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
     * @param oID
     * @return
     */
    default Optional<Servico> findByID(ServicoID oID) {
        return ofIdentity(oID);
    }

    public Iterable<Servico> findAllActive();

    void save(Servico oServico);
}
