/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package base.server.autotaskexecutor;


import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.BasePasswordPolicy;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.PlainTextEncoder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Jéssica Alves 1190682@isep.ipp.tp
 */
@SuppressWarnings("squid:S106")
public final class RunExecutor {

    private static final int BOOKING_PORT = 32507;
    private static final Logger LOGGER = LogManager.getLogger(RunExecutor.class);

    /**
     * Empty constructor is private to avoid instantiation of this class.
     */
    private RunExecutor() {
    }

    public static void main(final String[] args) throws Exception {
        LOGGER.info("Configuring the daemon");

        AuthzRegistry.configure(PersistenceContext.repositories().users(),
                new BasePasswordPolicy(),
                new PlainTextEncoder());

        LOGGER.info("Starting the server socket");
        final TCPServerAutoTaskExecutor server = new TCPServerAutoTaskExecutor();
        server.main(BOOKING_PORT);

        LOGGER.info("Exiting the daemon");
        System.exit(0);
    }
}