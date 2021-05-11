package org.eclipse.microprofile.asyncapi.models.bindings.channel;

import org.eclipse.microprofile.asyncapi.models.bindings.VersionableBinding;
import org.eclipse.microprofile.asyncapi.models.bindings.channel.amqp.AmqpExchange;
import org.eclipse.microprofile.asyncapi.models.bindings.channel.amqp.AmqpQueue;
import org.eclipse.microprofile.asyncapi.models.Constructible;

/**
 * This object contains information about the channel representation in AMQP
 * */
public interface AmqpBindings extends Constructible, VersionableBinding<AmqpBindings> {
    /**
     * Returns a definition of what type the channel is. Can be either {@code queue} or {@code routingKey} (default)
     *
     * @return type of channel
     * */
    String getIs();

    /**
     * Sets a definition of what type the channel is. Can be either {@code queue} or {@code routingKey} (default)
     *
     * @param is type of channel
     * */
    void setIs(String is);

    /**
     * Sets a definition of what type the channel is. Can be either {@code queue} or {@code routingKey} (default)
     *
     * @param is type of channel
     * @return bindings instance with the is property set
     * */
    default AmqpBindings is(String is) {
        setIs(is);
        return this;
    }

    /**
     * Returns, when {@code is}={@code routingKey}, object that defines the exchange properties.
     *
     * @return the exchange property
     * */
    AmqpExchange getExchange();

    /**
     * Sets, when {@code is}={@code routingKey}, the object that defines the exchange properties.
     *
     * @param exchange the exchange property
     * */
    void setExchange(AmqpExchange exchange);

    /**
     * Sets, when {@code is}={@code routingKey}, the object that defines the exchange properties.
     *
     * @param exchange the exchange properties
     * @return bindings instance with the exchange property set
     * */
    default AmqpBindings exchange(AmqpExchange exchange) {
        setExchange(exchange);
        return this;
    }

    /**
     * Returns, when {@code is}={@code queue}, the object that defines the queue properties.
     *
     * @return the queue property
     * */
    AmqpQueue getQueue();

    /**
     * Sets, when {@code is}={@code queue}, the object that defines the queue properties.
     *
     * @param queue the queue property
     * */
    void setQueue(AmqpQueue queue);

    /**
     * Sets, when {@code is}={@code queue}, the object that defines the queue properties.
     *
     * @param queue the queue property
     * @return bindings instance with the queue property set
     * */
    default AmqpBindings queue(AmqpQueue queue) {
        setQueue(queue);
        return this;
    }
}
