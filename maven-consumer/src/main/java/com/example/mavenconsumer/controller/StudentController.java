package com.example.mavenconsumer.controller;

import com.example.entity.Student;
import com.example.service.StudentService;
import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Reference
    private StudentService studentService;

    @RequestMapping("/getStudent")
    @ResponseBody
    public Student getStudent(){
        Student bzboom = studentService.getStudent("bzboom");
        System.out.println(bzboom);
        return bzboom;
    }
}
