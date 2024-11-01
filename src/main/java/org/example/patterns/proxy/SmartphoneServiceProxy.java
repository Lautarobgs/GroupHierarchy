package org.example.patterns.proxy;

import org.example.model.Smartphone;
import org.example.service.IGenericService;
import org.example.service.SmartphoneService;
import java.sql.SQLException;
import java.util.List;

public class SmartphoneServiceProxy implements IGenericService<Smartphone, Integer> {
    private final SmartphoneService smartphoneService;

    public SmartphoneServiceProxy() {
        this.smartphoneService = new SmartphoneService();
    }

    @Override
    public void add(Smartphone smartphone) throws SQLException {
        System.out.println("Checking permissions to add smartphone...");
        smartphoneService.add(smartphone);
    }

    @Override
    public Smartphone getById(Integer id) throws SQLException {
        System.out.println("Checking permissions to fetch smartphone by ID...");
        return smartphoneService.getById(id);
    }

    @Override
    public List<Smartphone> getAll() throws SQLException {
        System.out.println("Checking permissions to list all smartphones...");
        return smartphoneService.getAll();
    }

    @Override
    public void update(Smartphone smartphone) throws SQLException {
        System.out.println("Checking permissions to update smartphone...");
        smartphoneService.update(smartphone);
    }

    @Override
    public void delete(Integer id) throws SQLException {
        System.out.println("Checking permissions to delete smartphone...");
        smartphoneService.delete(id);
    }
}

