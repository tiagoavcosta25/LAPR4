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
package eapli.base.ticketmanagement.application;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecutionProgress;
import eapli.base.activityfluxmanagement.execution.repositories.ActivityFluxExecutionRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.taskmanagement.execution.domain.AutomaticTaskExecution;
import eapli.base.taskmanagement.execution.domain.ManualTaskExecution;
import eapli.base.taskmanagement.execution.domain.TaskExecution;
import eapli.base.taskmanagement.execution.repositories.TaskExecutionRepository;
import eapli.base.taskmanagement.specification.domain.AutomaticTask;
import eapli.base.taskmanagement.specification.domain.ManualTask;
import eapli.base.taskmanagement.specification.domain.Task;
import eapli.base.taskmanagement.specification.repositories.AutomaticTaskRepository;
import eapli.base.taskmanagement.specification.repositories.ManualTaskRepository;
import eapli.base.taskmanagement.specification.repositories.TaskRepository;
import eapli.framework.application.ApplicationService;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
@ApplicationService
public class ServiceSolicitationService {

    private final ManualTaskRepository m_oManualTaskRepo = PersistenceContext.repositories().manualTask();
    private final AutomaticTaskRepository m_oAutoTaskRepo = PersistenceContext.repositories().automaticTask();
    private final TaskExecutionRepository m_oTaskExecRepo = PersistenceContext.repositories().taskExecs();
    private final ActivityFluxExecutionRepository m_oFluxExecRepo = PersistenceContext.repositories().fluxExecs();

    public ActivityFluxExecution createActivityFluxExecution(Service oService){

        List<TaskExecution> lstFlux = new ArrayList<>();

        for(Task t : oService.flux().flux()){
            if(this.m_oManualTaskRepo.isManualTask(t.id())){
                ManualTaskExecution oManualExec = new ManualTaskExecution((ManualTask) t);
                oManualExec = this.m_oTaskExecRepo.save(oManualExec);
                lstFlux.add(oManualExec);
            } else if(this.m_oAutoTaskRepo.isAutoTask(t.id())){
                AutomaticTaskExecution oAutoExec = new AutomaticTaskExecution((AutomaticTask) t);
                oAutoExec = this.m_oTaskExecRepo.save(oAutoExec);
                lstFlux.add(oAutoExec);
            } else{
                throw new IllegalArgumentException();
            }
        }

        ActivityFluxExecutionProgress oProgress = new ActivityFluxExecutionProgress(0);

        ActivityFluxExecution oFlux = new ActivityFluxExecution(oProgress, lstFlux);

        oFlux = this.m_oFluxExecRepo.save(oFlux);

        return oFlux;
    }
}