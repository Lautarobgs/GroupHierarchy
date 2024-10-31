package org.example.patterns.subfactory;

import org.example.model.Device;
import org.example.model.Laptop;
import org.example.patterns.AbsDeviceFactory;

public class LaptopFactory extends AbsDeviceFactory {
    @Override
    public Device createDevice(Integer id, String brand, String model, Double price, Object... extraParams) {
        return new Laptop(id, brand, model, price, Device.DeviceType.Laptop,
                (int) extraParams[0], (int) extraParams[1]);
    }
}
