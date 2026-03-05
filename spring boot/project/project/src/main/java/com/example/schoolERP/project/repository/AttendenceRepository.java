package com.example.schoolERP.project.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.schoolERP.project.model.Attendance;
import com.example.schoolERP.project.model.Student;
import com.example.schoolERP.project.model.User;

public interface AttendenceRepository extends JpaRepository<Attendance, Long> {

	List<Attendance> findByStudent(Student student);

    Attendance findByStudentAndDate(Student student, LocalDate date);
}