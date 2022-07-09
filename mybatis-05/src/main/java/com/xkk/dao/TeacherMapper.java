package com.xkk.dao;

import com.xkk.pojo.Teacher;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {
    @Select("select * from teacher where id = #{id}")
    Teacher getTeacherById(int id);
}
