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
package org.sec2.saml.xml.validator;

import org.sec2.saml.xml.UserRequestType;

/**
 * Checks {@link org.sec2.saml.xml.UserRequestType} for schema compliance.
 *
 * @author  Dennis Felsch - dennis.felsch@rub.de
 * @version 0.1
 *
 * August 06, 2012
 *
 * @param <T> the type to be validated
 */
public class UserRequestTypeSchemaValidator<T extends UserRequestType>
                    extends UserBaseTypeSchemaValidator<T> {
}
