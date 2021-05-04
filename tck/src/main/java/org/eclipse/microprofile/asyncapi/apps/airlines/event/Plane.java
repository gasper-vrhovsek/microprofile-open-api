package org.eclipse.microprofile.asyncapi.apps.airlines.event;

import org.eclipse.microprofile.asyncapi.annotations.media.Schema;

public class Plane {

    @Schema(required = true)
    private String model;

    @Schema(required = true)
    private int passengerCapacity;

    public Plane(String model, int passengerCapacity) {
        this.model = model;
        this.passengerCapacity = passengerCapacity;
    }
}
