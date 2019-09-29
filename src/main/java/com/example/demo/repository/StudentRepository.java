package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends org.springframework.data.repository.Repository<Student, Long> {

    Student save(Student student);

}
