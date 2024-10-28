package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.service.*;
import org.example.service.SmartwatchService;
import org.example.service.TabletService;


public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        SmartwatchService smartwatchService = new SmartwatchService();
        TabletService tabletService = new TabletService();
        SmartphoneService smartphoneService = new SmartphoneService();
        LaptopService laptopService = new LaptopService();


    }
}