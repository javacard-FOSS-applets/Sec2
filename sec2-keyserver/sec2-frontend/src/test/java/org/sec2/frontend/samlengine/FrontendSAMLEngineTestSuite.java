/*
 * Copyright 2012 Ruhr-University Bochum, Chair for Network and Data Security
 *
 * This source code is part of the "Sec2" project and as this remains property
 * of the project partners. Content and concepts have to be treated as
 * CONFIDENTIAL. Publication or partly disclosure without explicit
 * written permission is prohibited.
 * For details on "Sec2" and its contributors visit
 *
 *        http://nds.rub.de/research/projects/sec2/
 */
package org.sec2.frontend.samlengine;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Test suite for namespace org.sec2.frontend.samlengine.
 *
 * @author  Dennis Felsch - dennis.felsch@rub.de
 * @version 0.1
 *
 * November 29, 2012
 */
public class FrontendSAMLEngineTestSuite extends TestCase {

    /**
     * Create the test suite.
     *
     * @param testName name of the test case
     */
    public FrontendSAMLEngineTestSuite(final String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        TestSuite suite = new TestSuite();

        suite.addTestSuite(KeyserverRequestVerifierTests.class);
        suite.addTestSuite(KeyserverSignatureEngineTests.class);

        return suite;
    }
}
