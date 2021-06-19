/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.net;

/**
 * @author Pedro Santos (1190967@isep.ipp.pt)
 */

public enum SDP2021Code {

        /**
         * Codes.
         */
        TEST(0),
        END(1),
        ROGER(2),
        AUTOTASK_RESPONSE_SUCCESS(3),
        AUTOTASK_REQUEST(4),
        INFO_RESPONSE(5),
        INFO_REQUEST(6),
        AUTOTASK_RESPONSE_FAILURE(7),
        FLUX_ADVANCE_RESPONSE(8),
        FLUX_ADVANCE_REQUEST(9),
        FLUX_CREATION_RESPONSE(10),
        FLUX_CREATION_REQUEST(11),
        SEGMENT(255);

        /**
         * Code.
         */
        private final int m_intCode;

        /**
         * An empty constructor of SDP2021Code.
         * @param intCode Code.
         */
        SDP2021Code(int intCode) {
            this.m_intCode = intCode;
        }

        public int getCode() {
            return m_intCode;
        }
}
