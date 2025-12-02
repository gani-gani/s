package com.example.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.exam.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
