package org.example.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import org.example.patterns.listener.SmartwatchListener;
import java.util.List;

public class Smartwatch extends Device
{
    private static final Logger log = LogManager.getLogger(Smartwatch.class);

    //Attributes
    private int smartwatchId;
    private int batteryLifeHours;
    private boolean isWaterResistant;
    private final List<SmartwatchListener> listeners = new ArrayList<>();

    // Constructor
    public Smartwatch(int smartwatchId, int batteryLifeHours, boolean isWaterResistant) {
        this.smartwatchId = smartwatchId;
        this.batteryLifeHours = batteryLifeHours;
        this.isWaterResistant = isWaterResistant;
    }

    public Smartwatch(Integer id, String brand, String model, Double price, DeviceType type, int smartwatchId, int batteryLifeHours, boolean isWaterResistant) {
        super(id, brand, model, price, type);
        this.smartwatchId = smartwatchId;
        this.batteryLifeHours = batteryLifeHours;
        this.isWaterResistant = isWaterResistant;
    }

    // Metodos para agregar y eliminar listeners
    public void addSmartwatchListener(SmartwatchListener listener) {
        listeners.add(listener);
    }

    public void removeSmartwatchListener(SmartwatchListener listener) {
        listeners.remove(listener);
    }

    // Metodo para notificar listeners de actualizacion de bateria
    private void notifyBatteryLevelUpdated(int newBatteryLevel) {
        for (SmartwatchListener listener : listeners) {
            listener.onBatteryLevelUpdated(newBatteryLevel);
        }
    }

    // Metodo para notificar listeners de cambio en resistencia al agua
    private void notifyWaterResistanceChanged(boolean isWaterResistant) {
        for (SmartwatchListener listener : listeners) {
            listener.onWaterResistanceChanged(isWaterResistant);
        }
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
        notifyBatteryLevelUpdated(batteryLifeHours); // Notifica cambio de bateria
    }

    public boolean isWaterResistant() {
        return isWaterResistant;
    }

    public void setWaterResistant(boolean waterResistant) {
        isWaterResistant = waterResistant;
        notifyWaterResistanceChanged(waterResistant); // Notifica cambio de resistencia al agua
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

