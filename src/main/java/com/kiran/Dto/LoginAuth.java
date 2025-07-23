package com.kiran.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public class LoginAuth {
	
	
	 @Email(message = "Invalid email")
		private String mailid;
		
		 @Size(min = 6, message = "Password must be at least 6 characters")
		private String password;

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

		 public LoginAuth( String mailid,
				 String password) {
			super();
			this.mailid = mailid;
			this.password = password;
		 }

		 public LoginAuth() {
			super();
			// TODO Auto-generated constructor stub
		 }
	
		 

}
