package org.example.interfaces.patterns;

import org.example.model.Device;

public interface IAbsDeviceFactory {
        Device createDevice(Integer id, String brand, String model, Double price, Object... extraParams);

}
