package com.example.studentsys.service;
import com.example.studentsys.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStud(Student student);

    public List<Student> getAllStudents();
}
