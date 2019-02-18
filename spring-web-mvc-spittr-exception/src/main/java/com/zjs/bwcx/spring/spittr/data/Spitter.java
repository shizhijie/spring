package com.zjs.bwcx.spring.spittr.data;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Spitter implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull
	@Size(min=5,max=16,message="{firstName.size}")
	private String firstName;
	@NotNull
	@Size(min=5,max=25,message="{lastName.size}")
	private String lastName;
	@NotNull
	@Size(min=2,max=30,message="{username.size}")
	private String username;
	@NotNull
	@Size(min=2,max=30,message="{password.size}")
	private String password;
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
	
	
}
