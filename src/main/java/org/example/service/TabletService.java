package org.example.service;

import org.example.dao.GenericDao;
import org.example.dao.TabletDAO;
import org.example.model.Device;
import org.example.model.Tablet;
import java.sql.SQLException;
import java.util.List;
public class TabletService implements IGenericService<Tablet,Integer>
{
    private final GenericDao<Tablet,Integer> tabletDAO = new TabletDAO();

    public void add(Tablet tablet) throws SQLException {
        tabletDAO.insert(tablet);
    }

    public Tablet getById(Integer id) throws SQLException {
        return tabletDAO.findById(id);
    }

    public List<Tablet> getAll() throws SQLException {
        return tabletDAO.findAll();
    }

    public void update(Tablet tablet) throws SQLException {
        tabletDAO.update(tablet);
    }

    public void delete(Integer id) throws SQLException {
        tabletDAO.delete(id);
    }
}
