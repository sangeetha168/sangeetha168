package com.example.schoolERP.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.schoolERP.project.model.Faculty;
import com.example.schoolERP.project.model.Student;
import com.example.schoolERP.project.model.User;

public interface FacutlyRepository extends JpaRepository<Faculty, Long> {

    Faculty findByUser(User user);
}