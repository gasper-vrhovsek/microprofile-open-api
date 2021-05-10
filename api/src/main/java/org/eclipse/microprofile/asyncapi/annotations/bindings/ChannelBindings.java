package org.eclipse.microprofile.asyncapi.annotations.bindings;

import org.eclipse.microprofile.asyncapi.annotations.bindings.channel.AmqpBindings;
import org.eclipse.microprofile.asyncapi.annotations.bindings.channel.WebsocketsBindings;

public @interface ChannelBindings {
    // TODO docs
    /**
     *
     * @return
     */
    WebsocketsBindings ws() default @WebsocketsBindings();

    /**
     *
     * @return
     */
    AmqpBindings amqp() default @AmqpBindings();
}
