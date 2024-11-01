package org.example.service;

import org.example.dao.GenericDao;
import org.example.model.Device;
import java.sql.SQLException;
import org.example.dao.DeviceDAO;
import java.util.List;

public class DeviceService implements IGenericService<Device,Integer>
{
    private final GenericDao<Device,Integer> deviceDAO = new DeviceDAO();

    @Override
    public void add(Device device) throws SQLException {
        deviceDAO.insert(device);
    }

    @Override
    public Device getById(Integer id) throws SQLException {
        return deviceDAO.findById(id);
    }

    @Override
    public List<Device> getAll() throws SQLException {
        return deviceDAO.findAll();
    }

    @Override
    public void update(Device device) throws SQLException {
        deviceDAO.update(device);
    }

    @Override
    public void delete(Integer id) throws SQLException {
        deviceDAO.delete(id);
    }
}
