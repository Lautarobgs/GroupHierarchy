package org.example.patterns.mvc;

import org.example.model.Smartphone;

public class SmartphoneView {
    public void printSmartphoneDetails(Smartphone smartphone) {
        System.out.println("Smartphone Details:");
        System.out.println("ID: " + smartphone.getSmartphoneId());
        System.out.println("Battery Capacity: " + smartphone.getBatteryCapacity() + " mAh");
        System.out.println("Brand: " + smartphone.getBrand());
        System.out.println("Model: " + smartphone.getModel());
        System.out.println("Price: $" + smartphone.getPrice());
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}

