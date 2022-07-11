package com.xkk.dao;

import com.xkk.pojo.Student;
import com.xkk.pojo.Teacher;
import com.xkk.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TeacherTest {
    @Test
    public void getTeacherById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = teacherMapper.getTeacherById(1);
        System.out.println(teacher);
        sqlSession.close();
    }

    @Test
    public void getStudent() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
//        List<Student> list = studentMapper.getStudent();
        List<Student> list = studentMapper.getStudent2();
        for (Student student : list) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
