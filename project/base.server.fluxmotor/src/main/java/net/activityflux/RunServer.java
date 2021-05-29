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

/**
 *
 * @author Paulo Gandra Sousa
 */
@SuppressWarnings("squid:S106")
public final class RunServer {

    /**
     * Empty constructor is private to avoid instantiation of this class.
     */
    private RunServer() {
    }

    public static void main(final String[] args) {
        System.out.println("=====================================");
        System.out.println("Base POS");
        System.out.println("(C) 2016, 2017, 2018");
        System.out.println("=====================================");

        AuthzRegistry.configure(PersistenceContext.repositories().users(),
                new BasePasswordPolicy(), new PlainTextEncoder());

        ActivityFlowEngine af = new ActivityFlowEngine();
        af.run();

        // exiting the application, closing all threads
        System.exit(0);
    }
}
