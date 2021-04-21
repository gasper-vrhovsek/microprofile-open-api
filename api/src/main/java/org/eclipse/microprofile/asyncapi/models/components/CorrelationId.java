package org.eclipse.microprofile.asyncapi.models.components;

import org.eclipse.microprofile.openapi.models.Constructible;
import org.eclipse.microprofile.openapi.models.Extensible;
import org.eclipse.microprofile.openapi.models.Reference;

/**
 * An object that specifies an identifier at design time that can used for message tracing and correlation.
 *
 * For specifying and computing the location of a Correlation ID, a runtime expression is used.
 * */
public interface CorrelationId extends Constructible, Extensible<CorrelationId>, Reference<CorrelationId> {

    /**
     * Returns an optional description of the identifier. <a href="http://spec.commonmark.org/">CommonMark syntax</a> can be
     * used for rich text representation.
     *
     * @return description property
     * */
    String getDescription();

    /**
     * Sets an optional description of the identifier. <a href="http://spec.commonmark.org/">CommonMark syntax</a> can be
     * used for rich text representation.
     *
     * @param description description property
     * */
    void setDescription(String description);

    /**
     * Sets an optional description of the identifier. <a href="http://spec.commonmark.org/">CommonMark syntax</a> can be
     * used for rich text representation.
     *
     * @param description description property
     * @return CorrelationId instance with the description property set
     * */
    default CorrelationId description(String description) {
        setDescription(description);
        return this;
    }

    /**
     * Returns a <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#runtimeExpression">runtime expression</a>
     * that specifies the location of the correlation ID. This field is REQUIRED.
     *
     * @return location property
     * */
    String getLocation();

    /**
     * Sets a <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#runtimeExpression">runtime expression</a>
     * that specifies the location of the correlation ID. This field is REQUIRED.
     *
     * @param location location property
     * */
    void setLocation(String location);

    /**
     * Sets a <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#runtimeExpression">runtime expression</a>
     * that specifies the location of the correlation ID. This field is REQUIRED.
     *
     * @param location location property
     * @return CorrelationId instance with the location property set
     * */
    default CorrelationId location(String location) {
        setLocation(location);
        return this;
    }
}
