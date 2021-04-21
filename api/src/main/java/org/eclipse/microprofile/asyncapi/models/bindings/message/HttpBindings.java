package org.eclipse.microprofile.asyncapi.models.bindings.message;

import org.eclipse.microprofile.asyncapi.models.media.Schema;
import org.eclipse.microprofile.openapi.models.Constructible;

public interface HttpBindings extends Constructible {
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

    /**
     * Returns the version of this binding. If omitted, "latest" MUST be assumed.
     *
     * @return binding version property
     * */
    String getBindingVersion();

    /**
     * Set the version of this binding. If omitted, "latest" MUST be assumed.
     *
     * @param bindingVersion binding version property
     * */
    void setBindingVersion(String bindingVersion);

    /**
     * Set the version of this binding. If omitted, "latest" MUST be assumed.
     *
     * @param bindingVersion binding version property
     * @return bindings instance with the headers property set
     * */
    default HttpBindings bindingVersion(String bindingVersion) {
        setBindingVersion(bindingVersion);
        return this;
    }
}
