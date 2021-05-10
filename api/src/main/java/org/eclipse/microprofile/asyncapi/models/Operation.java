package org.eclipse.microprofile.asyncapi.models;

import org.eclipse.microprofile.asyncapi.models.bindings.OperationBindings;
import org.eclipse.microprofile.asyncapi.models.components.Message;
import org.eclipse.microprofile.asyncapi.models.components.OperationTrait;
import org.eclipse.microprofile.asyncapi.models.tags.Tag;

import java.util.List;

/**
 * Describes a publish or a subscribe operation. This provides a place to document how and why messages are sent and received.
 *
 * <p>
 * For example, an operation might describe a chat application use case where a user sends a text message to a group.
 * A publish operation describes messages that are received by the chat application, whereas a subscribe operation
 * describes messages that are sent by the chat application.
 * </p>
 */
// TODO look into common interface with OperationTrait org.eclipse.microprofile.asyncapi.models.components.OperationTrait
public interface Operation extends Constructible, Extensible<Operation> {

    /**
     * Returns a unique string used to identify the operation. The id MUST be unique among all operations described
     * in the API. The operationId value is case-sensitive. Tools and libraries MAY use the operationId to uniquely
     * identify an operation, therefore, it is RECOMMENDED to follow common programming naming conventions.
     *
     * @return operationId property
     */
    String getOperationId();

    /**
     * Sets a unique string used to identify the operation. The id MUST be unique among all operations described
     * in the API. The operationId value is case-sensitive. Tools and libraries MAY use the operationId to uniquely
     * identify an operation, therefore, it is RECOMMENDED to follow common programming naming conventions.
     *
     * @param operationId operationId property
     */
    void setOperationId(String operationId);

    /**
     * Sets a unique string used to identify the operation. The id MUST be unique among all operations described
     * in the API. The operationId value is case-sensitive. Tools and libraries MAY use the operationId to uniquely
     * identify an operation, therefore, it is RECOMMENDED to follow common programming naming conventions.
     *
     * @param operationId operationId property
     * @return operation instance with the operationId property set
     */
    default Operation operationId(String operationId) {
        setOperationId(operationId);
        return this;
    }

    /**
     * Returna a short summary of what the operation is about.
     *
     * @return summary property
     */
    String getSummary();

    /**
     * Sets a short summary of what the operation is about.
     *
     * @param summary summary property
     */
    void setSummary(String summary);

    /**
     * Sets a short summary of what the operation is about.
     *
     * @param summary summary property
     * @return operation instance with the summary property set
     */
    default Operation summary(String summary) {
        setSummary(summary);
        return this;
    }

    /**
     * Gets a verbose explanation of the operation. <a href="http://spec.commonmark.org/">CommonMark</a> syntax can be
     * used for rich text representation.
     *
     * @return description property
     */
    String getDescription();

    /**
     * Sets a verbose explanation of the operation. <a href="http://spec.commonmark.org/">CommonMark</a> syntax can be
     * used for rich text representation.
     *
     * @param description description property
     */
    void setDescription(String description);

    /**
     * Sets a verbose explanation of the operation. <a href="http://spec.commonmark.org/">CommonMark</a> syntax can be
     * used for rich text representation.
     *
     * @param description description property
     * @return operation instance with the description property set
     */
    default Operation description(String description) {
        setDescription(description);
        return this;
    }

    /**
     * Returns a list of tags for API documentation control. Tags can be used for logical grouping of operations.
     *
     * @return tags property
     */
    List<Tag> getTags();

    /**
     * Sets a list of tags for API documentation control. Tags can be used for logical grouping of operations.
     *
     * @param tags tags property
     */
    void setTags(List<Tag> tags);

    /**
     * Sets a list of tags for API documentation control. Tags can be used for logical grouping of operations.
     *
     * @param tags tags property
     * @return operation instance with the tags property set
     */
    default Operation tags(List<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Adds the given tag to this Operation's list of tags.
     *
     * @param tag a tag for API documentation control
     * @return the current Operation object
     **/
    Operation addTag(String tag);

    /**
     * Removes the given tag to this Operation's list of tags.
     *
     * @param tag a tag for API documentation control
     **/
    void removeTag(String tag);

    /**
     * Returns additional external documentation for this operation.
     *
     * @return externalDocs property
     */
    ExternalDocumentation getExternalDocs();

    /**
     * Sets additional external documentation for this operation.
     *
     * @param externalDocs externalDocs property
     */
    void setExternalDocs(ExternalDocumentation externalDocs);

    /**
     * Sets additional external documentation for this operation.
     *
     * @param externalDocs externalDocs property
     * @return operation instance with the externalDocs property set
     */
    default Operation externalDocs(ExternalDocumentation externalDocs) {
        setExternalDocs(externalDocs);
        return this;
    }

    /**
     * A map where the keys describe the name of the protocol and the values describe protocol-specific definitions
     * for the operation.
     *
     * @return bindings property
     */
    OperationBindings getBindings();

    /**
     * A map where the keys describe the name of the protocol and the values describe protocol-specific definitions
     * for the operation.
     *
     * @param bindings bindings property
     */
    void setBindings(OperationBindings bindings);

    /**
     * A map where the keys describe the name of the protocol and the values describe protocol-specific definitions
     * for the operation.
     *
     * @param bindings bindings property
     * @return operation instance with the bindings property set
     */
    default Operation bingings(OperationBindings bindings) {
        setBindings(bindings);
        return this;
    }

    /**
     * Returns a list of traits to apply to the operation object. Traits MUST be merged into the operation object using
     * the <a href="https://tools.ietf.org/html/rfc7386">JSON Merge Patch</a> algorithm in the same order they are defined here.
     *
     * @return traits property
     */
    List<OperationTrait> getTraits();

    /**
     * Sets a list of traits to apply to the operation object. Traits MUST be merged into the operation object using
     * the <a href="https://tools.ietf.org/html/rfc7386">JSON Merge Patch</a> algorithm in the same order they are defined here.
     *
     * @param traits traits property
     */
    void setTraits(List<OperationTrait> traits);

    /**
     * Sets a list of traits to apply to the operation object. Traits MUST be merged into the operation object using
     * the <a href="https://tools.ietf.org/html/rfc7386">JSON Merge Patch</a> algorithm in the same order they are defined here.
     *
     * @param traits traits property
     * @return operation instance withthe traits property set
     */
    default Operation traits(List<OperationTrait> traits) {
        setTraits(traits);
        return this;
    }

    /**
     * Returns a definition of the message that will be published or received on this channel. {@code oneOf} is allowed here to
     * specify multiple messages, however, a message MUST be valid only against one of the referenced message objects.
     *
     * @return message property
     */
    Message getMessage();

    /**
     * Sets a definition of the message that will be published or received on this channel. {@code oneOf} is allowed here to
     * specify multiple messages, however, a message MUST be valid only against one of the referenced message objects.
     *
     * @param message message property
     */
    void setMessage(Message message);

    /**
     * Sets a definition of the message that will be published or received on this channel. {@code oneOf} is allowed here to
     * specify multiple messages, however, a message MUST be valid only against one of the referenced message objects.
     *
     * @param message message property
     * @return operation instance with the message property set
     */
    default Operation message(Message message) {
        setMessage(message);
        return this;
    }
}
