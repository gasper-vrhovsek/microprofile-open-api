package org.eclipse.microprofile.asyncapi.models.bindings.channel.amqp;

import org.eclipse.microprofile.openapi.models.Constructible;
import org.eclipse.microprofile.openapi.models.Extensible;

/**
 * Defines the exchange properties when {@code is}={@code routingKey}
 * */
public interface AmqpExchange extends Constructible, Extensible<AmqpExchange> {
    /**
     * Returns the name of the exchange. It MUST NOT exceed 255 characters.
     *
     * @return the name of the exchange
     * */
    String getName();

    /**
     * Sets the name of the exchange. It MUST NOT exceed 255 characters.
     *
     * @param name the name of the exchange
     */
    void setName(String name);

    /**
     * Return the type of the exchange. Can be either {@code topic}, {@code direct}, {@code fanout}, {@code default} or {@code headers}.
     *
     * @return the type of the exchange
     * */
    String getType();

    /**
     * Sets the type of the exchange. Can be either {@code topic}, {@code direct}, {@code fanout}, {@code default} or {@code headers}.
     *
     * @param type the type of the exchange
     * */
    void setType(String type);

    /**
     * Returns true or false whether the exchange should survive broker restarts or not.
     *
     * @return exchange durable property
     * */
    Boolean getDurable();

    /**
     * Sets the durable property, whether the exchange should survive broker restarts or not.
     *
     * @param durable exchange durable property
     * */
    void setDurable(boolean durable);

    /**
     * Returns true or false whether the exchange should be deleted when the last queue is unbound from it.
     *
     * @return exchange autoDelete property
     * */
    Boolean getAutoDelete();

    /**
     * Sets a boolean value whether the exchange should be deleted when the last queue is unbound from it.
     *
     * @param autoDelete exchange autoDelete property
     * */
    void setAutoDelete(boolean autoDelete);

    /**
     * Returns the virtual host of the exchange. Defaults to {@code /}.
     *
     * @return virtual host property
     * */
    String getVhost();

    /**
     * Sets the virtual host of the exchange. Defaults to {@code /}.
     *
     * @param vhost virtual host property
     * */
    void setVhost(String vhost);
}
