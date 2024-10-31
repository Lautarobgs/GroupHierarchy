package org.example.patterns.subfactory;

import org.example.model.Device;
import org.example.model.Smartphone;
import org.example.patterns.AbsDeviceFactory;

public class SmartphoneFactory extends AbsDeviceFactory{
    @Override
    public Device createDevice(Integer id, String brand, String model, Double price, Object... extraParams) {
        return new Smartphone(id, brand, model, price, Device.DeviceType.Smartphone,
                (int) extraParams[0], (int) extraParams[1]);
    }
}
