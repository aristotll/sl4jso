package com.mvc;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NetSchedulerTest {

    private final String collectorJobGroup = "collectorJobGroup";
    private final String collectorTriggerGroup = "collectorTriggerGroup";

    public enum JobType {
        START, STOP
    }

    public static void main(String[] args) {
        System.out.println("enum = " + JobType.START);
        log.info("quartz schedule is starting...");
    }
}
