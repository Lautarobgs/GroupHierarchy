The program works by interacting with the service class, service communicates with the respective DAOS of each entity. Within each DAO, the static method of MyBatisUtils (class created to create sessions) is used to get a SQL session to interact with the mappers. These mappers are made in interfaces.
