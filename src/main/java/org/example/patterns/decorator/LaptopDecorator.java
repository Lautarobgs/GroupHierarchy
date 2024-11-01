package org.example.patterns.decorator;

import org.example.model.Laptop;

public abstract class LaptopDecorator extends Laptop {
    protected Laptop decoratedLaptop;

    public LaptopDecorator(Laptop laptop) {
        super(laptop.getId(), laptop.getBrand(), laptop.getModel(), laptop.getPrice(), laptop.getType(), laptop.getLaptopId(), laptop.getStorage());
        this.decoratedLaptop = laptop;
    }

    @Override
    public String toString() {
        return decoratedLaptop.toString();
    }

    @Override
    public Double getPrice() {
        return decoratedLaptop.getPrice(); // Retorna el precio del laptop decorado
    }
}
