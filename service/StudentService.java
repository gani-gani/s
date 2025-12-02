package com.example.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exam.model.Student;
import com.example.exam.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    StudentRepository repository;
    public List<Student> getAllStudents() {
        return repository.findAll();
    }
    public void addStudent(Student student) {
        repository.save(student);
    }
    public void deleteStudent(int id) {
        repository.deleteById(id);
    }
    public Student getStudentById(int id) {
        return repository.findById(id).orElse(null);
    }
    public void updateStudent(Student student) {
        repository.save(student);
    }
}
