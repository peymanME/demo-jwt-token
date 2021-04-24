package com.demo.jwt.token.model;

import java.io.Serializable;
/**
 * @author peyman.ekhtiar on 2021-04-22
 */
public class JwtRequest implements Serializable {

	private static final long serialVersionUID = -5926467573005150707L;
	
	private String username;
	private String password;
	
	//need default constructor for JSON Parsing
	public JwtRequest()
	{
		
	}

	public JwtRequest(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}