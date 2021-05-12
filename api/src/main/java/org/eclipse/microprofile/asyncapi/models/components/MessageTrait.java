package org.eclipse.microprofile.asyncapi.models.components;

import org.eclipse.microprofile.asyncapi.models.Constructible;
import org.eclipse.microprofile.asyncapi.models.Extensible;
import org.eclipse.microprofile.asyncapi.models.ExternalDocumentation;
import org.eclipse.microprofile.asyncapi.models.Reference;
import org.eclipse.microprofile.asyncapi.models.bindings.MessageBindings;
import org.eclipse.microprofile.asyncapi.models.media.Schema;
import org.eclipse.microprofile.asyncapi.models.tags.Tag;

import java.util.Map;

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

    /**
     * Returns the content type to use when encoding/decoding a message's payload. The value MUST be a specific media type
     * (e.g. {@code application/json}). When omitted, the value MUST be the one specified on the
     * <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#defaultContentTypeString">defaultContentType</a> field.
     *
     * @return contentType property
     */
    String getContentType();

    /**
     * Sets the content type to use when encoding/decoding a message's payload. The value MUST be a specific media type
     * (e.g. {@code application/json}). When omitted, the value MUST be the one specified on the
     * <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#defaultContentTypeString">defaultContentType</a> field.
     *
     * @param contentType contentType property
     */
    void setContentType(String contentType);

    /**
     * Sets the content type to use when encoding/decoding a message's payload. The value MUST be a specific media type
     * (e.g. {@code application/json}). When omitted, the value MUST be the one specified on the
     * <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#defaultContentTypeString">defaultContentType</a> field.
     *
     * @param contentType contentType property
     * @return MessageTrait instance with the contentType property set
     */
    default MessageTrait contentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * Returns a machine-friendly name for the message.
     *
     * @return name property
     */
    String getName();

    /**
     * Sets a machine-friendly name for the message.
     *
     * @param name name property
     */
    void setName(String name);

    /**
     * Sets a machine-friendly name for the message.
     *
     * @param name name property
     * @return MessageTrait instance with the name property set
     */
    default MessageTrait name(String name) {
        setName(name);
        return this;
    }

    /**
     * Returns a human-friendly title for the message.
     *
     * @return title property
     */
    String getTitle();

    /**
     * Sets a human-friendly title for the message.
     *
     * @param title title property
     */
    void setTitle(String title);

    /**
     * Sets a human-friendly title for the message.
     *
     * @param title title property
     * @return MessageTrait instance with the title property set
     */
    default MessageTrait title(String title) {
        setTitle(title);
        return this;
    }

    /**
     * Returns a short summary of what the message is about.
     *
     * @return summary property
     */
    String getSummary();

    /**
     * Sets a short summary of what the message is about.
     *
     * @param summary summary property
     */
    void setSummary(String summary);

    /**
     * Sets a short summary of what the message is about.
     *
     * @param summary summary property
     * @return MessageTrait instance with the summary property set
     */
    default MessageTrait summary(String summary) {
        setSummary(summary);
        return this;
    }

    /**
     * Returns a verbose explanation of the message. <a href="http://spec.commonmark.org/">CommonMark syntax</a> can be used for
     * rich text representation.
     *
     * @return description property
     */
    String getDescription();

    /**
     * Sets a verbose explanation of the message. <a href="http://spec.commonmark.org/">CommonMark syntax</a> can be used for
     * rich text representation.
     *
     * @param description description property
     */
    void setDescription(String description);

    /**
     * Sets a verbose explanation of the message. <a href="http://spec.commonmark.org/">CommonMark syntax</a> can be used for
     * rich text representation.
     *
     * @param description description property
     * @return Message instance with the description property set
     */
    default MessageTrait description(String description) {
        setDescription(description);
        return this;
    }

    /**
     * Returns a list of tags for API documentation control. Tags can be used for logical grouping of messages.
     *
     * @return tags property
     */
    Tag[] getTags();

    /**
     * Sets a list of tags for API documentation control. Tags can be used for logical grouping of messages.
     *
     * @param tags tags property
     */
    void setTags(Tag[] tags);

    /**
     * Sets a list of tags for API documentation control. Tags can be used for logical grouping of messages.
     *
     * @param tags tags property
     * @return MessageTrait instance with the tags property set
     */
    default MessageTrait tags(Tag[] tags) {
        setTags(tags);
        return this;
    }

    /**
     * Returns additional external documentation for this message.
     *
     * @return externalDocs property
     */
    ExternalDocumentation getExternalDocs();

    /**
     * Sets additional external documentation for this message.
     *
     * @param externalDocs externalDocs property
     */
    void setExternalDocs(ExternalDocumentation externalDocs);

    /**
     * Sets additional external documentation for this message.
     *
     * @param externalDocs externalDocs property
     * @return MessageTrait instance with the externalDocs property set
     */
    default MessageTrait externalDocs(ExternalDocumentation externalDocs) {
        setExternalDocs(externalDocs);
        return this;
    }

    /**
     * Returns a map where the keys describe the name of the protocol and the values describe protocol-specific definitions for the message.
     *
     * @return Bindings property
     */
    MessageBindings getBindings();

    /**
     * Sets a map where the keys describe the name of the protocol and the values describe protocol-specific definitions for the message.
     *
     * @param bindings Bindings property
     */
    void setBindings(MessageBindings bindings);

    /**
     * Sets a map where the keys describe the name of the protocol and the values describe protocol-specific definitions for the message.
     *
     * @param bindings Bindings property
     * @return MessageTrait instance with the bindings property set
     */
    default MessageTrait bindings(MessageBindings bindings) {
        setBindings(bindings);
        return this;
    }

    /**
     * Returns an array of key/value pairs where keys MUST be either headers and/or payload. Values MUST contain examples
     * that validate against the <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#messageObjectHeaders">headers</a>
     * or <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#messageObjectPayload">payload</a> fields, respectively.
     *
     * @return examples property
     */
    Map<String, Object> getExamples();

    /**
     * Sets an array of key/value pairs where keys MUST be either headers and/or payload. Values MUST contain examples
     * that validate against the <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#messageObjectHeaders">headers</a>
     * or <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#messageObjectPayload">payload</a> fields, respectively.
     *
     * @param examples examples property
     */
    void setExamples(Map<String, Object> examples);

    /**
     * Sets an array of key/value pairs where keys MUST be either headers and/or payload. Values MUST contain examples
     * that validate against the <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#messageObjectHeaders">headers</a>
     * or <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#messageObjectPayload">payload</a> fields, respectively.
     *
     * @param examples examples property
     * @return MessageTrait instance with the examples property set
     */
    default MessageTrait examples(Map<String, Object> examples) {
        setExamples(examples);
        return this;
    }
}
