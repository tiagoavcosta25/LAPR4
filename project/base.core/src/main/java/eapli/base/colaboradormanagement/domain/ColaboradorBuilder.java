package eapli.base.colaboradormanagement.domain;

import eapli.base.formulariomanagement.domain.Formulario;
import eapli.base.servicemanagement.domain.*;
import eapli.framework.domain.model.DomainFactory;

import java.util.List;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
public class ColaboradorBuilder implements DomainFactory<Colaborador> {

    private ColaboradorID m_oID;
    private ColaboradorContacto m_oContacto;
    private ColaboradorDataNascimento m_oDataNascimento;
    private ColaboradorMorada m_oMorada;
    private ColaboradorNomeCompleto m_oNomeCompleto;
    private ColaboradorNomeCurto m_oNomeCurto;
    private ColaboradorNumeroMecanografico m_oNumeroMecanografico;
    private Funcao m_oFuncao;

    public ColaboradorBuilder withID(ColaboradorID oID) {
        this.m_oID = oID;
        return this;
    }

    public ColaboradorBuilder withContacto(ColaboradorContacto oContacto) {
        this.m_oContacto = oContacto;
        return this;
    }

    public ColaboradorBuilder withDataNascimento(ColaboradorDataNascimento oDataNascimento) {
        this.m_oDataNascimento = oDataNascimento;
        return this;
    }

    public ColaboradorBuilder withMorada(ColaboradorMorada oMorada) {
        this.m_oMorada = oMorada;
        return this;
    }

    public ColaboradorBuilder withNomeCompleto(ColaboradorNomeCompleto oNomeCompleto) {
        this.m_oNomeCompleto = oNomeCompleto;
        return this;
    }

    public ColaboradorBuilder withNomeCurto(ColaboradorNomeCurto oNomeCurto) {
        this.m_oNomeCurto = oNomeCurto;
        return this;
    }

    public ColaboradorBuilder withNumeroMecanografico(ColaboradorNumeroMecanografico oNumeroMecanografico) {
        this.m_oNumeroMecanografico = oNumeroMecanografico;
        return this;
    }

    public ColaboradorBuilder withFuncao(Funcao oFuncao) {
        this.m_oFuncao = oFuncao;
        return this;
    }

    @Override
    public Colaborador build() {
        // since the factory knows that all the parts are needed it could throw
        // an exception. however, we will leave that to the constructor
        return new Colaborador(this.m_oID, this.m_oContacto, this.m_oDataNascimento ,this.m_oMorada, this.m_oNomeCompleto, this.m_oNomeCurto, this.m_oNumeroMecanografico);
    }
}
