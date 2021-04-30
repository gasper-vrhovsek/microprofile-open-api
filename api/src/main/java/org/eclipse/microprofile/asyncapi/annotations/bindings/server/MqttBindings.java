package org.eclipse.microprofile.asyncapi.annotations.bindings.server;

import org.eclipse.microprofile.asyncapi.annotations.bindings.server.mqtt.LastWill;

import java.lang.annotation.*;

/**
 * This object contains information about the server representation in MQTT.
 * */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface MqttBindings {

    /**
     * The client identifier
     *
     * @return clientId property
     * */
    String clientId() default "";

    /**
     * Whether to create a persistent connection or not. When {@code false}, the connection will be persistent.
     *
     * @return clientSession property
     */
    boolean clientSession() default false;

    /**
     * Last Will and Testament configuration.
     *
     * @return lastWill property
     */
    LastWill lastWill() default @LastWill();

    /**
     * Interval in seconds of the longest period of time the broker and the client can endure without sending a message.
     *
     * @return keepAlive property
     */
    int keepAlive() default 0;

    /**
     * The version of this binding. If omitted, "latest" MUST be assumed.
     *
     * @return
     */
    String bindingVersion() default "latest";
}
