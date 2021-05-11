package org.eclipse.microprofile.asyncapi.models.bindings.operation;

import org.eclipse.microprofile.asyncapi.models.Constructible;
import org.eclipse.microprofile.asyncapi.models.bindings.VersionableBinding;

/**
 * This object contains information about the operation representation in AMQP.
 * */
public interface AmqpBindings extends Constructible, VersionableBinding<AmqpBindings> {
    /**
     * Returns TTL (Time-To-Live) for the message. It Must be greater than or equal to zero.
     *
     * @return expiration property
     * */
    int getExpiration();

    /**
     * Sets TTL (Time-To-Live) for the message. It Must be greater than or equal to zero.
     *
     * @param expiration expiration property
     * */
    void setExpiration(int expiration);

    /**
     * Sets TTL (Time-To-Live) for the message. It Must be greater than or equal to zero.
     *
     * @param expiration expiration property
     * @return bindings instance with the expiration property set
     * */
    default AmqpBindings expiration(int expiration) {
        setExpiration(expiration);
        return this;
    }

    /**
     * Returns the user identificator who has sent the message.
     *
     * @return userId property
     * */
    String getUserId();

    /**
     * Sets the user identificator who has sent the message.
     *
     * @param userId userId property
     * */
    void setUserId(String userId);

    /**
     * Sets the user identificator who has sent the message.
     *
     * @param userId userId property
     * @return bindings instance with the userId property set
     * */
    default AmqpBindings userId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * Returns the routing keys the message should be routed to at the time of publishing.
     *
     * @return cc property
     * */
    String[] getCc();

    /**
     * Sets the routing keys the message should be routed to at the time of publishing.
     *
     * @param cc cc property
     * */
    void setCc(String[] cc);

    /**
     * Sets the routing keys the message should be routed to at the time of publishing.
     *
     * @param cc cc property
     * @return bindings instance with the cc property set
     * */
    default AmqpBindings cc(String[] cc) {
        setCc(cc);
        return this;
    }

    /**
     * Returns priority of the message
     *
     * @return priority property
     * */
    int getPriority();

    /**
     * Sets priority of the message
     *
     * @param priority priority property
     * */
    void setPriority(int priority);

    /**
     * Sets priority of the message
     *
     * @param priority priority property
     * @return bindings instance with the priority property set
     * */
    default AmqpBindings priority(int priority) {
        setPriority(priority);
        return this;
    }

    /**
     * Returns delivery mode of the message. Its value MUST be either 1 (transient) or 2 (persistent).
     *
     * @return deliveryMode property
     * */
    int getDeliveryMode();

    /**
     * Sets delivery mode of the message. Its value MUST be either 1 (transient) or 2 (persistent).
     *
     * @param deliveryMode deliveryMode property
     * */
    void setDeliveryMode(int deliveryMode);

    /**
     * Sets delivery mode of the message. Its value MUST be either 1 (transient) or 2 (persistent).
     *
     * @param deliveryMode deliveryMode property
     * @return bindings instance with the deliveryMode property set
     * */
    default AmqpBindings deliveryMode(int deliveryMode) {
        setDeliveryMode(deliveryMode);
        return this;
    }

    /**
     * Returns whether the message is mandatory or not.
     *
     * @return mandatory property
     * */
    boolean getMandatory();

    /**
     * Sets whether the message is mandatory or not.
     *
     * @param mandatory mandatory property
     * */
    void setMandatory(boolean mandatory);

    /**
     * Sets whether the message is mandatory or not.
     *
     * @param mandatory mandatory property
     * @return bindings instance with the mandatory property set
     * */
    default AmqpBindings mandatory(boolean mandatory) {
        setMandatory(mandatory);
        return this;
    }

    /**
     * Returns property similar to {@link AmqpBindings#getCc} but consumers will not receive this information.
     *
     * @return bcc property
     * */
    String[] getBcc();

    /**
     * Sets property similar to {@link AmqpBindings#getCc} but consumers will not receive this information.
     *
     * @param bcc bcc property
     * */
    void setBcc(String[] bcc);

    /**
     * Sets property similar to {@link AmqpBindings#getCc} but consumers will not receive this information.
     *
     * @param bcc bcc property
     * @return bindings instance with the bcc property set
     * */
    default AmqpBindings bcc(String[] bcc) {
        setBcc(bcc);
        return this;
    }

    /**
     * Returns the name of the queue where the consumer should send the response.
     *
     * @return replyTo property
     * */
    String getReplyTo();

    /**
     * Sets the name of the queue where the consumer should send the response.
     *
     * @param replyTo replyTo property
     * */
    void setReplyTo(String replyTo);

    /**
     * Sets the name of the queue where the consumer should send the response.
     *
     * @param replyTo replyTo property
     * @return bindings instance with the replyTo property set
     * */
    default AmqpBindings replyTo(String replyTo) {
        setReplyTo(replyTo);
        return this;
    }

    /**
     * Returns whether the message should include a timestamp or not.
     *
     * @return timestamp property
     * */
    boolean getTimestamp();

    /**
     * Sets whether the message should include a timestamp or not.
     *
     * @param timestamp timestamp property
     * */
    void setTimestamp(boolean timestamp);

    /**
     * Sets whether the message should include a timestamp or not.
     *
     * @param timestamp timestamp property
     * @return bindings instance with the timestamp property set
     * */
    default AmqpBindings timestamp(boolean timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * Returns whether the consumer should ack the message or not.
     *
     * @return ack property
     * */
    boolean getAck();

    /**
     * Sets whether the consumer should ack the message or not.
     *
     * @param ack ack property
     * */
    void setAck(boolean ack);

    /**
     * Sets whether the consumer should ack the message or not.
     *
     * @param ack ack property
     * @return bindings instance with the ack property set
     * */
    default AmqpBindings ack(boolean ack) {
        setAck(ack);
        return this;
    }
}
