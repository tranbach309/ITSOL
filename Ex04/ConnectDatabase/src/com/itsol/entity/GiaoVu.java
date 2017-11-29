package com.itsol.jdbc;

public class GiaoVu {
	private String acc;
	private String firstName;
	private String lastName;
	private String email;
	
	public void setAcc(String acc) {
		this.acc = acc;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAcc() {
		return acc;
	}
	public String getFirstName() {
		return firstName;
	}
	public String lastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	
	public GiaoVu() {
		
	}
	public GiaoVu(String acc, String firstName, String lastName, String email) {
		this.acc = acc;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	
}
