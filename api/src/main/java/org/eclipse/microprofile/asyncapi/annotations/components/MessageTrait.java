package org.eclipse.microprofile.asyncapi.annotations.components;

import org.eclipse.microprofile.asyncapi.annotations.media.Schema;

/**
 * Describes a trait that MAY be applied to a <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#messageObject">
 * Message Object</a>.
 * This object MAY contain any property from the <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#messageObject">
 * Message Object</a>,
 * except payload and traits.
 * <p>
 * If you're looking to apply traits to an operation, see the
 * <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#operationTraitObject">Operation Trait Object</a>.
 */
public @interface MessageTrait {

    /**
     * Schema definition of the application headers. Schema MUST be of type "object". It MUST NOT define the protocol headers.
     *
     * @return headers property
     */
    Schema headers() default @Schema();

    /**
     * Definition of the correlation ID used for message tracing or matching.
     *
     * @return correlationId property
     */
    CorrelationId correlationId() default @CorrelationId();

    /**
     * A string containing the name of the schema format/language used to define the message payload. If omitted,
     * implementations should parse the payload as a <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#schemaObject">
     * Schema object</a>.
     *
     * @return schemaFormat property
     */
    String schemaFormat() default "";
}
