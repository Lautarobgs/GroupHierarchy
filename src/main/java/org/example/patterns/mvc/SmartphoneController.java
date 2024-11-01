package org.example.patterns.mvc;

import org.example.model.Smartphone;

public class SmartphoneController {
    private Smartphone smartphone;
    private final SmartphoneView view;

    public SmartphoneController(Smartphone smartphone, SmartphoneView view) {
        this.smartphone = smartphone;
        this.view = view;
    }

    public void updateBatteryCapacity(int newBatteryCapacity) {
        smartphone.setBatteryCapacity(newBatteryCapacity);
        view.displayMessage("Battery capacity updated to: " + newBatteryCapacity + " mAh");
    }

    public void updatePrice(double newPrice) {
        smartphone.setPrice(newPrice);
        view.displayMessage("Price updated to: $" + newPrice);
    }

    public void displaySmartphoneDetails() {
        view.printSmartphoneDetails(smartphone);
    }

    public void setSmartphone(Smartphone smartphone) {
        this.smartphone = smartphone;
    }

    public Smartphone getSmartphone() {
        return smartphone;
    }
}
