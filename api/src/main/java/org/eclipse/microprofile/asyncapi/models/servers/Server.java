package org.eclipse.microprofile.asyncapi.models.servers;

import org.eclipse.microprofile.asyncapi.models.bindings.ServerBindings;
import org.eclipse.microprofile.openapi.models.Constructible;
import org.eclipse.microprofile.openapi.models.Extensible;
import org.eclipse.microprofile.openapi.models.security.SecurityRequirement;
import org.eclipse.microprofile.openapi.models.servers.ServerVariable;

import java.util.List;
import java.util.Map;

/**
 * An object representing a message broker, a server or any other kind of computer program capable of sending and/or receiving data. This object is used to capture details such as URIs, protocols and security configuration. Variable substitution can be used so that some details, for example usernames and passwords, can be injected by code generation tools.
 *
 * @see <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#serverObject">Server Object</a>
 */
public interface Server extends Constructible, Extensible<Server> {

    /**
     * This method returns the url property of Server instance, which is a URL to the target host.
     * <p>
     * A URL to the target host. This URL supports Server Variables and MAY be relative, to indicate that the host location is relative
     * to the location where the AsyncAPI document is being served. Variable substitutions will be made when a variable is named in {brackets}.
     * </p>
     * <p>
     * This is a REQUIRED property.
     * </p>
     *
     * @return String url
     **/
    String getUrl();

    /**
     * This method sets the url property of Server instance to the given url argument, representing a URL to the target host.
     * <p>
     * A URL to the target host. This URL supports Server Variables and MAY be relative, to indicate that the host location is relative
     * to the location where the AsyncAPI document is being served. Variable substitutions will be made when a variable is named in {brackets}.
     * </p>
     * <p>
     * This is a REQUIRED property.
     * </p>
     *
     * @param url a URL to the target host
     */
    void setUrl(String url);

    /**
     * This method sets the url property of Server instance to the given url argument, representing a URL to the target host, and returns the modified
     * instance.
     * <p>
     * This URL supports Server Variables and MAY be relative, to indicate that the host location is relative to the location where the OpenAPI
     * definition is being served. Variable substitutions will be made when a variable is named enclosed in curly brackets.
     * </p>
     * <p>
     * This is a REQUIRED property.
     * </p>
     *
     * @param url a URL to the target host
     * @return Server instance with the set url property.
     */
    default Server url(String url) {
        setUrl(url);
        return this;
    }

    /**
     * This method returns the protocol property of Server instance.
     * <p>
     * The protocol this URL supports for connection. Supported protocol include, but are not limited to:
     * amqp, amqps, http, https, jms, kafka, kafka-secure, mqtt, secure-mqtt, stomp, stomps, ws, wss, mercure.
     * </p>
     * <p>
     * This is a REQUIRED property.
     * </p>
     *
     * @return String protocol
     **/
    String getProtocol();

    /**
     * This method sets the protocol property of Server instance.
     * <p>
     * The protocol this URL supports for connection. Supported protocol include, but are not limited to:
     * amqp, amqps, http, https, jms, kafka, kafka-secure, mqtt, secure-mqtt, stomp, stomps, ws, wss, mercure.
     * </p>
     * <p>
     * This is a REQUIRED property.
     * </p>
     *
     * @param protocol a protocol for this server
     **/
    void setProtocol(String protocol);

    /**
     * This method sets the protocol property of Server instance.
     * <p>
     * The protocol this URL supports for connection. Supported protocol include, but are not limited to:
     * amqp, amqps, http, https, jms, kafka, kafka-secure, mqtt, secure-mqtt, stomp, stomps, ws, wss, mercure.
     * </p>
     * <p>
     * This is a REQUIRED property.
     * </p>
     *
     * @param protocol a protocol for this server
     * @return Server instance with the set protocol property.
     **/
    default Server protocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * This method returns the protocol version property of Server instance.
     * <p>
     * The version of the protocol used for connection. For instance: AMQP 0.9.1, HTTP 2.0, Kafka 1.0.0, etc.
     * </p>
     *
     * @return String protocolVersion
     **/
    String getProtocolVersion();

    /**
     * This method sets the protocol version property of Server instance.
     * <p>
     * The version of the protocol used for connection. For instance: AMQP 0.9.1, HTTP 2.0, Kafka 1.0.0, etc.
     * </p>
     *
     * @param protocolVersion a protocol for this server
     **/
    void setProtocolVersion(String protocolVersion);

