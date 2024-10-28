package org.example.service;

import org.example.model.Smartwatch;
import java.sql.SQLException;
import org.example.dao.SmartwatchDAO;
public class SmartwatchService
{
    private final SmartwatchDAO smartwatchDAO = new SmartwatchDAO();

    public void addSmartwatch(Smartwatch smartwatch) throws SQLException {
        smartwatchDAO.insert(smartwatch);
    }

    public Smartwatch getSmartwatchById(int id) throws SQLException {
        return smartwatchDAO.findById(id);
    }

    public List<Smartwatch> getAllSmartwatches() throws SQLException {
        return smartwatchDAO.findAll();
    }

    public void updateSmartwatch(Smartwatch smartwatch) throws SQLException {
        smartwatchDAO.update(smartwatch);
    }

    public void deleteSmartwatch(int id) throws SQLException {
        smartwatchDAO.delete(id);
    }
}

