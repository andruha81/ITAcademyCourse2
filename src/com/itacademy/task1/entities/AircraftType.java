package com.itacademy.task1.entities;

public enum AircraftType {
    CARGO("Cargo"),
    PASSENGER("Passenger");

    private final String type;

    AircraftType(String name) {
        this.type = name;
    }

    public String getType() {
        return this.type;
    }
}
