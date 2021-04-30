package org.eclipse.microprofile.asyncapi.annotations.channels;

import org.eclipse.microprofile.asyncapi.annotations.Operation;
import org.eclipse.microprofile.asyncapi.annotations.Parameter;
import org.eclipse.microprofile.asyncapi.annotations.bindings.ChannelBindings;

import java.lang.annotation.*;

/**
 * A representation of a channel. Describes the operation ovailable on a singe channel.
 *
 * @see org.eclipse.microprofile.asyncapi.models.channels.ChannelItem
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(ChannelItems.class)
@Inherited
public @interface ChannelItem {
    /**
     * The name of the channel item property.
     * <p>
     * The name is REQUIRED when the channel is defined within {@link org.eclipse.microprofile.asyncapi.annotations.channels.ChannelItems}.
     * The name will be used as the key to add this channel to the channels map for reuse.
     * </p>
     *
     * @return the name of the channel
     */
    String name() default "";

    /**
     * An optional description of this channel item.
     * <a href="http://spec.commonmark.org/">CommonMark</a> syntax can be used for rich text representation.
     *
     * @return a description of this channel
     */
    String description() default "";

    /**
     * Definition of the SUBSCRIBE operation, which defines the messages produced by the application
     * and sent to the channel.
     *
     * @return Subscribe operation of this channel
     * */
    Operation subscribe() default @Operation();

    /**
     * Definition of the PUBLISH operation, which defines the messages produced by the application
     * and sent to the channel.
     *
     * @return Publish operation of this channel
     * */
    Operation publish() default @Operation();

    /**
     * A list of parameters included in a channel name.
     * This map MUST contain all the parameters used in the parent channel name.
     *
     * @return a map containing channel name parameters
     * */
    Parameter[] parameters() default {};

    /**
     * A list of protocol-specific definitions for the channel.
     *
     * @return a list of channel protocol bindings
     * */
    ChannelBindings bindings() default @ChannelBindings();

}
