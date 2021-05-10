package org.eclipse.microprofile.asyncapi.models.bindings;

import org.eclipse.microprofile.asyncapi.models.bindings.server.MqttBindings;
import org.eclipse.microprofile.asyncapi.models.Constructible;
import org.eclipse.microprofile.asyncapi.models.Extensible;
import org.eclipse.microprofile.asyncapi.models.Reference;

/**
 * Map describing protocol-specific definitions for a server.
 * */
public interface ServerBindings extends Constructible, Extensible<ServerBindings>, Reference<ServerBindings> {
    // TODO check if we should just remove EmptyBindings placeholders

    /**
     * Returns protocol-specific information for an HTTP server.
     *
     * @return bindings object for this specific protocol
     * */
    EmptyBindings getHttp();

    /**
     * Sets the protocol-specific information for an HTTP server.
     *
     * @param http bindings object for this specific protocol
     * */
    void setHttp(EmptyBindings http);

    /**
     * Returns protocol-specific information for an WebSockets server.
     *
     * @return bindings object for this specific protocol
     * */
    EmptyBindings getWs();

    /**
     * Sets the protocol-specific information for an WebSockets server.
     *
     * @param ws bindings object for this specific protocol
     * */
    void setWs(EmptyBindings ws);

    /**
     * Returns protocol-specific information for an Kafka server.
     *
     * @return bindings object for this specific protocol
     * */
    EmptyBindings getKafka();

    /**
     * Sets the protocol-specific information for an Kafka server.
     *
     * @param kafka bindings object for this specific protocol
     * */
    void setKafka(EmptyBindings kafka);

    /**
     * Returns protocol-specific information for an AMQP server.
     *
     * @return bindings object for this specific protocol
     * */
    EmptyBindings getAmqp();

    /**
     * Sets the protocol-specific information for an AMQP server.
     *
     * @param amqp bindings object for this specific protocol
     * */
    void setAmqp(EmptyBindings amqp);

    /**
     * Returns protocol-specific information for an AMQP1 server.
     *
     * @return bindings object for this specific protocol
     * */
    EmptyBindings getAmqp1();

    /**
     * Sets the protocol-specific information for an AMQP1 server.
     *
     * @param amqp1 bindings object for this specific protocol
     * */
    void setAmqp1(EmptyBindings amqp1);

    /**
     * Returns protocol-specific information for an MQTT server.
     *
     * @return bindings object for this specific protocol
     * */
    MqttBindings getMqtt();

    /**
     * Sets the protocol-specific information for an MQTT server.
     *
     * @param mqtt bindings object for this specific protocol
     * */
    void setMqtt(MqttBindings mqtt);

    /**
     * Returns protocol-specific information for an MQTT5 server.
     *
     * @return bindings object for this specific protocol
     * */
    EmptyBindings getMqtt5();

    /**
     * Sets the protocol-specific information for an MQTT5 server.
     *
     * @param mqtt5 bindings object for this specific protocol
     * */
    void setMqtt5(EmptyBindings mqtt5);

    /**
     * Returns protocol-specific information for an NATS server.
     *
     * @return bindings object for this specific protocol
     * */
    EmptyBindings getNats();

    /**
     * Sets the protocol-specific information for an NATS server.
     *
     * @param nats bindings object for this specific protocol
     * */
    void setNats(EmptyBindings nats);

    /**
     * Returns protocol-specific information for an JMS server.
     *
     * @return bindings object for this specific protocol
     * */
    EmptyBindings getJms();

    /**
     * Sets the protocol-specific information for an JMS server.
     *
     * @param jms bindings object for this specific protocol
     * */
    void setJms(EmptyBindings jms);

    /**
     * Returns protocol-specific information for an SNS server.
     *
     * @return bindings object for this specific protocol
     * */
    EmptyBindings getSns();

    /**
     * Sets the protocol-specific information for an SNS server.
     *
     * @param sns bindings object for this specific protocol
     * */
    void setSns(EmptyBindings sns);

    /**
     * Returns protocol-specific information for an SQS server.
     *
     * @return bindings object for this specific protocol
     * */
    EmptyBindings getSqs();

    /**
     * Sets the protocol-specific information for an SQS server.
     *
     * @param sqs bindings object for this specific protocol
     * */
    void setSqs(EmptyBindings sqs);

    /**
     * Returns protocol-specific information for an STOMP server.
     *
     * @return bindings object for this specific protocol
     * */
    EmptyBindings getStomp();

    /**
     * Sets the protocol-specific information for an STOMP server.
     *
     * @param stomp bindings object for this specific protocol
     * */
    void setStomp(EmptyBindings stomp);

    /**
     * Returns protocol-specific information for an Redis server.
     *
     * @return bindings object for this specific protocol
     * */
    EmptyBindings getRedis();

    /**
     * Sets the protocol-specific information for an Redis server.
     *
     * @param redis bindings object for this specific protocol
     * */
    void setRedis(EmptyBindings redis);

    /**
     * Returns protocol-specific information for an Mercure server.
     *
     * @return bindings object for this specific protocol
     * */
    EmptyBindings getMercure();

    /**
     * Sets the protocol-specific information for an Mercure server.
     *
     * @param mercure bindings object for this specific protocol
     * */
    void setMercure(EmptyBindings mercure);

}
