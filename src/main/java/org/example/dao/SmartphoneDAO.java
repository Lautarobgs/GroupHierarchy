package org.example.dao;

import org.example.model.Smartphone;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.example.config.MyBatisUtil;
import org.example.interfaces.SmartphoneMapper;

import java.sql.SQLException;
import java.util.List;

public class SmartphoneDAO implements GenericDao<Smartphone, Integer> {
    private final SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();

    public SmartphoneDAO() {
    }

    @Override
    public void insert(Smartphone entity) throws SQLException {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            SmartphoneMapper mapper = session.getMapper(SmartphoneMapper.class);
            mapper.insert(entity);
            session.commit();
        }
    }

    @Override
    public List<Smartphone> findAll() throws SQLException {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            SmartphoneMapper mapper = session.getMapper(SmartphoneMapper.class);
            return mapper.findAll();
        }
    }

    @Override
    public Smartphone findById(Integer id) throws SQLException {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            SmartphoneMapper mapper = session.getMapper(SmartphoneMapper.class);
            return mapper.findById(id);
        }
    }

    @Override
    public void update(Smartphone entity) throws SQLException {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            SmartphoneMapper mapper = session.getMapper(SmartphoneMapper.class);
            mapper.update(entity);
            session.commit();
        }
    }

    @Override
    public void delete(Integer id) throws SQLException {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            SmartphoneMapper mapper = session.getMapper(SmartphoneMapper.class);
            mapper.deleteById(id);
            session.commit();
        }
    }
}
