package org.example.patterns;

import org.example.model.*;

public class DeviceFactory {

    public static Device createDevice(Device.DeviceType type, Integer id, String brand, String model, Double price, Object... extraParams) {
        switch (type) {
            case Smartphone:
                return new Smartphone(id, brand, model, price, type,
                        (int) extraParams[0], (int) extraParams[1]);
            case Laptop:
                return new Laptop(id, brand, model, price, type,
                        (int) extraParams[0], (int) extraParams[1]);
            case Smartwatch:
                return new Smartwatch(id, brand, model, price, type,
                        (int) extraParams[0], (int) extraParams[1], (boolean) extraParams[2]);
            case Tablet:
                return new Tablet(id, brand, model, price, type,
                        (int) extraParams[0], (boolean) extraParams[1]);
            default:
                throw new IllegalArgumentException("Device type not recognized.");
        }
    }
}
