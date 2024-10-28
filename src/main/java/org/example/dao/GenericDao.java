package org.example.dao;

import java.sql.SQLException;
import java.util.List;

public interface GenericDao<T,K>{
    void insert(T entity) throws SQLException;
    List<T> findAll() throws SQLException;
    T findById(K id) throws SQLException;
    void update(T entity) throws SQLException;
    void delete(K id) throws SQLException;
}
