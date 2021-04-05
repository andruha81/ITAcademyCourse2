package com.itacademy.task1.entities;

import org.apache.commons.lang3.RandomUtils;

public class PassengerAircraft extends Aircraft {

    public PassengerAircraft(String manufacturer, String model, int seatsNumber, int payload, int range, double fuelBurn) {
        super(manufacturer, model, seatsNumber, payload, range, fuelBurn);
        type = AircraftType.PASSENGER;
    }

    @Override
    public String toString() {
        return String.format("%s Aircraft %s %s, seats number %s, payload %s, range %s, fuel burn %.1f"
                , getType(), this.manufacturer, this.model, this.seatsNumber, this.payload, this.range, this.fuelBurn);
    }

    @Override
    public boolean filling() {
        return takeSeats() != 0;
    }

    private int takeSeats() {
        return RandomUtils.nextInt(0, this.getSeatsNumber() + 1);
    }
}
