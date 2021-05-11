package org.eclipse.microprofile.asyncapi.annotations.bindings.message;

import org.eclipse.microprofile.asyncapi.annotations.media.Schema;

/**
 * This object contains information about the message representation in Kafka.
 * */
public @interface KafkaBindings {

    /**
     * Message key.
     *
     * @return key property
     * */
    Schema key() default @Schema();

    /**
     * Version of this binding. If omitted, "latest" MUST be assumed.
     *
     * @return binding version property
     * */
    String bindingVersion() default "";
}
