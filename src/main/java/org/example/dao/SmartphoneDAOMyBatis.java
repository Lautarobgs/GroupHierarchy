package org.example.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.example.model.Smartphone;

public class SmartphoneDAOMyBatis implements GenericDao<Smartphone,Integer> {

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

    @Override
    public void delete(Integer id) {
        sqlSession.delete("SmartphoneMapper.deleteById", id);
    }

    @Override
    public Smartphone findById(Integer id) {
        return sqlSession.selectOne("SmartphoneMapper.findById", id);
    }

    @Override
    public List<Smartphone> findAll() {
        return sqlSession.selectList("SmartphoneMapper.findAll");
    }
}
