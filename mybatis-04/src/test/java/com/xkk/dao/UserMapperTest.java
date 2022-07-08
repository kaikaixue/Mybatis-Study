package com.xkk.dao;

import com.xkk.pojo.User;
import com.xkk.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.delUser(5);
//        userMapper.updateUser(new User(5, "赵六", "111"));
//        userMapper.addUser(new User(5, "赵六", "123"));
//        User user = userMapper.getUserById(1);
//        System.out.println(user.getName());
//        List<User> list = userMapper.getUserList();
//        for (User user : list) {
//            System.out.println(user.getName());
//        }
    }
}
