package org.eclipse.microprofile.asyncapi.models.bindings.server;

import org.eclipse.microprofile.asyncapi.models.bindings.VersionableBinding;
import org.eclipse.microprofile.asyncapi.models.bindings.server.mqtt.LastWill;
import org.eclipse.microprofile.asyncapi.models.Constructible;

/**
 * This object contains information about the server representation in MQTT.
 */
public interface MqttBindings extends Constructible, VersionableBinding<MqttBindings> {

    /**
     * Returns the client identifier
     *
     * @return clientId property
     * */
    String getClientId();

    /**
     * Sets the client identifier
     *
     * @param clientId clientId property
     * */
    void setClientId(String clientId);

    /**
     * Sets the client identifier
     *
     * @param clientId clientId property
     * @return bindings instance with the clientId property set
     * */
    default MqttBindings clientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * Returns whether to create a persistent connection or not. When {@code false}, the connection will be persistent.
     *
     * @return clientSession property
     * */
    boolean getClientSession();

    /**
     * Sets whether to create a persistent connection or not. When {@code false}, the connection will be persistent.
     *
     * @param clientSession clientSession property
     * */
    void setClientSession(boolean clientSession);

    /**
     * Sets whether to create a persistent connection or not. When {@code false}, the connection will be persistent.
     *
     * @param clientSession clientSession property
     * @return bindings instance with the clientSession property set
     * */
    default MqttBindings clientSession(boolean clientSession) {
        setClientSession(clientSession);
        return this;
    }

    /**
     * Returns last Will and Testament configuration.
     *
     * @return lastWill property
     * */
    LastWill getLastWill();

    /**
     * Sets last Will and Testament configuration.
     *
     * @param lastWill lastWill property
     * */
    void setLastWill(LastWill lastWill);

    /**
     * Sets last Will and Testament configuration.
     *
     * @param lastWill lastWill property
     * @return bindings instance with the lastWill property set
     * */
    default MqttBindings lastWill(LastWill lastWill) {
        setLastWill(lastWill);
        return this;
    }

    /**
     * Returns interval in seconds of the longest period of time the broker and the client can endure without sending a message.
     *
     * @return keepAlive property
     * */
    int getKeepAlive();

    /**
     * Sets interval in seconds of the longest period of time the broker and the client can endure without sending a message.
     *
     * @param keepAlive keepAlive property
     * */
    void setKeepAlive(int keepAlive);

    /**
     * Sets interval in seconds of the longest period of time the broker and the client can endure without sending a message.
     *
     * @param keepAlive keepAlive property
     * @return bindings instance with the keepAlive property set
     * */
    default MqttBindings keepAlive(int keepAlive) {
        setKeepAlive(keepAlive);
        return this;
    }
}
