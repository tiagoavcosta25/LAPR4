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
import eapli.base.activityfluxmanagement.specification.domain.ActivityFlux;
import eapli.base.cataloguemanagement.domain.Catalogue;
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
public class Service implements AggregateRoot<Long> {

    @Version
    private Long version;

    @Id
    @GeneratedValue
    @Column(name = "serviceID")
    private Long m_lngID;

    @Embedded
    private ServiceTitle m_oTitle;

    @Embedded
    private ServiceIcon m_oIcon;
    
    @Embedded
    private ServiceBriefDescription m_oBriefDescription;

    @Embedded
    private ServiceCompleteDescription m_oCompleteDescription;

    @Embedded
    private Feedback m_oFeedback;

    @ManyToOne
    @JoinColumn(name="catalogueID")
    private Catalogue m_oCatalogue;

    @ElementCollection
    @Column(name = "serviceDraftKeywords")
    private List<Keyword> m_lstKeywords;

    @OneToMany
    @Column(name = "serviceForms")
    private List<Form> m_lstForms;

    @ManyToOne
    @JoinColumn(name="fluxID")
    private ActivityFlux m_oActivityFlux;

    public Service(final ServiceTitle oTitle, final ServiceIcon oIcon,final ServiceBriefDescription oBriefDescription, final ServiceCompleteDescription oCompleteDescription,
                   final Feedback oFeedback, Catalogue oCatalogue, final List<Keyword> lstKeywords, final List<Form> lstForms, ActivityFlux oActivityFlux) {
        if (oTitle == null || oIcon == null || oBriefDescription == null || oCompleteDescription == null || oCatalogue == null || lstKeywords == null || lstForms == null || lstKeywords.isEmpty()  || lstForms.isEmpty() || oActivityFlux == null) {
            throw new IllegalArgumentException();
        }
        this.m_oTitle = oTitle;
        this.m_oIcon = oIcon;
        this.m_oBriefDescription = oBriefDescription;
        this.m_oCompleteDescription = oCompleteDescription;
        this.m_oFeedback = oFeedback;
        this.m_oCatalogue = oCatalogue;
        this.m_lstKeywords = lstKeywords;
        this.m_lstForms = lstForms;
        this.m_oActivityFlux = oActivityFlux;
    }

    protected Service() {
        // for ORM only
    }

    public ServiceTitle title() {
        return this.m_oTitle;
    }
    public ServiceIcon icon() {
        return this.m_oIcon;
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
    public ActivityFlux flux() {
        return this.m_oActivityFlux;
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
        return "Service Title: " + m_oTitle + " | Brief Description: " + m_oBriefDescription;
    }
}
