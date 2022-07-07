package com.xkk.dao;

import com.xkk.pojo.User;

import java.util.List;

public interface UserMapper {
    /**
     * 查询所有用户
     * @return
     */
    List<User> getUserList();

    /**
     * 根据id查用户
     * @param id
     * @return
     */
    User getUserById(Integer id);

    /**
     * 插入用户
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int delUser(Integer id);
}
