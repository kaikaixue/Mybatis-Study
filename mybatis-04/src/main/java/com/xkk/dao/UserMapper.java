package com.xkk.dao;

import com.xkk.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("select * from t_user")
    List<User> getUserList();

    // 如果存在多个参数，参数前面必须加上 @Param()
    @Select("select * from t_user where id = #{id}")
    User getUserById(@Param("id") Integer id);

    @Insert("insert into t_user values (#{id}, #{name}, #{password})")
    int addUser(User user);

    @Update("update t_user set name = #{name}, pwd = #{password} where id = #{id}")
    int updateUser(User user);

    @Delete("delete from t_user where id = #{id}")
    int delUser(Integer id);
}
