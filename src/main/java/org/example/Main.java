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
import org.example.patterns.decorator.BusinessLaptopDecorator;
import org.example.patterns.decorator.GamingLaptopDecorator;
import org.example.patterns.listener.SmartwatchEventListener;
import org.example.service.SmartwatchService;
import org.example.service.TabletService;
import org.example.service.SmartphoneService;
import org.example.service.LaptopService;
import org.example.model.*;
import org.example.service.*;
import org.example.patterns.facade.DeviceFacade;
import java.sql.SQLException;
import java.util.List;
import org.example.dao.LaptopDAO;
import org.example.service.IGenericService;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
            // Crear servicios inyectados para cada tipo de dispositivo
            IGenericService<Smartwatch, Integer> smartwatchService = new SmartwatchService();
            IGenericService<Tablet, Integer> tabletService = new TabletService();
            IGenericService<Smartphone, Integer> smartphoneService = new SmartphoneService();
            IGenericService<Laptop, Integer> laptopService = new LaptopService();

            // Crear una instancia de DeviceFacade pasando smartphoneService (inyeccion de dependencia)
            DeviceFacade deviceFacade = new DeviceFacade(smartphoneService);

            // FACTORY Pattern: Creación de un dispositivo Smartphone
            logger.info("----------FACTORY SMARTPHONE----------");
            Device smartphone = DeviceFactory.createDevice(
                    Device.DeviceType.Smartphone, 1, "Samsung", "Galaxy S21", 799.99, 101, 4500);
            logger.info("Smartphone created: " + smartphone);

            // ABSTRACT FACTORY Pattern: Creacion de un dispositivo Laptop
            logger.info("----------ABSTRACT FACTORY LAPTOP----------");
            AbsDeviceFactory laptopFactory = AbsDeviceFactory.getFactory(Device.DeviceType.Laptop);
            Device laptop = laptopFactory.createDevice(2, "Dell", "XPS 13", 999.99, 201, 512);
            logger.info("Laptop created: " + laptop);

            // BUILDER Pattern: Construccion de un Smartphone usando el Builder
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

            // LISTENER Pattern: Configuracion de eventos para un Smartwatch
            logger.info("----------LISTENER SMARTWATCH----------");
            Smartwatch smartwatch = new Smartwatch(1, 24, true);
            SmartwatchEventListener eventListener = new SmartwatchEventListener();
            smartwatch.addSmartwatchListener(eventListener);

            // Actualizar y mostrar cambios en el Smartwatch usando eventos
            logger.info("Updating the battery life of the smartwatch.");
            smartwatch.setBatteryLifeHours(20);

            logger.info("Updating the water resistance of the smartwatch.");
            smartwatch.setWaterResistant(false);

            // Uso del FACADE Pattern para realizar operaciones CRUD en Smartphone
            try {
                logger.info("----------CRUD OPERATIONS FOR SMARTPHONE USING DEVICE FACADE----------");

                // Crear y agregar un nuevo Smartphone
                Smartphone newSmartphone = new Smartphone(null, "Apple", "iPhone 13", 999.99, Device.DeviceType.Smartphone, 3, 4000);
                deviceFacade.addSmartphone(newSmartphone);
                logger.info("Inserted new smartphone: " + newSmartphone);

                // Obtener un Smartphone por ID
                Smartphone retrievedSmartphone = deviceFacade.getSmartphoneById(3); // ID 3
                if (retrievedSmartphone != null) {
                    logger.info("Retrieved smartphone by ID: " + retrievedSmartphone);
                } else {
                    logger.warn("Smartphone with ID 3 not found.");
                }

                // Obtener todos los Smartphones
                List<Smartphone> smartphones = deviceFacade.getAllSmartphones();
                logger.info("Retrieving all smartphones:");
                for (Smartphone smartphoneEntry : smartphones) {
                    logger.info("Found smartphone: " + smartphoneEntry);
                }

                // Actualizar el Smartphone si existe
                if (retrievedSmartphone != null) {
                    retrievedSmartphone.setBatteryCapacity(4500); // Actualiza la capacidad de la batería
                    deviceFacade.updateSmartphone(retrievedSmartphone);
                    logger.info("Updated smartphone battery capacity to 4500 for smartphone with ID 3");
                }

                // Eliminar el Smartphone
                deviceFacade.deleteSmartphone(3);
                logger.info("Deleted smartphone with ID 3");

                // Verificar si el Smartphone fue eliminado
                Smartphone deletedSmartphone = deviceFacade.getSmartphoneById(3);
                if (deletedSmartphone == null) {
                    logger.info("Smartphone with ID 3 has been successfully deleted.");
                } else {
                    logger.warn("Smartphone with ID 3 was not deleted.");
                }

            } catch (SQLException e) {
                logger.error("Error performing CRUD operations on Smartphone: ", e);
            }

            // DECORATOR Pattern
        logger.info("----------DECORATOR LAPTOP ----------");

        Laptop basicLaptop = new Laptop(1, "Dell", "Inspiron 15", 800.00, Device.DeviceType.Laptop, 101, 512);

        //Laptop basica
        logger.info("Detalles del Laptop Basico:");
        logger.info(basicLaptop);
        logger.info("Precio: " + basicLaptop.getPrice());

        // Aplicar decorador de caracteristicas de Gaming
        Laptop gamingLaptop = new GamingLaptopDecorator(basicLaptop);
        logger.info("\nDetalles del Laptop Gaming:");
        logger.info(gamingLaptop);
        logger.info("Precio: " + gamingLaptop.getPrice());

        // Aplicar decorador de caracteristicas de Business
        Laptop businessLaptop = new BusinessLaptopDecorator(basicLaptop);
        logger.info("\nDetalles del Laptop Business:");
        logger.info(businessLaptop);
        logger.info("Precio: " + businessLaptop.getPrice());

        // Aplicar multiples decoradores
        Laptop ultimateGamingBusinessLaptop = new BusinessLaptopDecorator(gamingLaptop);
        logger.info("\nDetalles del Laptop Ultimate Gaming y Business:");
        logger.info(ultimateGamingBusinessLaptop);
        logger.info("Precio: " + ultimateGamingBusinessLaptop.getPrice());
    }
}

