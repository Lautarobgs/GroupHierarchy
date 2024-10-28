package org.example.service;

import org.example.dao.LaptopDAO;
import org.example.model.Laptop;

import java.sql.SQLException;
import java.util.List;

public class LaptopService {
    private final LaptopDAO laptopDAO;

    public LaptopService() {
        this.laptopDAO = new LaptopDAO(); // Asegúrate de que este DAO esté definido.
    }

    public void insertLaptop(Laptop laptop) throws SQLException {
        laptopDAO.insert(laptop);
    }

    public List<Laptop> getAllLaptops() throws SQLException {
        return laptopDAO.findAll();
    }

    public Laptop getLaptopById(int laptopId) throws SQLException {
        return laptopDAO.findById(laptopId);
    }

    public void updateLaptop(Laptop laptop) throws SQLException {
        laptopDAO.update(laptop);
    }

    public void deleteLaptop(int laptopId) throws SQLException {
        laptopDAO.delete(laptopId);
    }
}
