package eapli.base.taskmanagement.domain;

import eapli.base.formmanagement.domain.Form;
import eapli.base.ticketmanagement.domain.Response;
import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.*;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
@Entity
public class ManualTaskExecution implements AggregateRoot<Long> {
    @Version
    private Long version;

    @Id
    @GeneratedValue
    @Column(name = "executionTaskID")
    private Long m_oID;

    @OneToOne
    @JoinColumn(name="responses")
    private Response m_oResponse;

    @OneToOne
    @JoinColumn(name="manualTask")
    private ManualTask m_oTask;

    public ManualTaskExecution(final ManualTask task) {
        if (task == null) {
            throw new IllegalArgumentException();
        }
        this.m_oTask = task;
    }

    protected ManualTaskExecution() {
        // for ORM only
    }

    public Response verifyExecution() {
        return this.m_oResponse;
    }

    public ManualTask getManualTask() {
        return this.m_oTask;
    }

    public void executeTask(Response response) {
        this.m_oResponse = response;
        m_oTask.setExecuted();
    }

    @Override
    public boolean sameAs(Object other) {
        return false;
    }

    @Override
    public Long identity() {
        return null;
    }
}
