package org.eclipse.microprofile.asyncapi.models.components;

import org.eclipse.microprofile.asyncapi.models.Parameter;
import org.eclipse.microprofile.asyncapi.models.bindings.ChannelBindings;
import org.eclipse.microprofile.asyncapi.models.bindings.MessageBindings;
import org.eclipse.microprofile.asyncapi.models.bindings.OperationBindings;
import org.eclipse.microprofile.asyncapi.models.bindings.ServerBindings;
import org.eclipse.microprofile.openapi.models.Constructible;
import org.eclipse.microprofile.openapi.models.Extensible;
import org.eclipse.microprofile.openapi.models.media.Schema;
import org.eclipse.microprofile.openapi.models.security.SecurityScheme;

import java.util.Map;

/**
 * Holds a set of reusable objects for different aspects of the AsyncAPI specification.
 * All objects defined within the components object will have no effect on the API unless they are explicitly referenced
 * from properties outside the components object.
 */
public interface Components extends Constructible, Extensible<Components> {

    /**
     * Returns the schemas property from a Components instance.
     *
     * @return a copy Map (potentially immutable) containing the keys and the reusable schemas for this AsyncAPI document
     **/
    Map<String, Schema> getSchemas();

    /**
     * Sets this Components' schemas property to the given Map containing keys and reusable schema objects.
     *
     * @param schemas a Map containing keys and reusable schema objects
     */
    void setSchemas(Map<String, Schema> schemas);

    /**
     * Sets this Components' schemas property to the given Map containing keys and reusable schemas.
     *
     * @param schemas a Map containing keys and reusable schemas
     * @return the current Components object
     */
    default Components schemas(Map<String, Schema> schemas) {
        setSchemas(schemas);
        return this;
    }

    /**
     * Adds the given schema to this Components' list of schemas with the given string as its key.
     *
     * @param key    a key conforming to the format required for this object
     * @param schema a reusable schema object. null values will be rejected (implementation will throw an exception) or ignored.
     * @return the current Components object
     */
    Components addSchema(String key, Schema schema);

    /**
     * Removes the given schema to this Components' list of schemas with the given string as its key.
     *
     * @param key a key conforming to the format required for this object
     */
    void removeSchema(String key);

    /**
     * Returns messages property from a Components instance.
     *
     * @return a copy Map containing the keys and the defined messages for this AsyncAPI document
     */
    Map<String, Message> getMessages();

    /**
     * Sets messages property to a Components instance.
     *
     * @param messages a Map containing the keys and defined messages for this AsyncAPI document
     */
    void setMessages(Map<String, Message> messages);

    /**
     * Sets messages property to a Components instance.
     *
     * @param messages a Map containing the keys and defined messages for this AsyncAPI document
     * @return the current Components object
     */
    default Components messages(Map<String, Message> messages) {
        setMessages(messages);
        return this;
    }

    /**
     * Adds the given message to this Components' list of messages with the given string as its key.
     *
     * @param key     a key conforming to the format required for this object
     * @param message a reusable message object. null values will be rejected (implementation will throw an exception) or ignored.
     * @return the current Components object
     */
    Components addMessage(String key, Message message);

    /**
     * Removes the given message to this Components' list of messages with the given string as its key.
     *
     * @param key a key conforming to the format required for this object
     */
    void removeMessage(String key);

    /**
     * Returns the securitySchemes property from a Components instance.
     *
     * @return a copy Map (potentially immutable) containing the keys and the reusable security schemes for this AsyncAPI document
     **/
    Map<String, SecurityScheme> getSecuritySchemes();

    /**
     * Sets this Components' securitySchemes property to the given Map containing keys and reusable security scheme objects.
     *
     * @param securitySchemes a Map containing the keys and reusable security scheme objects
     */
    void setSecuritySchemes(Map<String, SecurityScheme> securitySchemes);

    /**
     * Sets this Components' securitySchemes property to the given Map containing keys and reusable security scheme objects.
     *
     * @param securitySchemes a Map containing the keys and reusable security scheme objects
     * @return the current Components object
     */
    default Components securitySchemes(Map<String, SecurityScheme> securitySchemes) {
        setSecuritySchemes(securitySchemes);
        return this;
    }

    /**
     * Adds the given security scheme to this Components' map of security schemes with the given string as its key.
     *
     * @param key            a key conforming to the format required for this object
     * @param securityScheme a reusable security scheme object. null values will be rejected (implementation will throw an exception) or ignored.
     * @return the current Components object with the securityScheme property set
     */
    Components addSecurityScheme(String key, SecurityScheme securityScheme);

    /**
     * Removes the given security scheme to this Components' map of security schemes with the given string as its key.
     *
     * @param key a key conforming to the format required for this object
     */
    void removeSecurityScheme(String key);

    /**
     * Returns the parameters property from a Components instance.
     *
     * @return a copy Map (potentially immutable) containing the keys and the reusable parameters of API operations for this AsyncAPI document
     **/
    Map<String, Parameter> getParameters();

