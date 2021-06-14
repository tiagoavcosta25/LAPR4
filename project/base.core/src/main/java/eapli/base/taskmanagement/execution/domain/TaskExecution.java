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
package eapli.base.taskmanagement.execution.domain;

import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.*;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 * @author Jéssica Alves 1190682@isep.ipp.pt
 * @author Pedro Santos 1190967@isep.ipp.pt
 */

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class TaskExecution implements AggregateRoot<Long> {

    @Version
    private Long version;

    @Id
    @GeneratedValue
    @Column(name = "taskExecID")
    private Long m_oID;

    @Enumerated(EnumType.STRING)
    private TaskExecutionStatus m_oTaskStatus;

    @Enumerated(EnumType.STRING)
    private TaskExecutionResult m_oTaskResult;

    protected TaskExecution() {
        // for ORM only
    }

    public TaskExecutionStatus status() {
        return this.m_oTaskStatus;
    }

    public TaskExecutionResult result() {
        return this.m_oTaskResult;
    }

    public void setResult(TaskExecutionResult m_oTaskResult) {
        this.m_oTaskResult = m_oTaskResult;
    }

    public void setPending() {
        this.m_oTaskStatus = TaskExecutionStatus.PENDING;
    }

    public void setExecuting() {
        this.m_oTaskStatus = TaskExecutionStatus.DOING;
    }

    public void setExecuted() {
        this.m_oTaskStatus = TaskExecutionStatus.DONE;
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
