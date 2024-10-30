package org.example.model;

public class Smartphone extends Device{

    private int smartphoneId;
    private int batteryCapacity;

    public Smartphone(Integer id, String brand, String model, Double price, DeviceType type, int smartphoneId, int batteryCapacity) {
        super(id, brand, model, price, type);
        this.smartphoneId = smartphoneId;
        this.batteryCapacity = batteryCapacity;
    }

    public Smartphone(int smartphoneId, int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        this.smartphoneId = smartphoneId;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getSmartphoneId() {
        return smartphoneId;
    }

    public void setSmartphoneId(int smartphoneId) {
        this.smartphoneId = smartphoneId;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "smartphoneId=" + smartphoneId +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }
}
