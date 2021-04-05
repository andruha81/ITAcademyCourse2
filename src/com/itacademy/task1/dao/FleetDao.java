package com.itacademy.task1.dao;

import com.itacademy.task1.api.dao.IFleetDao;
import com.itacademy.task1.entities.Aircraft;

import java.util.ArrayList;
import java.util.List;

public class FleetDao implements IFleetDao {

    private final List<Aircraft> fleet = new ArrayList<>();

    @Override
    public void addAircraft(Aircraft aircraft) {
        fleet.add(aircraft);
    }

    @Override
    public void removeAircraft(Aircraft aircraft) {
        fleet.remove(aircraft);
    }

    @Override
    public List<Aircraft> getFleet() {
        return fleet;
    }
}
