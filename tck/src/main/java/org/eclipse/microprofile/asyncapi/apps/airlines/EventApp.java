package org.eclipse.microprofile.asyncapi.apps.airlines;

import org.eclipse.microprofile.asyncapi.annotations.AsyncAPIDefinition;
import org.eclipse.microprofile.asyncapi.annotations.Operation;
import org.eclipse.microprofile.asyncapi.annotations.channels.ChannelItem;
import org.eclipse.microprofile.asyncapi.annotations.components.Components;
import org.eclipse.microprofile.asyncapi.annotations.components.CorrelationId;
import org.eclipse.microprofile.asyncapi.annotations.components.Message;
import org.eclipse.microprofile.asyncapi.annotations.identifier.Identifier;
import org.eclipse.microprofile.asyncapi.annotations.info.Info;
import org.eclipse.microprofile.asyncapi.annotations.media.Schema;
import org.eclipse.microprofile.asyncapi.annotations.servers.Server;
import org.eclipse.microprofile.asyncapi.apps.airlines.consumer.PlaneCheckOutConsumer;
import org.eclipse.microprofile.asyncapi.apps.airlines.event.Plane;
import org.eclipse.microprofile.asyncapi.apps.airlines.producer.PlaneCheckInProducer;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.License;
import org.eclipse.microprofile.openapi.annotations.media.SchemaProperty;
import org.eclipse.microprofile.openapi.annotations.security.SecurityRequirement;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import java.util.HashSet;
import java.util.Set;

@AsyncAPIDefinition(
        id = @Identifier(id = "AirlinesEventDrivenApp"),
        info = @Info(
                title = "AirlinesApp",
                version = "0.1",
                description = "Airline application",
                termsOfService = "https://airlinesapp.com/terms",
                contact = @Contact(
                        name = "AirlinesApp Support",
                        email = "techsupport@airlinesapp.com",
                        url = "https://airlinesapp.com"),
                license = @License(
                        name = "Apache 2.0",
                        url = "http://www.apache.org/licenses/LICENSE-2.0.html")
        ),
        servers = {
                @Server(name = "Production AMQP",
                        url = "https://prod.amqp.airlines.com/",
                        description = "Airlines production AMQP server",
                        protocol = "amqp",
                        protocolVersion = "0.9.1",
                        security = @SecurityRequirement(name = "api_key", scopes = {})
                ),
                @Server(name = "Production MQTT",
                        url = "https://prod.mqtt.airlines.com",
                        description = "Airlines production MQTT server",
                        protocol = "mqtt",
                        protocolVersion = "5.0",
                        security = @SecurityRequirement(name = "api_key", scopes = {})
                )
        },
        channels = {
                @ChannelItem(
                        name = "plane/checkin",
                        publish = @Operation(
                                summary = "Inform when a plane has checked in",
                                operationId = "123",
                                message = @Message(ref = "#/components/messages/CheckInPlane")
                        )

                ),
                @ChannelItem(
                        name = "plane/checkout",
                        subscribe = @Operation(
                                summary = "Receives a message when planeis checked out",
                                operationId = "321",
                                message = @Message(ref = "#/components/messages/CheckOutPlane"))
                )
        },
        components = @Components(
                schemas = {
                        @Schema(name = "Plane", type = SchemaType.OBJECT, implementation = Plane.class),
                        @Schema(
                                name = "PlaneInline",
                                type = SchemaType.OBJECT,
                                properties = {
                                        @SchemaProperty(
                                                name = "id",
                                                type = SchemaType.INTEGER,
                                                format = "int64"
                                        ),
                                        @SchemaProperty(
                                                name = "model",
                                                type = SchemaType.STRING
                                        )
                                }
                        )
                },
                messages = {
                        @Message(
                                name = "CheckInPlane",
                                description = "Check in a plane",
                                title = "CheckInPlane",
                                contentType = "application/json",
                                tags = {
                                        @Tag(name = "plane"),
                                        @Tag(name = "check in"),
                                        @Tag(name = "airline")
                                },
                                headers = @Schema(
                                        type = SchemaType.OBJECT,
                                        properties = {
                                                @SchemaProperty(
                                                        name = "correlationId",
                                                        type = SchemaType.STRING,
                                                        description = "Correlation ID set by application"),
                                                @SchemaProperty(
                                                        name = "applicationInstanceId",
                                                        type = SchemaType.STRING,
                                                        description = "Unique ID for a given application instance")
                                        }
                                ),
                                payload = @Schema(
                                        type = SchemaType.OBJECT,
                                        properties = {
                                                @SchemaProperty(
                                                        name = "plane",
                                                        ref = "#/components/schemas/plane"
                                                )
                                        }
                                ),
                                correlationId = @CorrelationId(
                                        description = "Default correlation ID",
                                        location = "$message.header#/correlationId"
                                ),
                                // TODO finish traits
                                traits = {

                                }
                        ),
                        @Message(
                                name = "CheckOutPlane",
                                description = "Check out a plane",
                                title = "CheckOutPlane",
                                contentType = "application/json",
                                tags = {
                                        @Tag(name = "plane"),
                                        @Tag(name = "check out"),
                                        @Tag(name = "airline")
                                },
                                headers = @Schema(
                                        type = SchemaType.OBJECT,
                                        properties = {
                                                @SchemaProperty(
                                                        name = "correlationId",
                                                        type = SchemaType.STRING,
                                                        description = "Correlation ID set by application"),
                                                @SchemaProperty(
                                                        name = "applicationInstanceId",
                                                        type = SchemaType.STRING,
                                                        description = "Unique ID for a given application instance")
                                        }
                                ),
                                payload = @Schema(
                                        type = SchemaType.OBJECT,
                                        properties = {
                                                @SchemaProperty(
                                                        name = "plane",
                                                        ref = "#/components/schemas/plane"
                                                )
                                        }
                                )
                        )
                }
        )
)
public class EventApp {
    // Just a sample application, alot to do here
    Set<Object> getProducers() {
        Set<Object> producers = new HashSet<>();
        producers.add(new PlaneCheckInProducer());

        return producers;
    }

    Set<Object> getConsumers() {
        Set<Object> consumers = new HashSet<>();
        consumers.add(new PlaneCheckOutConsumer());

        return consumers;
    }
}
