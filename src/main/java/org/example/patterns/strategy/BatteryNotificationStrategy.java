package org.example.patterns.strategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BatteryNotificationStrategy implements BatteryManagementStrategy {
    private static final Logger log = LogManager.getLogger(BatteryNotificationStrategy.class);

    @Override
    public void manageBattery(int batteryLevel) {
        log.info("Battery level is now at " + batteryLevel + "%.");
    }
}
