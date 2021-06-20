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
package eapli.base.activityfluxmanagement.specification.domain;

import eapli.base.taskmanagement.specification.domain.Task;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.*;
import java.util.List;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */

@Entity
public class ActivityFlux implements AggregateRoot<Long> {

    @Version
    private Long version;

    @Id
    @GeneratedValue
    @Column(name = "fluxID")
    private Long m_oID;

    @OneToMany
    @Column(name = "activityFlux")
    private List<Task> m_lstFlux;

    public ActivityFlux(final List<Task> lstFlux) {
        if (lstFlux.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.m_lstFlux = lstFlux;
    }

    protected ActivityFlux() {
        // for ORM only
    }

    public List<Task> flux() {
        return this.m_lstFlux;
    }

    public void addTask(Task oTask) {
        this.m_lstFlux.add(oTask);
    }

    public boolean taskIsApproval(Task task) {
        if(this.m_lstFlux.size() < 2) return false;
        if(!this.m_lstFlux.contains(task)) return false;
        return this.m_lstFlux.indexOf(task) == 0;
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
        return this.m_oID;
    }
}
