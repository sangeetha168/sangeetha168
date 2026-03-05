package com.springsecuityy.DeMo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecuityy.DeMo.model.StudentModels;

public interface StudentRepo extends JpaRepository<StudentModels, Long> {

	Optional<StudentModels> findByEmail(String email);
}
