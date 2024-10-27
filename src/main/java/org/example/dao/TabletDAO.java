package org.example.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.example.config.MyBatisUtil;
import org.example.interfaces.GenericDao;
import org.example.interfaces.TabletMapper;
import org.example.model.Tablet;

import java.sql.SQLException;
import java.util.List;

public class TabletDAO implements GenericDao<Tablet,Integer> {

    private final SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();;

    public TabletDAO() {
    }

    @Override
    public void insert(Tablet entity) throws SQLException {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            TabletMapper mapper = session.getMapper(TabletMapper.class);
            mapper.insert(entity);
            session.commit();
        }
    }

    @Override
    public List<Tablet> findAll() throws SQLException {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            TabletMapper mapper = session.getMapper(TabletMapper.class);
            return mapper.findAll();
        }
    }

    @Override
    public Tablet findById(Integer id) throws SQLException {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            TabletMapper mapper = session.getMapper(TabletMapper.class);
            return mapper.findById(id);
        }
    }

    @Override
    public void update(Tablet entity) throws SQLException {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            TabletMapper mapper = session.getMapper(TabletMapper.class);
            mapper.update(entity);
            session.commit();
        }
    }

    @Override
    public void delete(Integer id) throws SQLException {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            TabletMapper mapper = session.getMapper(TabletMapper.class);
            mapper.deleteById(id);
            session.commit();
        }
    }
}
