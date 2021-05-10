package org.eclipse.microprofile.asyncapi.annotations.bindings;

import org.eclipse.microprofile.asyncapi.annotations.bindings.operation.AmqpBindings;
import org.eclipse.microprofile.asyncapi.annotations.bindings.operation.HttpBindings;
import org.eclipse.microprofile.asyncapi.annotations.bindings.operation.KafkaBindings;
import org.eclipse.microprofile.asyncapi.annotations.bindings.operation.MqttBindings;

public @interface OperationBindings {
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
