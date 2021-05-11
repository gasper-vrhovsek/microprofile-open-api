package org.eclipse.microprofile.asyncapi.models.bindings.message;

import org.eclipse.microprofile.asyncapi.models.bindings.VersionableBinding;
import org.eclipse.microprofile.asyncapi.models.media.Schema;
import org.eclipse.microprofile.asyncapi.models.Constructible;

/**
 * This object contains information about the message representation in Kafka.
 * */
public interface KafkaBindings extends Constructible, VersionableBinding<KafkaBindings> {
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
}
