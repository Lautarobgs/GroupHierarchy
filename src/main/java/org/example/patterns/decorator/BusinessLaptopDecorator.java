package org.example.patterns.decorator;

import org.example.model.Laptop;

public class BusinessLaptopDecorator extends LaptopDecorator {
    private final String businessFeature = "Business Features";
    private final double businessPriceIncrease = 200.00;

    public BusinessLaptopDecorator(Laptop laptop) {
        super(laptop);
    }

    @Override
    public String toString() {
        return super.toString() + " + " + businessFeature + " (Extra cost: " + businessPriceIncrease + ")";
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + businessPriceIncrease; // Aumenta el precio por características business
    }
}