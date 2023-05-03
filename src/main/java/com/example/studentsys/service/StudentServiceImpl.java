package com.example.studentsys.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.studentsys.repo.StudentRepo;
import com.example.studentsys.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student saveStud(Student student){
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }


}
