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
package org.sec2.saml.exceptions;


import org.slf4j.Marker;

/**
 * An exception telling that either no connection to the keyserver is available
 * or the keyserver detected an error.
 *
 * @author  Dennis Felsch - dennis.felsch@rub.de
 * @version 0.1
 *
 * December 02, 2012
 */
public class CipherEngineException extends SAMLEngineException {

    /**
     * A prefix that is logged before each message.
     */
    private static final String PREFIX = "Cipher error";

    /**
     * By default, CipherEngineExceptions are an error.
     */
    private static final SeverityLevel DEFAULT_SEVERITY = SeverityLevel.ERROR;

    /**
     * Constructs an instance of <code>CipherEngineException</code>
     * with the specified detail message.
     * @param msg the detail message.
     */
    public CipherEngineException(final String msg) {
        this(msg, null, DEFAULT_SEVERITY, null);
    }

    /**
     * Constructs an instance of <code>CipherEngineException</code>
     * with a cause.
     * @param cause the cause of this exception.
     */
    public CipherEngineException(final Throwable cause) {
        this(cause.getLocalizedMessage(), cause, DEFAULT_SEVERITY, null);
    }

    /**
     * Constructs an instance of <code>CipherEngineException</code>
     * with the specified detail message and a cause.
     * @param msg the detail message.
     * @param cause the cause of this exception.
     */
    public CipherEngineException(final String msg, final Throwable cause) {
        this(msg, cause, DEFAULT_SEVERITY, null);
    }

    /**
     * Constructs an instance of <code>CipherEngineException</code>.
     * @param pMessage the detail message.
     * @param pSeverity the severity label of the log message
     * @param pCause the cause of this exception.
     * @param pMarker the marker of the log message
     */
    public CipherEngineException(final String pMessage, final Throwable pCause,
            final SeverityLevel pSeverity, final Marker pMarker) {
        this(PREFIX, pMessage, pCause, pSeverity, pMarker);
    }

    /**
     * Constructs an instance of <code>CipherEngineException</code>.
     * @param pPrefix a prefix that is put before each log message
     * @param pMessage the detail message.
     * @param pSeverity the severity label of the log message
     * @param pCause the cause of this exception.
     * @param pMarker the marker of the log message
     */
    protected CipherEngineException(final String pPrefix, final String pMessage,
            final Throwable pCause, final SeverityLevel pSeverity,
            final Marker pMarker) {
        super(pPrefix, pMessage, pCause, pSeverity, pMarker);
    }
}
