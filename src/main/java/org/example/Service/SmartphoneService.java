package org.example.service;

import org.example.model.Smartphone;
import java.sql.SQLException;
import org.example.dao.SmartphoneDAO;
import java.util.List;

public class SmartphoneService
{
    private final SmartphoneDAO smartphoneDAO = new SmartphoneDAO();

    public void addSmartphone(Smartphone Smartphone) throws SQLException {
        smartphoneDAO.insert(Smartphone);
    }

    public Smartphone getSmartphoneById(int id) throws SQLException {
        return smartphoneDAO.findById(id);
    }

    public List<Smartphone> getAllSmartphones() throws SQLException {
        return smartphoneDAO.findAll();
    }

    public void updateSmartphone(Smartphone Smartphone) throws SQLException {
        smartphoneDAO.update(Smartphone);
    }

    public void deleteSmartphone(int id) throws SQLException {
        smartphoneDAO.delete(id);
    }
}
