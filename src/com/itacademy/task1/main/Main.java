package com.itacademy.task1.main;

import com.itacademy.task1.services.Airline;

public class Main {

    private static final int MAX_FLEET_NUMBER = 10;

    public static void main(String[] args) {

        Airline airline = new Airline("GrodnoAvia");

        for (int i = 0; i < MAX_FLEET_NUMBER; i++) {
            airline.buyPlane();
        }
        airline.makeFlight();

        System.out.printf("%s seats number is: %s%n", airline, airline.countSeats());
        System.out.printf("%s payload is: %s%n", airline, airline.countPayload());
        System.out.printf("%s fleet: %n", airline);
        airline.printFleet();
        System.out.printf("%s fleet sorted by range: %n", airline);
        airline.printSortedRangeFleet();
        System.out.printf("%s aircrafts with fuel burn from 2 to 2.5: %n", airline);
        airline.getAircraftByFuelBurn(2, 2.5).forEach(System.out::println);
    }
}
