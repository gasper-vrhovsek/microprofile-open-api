package org.eclipse.microprofile.asyncapi.models;

import org.eclipse.microprofile.asyncapi.models.channels.ChannelItem;
import org.eclipse.microprofile.asyncapi.models.components.Components;
import org.eclipse.microprofile.asyncapi.models.identifier.Identifier;
import org.eclipse.microprofile.asyncapi.models.servers.Server;
import org.eclipse.microprofile.openapi.models.Constructible;
import org.eclipse.microprofile.openapi.models.Extensible;
import org.eclipse.microprofile.openapi.models.ExternalDocumentation;
import org.eclipse.microprofile.openapi.models.info.Info;
import org.eclipse.microprofile.openapi.models.tags.Tag;

import java.util.List;
import java.util.Map;

public interface AsyncAPI extends Constructible, Extensible<AsyncAPI> {

    /**
     * Returns the asyncapi property from an AsyncAPI instance.
     *
     * @return the semantic version number of the AsyncAPI Specification version that the AsyncAPI document uses
     **/
    String getAsyncapi();

    /**
     * Sets this AsyncAPI instance's asyncapi property to the given string.
     *
     * @param asyncapi the semantic version number of the AsyncAPI Specification version that the AsyncAPI document uses
     */
    void setAsyncapi(String asyncapi);

    /**
     * Sets this AsyncAPI instance's asyncapi property to the given string.
     *
     * @param asyncapi the semantic version number of the AsyncAPI Specification version that the AsyncAPI document uses
     * @return the current AsyncAPI object
     */
    default AsyncAPI asyncapi(String asyncapi) {
        setAsyncapi(asyncapi);
        return this;
    }

    /**
     * Returns the identifier property from an AsyncAPI instance.
     *
     * @return identifier about the API
     */
    Identifier getId();

    /**
     * Sets the AsyncAPI instance's identifier property to the given object.
     *
     * @param id identifier of the API
     */
    void setId(Identifier id);

    /**
     * Sets the AsyncAPI instance's identifier property to the given object.
     *
     * @param id identifier of the API
     * @return the current AsyncAPI object
     */
    default AsyncAPI identifier(Identifier id) {
        setId(id);
        return this;
    }

    /**
     * Returns the info property from an AsyncAPI instance.
     *
     * @return metadata about the API
     **/
    Info getInfo();

    /**
     * Sets this AsyncAPI instance's info property to the given object.
     *
     * @param info metadata about the API
     */
    void setInfo(Info info);

    /**
     * Sets this AsyncAPI instance's info property to the given object.
     *
     * @param info metadata about the API
     * @return the current AsyncAPI object
     */
    default AsyncAPI info(Info info) {
        setInfo(info);
        return this;
    }

    /**
     * Returns the externalDocs property from an AsyncAPI instance.
     *
     * @return additional external documentation
     **/
    ExternalDocumentation getExternalDocs();

    /**
     * Sets this AsyncAPI instance's externalDocs property to the given object.
     *
     * @param externalDocs additional external documentation.
     */
    void setExternalDocs(ExternalDocumentation externalDocs);

    /**
     * Sets this AsyncAPI instance's externalDocs property to the given object.
     *
     * @param externalDocs additional external documentation
     * @return the current AsyncAPI object
     */
    default AsyncAPI externalDocs(ExternalDocumentation externalDocs) {
        setExternalDocs(externalDocs);
        return this;
    }

    /**
     * Returns the Servers defined in the API
     *
     * @return a copy List (potentially immutable) of Server objects which provide connectivity information to target servers
     **/
    Map<String, Server> getServers();

    /**
     * Sets this AsyncAPI instance's servers property to the given servers.
     *
     * @param servers Server objects which provide connectivity information to target servers
     */
    void setServers(Map<String, Server> servers);

    /**
     * Sets this AsyncAPI instance's servers property to the given servers.
     *
     * @param servers Server objects which provide connectivity information to target servers
     * @return the current AsyncAPI object
     */
    default AsyncAPI servers(Map<String, Server> servers) {
        setServers(servers);
        return this;
    }

    /**
     * Adds the given server to this AsyncAPI instance's list of servers.
     *
     * @param serverName name of the Server object
     * @param server Server object which provides connectivity information to a target server
     * @return the current AsyncAPI object
     */
    AsyncAPI addServer(String serverName, Server server);

    /**
     * Removes the server at a given name from this AsyncAPI instance's list of servers.
     *
     * @param serverName name of the Server object which provides connectivity information to a target server
     */
    void removeServer(String serverName);

