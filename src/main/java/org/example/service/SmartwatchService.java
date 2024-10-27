package org.example.service;

import org.example.dao.SmartwatchDAO;
import org.example.model.Smartwatch;

import java.sql.SQLException;
import java.util.List;

public class SmartwatchService {
    private final SmartwatchDAO smartwatchDAO;

    public SmartwatchService() {
        this.smartwatchDAO = new SmartwatchDAO(); // Asegúrate de que este DAO esté definido.
    }

    public void insertSmartwatch(Smartwatch smartwatch) throws SQLException {
        smartwatchDAO.insert(smartwatch);
    }

    public List<Smartwatch> getAllSmartwatches() throws SQLException {
        return smartwatchDAO.findAll();
    }

    public Smartwatch getSmartwatchById(int id) throws SQLException {
        return smartwatchDAO.findById(id);
    }

    public void updateSmartwatch(Smartwatch smartwatch) throws SQLException {
        smartwatchDAO.update(smartwatch);
    }

    public void deleteSmartwatch(int id) throws SQLException {
        smartwatchDAO.delete(id);
    }
}
