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
package org.sec2.frontend.exceptions;

/**
 * Tests for XMLProcessExceptions.
 *
 * @author  Dennis Felsch - dennis.felsch@rub.de
 * @version 0.1
 *
 * November 16, 2012
 */
public class XMLProcessExceptionTests extends
        AbstractKeyserverExceptionTests<XMLProcessException> {

    /** {@inheritDoc} */
    @Override
    protected Class getClassLiteral() {
        return XMLProcessException.class;
    }
}
