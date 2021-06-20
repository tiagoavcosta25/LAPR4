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

import eapli.base.taskmanagement.specification.domain.AutomaticTask;
import eapli.base.taskmanagement.specification.domain.Task;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * @author Jéssica Alves 1190682@isep.ipp.pt
 * @author Pedro Santos 1190967@isep.ipp.pt
 */

@Entity
public class AutomaticTaskExecution extends TaskExecution{

    @ManyToOne
    private AutomaticTask m_oAutomaticTask;

    public AutomaticTaskExecution(final AutomaticTask oAutomaticTask) {
        if(oAutomaticTask == null){
            throw new IllegalArgumentException();
        }
        this.m_oAutomaticTask = oAutomaticTask;
        super.setPending();
        super.setResult(TaskExecutionResult.NO_RESULT);
    }

    public AutomaticTask getM_oAutomaticTask() {
        return m_oAutomaticTask;
    }

    protected AutomaticTaskExecution() {
        // for ORM only
    }

    @Override
    public void setExecuted() {
        super.setExecuted();
        super.setResult(TaskExecutionResult.APPROVED);
    }

    @Override
    public String toString() {
        return "Automatic Task Execution #" + this.id() + ": " + " | Task #" + this.m_oAutomaticTask.id() + ": " + this.m_oAutomaticTask.description();
    }
}
