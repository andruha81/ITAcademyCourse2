package com.itacademy.task1.entities;

import org.apache.commons.lang3.RandomUtils;

public class CargoAircraft extends Aircraft {

    public CargoAircraft(String manufacturer, String model, int payload, int range, double fuelBurn) {
        super(manufacturer, model, 0, payload, range, fuelBurn);
        type = AircraftType.CARGO;
    }

    @Override
    public String toString() {
        return String.format("%s Aircraft %s %s, payload %s, range %s, fuel burn %.1f"
                , getType(), this.manufacturer, this.model, this.payload, this.range, this.fuelBurn);
    }

    @Override
    public boolean filling() {
        return loadGoods() != 0;
    }

    private int loadGoods() {
        return RandomUtils.nextInt(0, this.getPayload() + 1);
    }
}
