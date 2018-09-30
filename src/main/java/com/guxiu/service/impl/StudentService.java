package com.guxiu.service.impl;

import com.guxiu.dao.IStudentDao;
import com.guxiu.entity.Student;
import com.guxiu.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private IStudentDao dao;

    public String findStudentById(String id) throws Exception {
        return dao.findStudentById(id);
    }

    public List<Student> findAllStudents() throws Exception {
        return dao.findAllStudents();
    }

    public void multiSql() throws Exception {
        dao.multiSql();
    }
}
