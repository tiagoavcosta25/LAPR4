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
package eapli.base.activityfluxmanagement.execution.domain;

import eapli.base.taskmanagement.execution.domain.TaskExecution;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.*;
import java.util.List;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.pt
 * @author Pedro Santos 1190967@isep.ipp.pt
 * @author Beatriz Seixas 1190424@isep.ipp.pt
 */

@Entity
public class ActivityFluxExecution implements AggregateRoot<Long> {

    @Version
    private Long version;

    @Id
    @GeneratedValue
    @Column(name = "fluxExecID")
    private Long m_oID;

    @Embedded
    private ActivityFluxExecutionProgress m_oProgress;

    @OneToMany
    @Column(name = "activityFluxExecution")
    private List<TaskExecution> m_lstFlux;

    public ActivityFluxExecution(final List<TaskExecution> lstFlux) {
        if (lstFlux.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.m_oProgress = new ActivityFluxExecutionProgress(lstFlux.get(0).id());
        this.m_lstFlux = lstFlux;
    }

    protected ActivityFluxExecution() {
        // for ORM only
    }

    public ActivityFluxExecutionProgress progess() {
        return this.m_oProgress;
    }
    public List<TaskExecution> flux() {
        return this.m_lstFlux;
    }

    public void addTask(TaskExecution oTask) {
        this.m_lstFlux.add(oTask);
    }

    public ActivityFluxExecutionProgress currentProgress() {
        return this.m_oProgress;
    }

    public void advanceProgress() {
        int i = 0;
        for(TaskExecution te : this.m_lstFlux) {
            if(te.id().equals(this.progess().currentProgress())) {
                break;
            }
            i++;
        }

        // Finish
        if(i + 1 >= this.m_lstFlux.size()) this.m_oProgress = new ActivityFluxExecutionProgress(-1L);

            // Advance
        else this.m_oProgress = new ActivityFluxExecutionProgress(this.m_lstFlux.get(i + 1).id());
    }

    public boolean isFinished() {
        return this.m_oProgress.currentProgress() == -1L;
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