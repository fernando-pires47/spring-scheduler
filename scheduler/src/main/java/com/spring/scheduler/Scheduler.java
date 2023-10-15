package com.spring.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Component
public class Scheduler {

    private static final String TIME_ZONE = "America/Sao_Paulo";

    @Scheduled(fixedRate = 2000)
    public void fixedRate() {
        System.out.println("Fixed Rate | " + this.getCurrentDateFormatted());
    }

    @Scheduled(fixedDelay = 1000)
    public void fixedDelay() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fixed Delay | " + this.getCurrentDateFormatted());
    }

    @Scheduled(cron = "0 * * * * *", zone = TIME_ZONE)
    public void cronJobEachMinute() {
        System.out.println("Cron Job Minute| " + this.getCurrentDateFormatted());
    }

    @Scheduled(cron = "0 0 * * * *", zone = TIME_ZONE)
    public void cronJobAllHour() {
        System.out.println("Cron Job all hour | " + this.getCurrentDateFormatted());
    }

    @Scheduled(cron = "0 0 0 * * *", zone = TIME_ZONE)
    public void cronJobMidnightAllDay() {
        System.out.println("Cron Job 0:00 all day | " + this.getCurrentDateFormatted());
    }

    @Scheduled(cron = "0 0 0 1 * *", zone = TIME_ZONE)
    public void cronJobDay1AllMonth() {
        System.out.println("Cron Job day 1 at 0:00 all month | " + this.getCurrentDateFormatted());
    }

    @Scheduled(cron = "0 0 0 * 1 *", zone = TIME_ZONE)
    public void cronJobAllDaysJanuary() {
        System.out.println("Cron Job all days in january at 0:00 | " + this.getCurrentDateFormatted());
    }

    @Scheduled(cron = "0 0 0 * 1 0", zone = TIME_ZONE)
    public void cronJobSundayJanuary() {
        System.out.println("Cron Job all sunday in january at 0:00 | " + this.getCurrentDateFormatted());
    }

    private String getCurrentDateFormatted(){
        return LocalTime.now().format(DateTimeFormatter.ofPattern("hh mm ss"));
    }
}
