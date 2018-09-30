package com.guxiu.dao;

import com.guxiu.entity.Student;

import java.util.List;

public interface IStudentDao {
    public String findStudentById(String id) throws Exception ;
    public List<Student> findAllStudents() throws Exception;
    public void multiSql() throws Exception;
}
