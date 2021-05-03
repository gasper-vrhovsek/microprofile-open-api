package org.eclipse.microprofile.asyncapi.annotations.bindings;

import org.eclipse.microprofile.asyncapi.annotations.bindings.server.MqttBindings;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Map describing protocol-specific definitions for a server
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ServerBindings {

    /**
     * Protocol-specific information for an MQTT server
     */
    MqttBindings mqtt() default @MqttBindings();
}