    /**
     * This method sets the protocol version property of Server instance.
     * <p>
     * The version of the protocol used for connection. For instance: AMQP 0.9.1, HTTP 2.0, Kafka 1.0.0, etc.
     * </p>
     *
     * @param protocolVersion a protocol for this server
     * @return Server instance with the set protocol version property.
     **/
    default Server protocolVersion(String protocolVersion) {
        setProtocolVersion(protocolVersion);
        return this;
    }

    /**
     * This method returns the description property of Server instance.
     * An optional string describing the host designated by the URL. CommonMark syntax MAY be used for rich text representation.
     *
     * @return String description
     **/
    String getDescription();

    /**
     * This method sets the description property of a Server instance to the given description parameter.
     * <p>
     * An optional string describing the host designated by the URL. CommonMark syntax MAY be used for rich text representation.
     * </p>
     *
     * @param description an optional string describing the host designated by the URL
     */
    void setDescription(String description);

    /**
     * This method sets the description property of a Server instance to the given description parameter and returns the modified instance.
     * <p>
     * An optional string describing the host designated by the URL. CommonMark syntax MAY be used for rich text representation.
     * </p>
     *
     * @param description an optional string describing the host designated by the URL
     * @return Server instance with the set description property.
     */
    default Server description(String description) {
        setDescription(description);
        return this;
    }

    /**
     * This method returns the variables property of Server instance.
     * <p>
     * Variables are represented as a map between variable name and its value. The value is used for substitution in the server's URL template.
     * </p>
     *
     * @return map of server variables (potentially immutable).
     **/
    Map<String, ServerVariable> getVariables();

    /**
     * Adds the given server variable item to the Server's map of variables.
     *
     * @param variableName the name the variable to add
     * @param variable     a server variable used for substitution in the server's URL template.
     * @return the current Server object
     **/
    Server addVariable(String variableName, ServerVariable variable);

    /**
     * Removes the given server variable item from the Server's map of variables
     *
     * @param variableName the name the variable to remove
     */
    void removeVariable(String variableName);

    /**
     * This method sets the variables property of Server instance to the given variables argument.
     * <p>
     * Variables property is a map between variable name and its value. The value is used for substitution in the server's URL template.
     * </p>
     *
     * @param variables a map between variable name and its value
     */
    void setVariables(Map<String, ServerVariable> variables);

    /**
     * This method sets the variables property of Server instance to the given variables argument and returns the modified instance.
     * <p>
     * Variables property is a map between variable name and its value. The value is used for substitution in the server's URL template.
     * </p>
     *
     * @param variables a map between variable name and its value
     * @return Server instance with the set variables property.
     */
    default Server variables(Map<String, ServerVariable> variables) {
        setVariables(variables);
        return this;
    }

    /**
     * Returns a declaration of which security mechanisms can be used with this server. The list of values includes alternative
     * security requirement objects that can be used. Only one of the security requirement objects need to be satisfied to authorize
     * a connection or operation.
     *
     * @return a list of security requirement objects for this server instance
     * */
    List<SecurityRequirement> getSecurity();

    /**
     * Sets a declaration of which security mechanisms can be used with this server. The list of values includes alternative
     * security requirement objects that can be used. Only one of the security requirement objects need to be satisfied to authorize
     * a connection or operation.
     *
     * @param security a list of security requirement objects for this server instance
     * */
    void setSecurity(List<SecurityRequirement> security);

    /**
     * Returns a declaration of which security mechanisms can be used with this server. The list of values includes alternative
     * security requirement objects that can be used. Only one of the security requirement objects need to be satisfied to authorize
     * a connection or operation.
     *
     * @param security a list of security requirement objects for this server instance
     * @return Server instance with the set security property
     * */
    default Server security(List<SecurityRequirement> security) {
        setSecurity(security);
        return this;
    }

    /**
     * Gets a map where the keys describe the name of the protocol and the values describe protocol-specific definitions for the server.
     *
     * @return server bindings for this server instance
     * */
    ServerBindings getBindings();

    /**
     * Sets a map where the keys describe the name of the protocol and the values describe protocol-specific definitions for the server.
     *
     * @param bindings server bindings for this server instance
     * */
    void setBindings(ServerBindings bindings);

    /**
     * Sets a map where the keys describe the name of the protocol and the values describe protocol-specific definitions for the server.
     *
     * @param bindings server bindings for this server instance
     * @return Server instance with the set bindings property
     * */
    default Server bindings(ServerBindings bindings) {
        setBindings(bindings);
        return this;
    }
}
