package ru.Shamonin.Homework_1.Computers.Subtypes;

import org.springframework.stereotype.Component;

@Component
public class PortableDevice implements Subtype {

    @Override
    public String getInformation() {
        return "This is portable device.";
    }
}
