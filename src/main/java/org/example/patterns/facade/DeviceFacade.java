package org.example.patterns.facade;

import org.example.service.SmartphoneService;
import org.example.service.SmartwatchService;
import org.example.model.Smartphone;
import org.example.model.Smartwatch;
import java.sql.SQLException;
import java.util.List;
import org.example.dao.SmartphoneDAO;
import org.example.service.IGenericService;

public class DeviceFacade
{
    private final IGenericService<Smartphone, Integer> smartphoneService;

    // Constructor injection for services (DIP)
    public DeviceFacade(IGenericService<Smartphone, Integer> smartphoneService) {
        this.smartphoneService = smartphoneService;
    }

    // CRUD for Smartphone
    public void addSmartphone(Smartphone smartphone) throws SQLException {
        smartphoneService.add(smartphone);
    }

    public Smartphone getSmartphoneById(int id) throws SQLException {
        return smartphoneService.getById(id);
    }

    public List<Smartphone> getAllSmartphones() throws SQLException {
        return smartphoneService.getAll();
    }

    public void updateSmartphone(Smartphone smartphone) throws SQLException {
        smartphoneService.update(smartphone);
    }

    public void deleteSmartphone(int id) throws SQLException {
        smartphoneService.delete(id);
    }
}
