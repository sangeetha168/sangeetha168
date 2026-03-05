package com.example.schoolERP.project.model;

import jakarta.persistence.*;

@Entity
public class Fee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double totalAmount;

    private Double paidAmount;

    private boolean cleared;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

    // getters and setters
}