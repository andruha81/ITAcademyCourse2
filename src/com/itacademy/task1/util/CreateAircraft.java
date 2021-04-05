package com.itacademy.task1.util;

import com.itacademy.task1.entities.Aircraft;
import com.itacademy.task1.entities.CargoAircraft;
import com.itacademy.task1.entities.PassengerAircraft;
import org.apache.commons.lang3.RandomUtils;

public class CreateAircraft {
    private CreateAircraft() {
    }

    public static Aircraft create(int type) {
        Aircraft newAircraft;
        String manufacturer;
        String model;
        int seatsNumber;
        int payload;
        int range;
        double fuelBurn;

        switch (type) {
            case 0:
                manufacturer = "Boeing";
                model = "737 MAX";
                seatsNumber = RandomUtils.nextInt(178, 201);
                payload = RandomUtils.nextInt(20_000, 22_001);
                range = RandomUtils.nextInt(6_000, 7_001);
                fuelBurn = RandomUtils.nextDouble(2.2, 2.4);
                newAircraft = new PassengerAircraft(manufacturer, model, seatsNumber, payload, range, fuelBurn);
                break;
            case 1:
                manufacturer = "Airbus";
                model = "320 NEO";
                seatsNumber = RandomUtils.nextInt(160, 191);
                payload = RandomUtils.nextInt(21_000, 23_001);
                range = RandomUtils.nextInt(6_000, 6_500);
                fuelBurn = RandomUtils.nextDouble(2.1, 2.3);
                newAircraft = new PassengerAircraft(manufacturer, model, seatsNumber, payload, range, fuelBurn);
                break;
            case 2:
                manufacturer = "Antonov";
                model = "An-124";
                payload = RandomUtils.nextInt(300_000, 400_001);
                range = RandomUtils.nextInt(8_000, 10_000);
                fuelBurn = RandomUtils.nextDouble(4.1, 4.7);
                newAircraft = new CargoAircraft(manufacturer, model, payload, range, fuelBurn);
                break;
            default:
                manufacturer = "Airbus";
                model = "330 NEO";
                seatsNumber = RandomUtils.nextInt(260, 291);
                payload = RandomUtils.nextInt(21_000, 23_001);
                range = RandomUtils.nextInt(16_000, 18_500);
                fuelBurn = RandomUtils.nextDouble(2.9, 3.3);
                newAircraft = new PassengerAircraft(manufacturer, model, seatsNumber, payload, range, fuelBurn);
                break;
        }

        return newAircraft;
    }
}
