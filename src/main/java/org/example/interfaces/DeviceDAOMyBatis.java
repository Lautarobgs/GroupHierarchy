package org.example.interfaces;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.example.model.Device;

public class DeviceDAOMyBatis implements DeviceDAO {

    private final SqlSession sqlSession;

    public DeviceDAOMyBatis(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public void insert(Device device) {
        sqlSession.insert("DeviceMapper.insert", device);
    }

    @Override
    public void update(Device device) {
        sqlSession.update("DeviceMapper.update", device);
    }

    @Override
    public void deleteById(Integer id) {
        sqlSession.delete("DeviceMapper.deleteById", id);
    }

    @Override
    public Device findById(Integer id) {
        return sqlSession.selectOne("DeviceMapper.findById", id);
    }

    @Override
    public List<Device> findAll() {
        return sqlSession.selectList("DeviceMapper.findAll");
    }
}
