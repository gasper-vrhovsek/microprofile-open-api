package org.eclipse.microprofile.asyncapi.annotations.bindings.operation;

public @interface AmqpBindings {
    // TODO docs

    /**
     *
     * @return
     */
    int expiration() default 0;

    /**
     *
     * @return
     */
    String userId() default "";

    /**
     *
     * @return
     */
    String[] cc() default {};

    /**
     *
     * @return
     */
    int priority() default 0;

    /**
     *
     * @return
     */
    int deliveryMode() default 0;

    /**
     *
     * @return
     */
    boolean mandatory() default false;

    /**
     *
     * @return
     */
    String[] bcc() default {};

    /**
     *
     * @return
     */
    String replyTo() default "";

    /**
     *
     */
    boolean timestamp() default false;

    /**
     *
     * @return
     */
    boolean ack() default false;

    /**
     *
     * @return
     */
    String bindingVersion() default "";
}
