package com.example.securityproject.student;

import com.example.securityproject.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    Optional<Student>findByName(String name);
//
//    Optional<Student> findById(String id);
}
