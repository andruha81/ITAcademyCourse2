package com.itacademy.task1.dao;

import com.itacademy.task1.api.dao.IFleetDao;
import com.itacademy.task1.entities.Aircraft;
import com.itacademy.task1.entities.PassengerAircraft;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FleetDao implements IFleetDao {

    private final List<Aircraft> fleet = new ArrayList<>();

    @Override
    public void addAircraft(Aircraft aircraft) {
        fleet.add(aircraft);
    }

    @Override
    public boolean removeAircraft(Aircraft aircraft) {
        return fleet.remove(aircraft);
    }

    @Override
    public List<Aircraft> getFleet() {
        return fleet;
    }

    @Override
    public int countSeats() {
        return fleet.stream()
                .filter(PassengerAircraft.class::isInstance)
                .mapToInt(Aircraft::getSeatsNumber)
                .sum();
    }

    @Override
    public int countPayload() {
        return fleet.stream()
                .mapToInt(Aircraft::getPayload)
                .sum();
    }

    @Override
    public void printSortedRangeFleet() {
        fleet.stream()
                .sorted(Comparator.comparingInt(Aircraft::getRange))
                .forEach(System.out::println);
    }

    @Override
    public void printFleet() {
        fleet.forEach(System.out::println);
    }

    @Override
    public List<Aircraft> getAircraftByFuelBurn(double minFuelBurn, double maxFuelBurn) {
        return fleet.stream()
                .filter(x -> x.getFuelBurn() >= minFuelBurn && x.getFuelBurn() <= maxFuelBurn)
                .collect(Collectors.toList());
    }
}
