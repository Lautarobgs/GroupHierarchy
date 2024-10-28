package org.example.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.example.config.MyBatisUtil;
import org.example.interfaces.GenericDao;
import org.example.interfaces.LaptopMapper;
import org.example.model.Laptop;

import java.sql.SQLException;
import java.util.List;

public class LaptopDAO implements GenericDao<Laptop,Integer> {

    private final SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();

    public LaptopDAO() {
    }

    @Override
    public void insert(Laptop laptop) throws SQLException {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            LaptopMapper mapper = session.getMapper(LaptopMapper.class);
            mapper.insert(laptop);
            session.commit();
        }
    }

    @Override
    public List<Laptop> findAll() throws SQLException {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            LaptopMapper mapper = session.getMapper(LaptopMapper.class);
            return mapper.findAll();
        }
    }
    @Override
    public Laptop findById(Integer laptopId) throws SQLException {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            LaptopMapper mapper = session.getMapper(LaptopMapper.class);
            return mapper.findById(laptopId);
        }
    }

    @Override
    public void update(Laptop laptop) throws SQLException {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            LaptopMapper mapper = session.getMapper(LaptopMapper.class);
            mapper.update(laptop);
            session.commit();
        }
    }

    @Override
    public void delete(Integer laptopId) throws SQLException {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            LaptopMapper mapper = session.getMapper(LaptopMapper.class);
            mapper.deleteById(laptopId);
            session.commit();
        }
    }
}
