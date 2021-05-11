package org.eclipse.microprofile.asyncapi.models.bindings.operation;

import org.eclipse.microprofile.asyncapi.models.Constructible;
import org.eclipse.microprofile.asyncapi.models.bindings.VersionableBinding;

public interface HttpBindings extends Constructible, VersionableBinding<HttpBindings> {

    /**
     * Returns a required type of operation. Its value MUST be either {@code request} or {@code response}.
     *
     * @return type property
     * */
    String getType();

    /**
     * Sets a required type of operation. Its value MUST be either {@code request} or {@code response}.
     *
     * @param type type property
     * */
    void setType(String type);

    /**
     * Sets a required type of operation. Its value MUST be either {@code request} or {@code response}.
     *
     * @param type type property
     * @return bindings instance with the type property set
     * */
    default HttpBindings type(String type) {
        setType(type);
        return this;
    }

    /**
     * Returns, when {@code type} is {@code request}, the HTTP method, otherwise it MUST be ignored.
     * Its value MUST be one of {@code GET}, {@code POST}, {@code PUT}, {@code PATCH}, {@code DELETE}, {@code HEAD},
     * {@code OPTIONS}, {@code CONNECT}, and {@code TRACE}.
     *
     * @return method property
     * */
    String getMethod();

    /**
     * Sets, when {@code type} is {@code request}, the HTTP method, otherwise it MUST be ignored.
     * Its value MUST be one of {@code GET}, {@code POST}, {@code PUT}, {@code PATCH}, {@code DELETE}, {@code HEAD},
     * {@code OPTIONS}, {@code CONNECT}, and {@code TRACE}.
     *
     * @param method method property
     * */
    void setMethod(String method);

    /**
     * Sets, when {@code type} is {@code request}, the HTTP method, otherwise it MUST be ignored.
     * Its value MUST be one of {@code GET}, {@code POST}, {@code PUT}, {@code PATCH}, {@code DELETE}, {@code HEAD},
     * {@code OPTIONS}, {@code CONNECT}, and {@code TRACE}.
     *
     * @param method method property
     * @return bindings instance with the method property set
     * */
    default HttpBindings method(String method) {
        setMethod(method);
        return this;
    }
}
