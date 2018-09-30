package com.guxiu.controller;

import com.guxiu.entity.Student;
import com.guxiu.service.IStudentService;
import com.guxiu.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HelloStudentByMyBatisController {

    @Autowired
    private IStudentService iStudentService;

    @RequestMapping("/HelloStudentByMyBatisController/findAllStudents")
    public String findAllStudents(Model model) throws Exception {
        List<Student> listStudent = iStudentService.findAllStudents();
        model.addAttribute("listStudent", listStudent.get(0));
        return "helloStudentFindAllStudents";
    }

    @RequestMapping("/HelloStudentByMyBatisController/multiSql")
    public String multiSql(Model model) throws Exception {
        try {
            iStudentService.multiSql();
            model.addAttribute("result", "sucess");
        } catch (Exception e) {
            model.addAttribute("result", e.getMessage());
        }
        return "result";
    }


}
