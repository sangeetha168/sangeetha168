package com.example.journal.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
//import lombok.Builder;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.NonNull;
//import lombok.Setter;
//import lombok.ToString;
@Entity //which is creating a table using private variable specified below
@Table(name="journal")
//@Getter
//@Setter
//@NoArgsConstructor
//@ToString
//@EqualsAndHashCode
//@Builder
//for all this annotation can be replaced by @Data annotation

@Data
@NoArgsConstructor//must import this with @data

public class JournalModels {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //it specifies that how the primary key is generated
	private long id;//data type must be primitive in this entity class
	@NonNull
	private String title;
	private String content;
	private LocalDateTime date;
	
	
	@ManyToOne
	@JoinColumn(name ="user_id")
	@JsonBackReference
	private Users user;
	
	
	
}
