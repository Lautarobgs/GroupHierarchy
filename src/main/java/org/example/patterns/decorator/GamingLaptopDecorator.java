package org.example.patterns.decorator;

import org.example.model.Laptop;

public class GamingLaptopDecorator extends LaptopDecorator {
    private final String gamingFeature = "Gaming Features";
    private final double gamingPriceIncrease = 300.00;

    public GamingLaptopDecorator(Laptop laptop) {
        super(laptop);
    }

    @Override
    public String toString() {
        return super.toString() + " + " + gamingFeature + " (Extra cost: " + gamingPriceIncrease + ")";
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + gamingPriceIncrease; // Aumenta el precio por características gamer
    }
}