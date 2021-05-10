package org.eclipse.microprofile.asyncapi.annotations;

import org.eclipse.microprofile.asyncapi.annotations.channels.ChannelItem;
import org.eclipse.microprofile.asyncapi.annotations.components.Components;
import org.eclipse.microprofile.asyncapi.annotations.identifier.Identifier;
import org.eclipse.microprofile.asyncapi.annotations.info.Info;
import org.eclipse.microprofile.asyncapi.annotations.servers.Server;
import org.eclipse.microprofile.asyncapi.annotations.tags.Tag;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Inherited;


/**
 * AsyncAPI
 * <p>
 * This is the root document object of the AsyncAPI document. It contains required and optional fields.
 *
 * @see <a href= "https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#A2SObject">AsyncAPI Specification AsyncAPI Object</a>
 */

@Target({ElementType.TYPE, ElementType.PACKAGE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface AsyncAPIDefinition {

    /**
     * The identifier property from an AsyncAPI instance.
     *
     * @return the api identifier
     */
    Identifier id();

    /**
     * Required: Provides metadata about the API. The metadata MAY be used by tooling as required.
     *
     * @return the metadata about this API
     */
    Info info();

    // TODO check if openapi definition is ok

    /**
     * Any additional external documentation for the API
     *
     * @return the external documentation for this API.
     */
    ExternalDocumentation externalDocs() default @ExternalDocumentation;

    /**
     * An array of Server Objects, which provide connectivity information to a target server. If the servers property is not provided, or is an empty
     * array, the default value would be a Server Object with a url value of /.
     *
     * @return the servers of this API
     */
    Server[] servers() default {};

    /**
     * The available channels and messages for the API. This field is required
     *
     * @return the available channels
     */
    ChannelItem[] channels();

    /**
     * A list of tags used by the specification with additional metadata. The order of the tags can be used to reflect on their order by the parsing
     * tools.
     *
     * @return the tags used by the specification with any additional metadata
     */
    Tag[] tags() default {};

    /**
     * An element to hold various schemas for the specification.
     *
     * @return available components
     */
    Components components() default @Components;
}
