package org.eclipse.microprofile.asyncapi.annotations.bindings.message;

import org.eclipse.microprofile.asyncapi.annotations.media.Schema;

public @interface HttpBindings {
    // TODO docs
    /**
     *
     * @return
     */
    Schema headers() default @Schema();

    /**
     *
     * @return
     */
    String bindingVersion() default "";
}
