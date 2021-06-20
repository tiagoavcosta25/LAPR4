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
import eapli.base.collaboratormanagement.domain.Collaborator;
import eapli.base.formmanagement.domain.Form;
import eapli.base.grammar.ScriptAlgorithms;
import eapli.base.grammar.ScriptMode;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.net.SDP2021;
import eapli.base.net.SDP2021Code;
import eapli.base.net.motorflux.ActivityFlowClient;
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
import eapli.base.ticketmanagement.domain.Response;
import eapli.base.ticketmanagement.repository.ResponseRepository;
import eapli.base.util.Application;
import eapli.framework.application.ApplicationService;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
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
    private final ResponseRepository m_oRespRepo = PersistenceContext.repositories().responses();

    public ActivityFluxExecution createActivityFluxExecution(Service oService, Collaborator oCollaborator){

        List<TaskExecution> lstFlux = new ArrayList<>();

        for(Task t : oService.flux().flux()){

            if(this.m_oManualTaskRepo.isManualTask(t.id())){
                ManualTaskExecution oManualExec = new ManualTaskExecution((ManualTask) t);

                if(oService.flux().taskIsApproval(t) && oCollaborator != null){
                    oManualExec.assignCollaborator(oCollaborator);
                }

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

        ActivityFluxExecution oFlux = new ActivityFluxExecution(lstFlux);

        oFlux = this.m_oFluxExecRepo.save(oFlux);

        return oFlux;
    }

    public String getXMLContent(String strScriptName) throws IOException {
        String strPath = System.getProperty("user.dir") + "\\xml\\" + strScriptName + ".xml";
        File oFile = new File(strPath);

        if(oFile.exists() && !oFile.isDirectory()) {
          return FileUtils.readFileToString(oFile, StandardCharsets.UTF_8);
        }
        throw new IOException();
    }

    public Response createAndValidateResponse(Form oForm, List<String> lstAnswer) throws IOException {
        List<String> lstResp = new ArrayList<>(lstAnswer);
        Response oResponse = new Response(oForm, lstResp);
        if(!ScriptAlgorithms.executeValidateForm(oResponse, ScriptMode.get(Application.settings().getScriptMode()))){
            throw new IOException();
        }
        return this.m_oRespRepo.save(oResponse);
    }
}