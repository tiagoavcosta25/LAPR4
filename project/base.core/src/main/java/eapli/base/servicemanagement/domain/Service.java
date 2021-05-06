/*
 * Copyright (c) 2013-2019 the original author or authors.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package eapli.base.servicemanagement.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import eapli.base.formmanagement.domain.*;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.*;
import java.util.List;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */

@Entity
public class Service implements AggregateRoot<ServiceID> {

    @Version
    private Long version;

    @Id
    @GeneratedValue
    @Column(name = "serviceID")
    private ServiceID m_oID;

    @JsonProperty
    @Column(name = "title")
    private ServiceTitle m_oTitle;
    
    @Embedded
    @Column(name = "briefDescription")
    private ServiceBriefDescription m_oBriefDescription;

    @Embedded
    @Column(name = "completeDescription")
    private ServiceCompleteDescription m_oCompleteDescription;

    @Embedded
    @Column(name = "feedback")
    @JoinColumn(name="keywordID")
    private Feedback m_oFeedback;

    @OneToOne
    @Column(name = "catalogue")
    @JoinColumn(name="catalogueID")
    private Catalogue m_oCatalogue;

    @ElementCollection()
    @Column(name = "keywords")
    @JoinColumn(name="keywordID")
    private List<Keyword> m_lstKeywords;

    @OneToMany()
    @Column(name = "forms")
    @JoinColumn(name="formID")
    private List<Form> m_lstForms;

    public Service(final ServiceTitle oTitle, final ServiceBriefDescription oBriefDescription, final ServiceCompleteDescription oCompleteDescription,
                   final Feedback oFeedback, Catalogue oCatalogue, final List<Keyword> lstKeywords, final List<Form> lstForms) {
        if (oTitle == null || oBriefDescription == null || oCompleteDescription == null || oFeedback == null || oCatalogue == null || lstKeywords.isEmpty() || lstForms.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.m_oTitle = oTitle;
        this.m_oBriefDescription = oBriefDescription;
        this.m_oCompleteDescription = oCompleteDescription;
        this.m_oFeedback = oFeedback;
        this.m_oCatalogue = oCatalogue;
        this.m_lstKeywords = lstKeywords;
        this.m_lstForms = lstForms;
    }

    protected Service() {
        // for ORM only
    }

    public ServiceTitle title() {
        return this.m_oTitle;
    }
    public ServiceBriefDescription briefDescription() {
        return this.m_oBriefDescription;
    }
    public ServiceCompleteDescription completeDescription() {
        return this.m_oCompleteDescription;
    }
    public Feedback feedback() {
        return this.m_oFeedback;
    }
    public Catalogue catalogue() {
        return this.m_oCatalogue;
    }
    public List<Keyword> keywords() {
        return this.m_lstKeywords;
    }
    public List<Form> forms() {
        return this.m_lstForms;
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

    public ServiceID id() {
        return identity();
    }

    @Override
    public ServiceID identity() {
        return this.m_oID;
    }
}
