package org.example.service;

import org.example.dao.GenericDao;
import org.example.model.Device;
import org.example.model.Smartwatch;
import java.sql.SQLException;
import org.example.dao.SmartwatchDAO;
import java.util.List;
public class SmartwatchService implements IGenericService<Smartwatch,Integer>
{
    private final GenericDao<Smartwatch,Integer> smartwatchDAO = new SmartwatchDAO();

    public void add(Smartwatch smartwatch) throws SQLException {
        smartwatchDAO.insert(smartwatch);
    }

    public Smartwatch getById(Integer id) throws SQLException {
        return smartwatchDAO.findById(id);
    }

    public List<Smartwatch> getAll() throws SQLException {
        return smartwatchDAO.findAll();
    }
  
    public void update(Smartwatch smartwatch) throws SQLException {
        smartwatchDAO.update(smartwatch);
    }

    public void delete(Integer id) throws SQLException {
        smartwatchDAO.delete(id);
    }
}