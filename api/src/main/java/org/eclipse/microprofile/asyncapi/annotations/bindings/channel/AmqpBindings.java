package org.eclipse.microprofile.asyncapi.annotations.bindings.channel;

import org.eclipse.microprofile.asyncapi.annotations.bindings.channel.amqp.AmqpExchange;
import org.eclipse.microprofile.asyncapi.annotations.bindings.channel.amqp.AmqpQueue;

public @interface AmqpBindings {
    // TODO

    /**
     *
     * @return
     */
    String is() default "";

    /**
     *
     * @return
     */
    AmqpExchange exchange() default @AmqpExchange();

    /**
     *
     * @return
     */
    AmqpQueue queue() default @AmqpQueue();

    /**
     *
     * @return
     */
    String bindingVersion() default "";
}
