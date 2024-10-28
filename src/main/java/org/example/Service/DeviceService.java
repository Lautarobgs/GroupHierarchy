package org.example.service;

import org.example.model.Device;
import java.sql.SQLException;
import org.example.dao.DeviceDAO;
import java.util.List;

public class DeviceService
{
    private final DeviceDAO deviceDAO = new DeviceDAO();

    public void addDevice(Device device) throws SQLException {
        deviceDAO.insert(device);
    }

    public Device getDeviceById(int id) throws SQLException {
        return deviceDAO.findById(id);
    }

    public List<Device> getAllDevices() throws SQLException {
        return deviceDAO.findAll();
    }

    public void updateDevice(Device device) throws SQLException {
        deviceDAO.update(device);
    }

    public void deleteDevice(int id) throws SQLException {
        deviceDAO.delete(id);
    }
}
