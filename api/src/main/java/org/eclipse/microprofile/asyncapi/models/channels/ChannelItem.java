package org.eclipse.microprofile.asyncapi.models.channels;

import org.eclipse.microprofile.asyncapi.models.Operation;
import org.eclipse.microprofile.asyncapi.models.Parameter;
import org.eclipse.microprofile.asyncapi.models.bindings.ChannelBindings;
import org.eclipse.microprofile.openapi.models.Constructible;
import org.eclipse.microprofile.openapi.models.Extensible;
import org.eclipse.microprofile.openapi.models.Reference;

import java.util.Map;

/**
 * An object representing a channel. Describes the operation available on a single channel
 * */
public interface ChannelItem extends Constructible, Extensible<ChannelItem>, Reference<ChannelItem> {

    /**
     * An optional description of this channel item.
     * <a href="http://spec.commonmark.org/">CommonMark</a> syntax can be used for rich text representation.
     *
     * @return a description of this channel
     * */
    String getDescription();

    /**
     * Sets an optional description of this channel item.
     * <a href="http://spec.commonmark.org/">CommonMark</a> syntax can be used for rich text representation.
     *
     * @param description a description of this channel
     * */
    void setDescription(String description);

    /**
     * Sets an optional description of this channel item.
     * <a href="http://spec.commonmark.org/">CommonMark</a> syntax can be used for rich text representation.
     *
     * @param description a description of this channel
     * @return ChannelItem instance with the set description property
     * */
    default ChannelItem description(String description) {
        setDescription(description);
        return this;
    }

    /**
     * Returns a definition of the SUBSCRIBE operation, which defines the messages produced by the application
     * and sent to the channel.
     *
     * @return Subscribe operation of this channel
     * */
    Operation getSubscribe();

    /**
     * Sets a definition of the SUBSCRIBE operation, which defines the messages produced by the application
     * and sent to the channel.
     *
     * @param subscribe Subscribe operation of this channel
     * */
    void setSubscribe(Operation subscribe);

    /**
     * Sets a definition of the SUBSCRIBE operation, which defines the messages produced by the application
     * and sent to the channel.
     *
     * @param subscribe Subscribe operation of this channel
     * @return ChanelItem instance with the set subscribe property
     * */
    default ChannelItem subscribe(Operation subscribe) {
        setSubscribe(subscribe);
        return this;
    }

    /**
     * Returns a definition of the PUBLISH operation, which defines the messages produced by the application
     * and sent to the channel.
     *
     * @return Publish operation of this channel
     * */
    Operation getPublish();

    /**
     * Sets a definition of the PUBLISH operation, which defines the messages produced by the application
     * and sent to the channel.
     *
     * @param publish Publish operation of this channel
     * */
    void setPublish(Operation publish);

    /**
     * Sets a definition of the PUBLISH operation, which defines the messages produced by the application
     * and sent to the channel.
     *
     * @param publish Publish operation of this channel
     * @return ChanelItem instance with the set publish property
     * */
    default ChannelItem publish(Operation publish) {
        setPublish(publish);
        return this;
    }

    /**
     * Returns a map of parameters included in a channel name.
     * This map MUST contain all the parameters used in the parent channel name.
     *
     * @return a map containing channel name parameters
     * */
    Map<String, Parameter> getParameters();

    /**
     * Sets a map of parameters included in a channel name.
     * This map MUST contain all the parameters used in the parent channel name.
     *
     * @param parameters a map containing channel name parameters
     * */
    void setParameters(Map<String, Parameter> parameters);

    /**
     * Sets a map of parameters included in a channel name.
     * This map MUST contain all the parameters used in the parent channel name.
     *
     * @param parameters a map containing channel name parameters
     * @return ChanelItem instance with the set parameters property
     * */
    default ChannelItem parameters(Map<String, Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Returns a map where the keys describe the name of the protocol and the values describe protocol-specific definitions
     * for the channel.
     *
     * @return a map of channel protocol bindings
     * */
    ChannelBindings getBindings();

    /**
     * Sets a map where the keys describe the name of the protocol and the values describe protocol-specific definitions
     * for the channel.
     *
     * @param bindings  a map of channel protocol bindings
     * */
    void setBindings(ChannelBindings bindings);

    /**
     * Sets a map where the keys describe the name of the protocol and the values describe protocol-specific definitions
     * for the channel.
     *
     * @param bindings  a map of channel protocol bindings
     * @return ChanelItem instance with the set bindings property
     * */
    default ChannelItem bindings(ChannelBindings bindings) {
        setBindings(bindings);
        return this;
    }
}
