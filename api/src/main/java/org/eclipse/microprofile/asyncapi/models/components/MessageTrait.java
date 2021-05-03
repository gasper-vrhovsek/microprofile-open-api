package org.eclipse.microprofile.asyncapi.models.components;

import org.eclipse.microprofile.asyncapi.models.media.Schema;
import org.eclipse.microprofile.openapi.models.Constructible;
import org.eclipse.microprofile.openapi.models.Extensible;
import org.eclipse.microprofile.openapi.models.Reference;

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
public interface MessageTrait extends Constructible, Extensible<MessageTrait>, Reference<MessageTrait> {

    /**
     * Returns schema definition of the application headers. Schema MUST be of type "object". It MUST NOT define the protocol headers.
     *
     * @return headers property
     */
    Schema getHeaders();

    /**
     * Sets schema definition of the application headers. Schema MUST be of type "object". It MUST NOT define the protocol headers.
     *
     * @param headers headers property
     */
    void setHeaders(Schema headers);

    /**
     * Sets schema definition of the application headers. Schema MUST be of type "object". It MUST NOT define the protocol headers.
     *
     * @param headers headers property
     * @return MessageTrait instance with the headers property set
     */
    default MessageTrait headers(Schema headers) {
        setHeaders(headers);
        return this;
    }

    /**
     * Returns the definition of the correlation ID used for message tracing or matching.
     *
     * @return correlationId property
     */
    CorrelationId getCorrelationId();

    /**
     * Sets the definition of the correlation ID used for message tracing or matching.
     *
     * @param correlationId correlationId property
     */
    void setCorrelationId(CorrelationId correlationId);

    /**
     * Sets the definition of the correlation ID used for message tracing or matching.
     *
     * @param correlationId correlationId property
     * @return MessageTrait instance with the correlationId property set
     */
    default MessageTrait correlationId(CorrelationId correlationId) {
        setCorrelationId(correlationId);
        return this;
    }

    /**
     * A string containing the name of the schema format/language used to define the message payload. If omitted,
     * implementations should parse the payload as a <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#schemaObject">
     * Schema object</a>.
     *
     * @return schemaFormat property
     */
    String getSchemaFormat();

    /**
     * A string containing the name of the schema format/language used to define the message payload. If omitted,
     * implementations should parse the payload as a <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#schemaObject">
     * Schema object</a>.
     *
     * @param schemaFormat schemaFormat property
     */
    void setSchemaFormat(String schemaFormat);

    /**
     * A string containing the name of the schema format/language used to define the message payload. If omitted,
     * implementations should parse the payload as a <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#schemaObject">
     * Schema object</a>.
     *
     * @param schemaFormat schemaFormat property
     * @return MessageTrait instance with the schemaFormat property set
     */
    default MessageTrait schemaFormat(String schemaFormat) {
        setSchemaFormat(schemaFormat);
        return this;
    }
}
