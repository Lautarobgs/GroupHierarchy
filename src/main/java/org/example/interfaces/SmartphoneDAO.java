package org.example.interfaces;

import org.example.model.Device;
import org.example.model.Smartphone;

import java.sql.SQLException;
import java.util.List;

public interface SmartphoneDAO extends DeviceDAO {

    void insert(Smartphone smartphone) throws SQLException;
    void update(Smartphone smartphone) throws SQLException;
    void deleteById(Integer id) throws SQLException;
    Device findById(Integer id) throws SQLException;
    List<Device> findAll() throws SQLException;
    List<Smartphone> findByBatteryCapacity(int batteryCapacity) throws SQLException;
}
