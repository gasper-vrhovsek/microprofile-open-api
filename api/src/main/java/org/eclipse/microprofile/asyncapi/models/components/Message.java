package org.eclipse.microprofile.asyncapi.models.components;

import org.eclipse.microprofile.asyncapi.models.bindings.MessageBindings;
import org.eclipse.microprofile.asyncapi.models.media.Schema;
import org.eclipse.microprofile.openapi.models.Constructible;
import org.eclipse.microprofile.openapi.models.Extensible;
import org.eclipse.microprofile.openapi.models.ExternalDocumentation;
import org.eclipse.microprofile.openapi.models.Reference;
import org.eclipse.microprofile.openapi.models.tags.Tag;

import java.util.Map;

/**
 * Describes a message received on a given channel and operation
 */
public interface Message extends Constructible, Extensible<Message>, Reference<Message> {

    /**
     * Returns schema definition of the application headers. Schema MUST be of type "object". It MUST NOT define
     * the protocol headers.
     *
     * @return headers property
     */
    Schema getHeaders();

    /**
     * Sets schema definition of the application headers. Schema MUST be of type "object". It MUST NOT define
     * the protocol headers.
     *
     * @param headers headers property
     */
    void setHeaders(Schema headers);

    /**
     * Sets schema definition of the application headers. Schema MUST be of type "object". It MUST NOT define
     * the protocol headers.
     *
     * @param headers headers property
     * @return Message instance with the headers property set
     */
    default Message headers(Schema headers) {
        setHeaders(headers);
        return this;
    }

    /**
     * Returns the definition of the message payload. It can be of any type but defaults to
     * <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#schemaObject">Schema object</a>.
     *
     * @return payload property
     */
    Object getPayload();

    /**
     * Sets the definition of the message payload. It can be of any type but defaults to
     * <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#schemaObject">Schema object</a>.
     *
     * @param payload payload property
     */
    void setPayload(Object payload);

    /**
     * Sets the definition of the message payload. It can be of any type but defaults to
     * <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#schemaObject">Schema object</a>.
     *
     * @param payload payload property
     * @return Message instance with the payload property set
     */
    default Message payload(Object payload) {
        setPayload(payload);
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
     * @return Message instance with the correlationId property set
     */
    default Message correlationId(CorrelationId correlationId) {
        setCorrelationId(correlationId);
        return this;
    }

    /**
     * Returns a string containing the name of the schema format used to define the message payload. If omitted,
     * implementations should parse the payload as a <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#schemaObject">
     * Schema object</a>.
     * Check out the <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#messageObjectSchemaFormatTable">
     * supported schema formats table</a>
     * for more information. Custom values are allowed but their implementation is OPTIONAL. A custom value MUST NOT refer
     * to one of the schema formats listed in the
     * <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#messageObjectSchemaFormatTable">table</a>.
     *
     * @return schemaFormat property
     */
    String getSchemaFormat();

    /**
     * Sets a string containing the name of the schema format used to define the message payload. If omitted,
     * implementations should parse the payload as a <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#schemaObject">
     *     Schema object</a>.
     * Check out the <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#messageObjectSchemaFormatTable">
     *     supported schema formats table</a>
     * for more information. Custom values are allowed but their implementation is OPTIONAL. A custom value MUST NOT refer
     * to one of the schema formats listed in the
     * <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#messageObjectSchemaFormatTable">table</a>.
     *
     * @param schemaFormat schemaFormat property
     */
    void setSchemaFormat(String schemaFormat);

    /**
     * Sets a string containing the name of the schema format used to define the message payload. If omitted,
     * implementations should parse the payload as a <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#schemaObject">
     *     Schema object</a>.
     * Check out the <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#messageObjectSchemaFormatTable">
     *     supported schema formats table</a>
     * for more information. Custom values are allowed but their implementation is OPTIONAL. A custom value MUST NOT refer
     * to one of the schema formats listed in the
     * <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#messageObjectSchemaFormatTable">table</a>.
     *
     * @param schemaFormat schemaFormat property
     * @return message instance with the schemaFormat property set
     */
    default Message schemaFormat(String schemaFormat) {
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
     * @return Message instance with the contentType property set
     */
    default Message contentType(String contentType) {
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
     * @return Message instance with the name property set
     */
    default Message name(String name) {
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
     * @return Message instance with the title property set
     */
    default Message title(String title) {
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
     * @return Message instance with the summary property set
     */
    default Message summary(String summary) {
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
    default Message description(String description) {
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
     * @return Message instance with the tags property set
     */
    default Message tags(Tag[] tags) {
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
     * @return Message instance with the externalDocs property set
     */
    default Message externalDocs(ExternalDocumentation externalDocs) {
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
     * @return Message instance with the bindings property set
     */
    default Message bindings(MessageBindings bindings) {
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
     * @return Message instance with the examples property set
     */
    default Message examples(Map<String, Object> examples) {
        setExamples(examples);
        return this;
    }

    /**
     * Returns a list of traits to apply to the message object. Traits MUST be merged into the message object using the
     * <a href="https://tools.ietf.org/html/rfc7386">JSON Merge Patch</a> algorithm in the same order they are defined
     * here. The resulting object MUST be a valid
     * <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#messageObject">Message Object</a>.
     *
     * @return traits property
     */
    MessageTrait[] getTraits();

    /**
     * Sets a list of traits to apply to the message object. Traits MUST be merged into the message object using the
     * <a href="https://tools.ietf.org/html/rfc7386">JSON Merge Patch</a> algorithm in the same order they are defined
     * here. The resulting object MUST be a valid
     * <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#messageObject">Message Object</a>.
     *
     * @param traits traits property
     */
    void setTraits(MessageTrait[] traits);

    /**
     * Sets a list of traits to apply to the message object. Traits MUST be merged into the message object using the
     * <a href="https://tools.ietf.org/html/rfc7386">JSON Merge Patch</a> algorithm in the same order they are defined
     * here. The resulting object MUST be a valid
     * <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#messageObject">Message Object</a>.
     *
     * @param traits traits property
     * @return Message instance with the traits property set
     */
    default Message traits(MessageTrait[] traits) {
        setTraits(traits);
        return this;
    }
}
