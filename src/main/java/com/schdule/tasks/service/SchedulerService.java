package com.schdule.tasks.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

//https://javahowtos.com/guides/107-spring/321-difference-between-fixedrate-and-fixeddelay-parameter-in-scheduled-in-spring.html
//https://www.geeksforgeeks.org/writing-cron-expressions-for-scheduling-tasks/

@Slf4j
@Service
public class SchedulerService {
    int i = 0;

    @Scheduled(fixedDelay = 10000)
    public void scheduleFixedDelayTask() throws InterruptedException {
        ++i;
        log.info("Fixed delay task started - " + (i) + " " + LocalDateTime.now());
        Thread.sleep(5000);
        log.info("Fixed delay task finished - " + (i) + " " + LocalDateTime.now());
    }


    @Scheduled(fixedRate = 10000)
    public void scheduleFixedRateTask() throws InterruptedException {
        ++i;
        log.info("Fixed delay task started - " + (i) + " " + LocalDateTime.now());
        Thread.sleep(5000);
        log.info("Fixed delay task finished - " + (i) + " " + LocalDateTime.now());
    }


    // Once every five minutes
    @Scheduled(cron = "0 */5 * ? * *")
    public void scheduleCronTask1() {
        log.info("Cron task finished - " + (i) + " " + LocalDateTime.now());
    }

    // Every 09:00 a.m. from Monday to Friday
    @Scheduled(cron = "0 0 9 ? * MON-FRI")
    public void scheduleCronTask2() {
        log.info("Cron task finished - " + (i) + " " + LocalDateTime.now());
    }

}
