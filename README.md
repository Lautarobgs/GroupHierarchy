Group project made by Lautaro Burgos, Lucas Ribeiro & Julieta Bucci

Device hierarchy which compose of:
• Device (Superclass)
• Laptop (Subclass)
• Smartphone (Subclass)
• Smartwatch (Subclass)
• Tablet (Subclass)
Each class has their own service/dao/mapper
The SQL file is located in solvd-group-mysql.sql

The program works by interacting with the service class, service communicates with the respective DAOS of each entity. Within each DAO, the static method of MyBatisUtils (class created to create sessions) is used to get a SQL session to interact with the mappers. These mappers are made in interfaces.
