package com.egide.models;

import java.time.LocalDateTime;

public class Student {
	private String id;
	private String firstName;
	private String lastName;
	private LocalDateTime birthDate;
	private String email;
	private String password;
	
	public Student() {}
	
	public Student(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public Student(String firstName, String lastName, LocalDateTime birthDate, String email, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.email = email;
		this.password = password;
	}

	public Student(String id, String firstName, String lastName, LocalDateTime birthDate, String email,String password) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.email = email;
		this.password = password;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDateTime getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDateTime birthDate) {
		this.birthDate = birthDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return String.format(
				"Student [id=%s, firstName=%s, lastName=%s, birthDate=%s, email=%s, password=%s, getId()=%s, getFirstName()=%s, getLastName()=%s, getBirthDate()=%s, getEmail()=%s, getPassword()=%s, getClass()=%s, hashCode()=%s, toString()=%s]",
				id, firstName, lastName, birthDate, email, password, getId(), getFirstName(), getLastName(),
				getBirthDate(), getEmail(), getPassword(), getClass(), hashCode(), super.toString());
	}
	
	
}
