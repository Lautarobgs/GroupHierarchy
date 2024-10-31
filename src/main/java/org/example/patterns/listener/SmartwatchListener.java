package org.example.patterns.listener;

public interface SmartwatchListener
{
    void onBatteryLevelUpdated(int newBatteryLevel);
    void onWaterResistanceChanged(boolean isWaterResistant);
}
