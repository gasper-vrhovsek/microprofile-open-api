package org.eclipse.microprofile.asyncapi.annotations.bindings;

import org.eclipse.microprofile.asyncapi.annotations.bindings.server.MqttBindings;
import org.eclipse.microprofile.asyncapi.annotations.servers.Servers;

import java.lang.annotation.*;

/**
 * Map describing protocol-specific definitions for a server
 * */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ServerBindings {

    /**
     * Protocol-specific information for an MQTT server
     * */
    MqttBindings mqtt() default @MqttBindings();
}
