package ru.Shamonin.Homework_1.Computers.Subtypes;

import org.springframework.stereotype.Component;

@Component
public class StationaryDevice implements Subtype {
    @Override
    public String getInformation()  {
        return "This is stationary device.";
    }
}
