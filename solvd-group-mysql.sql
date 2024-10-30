CREATE DATABASE DeviceStore;
USE DeviceStore;

/* Device table */
CREATE TABLE Device (
    id INT AUTO_INCREMENT PRIMARY KEY,
    brand VARCHAR(50) NOT NULL,
    model VARCHAR(50) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    type ENUM('Smartphone', 'Laptop', 'Smartwatch', 'Tablet') NOT NULL 
);

/* Smartphone table */
CREATE TABLE Smartphone (
    smartphone_id INT PRIMARY KEY,
    batteryCapacity INT NOT NULL,      
    FOREIGN KEY (smartphone_id) REFERENCES Device(id) ON DELETE CASCADE
);

/* Laptop table */
CREATE TABLE Laptop (
    laptop_id INT PRIMARY KEY,
    storage INT NOT NULL,              
    FOREIGN KEY (laptop_id) REFERENCES Device(id) ON DELETE CASCADE
);

/* Smartwatch table */
CREATE TABLE Smartwatch (
    smartwatch_id INT PRIMARY KEY,
    batteryLifeHours INT NOT NULL,      
    isWaterResistant BOOLEAN NOT NULL,  
    FOREIGN KEY (smartwatch_id) REFERENCES Device(id) ON DELETE CASCADE
);

/* Tablet table */
CREATE TABLE Tablet (
    tablet_id INT PRIMARY KEY,
    hasCellular BOOLEAN NOT NULL,           
    FOREIGN KEY (tablet_id) REFERENCES Device(id) ON DELETE CASCADE
);

INSERT INTO Device (brand, model, price, type) VALUES ('Apple', 'iPhone 13', 999.99, 'Smartphone');
INSERT INTO Device (brand, model, price, type) VALUES ('Samsung', 'Galaxy Tab S7', 649.99, 'Tablet');
INSERT INTO Device (brand, model, price, type) VALUES ('Dell', 'XPS 13', 1299.99, 'Laptop');
INSERT INTO Device (brand, model, price, type) VALUES ('Apple', 'Apple Watch Series 7', 399.99, 'Smartwatch');

-- Asegúrate de que los IDs de `Device` coincidan antes de realizar inserciones en otras tablas
INSERT INTO Smartphone (smartphone_id, batteryCapacity) VALUES (1, 4000);
INSERT INTO Tablet (tablet_id, hasCellular) VALUES (2, TRUE);
INSERT INTO Laptop (laptop_id, storage) VALUES (3, 512);
INSERT INTO Smartwatch (smartwatch_id, batteryLifeHours, isWaterResistant) VALUES (4, 18, TRUE);
