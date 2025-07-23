package com.kiran.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class StudentAuth {
	
	 @NotBlank(message = "Name is required")
	private String name;
	
	
	 @Email(message = "Invalid email")
	private String mailid;
	
	 @Size(min = 6, message = "Password must be at least 6 characters")
	private String password;
	 
	@NotBlank(message = "Mobile number is required")
    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid mobile number format")
	private long mobilenumber;
	
	
	public StudentAuth(String name, String mailid, String password, long mobilenumber) {
		super();
		this.name = name;
		this.mailid = mailid;
		this.password = password;
		this.mobilenumber = mobilenumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public StudentAuth() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
