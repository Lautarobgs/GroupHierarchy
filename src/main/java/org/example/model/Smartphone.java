package org.example.model;

public class Smartphone extends Device {
    private int batteryCapacity;

    public Smartphone(Integer id, String brand, String model, Double price, DeviceType type, int batteryCapacity) {
        super(id, brand, model, price, type);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
