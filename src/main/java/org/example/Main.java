package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.model.Device;
import org.example.model.Smartwatch;
import org.example.model.Laptop;
import org.example.model.Tablet;
import org.example.patterns.AbsDeviceFactory;
import org.example.patterns.DeviceBuilder;
import org.example.patterns.DeviceFactory;
import org.example.service.SmartwatchService;
import org.example.service.TabletService;
import org.example.service.SmartphoneService;
import org.example.service.LaptopService;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        SmartwatchService smartwatchService = new SmartwatchService();
        TabletService tabletService = new TabletService();
        SmartphoneService smartphoneService = new SmartphoneService();
        LaptopService laptopService = new LaptopService();

        logger.info("----------LISTENER SMARTWATCH----------");
        Smartwatch smartwatch = new Smartwatch(1, 24, true);
        SmartwatchEventListener eventListener = new SmartwatchEventListener();
        smartwatch.addSmartwatchListener(eventListener);

        logger.info("Updating the battery life of the smartwatch.");
        smartwatch.setBatteryLifeHours(20);

        logger.info("Updating the water resistance of the smartwatch.");
        smartwatch.setWaterResistant(false);

        logger.info("----------FACTORY SMARTPHONE----------");
        Device smartphone = DeviceFactory.createDevice(
                Device.DeviceType.Smartphone, 1, "Samsung", "Galaxy S21", 799.99, 101, 4500);
        logger.info("Smartphone created: " + smartphone);

        logger.info("----------ABSTRACTFACTORY LAPTOP----------");
        AbsDeviceFactory laptopFactory = AbsDeviceFactory.getFactory(Device.DeviceType.Laptop);
        Device laptop = laptopFactory.createDevice(2, "Dell", "XPS 13", 999.99, 201, 512);
        logger.info("Laptop created: " + laptop);

        logger.info("----------SMARTPHONE BUILDER----------");
        Device smartphoneBuilt = new DeviceBuilder()
                .setType(Device.DeviceType.Smartphone)
                .setId(1)
                .setBrand("Samsung")
                .setModel("Galaxy S21")
                .setPrice(799.99)
                .setSpecificId(101)
                .setBatteryCapacity(4500)
                .build();
        logger.info("Smartphone created: " + smartphoneBuilt);
    }
}