    /**
     * Sets this Components' parameters property to the given Map containing keys and reusable parameter objects.
     *
     * @param parameters a Map containing keys and reusable parameter objects
     */
    void setParameters(Map<String, Parameter> parameters);

    /**
     * Sets this Components' parameters property to the given Map containing keys and reusable parameter objects.
     *
     * @param parameters a Map containing keys and reusable parameter objects
     * @return the current Components object with the parameter property set
     */
    default Components parameters(Map<String, Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Adds the given parameter to this Components' map of parameters with the given string as its key.
     *
     * @param key       a key conforming to the format required for this object
     * @param parameter a reusable parameter object. null values will be rejected (implementation will throw an exception) or ignored.
     * @return the current Components object with the parameter property added
     */
    Components addParameter(String key, Parameter parameter);

    /**
     * Removes the given parameter to this Components' map of parameters with the given string as its key.
     *
     * @param key a key conforming to the format required for this object
     */
    void removeParameter(String key);

    /**
     * Returns the correlationIds property from a Components instance.
     *
     * @return a copy Map (potentially immutable) containing the keys and the reusable correlationIds of API operations for
     * this AsyncAPI document
     **/
    Map<String, CorrelationId> getCorrelationIds();

    /**
     * Sets the correlationIds property from a Components instance.
     *
     * @param correlationIds a copy Map (potentially immutable) containing the keys and the reusable correlationIds of API
     *                       operations for this AsyncAPI document
     **/
    void setCorrelationIds(Map<String, CorrelationId> correlationIds);

    /**
     * Sets the correlationIds property from a Components instance.
     *
     * @param correlationIds a copy Map (potentially immutable) containing the keys and the reusable correlationIds of API
     *                       operations for this AsyncAPI document
     * @return the current Components object with the correlationIds property set
     **/
    default Components correlationIds(Map<String, CorrelationId> correlationIds) {
        setCorrelationIds(correlationIds);
        return this;
    }

    /**
     * Returns the operationTraits property from a Components instance.
     *
     * @return a copy Map (potentially immutable) containing the keys and the reusable operationTraits of API operations
     * for this AsyncAPI document
     **/
    Map<String, OperationTrait> getOperationTraits();

    /**
     * Sets the operationTraits property from a Components instance.
     *
     * @param operationTraits a copy Map (potentially immutable) containing the keys and the reusable operationTraits of API
     *                        operations for this AsyncAPI document
     **/
    void setOperationTraits(Map<String, OperationTrait> operationTraits);

    /**
     * Sets the operationTraits property from a Components instance.
     *
     * @param operationTraits a copy Map (potentially immutable) containing the keys and the reusable operationTraits of API
     *                        operations for this AsyncAPI document
     * @return the current Components object with the correlationIds property set
     **/
    default Components operationTraits(Map<String, OperationTrait> operationTraits) {
        setOperationTraits(operationTraits);
        return this;
    }

    /**
     * Adds the given operationTrait to this Components' map of operationTraits with the given string as its key.
     *
     * @param key            a key conforming to the format required for this object
     * @param operationTrait a reusable operationTrait object. null values will be rejected (implementation will throw
     *                       an exception) or ignored.
     * @return the current Components object with the operationTrait property added
     */
    Components addOperationTrait(String key, OperationTrait operationTrait);

    /**
     * Removes the given operationTrait to this Components' map of operationTraits with the given string as its key.
     *
     * @param key a key conforming to the format required for this object
     */
    void removeOperationTrait(String key);

    /**
     * Returns the messageTraits property from a Components instance.
     *
     * @return a copy Map (potentially immutable) containing the keys and the reusable messageTraits of API operations for
     * this AsyncAPI document
     **/
    Map<String, MessageTrait> getMessageTraits();

    /**
     * Sets the messageTraits property from a Components instance.
     *
     * @param messageTraits a copy Map (potentially immutable) containing the keys and the reusable messageTraits of API
     *                      operations for this AsyncAPI document
     **/
    void setMessageTraits(Map<String, MessageTrait> messageTraits);

    /**
     * Sets the messageTraits property from a Components instance.
     *
     * @param messageTraits a copy Map (potentially immutable) containing the keys and the reusable messageTraits of API
     *                      operations for this AsyncAPI document
     * @return the current Components object with the messageTraits property set
     **/
    default Components messageTraits(Map<String, MessageTrait> messageTraits) {
        setMessageTraits(messageTraits);
        return this;
    }

    /**
     * Adds the given messageTrait to this Components' map of messageTraits with the given string as its key.
     *
     * @param key          a key conforming to the format required for this object
     * @param messageTrait a reusable messageTrait object. null values will be rejected (implementation will throw an
     *                     exception) or ignored.
     * @return the current Components object with the messageTrait property added
     */
    Components addMessageTrait(String key, MessageTrait messageTrait);

    /**
     * Removes the given messageTrait to this Components' map of messageTraits with the given string as its key.
     *
     * @param key a key conforming to the format required for this object
     */
    void removeMessageTrait(String key);

    /**
     * Returns an object that holds reusable Server Bindings Objects
     *
     * @return Map of ServerBinding objects
     */
    Map<String, ServerBindings> getServerBindings();

    /**
     * Sets an object that holds reusable Server Bindings Objects
     *
     * @param serverBindings Map of ServerBinding objects
     */
    void setServerBindings(Map<String, ServerBindings> serverBindings);

    /**
     * Sets an object that holds reusable Server Bindings Objects
     *
     * @param serverBindings Map of ServerBinding objects
     * @return the current Components object with the serverBindings property set
     */
    default Components serverBindings(Map<String, ServerBindings> serverBindings) {
        setServerBindings(serverBindings);
        return this;
    }

    /**
     * Adds the given serverBinding to this Components' map of serverBindings with the given string as its key.
     *
     * @param key           a key conforming to the format required for this object
     * @param serverBinding a reusable serverBinding object. null values will be rejected (implementation will throw an
     *                      exception) or ignored.
     * @return the current Components object with the messageTrait property added
     */
    Components addServerBinding(String key, ServerBindings serverBinding);

    /**
     * Removes the given serverBinding to this Components' map of serverBindings with the given string as its key.
     *
     * @param key a key conforming to the format required for this object
     */
    void removeServerBinding(String key);

    /**
     * Returns an object that holds reusable Server Bindings Objects
     *
     * @return Map of ChannelBinding objects
     */
    Map<String, ChannelBindings> getChannelBindings();

    /**
     * Sets an object that holds reusable Server Bindings Objects
     *
     * @param channelBindings Map of ChannelBinding objects
     */
    void setChannelBindings(Map<String, ChannelBindings> channelBindings);

    /**
     * Sets an object that holds reusable Server Bindings Objects
     *
     * @param channelBindings Map of ChannelBinding objects
     * @return the current Components object with the channelBindings property set
     */
    default Components channelBindings(Map<String, ChannelBindings> channelBindings) {
        setChannelBindings(channelBindings);
        return this;
    }

    /**
     * Adds the given channelBinding to this Components' map of channelBindings with the given string as its key.
     *
     * @param key            a key conforming to the format required for this object
     * @param channelBinding a reusable channelBinding object. null values will be rejected (implementation will throw
     *                       an exception) or ignored.
     * @return the current Components object with the messageTrait property added
     */
    Components addChannelBinding(String key, ChannelBindings channelBinding);

    /**
     * Removes the given channelBinding to this Components' map of channelBindings with the given string as its key.
     *
     * @param key a key conforming to the format required for this object
     */
    void removeChannelBinding(String key);

    /**
     * Returns an object that holds reusable Server Bindings Objects
     *
     * @return Map of OperationBinding objects
     */
    Map<String, OperationBindings> getOperationBindings();

    /**
     * Sets an object that holds reusable Server Bindings Objects
     *
     * @param operationBindings Map of OperationBinding objects
     */
    void setOperationBindings(Map<String, OperationBindings> operationBindings);

    /**
     * Sets an object that holds reusable Server Bindings Objects
     *
     * @param operationBindings Map of OperationBinding objects
     * @return the current Components object with the operationBindings property set
     */
    default Components operationBindings(Map<String, OperationBindings> operationBindings) {
        setOperationBindings(operationBindings);
        return this;
    }

    /**
     * Adds the given operationBinding to this Components' map of operationBindings with the given string as its key.
     *
     * @param key              a key conforming to the format required for this object
     * @param operationBinding a reusable operationBinding object. null values will be rejected (implementation will throw
     *                         an exception) or ignored.
     * @return the current Components object with the messageTrait property added
     */
    Components addOperationBinding(String key, OperationBindings operationBinding);

    /**
     * Removes the given operationBinding to this Components' map of operationBindings with the given string as its key.
     *
     * @param key a key conforming to the format required for this object
     */
    void removeOperationBinding(String key);

    /**
     * Returns an object that holds reusable Server Bindings Objects
     *
     * @return Map of MessageBinding objects
     */
    Map<String, MessageBindings> getMessageBindings();

    /**
     * Sets an object that holds reusable Server Bindings Objects
     *
     * @param messageBindings Map of MessageBinding objects
     */
    void setMessageBindings(Map<String, MessageBindings> messageBindings);

    /**
     * Sets an object that holds reusable Server Bindings Objects
     *
     * @param messageBindings Map of MessageBinding objects
     * @return the current Components object with the messageBindings property set
     */
    default Components messageBindings(Map<String, MessageBindings> messageBindings) {
        setMessageBindings(messageBindings);
        return this;
    }

    /**
     * Adds the given messageBinding to this Components' map of messageBindings with the given string as its key.
     *
     * @param key            a key conforming to the format required for this object
     * @param messageBinding a reusable messageBinding object. null values will be rejected (implementation will throw an
     *                       exception) or ignored.
     * @return the current Components object with the messageTrait property added
     */
    Components addMessageBinding(String key, MessageBindings messageBinding);

    /**
     * Removes the given messageBinding to this Components' map of messageBindings with the given string as its key.
     *
     * @param key a key conforming to the format required for this object
     */
    void removeMessageBinding(String key);
}
