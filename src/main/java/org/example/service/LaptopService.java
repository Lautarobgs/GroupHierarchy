package org.example.service;

import org.example.dao.GenericDao;
import org.example.dao.LaptopDAO;
import org.example.model.Device;
import org.example.model.Laptop;

import java.sql.SQLException;
import java.util.List;

public class LaptopService implements IGenericService<Laptop, Integer> {
    private final GenericDao<Laptop,Integer> laptopDAO;

    public LaptopService() {
        this.laptopDAO = new LaptopDAO();
    }

    @Override
    public void add(Laptop laptop) throws SQLException {
        laptopDAO.insert(laptop);
    }

    @Override
    public List<Laptop> getAll() throws SQLException {
        return laptopDAO.findAll();
    }

    @Override
    public Laptop getById(Integer laptopId) throws SQLException {
        return laptopDAO.findById(laptopId);
    }

    @Override
    public void update(Laptop laptop) throws SQLException {
        laptopDAO.update(laptop);
    }

    @Override
    public void delete(Integer laptopId) throws SQLException {
        laptopDAO.delete(laptopId);
    }
}
