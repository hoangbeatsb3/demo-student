package com.example.demo.controller;

import com.example.demo.form.StudentForm;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/")
    public Student createStudent(@RequestBody StudentForm studentForm) {
        return studentService.createStudent(studentForm);
    }

}
