package org.eclipse.microprofile.asyncapi.models.bindings.channel;

import org.eclipse.microprofile.asyncapi.models.media.Schema;
import org.eclipse.microprofile.openapi.models.Constructible;

/**
 * When using WebSockets, the channel represents the connection. Unlike other protocols that support multiple virtual
 * channels (topics, routing keys, etc.) per connection, WebSockets doesn't support virtual channels or, put it another
 * way, there's only one channel and its characteristics are strongly related to the protocol used for the handshake,
 * i.e., HTTP.
 * */
public interface WebsocketsBindings extends Constructible {
    /**
     * Returns the HTTP method to use when establishing the connection. Its value MUST be either {@code GET} or {@code POST}.
     *
     * @return binding method property
     * */
    String getMethod();

    /**
     * Sets the HTTP method to use when establishing the connection. Its value MUST be either {@code GET} or {@code POST}.
     *
     * @param method binding method property
     * */
    void setMethod(String method);

    /**
     * Sets the HTTP method to use when establishing the connection. Its value MUST be either {@code GET} or {@code POST}.
     *
     * @param method binding method property
     * @return bindings instance with the method property set
     * */
    default WebsocketsBindings method(String method) {
        setMethod(method);
        return this;
    }

    /**
     * Returns a Schema object containing the definitions for each query parameter.
     * This schema MUST be of type {@code object} and have a {@code properties} key.
     *
     * @return query property
     * */
    Schema getQuery();

    /**
     * Sets a Schema object containing the definitions for each query parameter.
     * This schema MUST be of type {@code object} and have a {@code properties} key.
     *
     * @param query query property
     * */
    void setQuery(Schema query);

    /**
     * Sets a Schema object containing the definitions for each query parameter.
     * This schema MUST be of type {@code object} and have a {@code properties} key.
     *
     * @param query query property
     * @return bindings instance with the query property set
     * */
    default WebsocketsBindings query(Schema query) {
        setQuery(query);
        return this;
    }

    /**
     * Returns a Schema object containing the definitions of the HTTP headers to use when establishing the connection.
     * This schema MUST be of type {@code object} and have a {@code properties} key.
     *
     * @return headers property
     * */
    Schema getHeaders();

    /**
     * Sets a Schema object containing the definitions of the HTTP headers to use when establishing the connection.
     * This schema MUST be of type {@code object} and have a {@code properties} key.
     *
     * @param headers headers property
     * */
    void setHeaders(Schema headers);

    /**
     * Sets a Schema object containing the definitions of the HTTP headers to use when establishing the connection.
     * This schema MUST be of type {@code object} and have a {@code properties} key.
     *
     * @param headers headers property
     * @return bindings instance with the headers property set
     * */
    default WebsocketsBindings headers(Schema headers) {
        setHeaders(headers);
        return this;
    }
}
