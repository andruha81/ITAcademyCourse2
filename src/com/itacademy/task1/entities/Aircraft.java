package com.itacademy.task1.entities;

public abstract class Aircraft {

    private final String manufacturer;
    private final String model;
    private final int seatsNumber;
    private final int payload;
    private final int range;
    private final double fuelBurn;
    private boolean isEnginesWorking;
    private boolean isInFlight;

    protected Aircraft(String manufacturer, String model, int seatsNumber, int payload, int range, double fuelBurn) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.seatsNumber = seatsNumber;
        this.payload = payload;
        this.range = range;
        this.fuelBurn = fuelBurn;
    }

    @Override
    public String toString() {
        return String.format("Aircraft %s %s, range %s", this.manufacturer, this.model, this.range);
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public int getPayload() {
        return payload;
    }

    public int getRange() {
        return range;
    }

    public double getFuelBurn() {
        return fuelBurn;
    }

    public boolean isEnginesWorking() {
        return isEnginesWorking;
    }

    public boolean isInFlight() {
        return isInFlight;
    }

    public boolean takeoff() {
        setEnginesWorking(true);
        isInFlight = true;
        return true;
    }

    public boolean land() {
        setEnginesWorking(false);
        isInFlight = false;
        return true;
    }

    public abstract boolean filling();

    private void setEnginesWorking(boolean enginesWorking) {
        isEnginesWorking = enginesWorking;
    }
}
