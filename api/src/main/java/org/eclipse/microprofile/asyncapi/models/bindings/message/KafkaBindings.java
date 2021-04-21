package org.eclipse.microprofile.asyncapi.models.bindings.message;

import org.eclipse.microprofile.asyncapi.models.media.Schema;
import org.eclipse.microprofile.openapi.models.Constructible;

/**
 * This object contains information about the message representation in Kafka.
 * */
public interface KafkaBindings extends Constructible {
    /**
     * Returns the message key.
     *
     * @return key property
     * */
    Schema getKey();

    /**
     * Sets the message key.
     *
     * @param key key property
     * */
    void setKey(Schema key);

    /**
     * Sets the message key.
     *
     * @param key key property
     * @return bindings instance with the key property set
     * */
    default KafkaBindings key(Schema key) {
        setKey(key);
        return this;
    }

    // TODO extract into common interface
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
    default KafkaBindings bindingVersion(String bindingVersion) {
        setBindingVersion(bindingVersion);
        return this;
    }
}
