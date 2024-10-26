package org.example.interfaces;

import org.example.model.Device;

import java.sql.SQLException;
import java.util.List;

public interface DeviceDAO {
    void insert(Device device) throws SQLException;
    void update(Device device) throws SQLException;
    void deleteById(Integer id) throws SQLException;
    Device findById(Integer id) throws SQLException;
    List<Device> findAll() throws SQLException;
}
