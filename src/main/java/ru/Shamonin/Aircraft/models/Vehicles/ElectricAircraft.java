package ru.Shamonin.Aircraft.models.Vehicles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.Shamonin.Aircraft.models.Engines.ElectricEngine;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ElectricAircraft {
    private ElectricEngine engine;
    private int price;
}
