package org.eclipse.microprofile.asyncapi.annotations.bindings.message;

public @interface AmqpBindings {
    // TODO docs

    /**
     *
     * @return
     */
    String contentEncoding() default "";

    /**
     *
     * @return
     */
    String messageType() default "";

    /**
     *
     * @return
     */
    String bindingBersion() default "";
}
