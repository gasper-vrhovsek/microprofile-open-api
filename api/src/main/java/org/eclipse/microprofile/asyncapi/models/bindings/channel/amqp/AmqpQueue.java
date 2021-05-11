package org.eclipse.microprofile.asyncapi.models.bindings.channel.amqp;

import org.eclipse.microprofile.asyncapi.models.Constructible;
import org.eclipse.microprofile.asyncapi.models.Extensible;

/**
 * Defines the queue properties when {@code is}={@code queue}
 * */
public interface AmqpQueue extends Constructible, Extensible<AmqpQueue> {

    /**
     * Returns the name of the queue. It MUST NOT exceed 255 characters.
     *
     * @return queue name
     * */
    String getName();

    /**
     * Sets the name of the queue. It MUST NOT exceed 255 characters.
     *
     * @param name queue name
     * */
    void setName(String name);

    /**
     * Sets the name of the queue. It MUST NOT exceed 255 characters.
     *
     * @param name queue name
     * @return amqpQueue instance with the name property set
     * */
    default AmqpQueue name(String name) {
        setName(name);
        return this;
    }

    /**
     * Returns true or false whether the queue should survive broker restarts or not.
     *
     * @return queue durable property
     * */
    Boolean getDurable();

    /**
     * Sets the durable property, whether the queue should survive broker restarts or not.
     *
     * @param durable queue durable property
     * */
    void setDurable(boolean durable);

    /**
     * Sets the durable property, whether the queue should survive broker restarts or not.
     *
     * @param durable queue durable property
     * @return amqpQueue instance with the durable property set
     * */
    default AmqpQueue durable(boolean durable) {
        setDurable(durable);
        return this;
    }

    /**
     * Returns true or falsw whether the queue should be used only by one connection or not.
     *
     * @return queue exclusive property
     * */
    Boolean getExclusive();

    /**
     * Sets the exclusive property, whether the queue should be used only by one connection or not.
     *
     * @param exclusive queue exclusive property
     * */
    void setExclusive(boolean exclusive);

    /**
     * Returns true or false whether the queue should be deleted when the last queue is unbound from it.
     *
     * @return queue autoDelete property
     * */
    Boolean getAutoDelete();

    /**
     * Sets a boolean value whether the queue should be deleted when the last queue is unbound from it.
     *
     * @param autoDelete queue autoDelete property
     * */
    void setAutoDelete(boolean autoDelete);

    /**
     * Returns the virtual host of the queue. Defaults to {@code /}.
     *
     * @return virtual host property
     * */
    String getVhost();

    /**
     * Sets the virtual host of the queue. Defaults to {@code /}.
     *
     * @param vhost virtual host property
     * */
    void setVhost(String vhost);
}
