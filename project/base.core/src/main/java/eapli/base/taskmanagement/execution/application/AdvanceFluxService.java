package eapli.base.taskmanagement.execution.application;

import eapli.base.activityfluxmanagement.execution.domain.ActivityFluxExecution;
import eapli.base.activityfluxmanagement.execution.repositories.ActivityFluxExecutionRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.net.SDP2021;
import eapli.base.net.SDP2021Code;
import eapli.base.net.motorflux.ActivityFlowClient;
import eapli.base.taskmanagement.specification.domain.TaskFilterFields;
import eapli.base.taskmanagement.specification.repositories.TaskRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.ApplicationService;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.Arrays;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@ApplicationService
public class AdvanceFluxService {

    private static final String SERVER_IP = "127.0.0.1"; //"10.9.20.133"

    private final AuthorizationService m_oAuthz = AuthzRegistry.authorizationService();

    public boolean advanceFlux(ActivityFluxExecution af) {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.COLLABORATOR);

        ActivityFlowClient oActivityFlow = new ActivityFlowClient(SERVER_IP);

        SDP2021 packet = oActivityFlow.retrieveInformation(String.valueOf(af.id()),
                SDP2021Code.FLUX_ADVANCE_REQUEST.getCode());

        oActivityFlow.retrieveInformation("", SDP2021Code.END.getCode());

        return packet.getData().equals("SUCCESS");
    }
}
