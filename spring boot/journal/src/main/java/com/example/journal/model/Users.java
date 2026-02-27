package com.example.journal.model;

import java.util.ArrayList;
import java.util.List;

//import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonBackReference;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="users")
@Data
@NoArgsConstructor

public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@NonNull
	@NotEmpty
	@NotBlank(message ="user name can't be blank")
	@Column(unique = true)
	private String userName;
	
	
	@NotNull
	@NotEmpty
	private String password;
	
	@JsonBackReference
	@OneToMany(mappedBy="user", cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	private List<JournalModels> entries= new ArrayList<>();
	
}