    /**
     * Returns the default content type to use when encoding/deconding a message's payload
     *
     * @return the default content type
     * */
    String getDefaultContentType();

    /**
     * Sets the default content type to use when encoding/deconding a message's payload
     *
     * @param defaultContentType the default content type
     * */
    void setDefaultContentType(String defaultContentType);

    /**
     * Sets the default content type to use when encoding/deconding a message's payload
     *
     * @param defaultContentType the default content type
     * @return the current AsyncAPI object
     * */
    default AsyncAPI defaultContentType(String defaultContentType) {
        setDefaultContentType(defaultContentType);
        return this;
    }

    /**
     * Returns relative paths to individual channels and their operations.
     * <p>
     * Channels are also known as "topics", "routing keys", "event types" or "paths". They hold relative paths to the
     * individual channels and their operations. Channel paths are relative to servers.
     * </p>
     * <p>
     * Relative paths to individual channels MUST be in the form of a <a href="https://tools.ietf.org/html/rfc6570">RFC 6570 URI template</a>.
     * Query parameters and fragments SHALL NOT be used. Instead use <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#channelBindingsObject">bindings</a> to define them.
     * </p>
     * @return a map of channel objects
     * */
    Map<String, ChannelItem> getChannels();

    /**
     * Sets relative paths to individual channels and their operations
     * <p>
     * Channels are also known as "topics", "routing keys", "event types" or "paths". They hold relative paths to the
     * individual channels and their operations. Channel paths are relative to servers.
     * </p>
     * <p>
     * Relative paths to individual channels MUST be in the form of a <a href="https://tools.ietf.org/html/rfc6570">RFC 6570 URI template</a>.
     * Query parameters and fragments SHALL NOT be used. Instead use <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#channelBindingsObject">bindings</a> to define them.
     * </p>
     * @param channels a map of channel objects
     * */
    void setChannels(Map<String, ChannelItem> channels);

    /**
     * Sets relative paths to individual channels and their operations
     * <p>
     * Channels are also known as "topics", "routing keys", "event types" or "paths". They hold relative paths to the
     * individual channels and their operations. Channel paths are relative to servers.
     * </p>
     * <p>
     * Relative paths to individual channels MUST be in the form of a <a href="https://tools.ietf.org/html/rfc6570">RFC 6570 URI template</a>.
     * Query parameters and fragments SHALL NOT be used. Instead use <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#channelBindingsObject">bindings</a> to define them.
     * </p>
     * @param channels a map of channel objects
     * @return the current AsyncAPI object
     * */
    default AsyncAPI channels(Map<String, ChannelItem> channels) {
        setChannels(channels);
        return this;
    }

    /**
     * Adds the given channel to this AsyncAPI instance's map of channels.
     *
     * @param channelName channel name also known as topic name, event name, etc.
     * @param channel channel object
     * */
    AsyncAPI addChannel(String channelName, ChannelItem channel);

    /**
     * Removes the channel under the given channel name from this AsyncAPI instance's map of channels
     *
     * @param channelName channel name from the corresponding channel to remove
     * */
    void removeChannel(String channelName);

    /**
     * Returns the tags property from an AsyncAPI instance.
     *
     * @return a copy List (potentially immutable) of tags defined in this the specification
     **/

    List<Tag> getTags();

    /**
     * Sets this AsyncAPI instance's tags property to the given Tags.
     *
     * @param tags tags used by the specification with additional metadata
     */
    void setTags(List<Tag> tags);

    /**
     * Sets this AsyncAPI instance's tags property to the given tags.
     *
     * @param tags tags used by the specification with additional metadata
     * @return the current AsyncAPI object
     */
    default AsyncAPI tags(List<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Adds the given tag to this AsyncAPI instance's list of tags.
     *
     * @param tag a tag used by the specification with additional metadata
     * @return the current AsyncAPI object
     */
    AsyncAPI addTag(Tag tag);

    /**
     * Removes the given tag to this AsyncAPI instance's list of tags.
     *
     * @param tag a tag used by the specification with additional metadata
     */
    void removeTag(Tag tag);

    /**
     * Returns the components property from an AsyncAPI instance.
     *
     * @return schemas used in the specification
     **/
    Components getComponents();

    /**
     * Sets this AsyncAPI instance's components property to the given components.
     *
     * @param components a set of reusable objects used in the API specification
     */
    void setComponents(Components components);

    /**
     * Sets this AsyncAPI instance's components property to the given components.
     *
     * @param components a set of reusable objects used in the API specification
     * @return the current AsyncAPI object
     */
    default AsyncAPI components(Components components) {
        setComponents(components);
        return this;
    }

}
