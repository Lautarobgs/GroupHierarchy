package org.example.patterns.subfactory;

import org.example.model.Device;
import org.example.model.Smartwatch;
import org.example.patterns.AbsDeviceFactory;

public class SmartwatchFactory extends AbsDeviceFactory {
    @Override
    public Device createDevice(Integer id, String brand, String model, Double price, Object... extraParams) {
        return new Smartwatch(id, brand, model, price, Device.DeviceType.Smartwatch,
                (int) extraParams[0], (int) extraParams[1], (boolean) extraParams[2]);
    }
}