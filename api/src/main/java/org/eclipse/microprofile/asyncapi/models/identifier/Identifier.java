package org.eclipse.microprofile.asyncapi.models.identifier;

/**
 * This field represents a unique universal identifier of the application the AsyncAPI document is defining. It must conform to the URI format, according to RFC3986.
 *
 * It is RECOMMENDED to use a URN to globally and uniquely identify the application during long periods of time, even after it becomes unavailable or ceases to exist.
 *
 * @see "https://www.asyncapi.com/docs/specifications/2.0.0#A2SIdString"
 */
public interface Identifier {

    /**
     * Returns the id of the application for this instance of Identifier
     *
     * @return the id of the application
     * */
    String getId();

    /**
     * Sets this Identifier instance's id for the application
     *
     * @param id the id of the application
     * */
    void setId(String id);

    /**
     * Sets this Identifier instance's id for the application
     *
     * @param id the id of the application
     * @return this Identifier instance
     * */
    default Identifier id(String id) {
        setId(id);
        return this;
    }
}
