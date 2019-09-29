package com.example.demo.service;

import com.example.demo.form.StudentForm;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student createStudent(StudentForm studentForm) {
        return studentRepository.save(new Student(studentForm));
    }

}
