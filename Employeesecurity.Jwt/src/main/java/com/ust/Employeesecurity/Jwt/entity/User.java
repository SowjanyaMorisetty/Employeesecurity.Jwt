package com.ust.Employeesecurity.Jwt.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_tbl")

public class User {
	@Id

	private int id;
	private String username;
	private String password;
	private String email;
	private String phnumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getuserName() {
		return username;
	}

	public void setuserName(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassowrd(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhnumber() {
		return phnumber;
	}

	public void setPhnumber(String phnumber) {
		this.phnumber = phnumber;
	}

	public User(int id, String username, String passowrd, String email, String phnumber) {
		super();
		this.id = id;
		this.username = username;
		this.password = passowrd;
		this.email = email;
		this.phnumber = phnumber;
	}

	public User() {

	}

}
