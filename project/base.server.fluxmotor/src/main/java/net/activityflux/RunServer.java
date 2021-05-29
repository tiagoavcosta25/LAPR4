/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package net.activityflux;


import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.BasePasswordPolicy;

import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.PlainTextEncoder;
import net.activityflux.domain.ActivityFlowEngine;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Tiago Costa 1191460@isep.ipp.tp
 */
@SuppressWarnings("squid:S106")
public final class RunServer {

    //TODO: read port from properties file
    private static final int BOOKING_PORT = 32507;
    private static final Logger LOGGER = LogManager.getLogger(RunServer.class);

    /**
     * Empty constructor is private to avoid instantiation of this class.
     */
    private RunServer() {
    }

    public static void main(final String[] args) {
        LOGGER.info("Configuring the daemon");

        AuthzRegistry.configure(PersistenceContext.repositories().users(),
                new BasePasswordPolicy(),
                new PlainTextEncoder());

        LOGGER.info("Starting the server socket");
        final ActivityFlowEngine server = new ActivityFlowEngine();
        server.start(BOOKING_PORT, true);

        LOGGER.info("Exiting the daemon");
        System.exit(0);
    }
}
