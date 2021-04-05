package com.itacademy.task1.api.services;

import com.itacademy.task1.entities.Aircraft;

import java.util.List;

public interface IAirline {
    void buyPlane();

    void sellPlane();

    void makeFlight();

    int countSeats();

    int countPayload();

    void printSortedRangeFleet();

    void printFleet();

    List<Aircraft> getAircraftByFuelBurn(double minFuelBurn, double maxFuelBurn);
}
