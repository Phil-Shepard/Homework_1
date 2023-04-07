package ru.Shamonin.Aircraft.dao;

import org.springframework.stereotype.Service;
import ru.Shamonin.Aircraft.exceptions.DaoException;
import ru.Shamonin.Aircraft.models.Engines.ElectricEngine;
import ru.Shamonin.Aircraft.models.Vehicles.ElectricAircraft;

import java.util.ArrayList;
import java.util.List;

@Service
public class ElectricAircraftDAO {
    private List<ElectricAircraft> electricAircrafts = new ArrayList<>();
    private int id = 0;

    public List<ElectricAircraft> getAircrafts() {
        return electricAircrafts;
    }

    public ElectricAircraft getAircraftByEngineId(int id) {
        return electricAircrafts.stream().
                filter(electricAircraft -> electricAircraft.getEngine().getId() == id).
                findAny().
                orElseThrow(() -> new DaoException("Самолёт с таким id не найден."));
    }

    public synchronized ElectricAircraft addAircraft(ElectricAircraft electricAircraft) {
        ElectricEngine electricEngine = electricAircraft.getEngine();
        electricEngine.setId(++id);
        electricAircrafts.add(electricAircraft);
        return electricAircraft;
    }
}
