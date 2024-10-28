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

public class Main {
    private static Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        SmartwatchService smartwatchService = new SmartwatchService();
        TabletService tabletService = new TabletService();
        SmartphoneService smartphoneService = new SmartphoneService();
        LaptopService laptopService = new LaptopService();

        try {

            logger.info("==== TEST WITH SMARTWATCH ====");

            // Create a new Smartwatch and insert it
            Smartwatch smartwatch = new Smartwatch(1, 24, true);
            smartwatchService.addSmartwatch(smartwatch);
            logger.info("Smartwatch added: {}", smartwatch);

            // Retrieve a Smartwatch by ID
            Smartwatch retrievedSmartwatch = smartwatchService.getSmartwatchById(1);
            logger.info("Smartwatch retrieved by ID: {}", retrievedSmartwatch);

            // Update the Smartwatch
            retrievedSmartwatch.setBatteryLifeHours(36);
            smartwatchService.updateSmartwatch(retrievedSmartwatch);
            logger.info("Smartwatch updated: {}", retrievedSmartwatch);

            // Get all Smartwatches
            List<Smartwatch> allSmartwatches = smartwatchService.getAllSmartwatches();
            logger.info("List of all Smartwatches: {}", allSmartwatches);

            // Delete the Smartwatch
            smartwatchService.deleteSmartwatch(1);
            logger.info("Smartwatch deleted.");

            logger.info("\n==== TESTS WITH TABLET ====");

            // Create a new Tablet and insert it
            Tablet tablet = new Tablet(1, true);
            tabletService.addTablet(tablet);
            logger.info("Tablet added: {}", tablet);

            // Retrieve a Tablet by ID
            Tablet retrievedTablet = tabletService.getTabletById(1);
            logger.info("Tablet retrieved by ID: {}", retrievedTablet);

            // Update the Tablet
            retrievedTablet.setHasCellular(false);
            tabletService.updateTablet(retrievedTablet);
            logger.info("Tablet updated: {}", retrievedTablet);

            // Get all Tablets
            List<Tablet> allTablets = tabletService.getAllTablets();
            logger.info("List of all Tablets: {}", allTablets);

            // Delete the Tablet
            tabletService.deleteTablet(1);
            logger.info("Tablet deleted.");


        } catch (SQLException e) {
            System.err.println("Database operation error: " + e.getMessage());
            e.printStackTrace();
        }

    }
}