package org.eclipse.microprofile.asyncapi.annotations.bindings;

import org.eclipse.microprofile.asyncapi.annotations.bindings.message.AmqpBindings;
import org.eclipse.microprofile.asyncapi.annotations.bindings.message.HttpBindings;
import org.eclipse.microprofile.asyncapi.annotations.bindings.message.KafkaBindings;
import org.eclipse.microprofile.asyncapi.annotations.bindings.message.MqttBindings;

public @interface MessageBindings {
    // TODO

    /**
     *
     * @return
     */
    HttpBindings http() default @HttpBindings();

    /**
     *
     * @return
     */
    KafkaBindings kafka() default @KafkaBindings();

    /**
     *
     * @return
     */
    AmqpBindings amqp() default @AmqpBindings();

    /**
     *
     * @return
     */
    MqttBindings mqtt() default @MqttBindings();
}
