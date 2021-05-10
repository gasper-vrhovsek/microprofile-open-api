package org.eclipse.microprofile.asyncapi.annotations;

import org.eclipse.microprofile.asyncapi.annotations.media.Schema;

public @interface Parameter {
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
    Schema schema() default @Schema();

    /**
     *
     * @return
     */
    String location() default "";

    /**
     *
     * @return
     */
    String name() default "";
}
