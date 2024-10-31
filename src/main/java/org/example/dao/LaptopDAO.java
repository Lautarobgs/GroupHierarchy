package org.example.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.example.config.MyBatisUtil;
import org.example.interfaces.LaptopMapper;
import org.example.model.Laptop;
import java.sql.SQLException;
import java.util.List;
import org.example.patterns.decorator.TransactionalSession;
import org.example.patterns.decorator.SessionUtil;

public class LaptopDAO implements GenericDao<Laptop,Integer> {

    private final SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();

    public LaptopDAO() {
    }

    @Override
    @TransactionalSession
    public void insert(Laptop laptop) throws SQLException {
        SessionUtil.executeTransactional(session -> {
            LaptopMapper mapper = session.getMapper(LaptopMapper.class);
            mapper.insert(laptop);
            return null;
        });
    }

    @Override
    @TransactionalSession
    public List<Laptop> findAll() throws SQLException {
        return SessionUtil.executeTransactional(session -> {
            LaptopMapper mapper = session.getMapper(LaptopMapper.class);
            return mapper.findAll();
        });
    }

    @Override
    @TransactionalSession
    public Laptop findById(Integer laptopId) throws SQLException {
        return SessionUtil.executeTransactional(session -> {
            LaptopMapper mapper = session.getMapper(LaptopMapper.class);
            return mapper.findById(laptopId);
        });
    }

    @Override
    @TransactionalSession
    public void update(Laptop laptop) throws SQLException {
        SessionUtil.executeTransactional(session -> {
            LaptopMapper mapper = session.getMapper(LaptopMapper.class);
            mapper.update(laptop);
            return null;
        });
    }

    @Override
    @TransactionalSession
    public void delete(Integer laptopId) throws SQLException {
        SessionUtil.executeTransactional(session -> {
            LaptopMapper mapper = session.getMapper(LaptopMapper.class);
            mapper.deleteById(laptopId);
            return null;
        });
    }
}