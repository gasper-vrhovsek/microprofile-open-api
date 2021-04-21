package org.eclipse.microprofile.asyncapi.annotations;

import org.eclipse.microprofile.asyncapi.annotations.identifier.Identifier;
import org.eclipse.microprofile.asyncapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;

import java.lang.annotation.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * AsyncAPI
 * <p>
 * This is the root document object of the AsyncAPI document. It contains required and optional fields.
 *
 * @see <a href= "https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#A2SObject">AsyncAPI Specification AsyncAPI Object</a>
 */

@Target({ElementType.TYPE, ElementType.PACKAGE })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface AsyncAPIDefinition {
    /**
     * Required. Specifies the AsyncAPI Specification version being used. It can be used by tooling Specifications and clients to interpret the version. The structure shall be major.minor.patch, where patch versions must be compatible with the existing major.minor tooling. Typically patch versions will be introduced to address errors in the documentation, and tooling should typically be compatible with the corresponding major.minor (1.0.*). Patch versions will correspond to patches of this document.
     *
     * @return the id of this API
     * */
    Identifier id();

    /**
     * Required: Provides metadata about the API. The metadata MAY be used by tooling as required.
     *
     * @return the metadata about this API
     */
    Info info();

    /**
     * An array of Server Objects, which provide connectivity information to a target server. If the servers property is not provided, or is an empty
     * array, the default value would be a Server Object with a url value of /.
     *
     * @return the servers of this API
     * */
    Server[] servers() default {};

}
