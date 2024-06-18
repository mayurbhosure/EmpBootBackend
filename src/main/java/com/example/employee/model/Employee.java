package com.example.employee.model;

public class Employee {

	public Employee() {

	}

	public Employee(int id, String firstName, String lastName, String emailId) {
		super();
		this.id = (long) id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}

	private Long id;

	private String firstName;

	private String lastName;

	private String emailId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
