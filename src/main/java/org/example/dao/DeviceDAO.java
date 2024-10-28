package org.example.dao;

import org.example.model.Device;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.example.config.MyBatisUtil;
import org.example.interfaces.DeviceMapper;

import java.sql.SQLException;
import java.util.List;

public class DeviceDAO implements GenericDao<Device, Integer> {
    private final SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();

    public DeviceDAO() {
    }

    @Override
    public void insert(Device entity) throws SQLException {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            DeviceMapper mapper = session.getMapper(DeviceMapper.class);
            mapper.insert(entity);
            session.commit();
        }
    }

    @Override
    public List<Device> findAll() throws SQLException {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            DeviceMapper mapper = session.getMapper(DeviceMapper.class);
            return mapper.findAll();
        }
    }

    @Override
    public Device findById(Integer id) throws SQLException {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            DeviceMapper mapper = session.getMapper(DeviceMapper.class);
            return mapper.findById(id);
        }
    }

    @Override
    public void update(Device entity) throws SQLException {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            DeviceMapper mapper = session.getMapper(DeviceMapper.class);
            mapper.update(entity);
            session.commit();
        }
    }

    @Override
    public void delete(Integer id) throws SQLException {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            DeviceMapper mapper = session.getMapper(DeviceMapper.class);
            mapper.deleteById(id);
            session.commit();
        }
    }
}
