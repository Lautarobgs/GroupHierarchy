package org.example.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.example.config.MyBatisUtil;
import org.example.interfaces.SmartwatchMapper;
import org.example.model.Smartwatch;

import java.sql.SQLException;
import java.util.List;

public class SmartwatchDAO implements GenericDao<Smartwatch, Integer> {
    private final SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();

    public SmartwatchDAO() {
    }

    @Override
    public void insert(Smartwatch entity) throws SQLException {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            SmartwatchMapper mapper = session.getMapper(SmartwatchMapper.class);
            mapper.insert(entity);
            session.commit();
        }
    }

    @Override
    public List<Smartwatch> findAll() throws SQLException {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            SmartwatchMapper mapper = session.getMapper(SmartwatchMapper.class);
            return mapper.findAll();
        }
    }

    @Override
    public Smartwatch findById(Integer id) throws SQLException {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            SmartwatchMapper mapper = session.getMapper(SmartwatchMapper.class);
            return mapper.findById(id);
        }
    }

    @Override
    public void update(Smartwatch entity) throws SQLException {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            SmartwatchMapper mapper = session.getMapper(SmartwatchMapper.class);
            mapper.update(entity);
            session.commit();
        }
    }

    @Override
    public void delete(Integer id) throws SQLException {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            SmartwatchMapper mapper = session.getMapper(SmartwatchMapper.class);
            mapper.deleteById(id);
            session.commit();
        }
    }
}
