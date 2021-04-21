package org.eclipse.microprofile.asyncapi.models.bindings.server.mqtt;

import org.eclipse.microprofile.openapi.models.Constructible;

/**
 * Last Will and Testament configuration.
 * */
public interface LastWill extends Constructible {

    /**
     * Returns the topic where the Last Will and Testament message will be sent.
     *
     * @return topic property
     * */
    String getTopic();

    /**
     * Sets the topic where the Last Will and Testament message will be sent.
     *
     * @param topic topic property
     * */
    void setTopic(String topic);

    /**
     * Sets the topic where the Last Will and Testament message will be sent.
     *
     * @param topic topic property
     * */
    default LastWill topic(String topic) {
        setTopic(topic);
        return this;
    }

    /**
     * Returns how hard the broker/client will try to ensure that the Last Will and Testament message is received.
     * Its value MUST be either 0, 1 or 2.
     *
     * @return qos property
     * */
    int getQos();

    /**
     * Sets how hard the broker/client will try to ensure that the Last Will and Testament message is received.
     * Its value MUST be either 0, 1 or 2.
     *
     * @param qos qos property
     * */
    void setQos(int qos);

    /**
     * Sets how hard the broker/client will try to ensure that the Last Will and Testament message is received.
     * Its value MUST be either 0, 1 or 2.
     *
     * @param qos qos property
     * @return LastWill instance with the qos property set
     * */
    default LastWill qos(int qos) {
        setQos(qos);
        return this;
    }

    /**
     * Returns Last Will message.
     *
     * @return message property
     * */
    String getMessage();

    /**
     * Sets Last Will message.
     *
     * @param message message property
     * */
    void setMessage(String message);

    /**
     * Sets Last Will message.
     *
     * @param message message property
     * @return LastWill instance with the message property set
     * */
    default LastWill message(String message) {
        setMessage(message);
        return this;
    }

    /**
     * Returns whether the broker should retain the Last Will and Testament message or not.
     *
     * @return retain property
     * */
    boolean getRetain();

    /**
     * Sets whether the broker should retain the Last Will and Testament message or not.
     *
     * @param retain retain property
     * */
    void setRetain(boolean retain);

    /**
     * Sets whether the broker should retain the Last Will and Testament message or not.
     *
     * @param retain retain property
     * @return LastWill instance with the retain property set
     * */
    default LastWill retain(boolean retain) {
        setRetain(retain);
        return this;
    }
}
