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

import eapli.base.activityfluxmanagement.domain.ActivityFluxExecution;
import eapli.base.activityfluxmanagement.domain.ActivityFluxExecutionProgress;
import eapli.base.activityfluxmanagement.repositories.ActivityFluxExecutionRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.taskmanagement.domain.*;
import eapli.base.taskmanagement.repositories.TaskExecutionRepository;
import eapli.base.taskmanagement.repositories.TaskRepository;
import eapli.framework.application.ApplicationService;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pedro Santos 1190967@isep.ipp.pt
 */
@ApplicationService
public class ServiceSolicitationService {

    private final TaskRepository m_oTaskRepo = PersistenceContext.repositories().tasks();
    private final TaskExecutionRepository m_oTaskExecRepo = PersistenceContext.repositories().taskExecs();
    private final ActivityFluxExecutionRepository m_oFluxExecRepo = PersistenceContext.repositories().fluxExecs();

    public ActivityFluxExecution createActivityFluxExecution(Service oService) {

        List<TaskExecution> lstFlux = new ArrayList<>();

        for(Task t : oService.flux().flux()){

            //boolean flag = this.m_oTaskRepo.isManualTask(t.id());
            boolean flag = true;
            if(flag){
                ManualTaskExecution oManualExec = new ManualTaskExecution(t);
                oManualExec = this.m_oTaskExecRepo.save(oManualExec);
                lstFlux.add(oManualExec);
            } else{
                AutomaticTaskExecution oAutoExec = new AutomaticTaskExecution(t);
                oAutoExec = this.m_oTaskExecRepo.save(oAutoExec);
                lstFlux.add(oAutoExec);
            }
        }

        ActivityFluxExecutionProgress oProgress = new ActivityFluxExecutionProgress(0);

        ActivityFluxExecution oFlux = new ActivityFluxExecution(oProgress, lstFlux);

        oFlux = this.m_oFluxExecRepo.save(oFlux);

        return oFlux;
    }
}