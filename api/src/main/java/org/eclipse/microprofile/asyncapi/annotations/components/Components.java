package org.eclipse.microprofile.asyncapi.annotations.components;

import org.eclipse.microprofile.asyncapi.annotations.Parameter;
import org.eclipse.microprofile.asyncapi.annotations.bindings.ChannelBindings;
import org.eclipse.microprofile.asyncapi.annotations.bindings.OperationBindings;
import org.eclipse.microprofile.asyncapi.annotations.bindings.ServerBindings;
import org.eclipse.microprofile.asyncapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.security.SecurityScheme;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Components {
    // TODO finish annotation

    /**
     *
     */
    Schema[] schemas() default {};

    /**
     *
     */
    Message[] messages() default {};

    /**
     * @return
     */
    SecurityScheme[] securitySchemes() default {};

    /**
     * @return
     */
    Parameter[] parameters() default {};

    /**
     * @return
     */
    CorrelationId[] correlationIds() default {};

    /**
     *
     * @return
     */
    OperationTrait[] operationTraits() default {};

    /**
     *
     * @return
     */
    MessageTrait[] messageTraits() default {};

    /**
     *
     * @return
     */
    ServerBindings[] serverBindings() default {};

    /**
     *
     * @return
     */
    ChannelBindings[] channelBindings() default {};

    /**
     *
     * @return
     */
    OperationBindings[] operationBindigns() default {};
}
