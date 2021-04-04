package com.itacademy.task1.api.dao;

import com.itacademy.task1.entities.Aircraft;

import java.util.List;

public interface IFleetDao {
    void addAircraft(Aircraft aircraft);
    boolean removeAircraft(Aircraft aircraft);
    List<Aircraft> getFleet();
    int countSeats();
    int countPayload();
    void printSortedRangeFleet();
    void printFleet();
    List<Aircraft> getAircraftByFuelBurn(double minFuelBurn, double maxFuelBurn);
}
