package com.itacademy.task1.services;

import com.itacademy.task1.api.services.IAirline;
import com.itacademy.task1.dao.FleetDao;
import com.itacademy.task1.entities.Aircraft;
import com.itacademy.task1.entities.PassengerAircraft;
import com.itacademy.task1.util.CreateAircraft;
import org.apache.commons.lang3.RandomUtils;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Airline implements IAirline {

    private final String name;
    private final FleetDao fleet;

    public Airline(String name) {
        this.name = name;
        fleet = new FleetDao();
    }

    @Override
    public String toString() {
        return String.format("Airline %s", this.name);
    }

    @Override
    public void buyPlane() {
        fleet.addAircraft(CreateAircraft.create(RandomUtils.nextInt(0, 3)));
    }

    @Override
    public void sellPlane() {
        fleet.removeAircraft(fleet.getFleet().get(RandomUtils.nextInt(0, fleet.getFleet().size())));
    }

    @Override
    public void makeFlight() {
        Aircraft aircraftToFly = fleet.getFleet().get(RandomUtils.nextInt(0, fleet.getFleet().size()));
        if (aircraftToFly.filling()) {
            aircraftToFly.takeoff();
            aircraftToFly.land();
        }
    }

    @Override
    public int countSeats() {
        return fleet.getFleet().stream()
                .filter(PassengerAircraft.class::isInstance)
                .mapToInt(Aircraft::getSeatsNumber)
                .sum();
    }

    @Override
    public int countPayload() {
        return fleet.getFleet().stream()
                .mapToInt(Aircraft::getPayload)
                .sum();
    }

    @Override
    public void printSortedRangeFleet() {
        fleet.getFleet().stream()
                .sorted(Comparator.comparingInt(Aircraft::getRange))
                .forEach(System.out::println);
    }

    @Override
    public void printFleet() {
        fleet.getFleet().forEach(System.out::println);
    }

    @Override
    public List<Aircraft> getAircraftByFuelBurn(double minFuelBurn, double maxFuelBurn) {
        return fleet.getFleet().stream()
                .filter(x -> x.getFuelBurn() >= minFuelBurn && x.getFuelBurn() <= maxFuelBurn)
                .collect(Collectors.toList());
    }
}
