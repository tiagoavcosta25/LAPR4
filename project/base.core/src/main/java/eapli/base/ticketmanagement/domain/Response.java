/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.ticketmanagement.domain;

import eapli.base.formmanagement.domain.Attribute;
import eapli.base.formmanagement.domain.Form;
import eapli.base.servicemanagement.domain.Service;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.*;
import java.util.List;

/**
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
@Entity
public class Response implements  AggregateRoot<Long> {

    @Version
    private Long version;

    @Id
    @GeneratedValue
    @Column(name = "responseID")
    private Long m_lngID;

    @ManyToOne
    @JoinColumn(name="formID")
    private Form m_oForm;

    @ElementCollection()
    @CollectionTable(name = "response_list")
    private List<String> m_lstResponses;

    public Response(final Form oForm, List<String> lstResponses) {
        if (oForm == null || lstResponses == null || lstResponses.isEmpty() || (oForm.attributes().size() != lstResponses.size())) {
            throw new IllegalArgumentException(
                    "Forms and Responses should not be null nor empty, nor have more/less responses than attributes");
        }

        int c = 0;
        for(Attribute a : oForm.attributes()){
                if(!a.validate(lstResponses.get(c))){
                    throw new IllegalArgumentException(
                            "Invalid Attribute Response");
                }
                c++;
        }

        // expression
        this.m_oForm = oForm;
        this.m_lstResponses = lstResponses;
    }

    protected Response() {
        // for ORM
    }

    public List<String> getResponses() {
        return m_lstResponses;
    }

    public Form getForm() {
        return m_oForm;
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

    public Long id() {
        return identity();
    }

    @Override
    public Long identity() {
        return this.m_lngID;
    }

    @Override
    public String toString() {
        return this.m_oForm.toString();
    }
}
