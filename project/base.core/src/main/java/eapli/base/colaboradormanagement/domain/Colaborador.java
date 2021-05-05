/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.colaboradormanagement.domain;

import javax.persistence.Embeddable;

import eapli.base.formulariomanagement.domain.Formulario;
import eapli.base.servicemanagement.domain.*;
import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import java.util.List;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
@Embeddable
public class Colaborador implements AggregateRoot<Colaborador> {

    @Version
    private Long version;

    @EmbeddedId
    private ColaboradorID m_oID;

    /**
     * cascade = CascadeType.NONE as the systemUser is part of another aggregate
     */
    @OneToOne()
    private ColaboradorContacto m_oContacto;

    @OneToOne()
    private ColaboradorDataNascimento m_oDataNascimento;

    @OneToOne()
    private ColaboradorMorada m_oMorada;


    @OneToOne()
    private ColaboradorNomeCompleto m_oNomeCompleto;


    @OneToOne()
    private ColaboradorNomeCurto m_oNomeCurto;


    @OneToOne()
    private ColaboradorNumeroMecanografico m_oNumeroMecanografico;



    public Colaborador(final ColaboradorID oID, final ColaboradorContacto oContacto, final ColaboradorDataNascimento oDataNascimento,
                   final ColaboradorMorada oMorada, final ColaboradorNomeCompleto oNomeCompleto,
                       final ColaboradorNomeCurto oNomeCurto, final ColaboradorNumeroMecanografico oNumeroMecanografico) {
        if (oID == null || oContacto == null || oDataNascimento == null || oMorada == null || oNomeCompleto == null || oNomeCurto == null || oNumeroMecanografico == null){
            throw new IllegalArgumentException();
        }
        this.m_oID = oID;
        this.m_oContacto = oContacto;
        this.m_oDataNascimento = oDataNascimento;
        this.m_oMorada = oMorada;
        this.m_oNomeCompleto = oNomeCompleto;
        this.m_oNomeCurto = oNomeCurto;
        this.m_oNumeroMecanografico = oNumeroMecanografico;
    }

    protected Colaborador() {
        // for ORM only
    }

    public ColaboradorContacto contacto() {
        return this.m_oContacto;
    }
    public ColaboradorDataNascimento dataNascimento() {
        return this.m_oDataNascimento;
    }
    public ColaboradorMorada morada() {
        return this.m_oMorada;
    }
    public ColaboradorNomeCompleto nomeCompleto() { return this.m_oNomeCompleto; }
    public ColaboradorNomeCurto nomeCurto() {
        return this.m_oNomeCurto;
    }
    public ColaboradorNumeroMecanografico numeroMecanografico() {
        return this.m_oNumeroMecanografico;
    }

    @Override
    public boolean equals(final Object o) {
        return DomainEntities.areEqual(this, o);
    }

    @Override
    public int hashCode() {
        return DomainEntities.hashCode(this);
    }

    @Override
    public boolean sameAs(final Object other) {
        return DomainEntities.areEqual(this, other);
    }

    public ColaboradorID id() {
        return identity();
    }

    @Override
    public ColaboradorID identity() {
        return this.m_oID;
    }
}
