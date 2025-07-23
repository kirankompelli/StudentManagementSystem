package com.kiran.entity;



import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  id;
	
	@Nonnull
	private String name;
	
	
	@Column(unique=true,nullable=false)
	private String mailid;
	
	@Column(unique=true,nullable=false)
	private String password;
	
	
	@CreationTimestamp
	@Column(updatable=false)
	private Date createAt;
	
	@Column(nullable=false,unique=true)
	private long mobilenumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public Student(int id, String name, String mailid, String password, Date createAt, long mobilenumber) {
		super();
		this.id = id;
		this.name = name;
		this.mailid = mailid;
		this.password = password;
		this.createAt = createAt;
		this.mobilenumber = mobilenumber;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mailid=" + mailid + ", password=" + password + ", createAt="
				+ createAt + ", mobilenumber=" + mobilenumber + "]";
	}
	
	
	
	
}
