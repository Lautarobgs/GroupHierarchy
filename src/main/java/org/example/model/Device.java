package org.example.model;

public abstract class Device {
    public Device() {
    }

    private Integer id;
    private String brand;
    private String model;
    private Double price;
    private DeviceType type;

    public Device(Integer id, String brand, String model, Double price, DeviceType type) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public DeviceType getType() {
        return type;
    }

    public void setType(DeviceType type) {
        this.type = type;
    }

    public enum DeviceType {
        SMARTPHONE,
        LAPTOP,
        SMARTWATCH,
        TABLET
    }
}
