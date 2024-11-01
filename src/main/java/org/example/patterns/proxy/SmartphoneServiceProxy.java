package org.example.patterns.proxy;

import org.example.model.Smartphone;
import org.example.service.IGenericService;
import org.example.service.SmartphoneService;
import java.sql.SQLException;
import java.util.List;

public class SmartphoneServiceProxy implements IGenericService<Smartphone, Integer> {
    private final SmartphoneService smartphoneServ;

    public SmartphoneServiceProxy() {
        this.smartphoneServ = new SmartphoneService();
    }

    @Override
    public void add(Smartphone smartphone) throws SQLException {
        System.out.println("Checking permissions to add smartphone...");
        smartphoneServ.add(smartphone);
    }

    @Override
    public Smartphone getById(Integer id) throws SQLException {
        System.out.println("Checking permissions to fetch smartphone by ID...");
        return smartphoneServ.getById(id);
    }

    @Override
    public List<Smartphone> getAll() throws SQLException {
        System.out.println("Checking permissions to list all smartphones...");
        return smartphoneServ.getAll();
    }

    @Override
    public void update(Smartphone smartphone) throws SQLException {
        System.out.println("Checking permissions to update smartphone...");
        smartphoneServ.update(smartphone);
    }

    @Override
    public void delete(Integer id) throws SQLException {
        System.out.println("Checking permissions to delete smartphone...");
        smartphoneServ.delete(id);
    }
}