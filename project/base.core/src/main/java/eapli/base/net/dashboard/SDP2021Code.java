/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.net.dashboard;

public enum SDP2021Code {

        /**
         * Codes.
         */
        TEST(0),
        END(1),
        ROGER(2),
        HTTP_REQUEST(3),
        HTTP_RESPONSE(4),
        AUTOTASK_RESPONSE(5),
        AUTOTASK_REQUEST(6),
        INFO_RESPONSE(7),
        INFO_REQUEST(8),
        SEGMENT(255);

        /**
         * Code.
         */
        private int m_intCode;

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
