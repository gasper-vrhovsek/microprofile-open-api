package org.eclipse.microprofile.asyncapi.models.components;

import org.eclipse.microprofile.asyncapi.models.Operation;
import org.eclipse.microprofile.asyncapi.models.bindings.OperationBindings;
import org.eclipse.microprofile.asyncapi.models.Constructible;
import org.eclipse.microprofile.asyncapi.models.Extensible;
import org.eclipse.microprofile.asyncapi.models.ExternalDocumentation;
import org.eclipse.microprofile.asyncapi.models.Reference;
import org.eclipse.microprofile.asyncapi.models.tags.Tag;

/**
 * Describes a trait that MAY be applied to an
 * <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#operationObject">Operation Object</a>.
 * This object MAY contain any property from the <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#operationObject">
 * Operation Object</a>,
 * except message and traits.
 * <p>
 * If you're looking to apply traits to a message, see the
 * <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#messageTraitObject">Message Trait Object</a>.
 *
 * @see org.eclipse.microprofile.asyncapi.models.components.MessageTrait
 */
public interface OperationTrait extends Constructible, Extensible<OperationTrait>, Reference<OperationTrait> {

    /**
     * Returns a unique string used to identify the operation. The id MUST be unique among all operations described in
     * the API. The operationId value is case-sensitive. Tools and libraries MAY use the operationId to uniquely identify
     * an operation, therefore, it is RECOMMENDED to follow common programming naming conventions.
     *
     * @return operationId property
     */
    String getOperationId();

    /**
     * Sets a unique string used to identify the operation. The id MUST be unique among all operations described in
     * the API. The operationId value is case-sensitive. Tools and libraries MAY use the operationId to uniquely identify
     * an operation, therefore, it is RECOMMENDED to follow common programming naming conventions.
     *
     * @param operationId operationId property
     */
    void setOperationId(String operationId);

    /**
     * Sets a unique string used to identify the operation. The id MUST be unique among all operations described in
     * the API. The operationId value is case-sensitive. Tools and libraries MAY use the operationId to uniquely identify
     * an operation, therefore, it is RECOMMENDED to follow common programming naming conventions.
     *
     * @param operationId operationId property
     * @return OperationTrait instance with the operationId property set
     */
    default OperationTrait operationId(String operationId) {
        setOperationId(operationId);
        return this;
    }

    /**
     * Returns a short summary of what the operation is about.
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
     * @return OperationTrait instance with the summary property set
     */
    default OperationTrait summary(String summary) {
        setSummary(summary);
        return this;
    }

    /**
     * Returns a verbose explanation of the operation. <a href="http://spec.commonmark.org/">CommonMark syntax</a>
     * can be used for rich text representation.
     *
     * @return description property
     */
    String getDescription();

    /**
     * Sets a verbose explanation of the operation. <a href="http://spec.commonmark.org/">CommonMark syntax</a>
     * can be used for rich text representation.
     *
     * @param description description property
     */
    void setDescription(String description);

    /**
     * Sets a verbose explanation of the operation. <a href="http://spec.commonmark.org/">CommonMark syntax</a>
     * can be used for rich text representation.
     *
     * @param description description property
     * @return OperationTrait instance with the description property set
     */
    default OperationTrait description(String description) {
        setDescription(description);
        return this;
    }

    /**
     * Returns a list of tags for API documentation control. Tags can be used for logical grouping of operations.
     *
     * @return tags property
     */
    Tag getTags();

    /**
     * Sets a list of tags for API documentation control. Tags can be used for logical grouping of operations.
     *
     * @param tags tags property
     */
    void setTags(Tag tags);

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
     * Sets a list of tags for API documentation control. Tags can be used for logical grouping of operations.
     *
     * @param tags tags property
     * @return OperationTrait instance with the tags property set
     */
    default OperationTrait tags(Tag tags) {
        setTags(tags);
        return this;
    }

    /**
     * Sets additional external documentation for this operation.
     *
     * @return externalDocs property
     **/
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
     * @return OperationTrait instance with the externalDocs property set
     */
    default OperationTrait externalDocs(ExternalDocumentation externalDocs) {
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
     * @return OperationTrait instance with the bindings property set
     */
    default OperationTrait bingings(OperationBindings bindings) {
        setBindings(bindings);
        return this;
    }
}
