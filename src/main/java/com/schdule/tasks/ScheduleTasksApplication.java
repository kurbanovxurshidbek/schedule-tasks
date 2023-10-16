package com.schdule.tasks;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.TimeZone;
@Slf4j
@SpringBootApplication
public class ScheduleTasksApplication {

    @PostConstruct
    public void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));   // It will set UTC timezone
        log.warn("Application running in UTC timezone :" + LocalDateTime.now());
    }

    public static void main(String[] args) {
        SpringApplication.run(ScheduleTasksApplication.class, args);
    }

}
