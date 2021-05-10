package org.eclipse.microprofile.asyncapi.models.bindings.message;

import org.eclipse.microprofile.asyncapi.models.Constructible;

public interface AmqpBindings extends Constructible {
    /**
     * Returns a MIME encoding for the message content.
     *
     * @return contentEncoding property
     * */
    String getContentEncoding();

    /**
     * Sets a MIME encoding for the message content.
     *
     * @param contentEncoding contentEncoding property
     * */
    void setContentEncoding(String contentEncoding);

    /**
     * Sets a MIME encoding for the message content.
     *
     * @param contentEncoding contentEncoding property
     * @return bindings instance with the contentEncoding property set
     * */
    default AmqpBindings contentEncoding(String contentEncoding) {
        setContentEncoding(contentEncoding);
        return this;
    }

    /**
     * Returns the application-specific message type
     *
     * @return message type property
     * */
    String getMessageType();

    /**
     * Sets the application-specific message type
     *
     * @param messageType message type property
     * */
    void setMessageType(String messageType);

    /**
     * Sets the application-specific message type
     *
     * @param messageType message type property
     * @return bindings instance with the messageType property set
     * */
    default AmqpBindings messageType(String messageType) {
        setMessageType(messageType);
        return this;
    }

    /**
     * TODO docs
     * @return
     */
    String getBindingVersion();

    void setBindingVersion(String bindingVersion);

    default AmqpBindings bindingVersion(String bindingVersion) {
        setBindingVersion(bindingVersion);
        return this;
    }
}
