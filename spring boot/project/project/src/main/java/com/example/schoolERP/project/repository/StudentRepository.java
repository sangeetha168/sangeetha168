package com.example.schoolERP.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.schoolERP.project.model.Student;
import com.example.schoolERP.project.model.User;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findByUser(User user);
}