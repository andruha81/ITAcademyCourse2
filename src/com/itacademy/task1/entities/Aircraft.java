package com.itacademy.task1.entities;

public abstract class Aircraft {

    protected final String manufacturer;
    protected AircraftType type;
    protected final String model;
    protected final int seatsNumber;
    protected final int payload;
    protected final int range;
    protected final double fuelBurn;
    protected boolean isEnginesWorking;
    protected boolean isInFlight;

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
        return String.format("Aircraft %s %s", this.manufacturer, this.model);
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

    public String getType() {
        return type.getType();
    }

    public boolean isEnginesWorking() {
        return isEnginesWorking;
    }

    public boolean isInFlight() {
        return isInFlight;
    }

    public void takeoff() {
        setEnginesWorking(true);
        isInFlight = true;
    }

    public void land() {
        setEnginesWorking(false);
        isInFlight = false;
    }

    public abstract boolean filling();

    private void setEnginesWorking(boolean enginesWorking) {
        isEnginesWorking = enginesWorking;
    }
}
