package org.example.service;

import org.example.dao.TabletDAO;
import org.example.model.Tablet;
import java.sql.SQLException;
public class TabletService
{
    private final TabletDAO tabletDAO = new TabletDAO();

    public void addTablet(Tablet tablet) throws SQLException {
        tabletDAO.insert(tablet);
    }

    public Tablet getTabletById(int id) throws SQLException {
        return tabletDAO.findById(id);
    }

    public List<Tablet> getAllTablets() throws SQLException {
        return tabletDAO.findAll();
    }

    public void updateTablet(Tablet tablet) throws SQLException {
        tabletDAO.update(tablet);
    }

    public void deleteTablet(int id) throws SQLException {
        tabletDAO.delete(id);
    }
}
