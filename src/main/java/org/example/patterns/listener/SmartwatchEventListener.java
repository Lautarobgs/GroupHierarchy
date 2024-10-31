package org.example.patterns.listener;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class SmartwatchEventListener implements SmartwatchListener
{
    private static final Logger log = LogManager.getLogger(SmartwatchEventListener.class);

    @Override
    public void onBatteryLevelUpdated(int newBatteryLevel) {
        log.info("Battery life changed to: " + newBatteryLevel + " hours.");
    }

    @Override
    public void onWaterResistanceChanged(boolean isWaterResistant) {
        log.info("Water resistance changed: " + isWaterResistant);
    }
}
