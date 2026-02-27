package com.example.journal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.journal.model.Users;

public interface UserRepo extends JpaRepository<Users, Long> {

	//default it take
	//public  abstract 
	Users findByUserName(String userName);
	
	
	
}
