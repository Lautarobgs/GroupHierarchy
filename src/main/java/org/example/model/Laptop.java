package org.example.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Laptop extends Device{
    private static final Logger log = LogManager.getLogger(Laptop.class);
    private int laptopId;
    private int storage;

    public Laptop() {
    }

    public Laptop(int laptopId, int storage) {
        this.laptopId = laptopId;
        this.storage = storage;
    }

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
