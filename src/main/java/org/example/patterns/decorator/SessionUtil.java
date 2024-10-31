package org.example.patterns.decorator;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.example.config.MyBatisUtil;
import java.sql.SQLException;

public class SessionUtil {
    private static final SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();

    public static <T> T executeTransactional(TransactionalAction<T> action) throws SQLException {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            T result = action.execute(session);
            session.commit();
            return result;
        }
    }

    public interface TransactionalAction<T> {
        T execute(SqlSession session) throws SQLException;
    }
}
