package org.eclipse.microprofile.asyncapi.annotations.bindings;

import org.eclipse.microprofile.asyncapi.annotations.bindings.channel.AmqpBindings;
import org.eclipse.microprofile.asyncapi.annotations.bindings.channel.WebsocketsBindings;

public @interface ChannelBindings {
    // TODO annotation
    // TODO name parameter

    WebsocketsBindings ws() default @WebsocketsBindings();

    AmqpBindings amqp() default @AmqpBindings();
}
