package org.eclipse.microprofile.asyncapi.annotations;

import org.eclipse.microprofile.asyncapi.annotations.bindings.OperationBindings;
import org.eclipse.microprofile.asyncapi.annotations.components.Message;
import org.eclipse.microprofile.asyncapi.annotations.components.OperationTrait;
import org.eclipse.microprofile.asyncapi.annotations.tags.Tag;

public @interface Operation {
    // TODO docs

    /**
     *
     * @return
     */
    String operationId() default "";

    /**
     *
     * @return
     */
    String summary() default "";

    /**
     *
     * @return
     */
    String description() default "";

    /**
     *
     * @return
     */
    Tag[] tags() default {};

    /**
     *
     * @return
     */
    ExternalDocumentation externalDocs() default @ExternalDocumentation();

    /**
     *
     * @return
     */
    OperationBindings bindings() default @OperationBindings();

    /**
     *
     * @return
     */
    OperationTrait[] traits() default {};

    /**
     *
     * @return
     */
    Message message() default @Message();
}
