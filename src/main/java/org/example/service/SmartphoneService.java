package org.example.service;

import org.example.dao.GenericDao;
import org.example.model.Device;
import org.example.model.Smartphone;
import java.sql.SQLException;
import org.example.dao.SmartphoneDAO;
import java.util.List;

public class SmartphoneService implements IGenericService<Smartphone,Integer>
{
    private final GenericDao<Smartphone,Integer> smartphoneDAO = new SmartphoneDAO();

    public void add(Smartphone Smartphone) throws SQLException {
        smartphoneDAO.insert(Smartphone);
    }

    public Smartphone getById(Integer id) throws SQLException {
        return smartphoneDAO.findById(id);
    }

    public List<Smartphone> getAll() throws SQLException {
        return smartphoneDAO.findAll();
    }

    public void update(Smartphone Smartphone) throws SQLException {
        smartphoneDAO.update(Smartphone);
    }

    public void delete(Integer id) throws SQLException {
        smartphoneDAO.delete(id);
    }
}
