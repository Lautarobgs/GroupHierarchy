package org.example.patterns;

import org.example.model.Device;
import org.example.patterns.subfactory.LaptopFactory;
import org.example.patterns.subfactory.SmartphoneFactory;
import org.example.patterns.subfactory.SmartwatchFactory;
import org.example.patterns.subfactory.TabletFactory;

public abstract class AbsDeviceFactory {
    public abstract Device createDevice(Integer id, String brand, String model, Double price, Object... extraParams);

    public static AbsDeviceFactory getFactory(Device.DeviceType type) {
        switch (type) {
            case Smartphone:
                return new SmartphoneFactory();
            case Laptop:
                return new LaptopFactory();
            case Smartwatch:
                return new SmartwatchFactory();
            case Tablet:
                return new TabletFactory();
            default:
                throw new IllegalArgumentException("Device type not recognized.");
        }
    }
}
