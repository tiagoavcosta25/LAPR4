package eapli.base.taskmanagement.application;

import eapli.base.taskmanagement.domain.TaskOrderFields;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.ApplicationService;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.Arrays;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@ApplicationService
public class ListTaskOrderFieldsService {

    private final AuthorizationService m_oAuthz = AuthzRegistry.authorizationService();

    public Iterable<TaskOrderFields> getTaskOrderFields() {
        m_oAuthz.ensureAuthenticatedUserHasAnyOf(BaseRoles.USER);
        return Arrays.asList(TaskOrderFields.values());
    }
}
