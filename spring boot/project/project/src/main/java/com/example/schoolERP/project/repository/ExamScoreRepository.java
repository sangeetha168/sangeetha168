package com.example.schoolERP.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.schoolERP.project.model.ExamScore;
import com.example.schoolERP.project.model.Fee;
import com.example.schoolERP.project.model.Student;
import com.example.schoolERP.project.model.User;

public interface ExamScoreRepository extends JpaRepository<ExamScore, Long> {

	 List<ExamScore> findByStudent(Student student);
	
}
