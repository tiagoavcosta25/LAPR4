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

import eapli.base.formmanagement.domain.Form;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.*;
import java.util.List;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */

@Entity
public class ServiceDraft implements AggregateRoot<Long> {

    @Version
    private Long version;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long m_lngID;

    /**
     * cascade = CascadeType.NONE as the systemUser is part of another aggregate
     */
    @Basic
    @Column(name = "title")
    private String m_strTitle;

    @Basic
    @Column(name = "briefDescription")
    private String m_strBriefDescription;

    @Basic
    @Column(name = "completeDescription")
    private String m_strCompleteDescription;

    @Basic
    @Column(name = "feedback")
    private Double m_dblFeedback;

    @ElementCollection
    @Column(name = "keywords")
    private List<String> m_lstKeywords;

    @OneToMany()
    @Column(name = "forms")
    private List<Form> m_lstForms;

    public ServiceDraft(final Long lngID, final String strTitle, final String strBriefDescription, final String strCompleteDescription,
                        final Double dblFeedback, final List<String> lstKeywords, final List<Form> lstForms) {
        if (lngID == null || strTitle == null || strBriefDescription == null || strCompleteDescription == null || dblFeedback == null || lstKeywords.isEmpty() || lstForms.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.m_lngID = lngID;
        this.m_strBriefDescription = strBriefDescription;
        this.m_strCompleteDescription = strCompleteDescription;
        this.m_dblFeedback = dblFeedback;
        this.m_lstKeywords = lstKeywords;
        this.m_lstForms = lstForms;
    }

    public ServiceDraft() {
        // for ORM only
    }

    public String BriefDescription() {
        return this.m_strBriefDescription;
    }

    public Long getID() {
        return m_lngID;
    }

    public String getTitle() {
        return m_strTitle;
    }

    public String getBriefDescription() {
        return m_strBriefDescription;
    }

    public String getCompleteDescription() {
        return m_strCompleteDescription;
    }

    public Double getFeedback() {
        return m_dblFeedback;
    }

    public List<String> getKeywordList() {
        return m_lstKeywords;
    }

    public List<Form> getFormList() {
        return m_lstForms;
    }

    public void setID(Long m_lngID) {
        this.m_lngID = m_lngID;
    }

    public void setTitle(String m_strTitle) {
        this.m_strTitle = m_strTitle;
    }

    public void setBriefDescription(String m_strBriefDescription) {
        this.m_strBriefDescription = m_strBriefDescription;
    }

    public void setCompleteDescription(String m_strCompleteDescription) {
        this.m_strCompleteDescription = m_strCompleteDescription;
    }

    public void setFeedback(Double m_dblFeedback) {
        this.m_dblFeedback = m_dblFeedback;
    }

    public void setKeywordList(List<String> m_lstKeywords) {
        this.m_lstKeywords = m_lstKeywords;
    }

    public void setFormList(List<Form> m_lstForms) {
        this.m_lstForms = m_lstForms;
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
}
