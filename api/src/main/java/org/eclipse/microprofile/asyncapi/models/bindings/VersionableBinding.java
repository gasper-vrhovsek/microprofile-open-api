package org.eclipse.microprofile.asyncapi.models.bindings;

public interface VersionableBinding<T extends VersionableBinding<T>> {
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
    default T bindingVersion(String bindingVersion) {
        setBindingVersion(bindingVersion);
        @SuppressWarnings("unchecked")
        T t = (T) this;
        return t;
    }
}
