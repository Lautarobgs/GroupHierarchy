package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.dao.SmartwatchDAO;
import org.example.dao.TabletDAO;
import org.example.model.Tablet;
import org.example.service.SmartwatchService;
import org.example.service.TabletService;

import java.sql.SQLException;


public class Main {
    private static Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        SmartwatchService smartwatchService = new SmartwatchService();
        TabletService tabletService = new TabletService();
        logger.info(smartwatchService.getAllSmartwatches());

    }
}