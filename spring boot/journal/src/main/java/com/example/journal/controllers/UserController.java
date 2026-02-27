package com.example.journal.controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.journal.model.JournalModels;
import com.example.journal.model.Users;
import com.example.journal.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping
	public void createUser(@RequestBody Users user) {
			userService.saveUser(user);
	}
	
	// get all user
	@GetMapping("/user")
	public List<Users> getAllUser() {
		return userService.getAll();
		
	}

	//edit users password or name
	@PutMapping("/edit/{userName}")
	public ResponseEntity<?> updateUser(@RequestBody Users user, @PathVariable String userName){
		
		Users userInDb = userService.findByUserName(userName);
		
		
		if(userInDb !=null) {
			
			userInDb.setUserName(user.getUserName());
			
			userInDb.setPassword(user.getPassword());
			
			userService.saveUser(userInDb);
		return new	ResponseEntity<>(HttpStatus.OK);
		}
		
		return new ResponseEntity<> (HttpStatus.NOT_FOUND);		
	}
}
