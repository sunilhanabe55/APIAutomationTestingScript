package com.api.response.model;

public class ProfileResponse {

	private int id;
	private String username;
	private String email;
	private String firstname;
	private String lastname;
	private String mobilenumber;
	
	public ProfileResponse()
	{
		
	}
	
	public ProfileResponse(int id, String username, String email, String firstname, String lastname,
			String mobilenumber) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobilenumber = mobilenumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	@Override
	public String toString() {
		return "ProfileResponse [id=" + id + ", username=" + username + ", email=" + email + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", mobilenumber=" + mobilenumber + "]";
	}
	
	
	
}
