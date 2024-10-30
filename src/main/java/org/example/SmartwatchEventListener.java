package org.example;

import org.example.interfaces.SmartwatchListener;

public class SmartwatchEventListener implements SmartwatchListener
{
    @Override
    public void onBatteryLevelUpdated(int newBatteryLevel) {
        System.out.println("Battery level updated to: " + newBatteryLevel + " hours.");
    }

    @Override
    public void onWaterResistanceChanged(boolean isWaterResistant) {
        System.out.println("Water resistance changed: " + (isWaterResistant ? "Enabled" : "Disabled"));
    }
}
