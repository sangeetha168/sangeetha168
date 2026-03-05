package com.springsecuityy.DeMo.service;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.springsecuityy.DeMo.model.StudentModels;

public class CustomUserDetails implements UserDetails{

	private StudentModels studentmodels;
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return List.of(new SimpleGrantedAuthority(studentmodels.getRole()));
	}

	public CustomUserDetails(StudentModels studentmodels) {
		super();
		this.studentmodels = studentmodels;
	}

	@Override
	public String getPassword() {
		return studentmodels.getPassword();
		
		
		
	}

	@Override
	public String getUsername() {
		return studentmodels.getEmail();
	
		
	
	
	
	}

	
}
