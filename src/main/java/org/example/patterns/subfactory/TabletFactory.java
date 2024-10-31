package org.example.patterns.subfactory;

import org.example.model.Device;
import org.example.model.Tablet;
import org.example.patterns.AbsDeviceFactory;

public class TabletFactory extends AbsDeviceFactory{
    @Override
    public Device createDevice(Integer id, String brand, String model, Double price, Object... extraParams) {
        return new Tablet(id, brand, model, price, Device.DeviceType.Tablet,
                (int) extraParams[0], (boolean) extraParams[1]);
    }
}
