package com.itacademy.task1.api.dao;

import com.itacademy.task1.entities.Aircraft;

import java.util.List;

public interface IFleetDao {
    void addAircraft(Aircraft aircraft);

    void removeAircraft(Aircraft aircraft);

    List<Aircraft> getFleet();
}
