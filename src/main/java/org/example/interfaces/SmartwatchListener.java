package org.example.interfaces;

public interface SmartwatchListener
{
    void onBatteryLevelUpdated(int newBatteryLevel);
    void onWaterResistanceChanged(boolean isWaterResistant);
}
