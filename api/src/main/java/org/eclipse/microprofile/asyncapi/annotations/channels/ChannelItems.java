package org.eclipse.microprofile.asyncapi.annotations.channels;

import java.lang.annotation.*;


/**
 * This object represents an array of channel items that can be specified for the TODO definition level.
 *
 * TODO see SecurityRequirements javaDoc
 **/

@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ChannelItems {

    /**
     * An array of ChannelItem annotations that can be specified for the operation or at definition level.
     *
     * @return the array of the ChannelItem annotations
     * */
    ChannelItem[] value() default {};
}
