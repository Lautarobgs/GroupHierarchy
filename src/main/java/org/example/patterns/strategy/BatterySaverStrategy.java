package org.example.patterns.strategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BatterySaverStrategy implements BatteryManagementStrategy {
    private static final Logger log = LogManager.getLogger(BatterySaverStrategy.class);

    @Override
    public void manageBattery(int batteryLevel) {
        if (batteryLevel < 20) {
            log.warn("Battery is low. Activating battery saver mode.");
        } else {
            log.info("Battery level is sufficient.");
        }
    }
}