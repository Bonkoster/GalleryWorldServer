package com.lukashman.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lukashman.model.converter.LocalDateAttributeConverter;

@Entity
@Table ( name = "user_table" )
@Component
public class User {
	
	@Id
	@Column ( name = "user_id" )
	@GeneratedValue
	private long id;
	
	@Column ( name = "user_name" )
	private String username;
	
	@Column ( name = "user_registration_date" )
	@Convert( converter = LocalDateAttributeConverter.class )
	private LocalDate registrationDate;
	
	@Column ( name = "user_password" )
	private String password;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
