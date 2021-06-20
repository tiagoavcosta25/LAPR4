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

import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.taskmanagement.specification.domain.ManualTask;
import eapli.base.taskmanagement.specification.domain.Task;
import eapli.base.ticketmanagement.domain.Response;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 * @author Jéssica Alves 1190682@isep.ipp.pt
 * @author Pedro Santos 1190967@isep.ipp.pt
 */

@Entity
public class ManualTaskExecution extends TaskExecution{

    @OneToOne
    @JoinColumn(name="m_oMechanographicNumber")
    private Collaborator m_oCollaborator;

    @OneToOne
    @JoinColumn(name="responses")
    private Response m_oResponse;

    @ManyToOne
    private ManualTask m_oManualTask;

    public ManualTaskExecution(final ManualTask oManualTask) {
        if(oManualTask == null){
            throw new IllegalArgumentException();
        }
        this.m_oManualTask = oManualTask;
        super.setPending();
        super.setResult(TaskExecutionResult.NO_RESULT);
    }

    protected ManualTaskExecution() {
        // for ORM only
    }

    public ManualTask getM_oManualTask() {
        return m_oManualTask;
    }

    public Collaborator getM_oCollaborator() {
        return m_oCollaborator;
    }

    public void setResponse(Response oResponse) {
        this.m_oResponse = oResponse;
    }

    public void assignCollaborator(Collaborator oCollaborator) {
        this.m_oCollaborator = oCollaborator;
    }

    public Response verifyExecution() {
        return this.m_oResponse;
    }

    public void executeTask(Response response) {
        this.m_oResponse = response;
        super.setResult(TaskExecutionResult.SUCCESS);
        setExecuted();
    }

    @Override
    public String toString() {
        return "Manual Task Execution #" + this.id() + ": " + " | Task #" + this.m_oManualTask.id() + ": " + this.m_oManualTask.description();
    }
}
