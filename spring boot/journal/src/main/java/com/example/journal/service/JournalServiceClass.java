package com.example.journal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.journal.model.JournalModels;
import com.example.journal.model.Users;
import com.example.journal.repository.JournalRepository;



@Service
public class JournalServiceClass {


	@Autowired
	private JournalRepository repo;
	
	
	@Autowired
	private UserService userService;
	
	@Transactional
	public void saveEntry(JournalModels journal, String userName) {
	    Users user = userService.findByUserName(userName);

	    journal.setUser(user);   //  THIS IS THE KEY LINE

	    JournalModels save = repo.save(journal);
	    user.getEntries().add(save);
	    user.setUserName(null);  //   intentional bug to understand transactional
	    userService.saveUser(user);
	}


	//get all the entry
	public List<JournalModels> getAll(){
		return repo.findAll();
	}

	//find by id
	public Optional<JournalModels> findById(Long id){//optional is class used for when you returning null or data
		return repo.findById(id);
	}
   
	
	//delete by id
	
	public void deleteById(Long id) {
		repo.deleteById(id);
	}
	
	//edit
	
	public void edit(Long id,JournalModels newEntry) {
		JournalModels old = repo.findById(id).orElse(null);
		if(old != null) {
			old.setTitle(newEntry.getTitle() != null && !newEntry.getTitle().equals("") ? newEntry.getTitle() : old.getTitle());
			old.setContent(newEntry.getContent() != null && !newEntry.getContent().equals("") ? newEntry.getContent() : old.getContent());
		}
		repo.save(old);
		
		
		
	}
	}

	

	








