package com.example.mavenprovider.impl;

import com.example.entity.Student;
import com.example.service.StudentService;
import org.apache.dubbo.config.annotation.Service;

@Service(protocol = "dubbo")
public class StudentServiceImpl implements StudentService {

    public Student getStudent(String name) {
        Student student = new Student();
        student.setName(name);
        return student;
    }

}
