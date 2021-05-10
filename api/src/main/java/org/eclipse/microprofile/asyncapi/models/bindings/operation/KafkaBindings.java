package org.eclipse.microprofile.asyncapi.models.bindings.operation;

import org.eclipse.microprofile.asyncapi.models.media.Schema;
import org.eclipse.microprofile.asyncapi.models.Constructible;

public interface KafkaBindings extends Constructible {

    /**
     * Returns id of the consumer group.
     *
     * @return groupId property
     * */
    Schema getGroupId();

    /**
     * Sets id of the consumer group.
     *
     * @param groupId groupId property
     * */
    void setGroupId(Schema groupId);

    /**
     * Sets id of the consumer group.
     *
     * @param groupId groupId property
     * @return bindings instance with the groupId property set
     * */
    default KafkaBindings groupId(Schema groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * Returns id of the consumer inside a consumer group
     *
     * @return clientId property
     * */
    Schema getClientId();

    /**
     * Sets id of the consumer inside a consumer group
     *
     * @param clientId clientId property
     * */
    void setClientId(Schema clientId);

    /**
     * Sets id of the consumer inside a consumer group
     *
     * @param clientId clientId property
     * @return bindings instance with the clientId property set
     * */
    default KafkaBindings clientId(Schema clientId) {
        setClientId(clientId);
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
    default KafkaBindings bindingVersion(String bindingVersion) {
        setBindingVersion(bindingVersion);
        return this;
    }
}
