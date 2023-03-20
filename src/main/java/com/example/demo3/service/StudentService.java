package com.example.demo3.service;
import com.example.demo3.model.Student;

public interface StudentService {

    Student getStudentByIdAndByName(String id, String name);

    Student createStudent(Student student);

    Student updateStudent(String id, Student student);

    void deleteStudent(String id);
}
