package ru.Shamonin.Homework_1.Computers.Devices;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.Shamonin.Homework_1.Computers.Subtypes.Subtype;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Slf4j
public class Server {

    @Qualifier("stationaryDevice")
    @Autowired
    private Subtype subtype;



    @PostConstruct
    public void postConstruct(){
        log.info("Server bean created.");
    }

    @PreDestroy
    public void preDestroy(){
        log.info("Server bean deleted.");
    }
}
