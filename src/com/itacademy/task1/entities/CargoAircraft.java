package com.itacademy.task1.entities;

import org.apache.commons.lang3.RandomUtils;

public class CargoAircraft extends Aircraft{

    protected CargoAircraft(String manufacturer, String model, int payload, int range, double fuelBurn) {
        super(manufacturer, model, 0, payload, range, fuelBurn);
    }

    @Override
    public boolean filling() {
        return loadGoods() != 0;
    }

    private int loadGoods() {
        return RandomUtils.nextInt(0, this.getPayload() + 1);
    }
}
