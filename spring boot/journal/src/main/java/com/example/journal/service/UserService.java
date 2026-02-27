package com.example.journal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.journal.model.JournalModels;
import com.example.journal.model.Users;
import com.example.journal.repository.UserRepo;

@Service
public class UserService {

	
	@Autowired
	private UserRepo userRepo;
	

		//save user
	
		public void saveUser(Users user) {
			 userRepo.save(user);
		}
		
		//find by id
		
		public Optional<Users> findById(Long id){
			return userRepo.findById(id);
		}
		
		//get all the user
		public List<Users> getAll(){
			return userRepo.findAll();
		}
		
		//delete by id
		
		public void deleteById(Long id) {
			userRepo.deleteById(id);
		}
		
		//find user name
		
		public Users findByUserName(String userName) {
			return userRepo.findByUserName(userName);
		}
		
		//update user
		
}
