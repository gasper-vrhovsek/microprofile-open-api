package org.eclipse.microprofile.asyncapi.models.bindings.message;

import org.eclipse.microprofile.asyncapi.models.bindings.VersionableBinding;
import org.eclipse.microprofile.asyncapi.models.media.Schema;
import org.eclipse.microprofile.asyncapi.models.Constructible;

/**
 * This object contains information about the message representation in HTTP.
 */
public interface HttpBindings extends Constructible, VersionableBinding<HttpBindings> {
    /**
     * Returns a Schema object containing the definitions for HTTP-specific headers.
     * This schema MUST be of type {@code object} and have a {@code properties} key.
     *
     * @return headers property
     * */
    Schema getHeaders();

    /**
     * Sets a Schema object containing the definitions for HTTP-specific headers.
     * This schema MUST be of type {@code object} and have a {@code properties} key.
     *
     * @param headers headers property
     * */
    void setHeaders(Schema headers);

    /**
     * Sets a Schema object containing the definitions for HTTP-specific headers.
     * This schema MUST be of type {@code object} and have a {@code properties} key.
     *
     * @param headers headers property
     * @return bindings instance with the headers property set
     * */
    default HttpBindings headers(Schema headers) {
        setHeaders(headers);
        return this;
    }
}
