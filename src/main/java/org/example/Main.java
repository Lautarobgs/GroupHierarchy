package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.dao.TabletDAO;
import org.example.model.Tablet;

import java.sql.SQLException;


public class Main {
    private static Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        TabletDAO tabletDAO = new TabletDAO();
        try {
            logger.info(tabletDAO.findAll());
        }catch (SQLException e){
            logger.warn(e);
        }

    }
}