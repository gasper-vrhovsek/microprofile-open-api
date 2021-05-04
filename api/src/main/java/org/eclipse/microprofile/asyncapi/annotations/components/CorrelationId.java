package org.eclipse.microprofile.asyncapi.annotations.components;

public @interface CorrelationId {
    // TODO docs

    /**
     *
     * @return
     */
    String description() default "";

    /**
     *
     * @return
     */
    String location() default "";
}
