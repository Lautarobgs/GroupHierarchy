package org.example.service;

import java.sql.SQLException;
import java.util.List;

public interface IGenericService<T, ID> {
    void add(T entity) throws SQLException;
    T getById(ID id) throws SQLException;
    List<T> getAll() throws SQLException;
    void update(T entity) throws SQLException;
    void delete(ID id) throws SQLException;
}
