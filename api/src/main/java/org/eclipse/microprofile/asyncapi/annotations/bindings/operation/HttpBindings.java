package org.eclipse.microprofile.asyncapi.annotations.bindings.operation;

public @interface HttpBindings {
    // TODO docs
    /**
     *
     * @return
     */
    String type() default "";

    /**
     *
     * @return
     */
    String method() default "";

    /**
     *
     * @return
     */
    String bindingVersion() default "";
}
