package org.eclipse.microprofile.asyncapi.annotations.bindings;

import org.eclipse.microprofile.asyncapi.annotations.bindings.operation.AmqpBindings;
import org.eclipse.microprofile.asyncapi.annotations.bindings.operation.HttpBindings;
import org.eclipse.microprofile.asyncapi.annotations.bindings.operation.KafkaBindings;
import org.eclipse.microprofile.asyncapi.annotations.bindings.operation.MqttBindings;

public @interface OperationBindings {

    /**
     * Protocol-specific information for an HTTP server.
     *
     * @return bindings object for this specific protocol
     */
    HttpBindings http() default @HttpBindings();

    /**
     * Protocol-specific information for an Kafka server.
     *
     * @return bindings object for this specific protocol
     */
    KafkaBindings kafka() default @KafkaBindings();

    /**
     * Protocol-specific information for an AMQP server.
     *
     * @return bindings object for this specific protocol
     */
    AmqpBindings amqp() default @AmqpBindings();

    /**
     * Protocol-specific information for an MQTT server.
     *
     * @return bindings object for this specific protocol
     */
    MqttBindings mqtt() default @MqttBindings();
}
