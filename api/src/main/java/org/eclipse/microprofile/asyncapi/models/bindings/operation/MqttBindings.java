package org.eclipse.microprofile.asyncapi.models.bindings.operation;

import org.eclipse.microprofile.asyncapi.models.Constructible;
import org.eclipse.microprofile.asyncapi.models.bindings.VersionableBinding;

public interface MqttBindings extends Constructible, VersionableBinding<MqttBindings> {

    /**
     * Returns the Quality of Service (QoS) levels for the message flow between client and server. Its value MUST be
     * either 0 (At most once delivery), 1 (At least once delivery), or 2 (Exactly once delivery).
     *
     * @return qos property
     * */
    int getQos();

    /**
     * Sets the Quality of Service (QoS) levels for the message flow between client and server. Its value MUST be
     * either 0 (At most once delivery), 1 (At least once delivery), or 2 (Exactly once delivery).
     *
     * @param qos qos property
     * */
    void setQos(int qos);

    /**
     * Sets the Quality of Service (QoS) levels for the message flow between client and server. Its value MUST be
     * either 0 (At most once delivery), 1 (At least once delivery), or 2 (Exactly once delivery).
     *
     * @param qos qos property
     * @return bindings instance with the qos property set
     * */
    default MqttBindings qos(int qos) {
        setQos(qos);
        return this;
    }

    /**
     * Returns whether the broker should retain the message or not.
     *
     * @return retain property
     * */
    boolean getRetain();

    /**
     * Sets whether the broker should retain the message or not.
     *
     * @param retain retain property
     * */
    void setRetain(boolean retain);

    /**
     * Sets whether the broker should retain the message or not.
     *
     * @param retain retain property
     * @return bindings instance with the retain property set
     * */
    default MqttBindings retain(boolean retain) {
        setRetain(retain);
        return this;
    }
}
