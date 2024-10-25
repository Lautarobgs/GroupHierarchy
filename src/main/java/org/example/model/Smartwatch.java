package org.example.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Smartwatch extends Device
{
    private static final Logger log = LogManager.getLogger(Smartwatch.class);

    //Attributes
    private int smartwatchId;
    private int batteryLifeHours;
    private boolean isWaterResistant;

    // Constructor
    public Smartwatch(int smartwatchId, int batteryLifeHours, boolean isWaterResistant) {
        this.smartwatchId = smartwatchId;
        this.batteryLifeHours = batteryLifeHours;
        this.isWaterResistant = isWaterResistant;
    }

    // Getters and setters
    public int getSmartwatchId() {
        return smartwatchId;
    }

    public void setSmartwatchId(int smartwatchId) {
        this.smartwatchId = smartwatchId;
    }

    public int getBatteryLifeHours() {
        return batteryLifeHours;
    }

    public void setBatteryLifeHours(int batteryLifeHours) {
        this.batteryLifeHours = batteryLifeHours;
    }

    public boolean isWaterResistant() {
        return isWaterResistant;
    }

    public void setWaterResistant(boolean waterResistant) {
        isWaterResistant = waterResistant;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + "Smartwatch{" +
                "smartwatchId=" + smartwatchId +
                ", batteryLifeHours=" + batteryLifeHours +
                ", isWaterResistant=" + isWaterResistant +
                '}';
    }
}

