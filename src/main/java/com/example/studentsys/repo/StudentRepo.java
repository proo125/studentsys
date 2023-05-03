package com.example.studentsys.repo;

import com.example.studentsys.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {



}
