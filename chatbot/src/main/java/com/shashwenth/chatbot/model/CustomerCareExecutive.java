package com.shashwenth.chatbot.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class CustomerCareExecutive {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String username;
	
	private String password;
	
	private String fullName;
	
	@Enumerated(EnumType.STRING)
	private department department;
	
	@Enumerated(EnumType.STRING)
	private Status status;

	public CustomerCareExecutive() {
		super();
	}
	

	public CustomerCareExecutive(Long id, String username, String password, String fullName,
			com.shashwenth.chatbot.model.department department, Status status) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.department = department;
		this.status = status;
	}


	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}





	public String getUsername() {
		return username;
	}





	public void setUsername(String username) {
		this.username = username;
	}





	public String getPassword() {
		return password;
	}





	public void setPassword(String password) {
		this.password = password;
	}





	public String getFullName() {
		return fullName;
	}





	public void setFullName(String fullName) {
		this.fullName = fullName;
	}





	public department getDepartment() {
		return department;
	}





	public void setDepartment(department department) {
		this.department = department;
	}





	public Status getStatus() {
		return status;
	}





	public void setStatus(Status status) {
		this.status = status;
	}



	

	



	
	

}
