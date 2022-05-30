package com.example.demo.repository;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentRepository {
    public List<Student> findAll();
    public Student findById(Long id);
    public void save(Student student);
    public void update(Student student);
    public void deleteById(Long id);
}
