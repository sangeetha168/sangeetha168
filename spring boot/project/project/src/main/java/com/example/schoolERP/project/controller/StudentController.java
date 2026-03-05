package com.example.schoolERP.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.schoolERP.project.model.Student;
import com.example.schoolERP.project.repository.StudentRepository;
import com.example.schoolERP.project.service.StudentService;

@Controller
public class StudentController {

	
	 @Autowired
	    private StudentService studentService;
	 
	

}
