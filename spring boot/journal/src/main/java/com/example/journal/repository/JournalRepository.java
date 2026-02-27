package com.example.journal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.journal.model.JournalModels;

import jakarta.persistence.Id;

public interface JournalRepository extends JpaRepository<JournalModels,Long> {//primary key data type in wrapper class
//give model class name for this entity class
}
