package com.itacademy.task1.entities;

import org.apache.commons.lang3.RandomUtils;

public class PassengerAircraft extends Aircraft {

    public PassengerAircraft(String manufacturer, String model, int seatsNumber, int payload, int range, double fuelBurn) {
        super(manufacturer, model, seatsNumber, payload, range, fuelBurn);
    }

    @Override
    public boolean filling() {
        return takeSeats() != 0;
    }

    private int takeSeats() {
        return RandomUtils.nextInt(0, this.getSeatsNumber() + 1);
    }
}
