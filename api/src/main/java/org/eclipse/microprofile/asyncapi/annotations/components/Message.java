package org.eclipse.microprofile.asyncapi.annotations.components;

import org.eclipse.microprofile.asyncapi.annotations.bindings.MessageBindings;
import org.eclipse.microprofile.asyncapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Message {
    // TODO documentation

    /**
     * @return
     */
    String name() default "";

    /**
     * @return
     */
    Schema headers() default @Schema();

    /**
     * @return
     */
    // TODO could be any but defaults to Schema
    Schema payload() default @Schema();

    /**
     * @return
     */
    CorrelationId correlationId() default @CorrelationId();

    /**
     * @return
     */
    String schemaFormat() default "";

    /**
     * @return
     */
    String contentType() default "";

    /**
     * @return
     */
    String title() default "";

    /**
     * @return
     */
    String summary() default "";

    /**
     * @return
     */
    String description() default "";

    /**
     * @return
     */
    Tag[] tags() default {};

    /**
     * @return
     */
    ExternalDocumentation externalDocs() default @ExternalDocumentation();

    /**
     * @return
     */
    MessageBindings messageBindings() default @MessageBindings();

    // TODO how to represent examples in an annotation
//    Object[] examples() default {};

    /**
     * @return
     */
    MessageTrait[] traits() default {};

    /**
     * Reference value to a Message object.
     * <p>
     * This property provides a reference to an object defined elsewhere. This property and
     * all other properties are mutually exclusive. If other properties are defined in addition
     * to the ref property then the result is undefined.
     *
     * @return reference to a callback object definition
     **/
    String ref() default "";
}

