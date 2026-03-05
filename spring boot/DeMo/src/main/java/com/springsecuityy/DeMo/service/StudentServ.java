package com.springsecuityy.DeMo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.springsecuityy.DeMo.model.StudentDTO;
import com.springsecuityy.DeMo.model.StudentModels;
import com.springsecuityy.DeMo.repository.StudentRepo;

@Service
public class StudentServ {

	private StudentRepo studentRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	public StudentServ(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}
	
	public  void storeStudent(StudentDTO studentDTO) {
		StudentModels student = new StudentModels();
		student.setName(studentDTO.getName());
		student.setEmail(studentDTO.getEmail());
		student.setPassword(passwordEncoder.encode(studentDTO.getPassword()));
		student.setRole("ROLE_USER");
		studentRepo.save(student);
	}
}
