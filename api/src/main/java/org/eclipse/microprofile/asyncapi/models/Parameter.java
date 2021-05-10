package org.eclipse.microprofile.asyncapi.models;

import org.eclipse.microprofile.asyncapi.models.media.Schema;

/**
 * Describes operations available on a single channel
 * */
public interface Parameter extends Constructible, Extensible<Parameter>, Reference<Parameter> {

    /**
     *  Returns an optional description of this channel item. <a href="http://spec.commonmark.org/">CommonMark</>
     *  syntax can be used for rich text representation.
     *
     * @return channel description
     * */
    String getDescription();

    /**
     *  Sets an optional description of this channel item. <a href="http://spec.commonmark.org/">CommonMark</>
     *  syntax can be used for rich text representation.
     *
     * @param description channel description
     * */
    void setDescription(String description);

    /**
     *  Sets an optional description of this channel item. <a href="http://spec.commonmark.org/">CommonMark</>
     *  syntax can be used for rich text representation.
     *
     * @param description channel description
     * @return Parameter instance with set description property
     * */
    default Parameter description(String description) {
        setDescription(description);
        return this;
    }

    /**
     * Returns the definition of the parameter.
     *
     * @return channels schema
     * */
    Schema getSchema();

    /**
     * Sets the definition of the parameter.
     *
     * @param schema channels schema
     * */
    void setSchema(Schema schema);

    /**
     * Sets the definition of the parameter.
     *
     * @param schema channels schema
     * @return Parameter instance with set schema property
     * */
    default Parameter schema(Schema schema) {
        setSchema(schema);
        return this;
    }

    /**
     * Returns a <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#runtimeExpression">runtime expression</a>
     * that specifies the location of the parameter value. Even when a definition for the target field exists, it MUST NOT be used to validate
     * this parameter but, instead, the schema property MUST be used.
     *
     * @return location property
     * */
    String getLocation();

    /**
     * Sets a <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#runtimeExpression">runtime expression</a>
     * that specifies the location of the parameter value. Even when a definition for the target field exists, it MUST NOT be used to validate
     * this parameter but, instead, the schema property MUST be used.
     *
     * @param location location property
     * */
    void setLocation(String location);

    /**
     * Sets a <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#runtimeExpression">runtime expression</a>
     * that specifies the location of the parameter value. Even when a definition for the target field exists, it MUST NOT be used to validate
     * this parameter but, instead, the schema property MUST be used.
     *
     * @param location location property
     * @return Parameter instance with set location property
     * */
    default Parameter location(String location) {
        setLocation(location);
        return this;
    }
}
