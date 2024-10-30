package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.dao.SmartphoneDAO;
import org.example.dao.SmartwatchDAO;
import org.example.dao.TabletDAO;
import org.example.model.Laptop;
import org.example.model.Tablet;
import org.example.service.*;

import java.sql.SQLException;
import org.example.service.SmartwatchService;
import org.example.model.Smartwatch;
import org.example.service.TabletService;
import java.util.List;
import org.example.service.SmartphoneService;
import org.example.service.LaptopService;

public class Main {
    private static Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
       SmartwatchService smartwatchService = new SmartwatchService();
        TabletService tabletService = new TabletService();
        SmartphoneService smartphoneService = new SmartphoneService();
        LaptopService laptopService = new LaptopService();

    }
}