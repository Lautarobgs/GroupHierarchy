package org.example.patterns;

import org.example.model.*;

public class DeviceBuilder {
    private Integer id;
    private String brand;
    private String model;
    private Double price;
    private Device.DeviceType type;
    private Integer specificId;
    private Integer batteryCapacity;
    private Integer storage;
    private Integer batteryLifeHours;
    private Boolean isWaterResistant;
    private Boolean hasCellular;

    public DeviceBuilder setId(Integer id) {
        this.id = id;
        return this;
    }

    public DeviceBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public DeviceBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public DeviceBuilder setPrice(Double price) {
        this.price = price;
        return this;
    }

    public DeviceBuilder setType(Device.DeviceType type) {
        this.type = type;
        return this;
    }

    public DeviceBuilder setSpecificId(Integer specificId) {
        this.specificId = specificId;
        return this;
    }

    public DeviceBuilder setBatteryCapacity(Integer batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        return this;
    }

    public DeviceBuilder setStorage(Integer storage) {
        this.storage = storage;
        return this;
    }

    public DeviceBuilder setBatteryLifeHours(Integer batteryLifeHours) {
        this.batteryLifeHours = batteryLifeHours;
        return this;
    }

    public DeviceBuilder setWaterResistant(Boolean isWaterResistant) {
        this.isWaterResistant = isWaterResistant;
        return this;
    }

    public DeviceBuilder setHasCellular(Boolean hasCellular) {
        this.hasCellular = hasCellular;
        return this;
    }

    public Device build() {
        switch (type) {
            case Smartphone:
                return new Smartphone(id, brand, model, price, type, specificId, batteryCapacity);
            case Laptop:
                return new Laptop(id, brand, model, price, type, specificId, storage);
            case Smartwatch:
                return new Smartwatch(id, brand, model, price, type, specificId, batteryLifeHours, isWaterResistant);
            case Tablet:
                return new Tablet(id, brand, model, price, type, specificId, hasCellular);
            default:
                throw new IllegalArgumentException("Invalid Device Type");
        }
    }
}