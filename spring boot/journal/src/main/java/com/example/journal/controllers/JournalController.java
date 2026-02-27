package com.example.journal.controllers;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.journal.model.JournalModels;
import com.example.journal.model.Users;
import com.example.journal.service.JournalServiceClass;
import com.example.journal.service.UserService;

@RestController
@RequestMapping("/api/journal")
public class JournalController {

	@Autowired
	private JournalServiceClass service;
	
	
	@Autowired
	private UserService userService;

	// create journal entry
	@PostMapping("/api/{userName}")
	public ResponseEntity<JournalModels> createJournal(@RequestBody JournalModels journal, @PathVariable String userName) {

		try {
			journal.setDate(LocalDateTime.now());
			service.saveEntry(journal, userName);
			return new ResponseEntity<>(journal, HttpStatus.OK);

		}
		catch(Exception e) {
			return new ResponseEntity<JournalModels>(HttpStatus.BAD_REQUEST);
		}
	}
	
	
	
	//  get all journal entries
	@GetMapping("/user/{userName}")
    public ResponseEntity<?> getAllJournals(@PathVariable String userName) {

        Users user = userService.findByUserName(userName);

        // FIX null check (NO logic change)
        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        List<JournalModels> all = user.getEntries();

        if (all != null && !all.isEmpty()) {
            return new ResponseEntity<>(all, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
	

	//  get journal by ID
	@GetMapping("id/{id}")
	public ResponseEntity<JournalModels> getJournalById(
			@PathVariable Long id) {

		Optional<JournalModels> journal = service.findById(id);

		if(journal.isPresent()) {
			return new ResponseEntity<JournalModels>(journal.get(),HttpStatus.OK);
		}
		return new ResponseEntity<JournalModels>(HttpStatus.NOT_FOUND);

	}

	// Update journal (edit)
	@PutMapping("edit/{id}")
	public ResponseEntity<JournalModels> updateJournal(
			@PathVariable Long id,
			@RequestBody JournalModels journal) {

		try {
			service.edit(id, journal);
			return new ResponseEntity<JournalModels>(journal,HttpStatus.OK);
		}
		catch(Exception e){
			return new ResponseEntity<JournalModels>(HttpStatus.NOT_FOUND);

		}
	}

	// Delete journal
	@DeleteMapping("delete/{id}")
	public ResponseEntity<?> deleteJournal(
			@PathVariable Long id) {

		service.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}



