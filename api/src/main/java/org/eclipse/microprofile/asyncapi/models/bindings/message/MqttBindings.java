package org.eclipse.microprofile.asyncapi.models.bindings.message;

import org.eclipse.microprofile.asyncapi.models.Constructible;

public interface MqttBindings extends Constructible {
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
    default MqttBindings bindingVersion(String bindingVersion) {
        setBindingVersion(bindingVersion);
        return this;
    }
}
