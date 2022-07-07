package com.xkk.dao;

import com.xkk.pojo.User;
import com.xkk.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test() {
        // 获取 SqlSession 对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 执行 SQL

        // 方式一： getMapper
//        UserMapper mapper =  sqlSession.getMapper(UserMapper.class);
//        List<User> list =  mapper.getUserList();

        // 方式二：
        List<User> list = sqlSession.selectList("com.xkk.dao.UserMapper.getUserList");

        for (User user : list) {
            System.out.println(user);
        }

        // 关闭 SqlSession
        sqlSession.close();
    }

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(1);
        System.out.println(user.getName());
        sqlSession.close();
    }

    @Test
    public void addUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(4, "lkr", "123");
        userMapper.addUser(user);
        // 增删改 要 commit
        // 提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.updateUser(new User(4, "lkr", "111"));
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void delUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.delUser(4);
        sqlSession.commit();
        sqlSession.close();
    }
}
