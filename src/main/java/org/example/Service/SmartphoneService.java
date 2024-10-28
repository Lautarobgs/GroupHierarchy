package org.example.Service;

import org.example.model.Smartphone;
import java.sql.SQLException;
import org.example.dao.SmartphoneDAO;
import java.util.List;

public class SmartphoneService
{
    private final SmartphoneDAO smartphoneDAO = new SmartphoneDAO();

    public void addSmartphone(Smartphone Smartphone) throws SQLException {
        SmartphoneDAO.insert(Smartphone);
    }

    public Smartphone getSmartphoneById(int id) throws SQLException {
        return SmartphoneDAO.findById(id);
    }

    public List<Smartphone> getAllSmartphones() throws SQLException {
        return SmartphoneDAO.findAll();
    }

    public void updateSmartphone(Smartphone Smartphone) throws SQLException {
        SmartphoneDAO.update(Smartphone);
    }

    public void deleteSmartphone(int id) throws SQLException {
        SmartphoneDAO.delete(id);
    }
}
