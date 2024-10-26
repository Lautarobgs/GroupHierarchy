package org.example.interfaces;

import java.sql.SQLException;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.example.model.Device;
import org.example.model.Smartphone;

public class SmartphoneDAOMyBatis implements SmartphoneDAO {

    private final SqlSession sqlSession;

    public SmartphoneDAOMyBatis(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public void insert(Smartphone smartphone) {
        sqlSession.insert("SmartphoneMapper.insert", smartphone);
    }

    @Override
    public void update(Smartphone smartphone) {
        sqlSession.update("SmartphoneMapper.update", smartphone);
    }

    // I tried to not put the next 2 methods here but it was not working
    @Override
    public void insert(Device device) throws SQLException {}
    @Override
    public void update(Device device) throws SQLException {}

    @Override
    public void deleteById(Integer id) {
        sqlSession.delete("SmartphoneMapper.deleteById", id);
    }

    @Override
    public Smartphone findById(Integer id) {
        return sqlSession.selectOne("SmartphoneMapper.findById", id);
    }

    @Override
    public List<Device> findAll() {
        return sqlSession.selectList("SmartphoneMapper.findAll");
    }

    @Override
    public List<Smartphone> findByBatteryCapacity(int batteryCapacity) {
        return sqlSession.selectList("SmartphoneMapper.findByBatteryCapacity", batteryCapacity);
    }
}
